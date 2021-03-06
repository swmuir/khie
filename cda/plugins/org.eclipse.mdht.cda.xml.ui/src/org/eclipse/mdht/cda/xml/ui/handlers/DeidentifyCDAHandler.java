/*******************************************************************************
 * Copyright (c) 2017 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.cda.xml.ui.handlers;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.uml.cda.AssignedAuthor;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.Material;
import org.eclipse.mdht.uml.cda.NonXMLBody;
import org.eclipse.mdht.uml.cda.Patient;
import org.eclipse.mdht.uml.cda.Person;
import org.eclipse.mdht.uml.cda.PlayingEntity;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.StrucDocText;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Filter;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.eclipse.mdht.uml.hl7.datatypes.AD;
import org.eclipse.mdht.uml.hl7.datatypes.ADXP;
import org.eclipse.mdht.uml.hl7.datatypes.BinaryDataEncoding;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.EN;
import org.eclipse.mdht.uml.hl7.datatypes.ENXP;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.PN;
import org.eclipse.mdht.uml.hl7.datatypes.TEL;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com.google.common.base.Stopwatch;

public class DeidentifyCDAHandler extends AbstractHandler {

	protected String folderPrefix = "DeIndentified";

	/**
	 * @return the folderPrefix
	 */
	public String getFolderPrefix() {
		return folderPrefix;
	}

	/**
	 * @param folderPrefix
	 *            the folderPrefix to set
	 */
	public void setFolderPrefix(String folderPrefix) {
		this.folderPrefix = folderPrefix;
	}

	public static final SimpleDateFormat DATE_FORMAT3 = new SimpleDateFormat("yyyyMMdd");

	public class DeIdentificationDialog extends TitleAreaDialog {

		org.eclipse.swt.widgets.Table table;

		public DeIdentificationDialog(Shell shell) {
			super(shell);

		}

		@Override
		public void create() {
			super.create();
			setTitle("DeIdentification Results");
		}

		@Override
		protected Control createDialogArea(Composite parent) {

			final ScrolledComposite composite = new ScrolledComposite(parent, SWT.V_SCROLL);
			composite.setLayout(new GridLayout());
			composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

			table = new org.eclipse.swt.widgets.Table(composite, SWT.BORDER | SWT.MULTI);
			table.setHeaderVisible(true);

			table.setSize(100, 100);

			composite.setContent(table);
			composite.setExpandHorizontal(true);
			composite.setExpandVertical(true);
			composite.setAlwaysShowScrollBars(true);
			composite.setMinSize(table.computeSize(SWT.DEFAULT, SWT.DEFAULT));

			table.setLinesVisible(true);

			final GridData gridData = new GridData();
			gridData.widthHint = 500;
			table.setLayoutData(gridData);

			table.setHeaderVisible(true);
			final TableColumn column1 = new TableColumn(table, SWT.LEFT);

			final TableColumn column2 = new TableColumn(table, SWT.LEFT);

			column1.setText("File Name");
			column2.setText("Size (MB)");

			column1.setWidth(250);
			column2.setWidth(250);

			for (IFile file : documents) {
				IFileStore fs1;
				try {
					fs1 = org.eclipse.core.filesystem.EFS.getStore(file.getLocationURI());
					final TableItem valueSetsUpdatedItem = new TableItem(table, SWT.NONE);
					valueSetsUpdatedItem.setText(
						new String[] {
								fs1.fetchInfo().getName(), String.valueOf(fs1.fetchInfo().getLength() / 1000000) });

				} catch (CoreException e) {

				}
			}

			return composite;
		}

		@Override
		protected void createButtonsForButtonBar(Composite parent) {

			Button okButton = createButton(parent, OK, "Ok", false);

			okButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					setReturnCode(OK);
					close();
				}
			});
		}

	}

	public String getKey(II ii) {
		if (ii.getRoot() != null) {
			if (ii.getExtension() != null) {
				return ii.getRoot() + "::" + ii.getExtension();
			}
		} else {
			return "noroot x " + ii.getExtension();
		}
		return "nokey";

	}

	public String getKey(String prefix, II ii) {
		return prefix + "\t" + getKey(ii);
	}

	ArrayDeque<String> names = new ArrayDeque<String>();

	ArrayDeque<String> randomNames = new ArrayDeque<String>();

	public String getKey(String prefix, EN pn) {
		return prefix + "\t" + getKey(pn);
	}

	public String getKey(EN pn) {

		if (pn.getText() != null && pn.getText().trim().length() > 0) {
			names.add(pn.getText());
			randomNames.add(RandomStringUtils.randomAlphabetic(pn.getText().length()));
			return pn.getText();
		}

		StringBuffer b = new StringBuffer();

		for (ENXP e : pn.getPrefixes()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			randomNames.add(RandomStringUtils.randomAlphabetic(pn.getText().length()));
			b.append(e.getText());
		}

		for (ENXP e : pn.getGivens()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			randomNames.add(RandomStringUtils.randomAlphabetic(pn.getText().length()));
			b.append(e.getText());
		}

		for (ENXP e : pn.getFamilies()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			randomNames.add(RandomStringUtils.randomAlphabetic(pn.getText().length()));
			b.append(e.getText());
		}

		for (ENXP e : pn.getSuffixes()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			randomNames.add(RandomStringUtils.randomAlphabetic(pn.getText().length()));
			b.append(e.getText());
		}

		while (names.size() > 1000) {
			for (int i = 0; i < 100; i++) {
				names.removeFirst();
				randomNames.removeFirst();
			}
		}

		return b.toString();

	}

	HashMap<String, String> randomIds = new HashMap<String, String>(10000, .50f);;

	/**
	 * lookForExisting checks for an existing random id ignoring the part of file name
	 * Add file name for report purposes but want id to span files
	 *
	 * @param slimkey
	 * @return
	 */
	private String lookForExistingAcrossFiles(String slimkey) {
		String randomString = "";
		for (String fatkey : randomIds.keySet()) {
			if (fatkey.endsWith(slimkey)) {
				randomString = randomIds.get(fatkey);
			}
		}
		return randomString;
	}

	public void deidentifyCDA(final IFile file) throws Exception {

		// /**
		// * Do not attempt to use ids across files - performance issues of large hash maps
		// */
		// randomIds.clear();

		URI cdaURI = URI.createFileURI(file.getLocation().toOSString());

		ClinicalDocument clinicalDocument = null;
		try (InputStream is = Files.newInputStream(Paths.get(cdaURI.toFileString()))) {
			clinicalDocument = CDAUtil.load(is, ((ValidationHandler) null));
			is.close();
		} catch (IOWrappedException iowe) {
			System.out.println("error processing " + cdaURI.toFileString());
			return;
		}

		Query query = new Query(clinicalDocument);

		// Use inline filters - bit simpler then setting up ctors to passing ramdomids and names
		Filter<II> iiFilter = new Filter<II>() {

			@Override
			public boolean accept(II ii) {

				if (ii.isNullFlavorDefined()) {
					return false;
				}

				if ("templateId".equals(ii.eContainingFeature().getName())) {
					return false;
				}

				if ((!"2.16.840.1.113883.1.3".equals(ii.getRoot())) && ii.getExtension() != null &&
						ii.getExtension().trim().length() > 0) {
					String key = getKey(file.getName(), ii);
					if (!randomIds.containsKey(key)) {
						String randomString = lookForExistingAcrossFiles(getKey(ii));
						if (StringUtils.isEmpty(randomString)) {
							if (ii.getExtension() != null) {
								randomString = RandomStringUtils.randomNumeric(ii.getExtension().length());
							} else {
								randomString = RandomStringUtils.randomNumeric(5);
							}
						}
						randomIds.put(key, randomString);

					}

					if (randomIds.containsKey(key)) {
						ii.setExtension(randomIds.get(key));
					}
				}

				return true;
			}

		};
		query.getEObjects(II.class, iiFilter);

		Filter<PN> enFilter = new Filter<PN>() {

			@Override
			public boolean accept(PN pn) {

				if (pn.eContainer() != null &&
						"assignedPerson".equals(pn.eContainer().eContainingFeature().getName())) {
					return false;
				}

				if (pn.eContainer() instanceof Material) {
					return false;
				}
				if (pn.isNullFlavorDefined()) {
					return false;
				}

				if (pn.eContainer() instanceof PlayingEntity) {
					return false;
				}

				if (pn.eContainer() instanceof Person && pn.eContainer().eContainer() instanceof AssignedAuthor) {
					return false;
				}

				if (StringUtils.isEmpty(getKey(pn))) {
					return false;
				}

				String key = getKey(file.getName(), pn);

				if (!randomIds.containsKey(key)) {

					String[] randoms = key.split(" ");

					String randomString = lookForExistingAcrossFiles(getKey(pn));

					if (StringUtils.isEmpty(randomString)) {
						String newName = key;
						for (String n : randoms) {
							newName = newName.replace(n, RandomStringUtils.randomAlphabetic(5));
						}
						randomString = newName;
					}

					randomIds.put(key, randomString);

				}

				if (randomIds.containsKey(key)) {

					pn.getMixed().clear();
					pn.getPrefixes().clear();
					pn.getGivens().clear();
					pn.getFamilies().clear();
					pn.getSuffixes().clear();
					pn.addText(randomIds.get(key));
				}

				return true;
			}

		};
		query.getEObjects(PN.class, enFilter);

		Filter<AD> adFilter = new Filter<AD>() {

			@Override
			public boolean accept(AD item) {

				if (item.isNullFlavorDefined()) {
					return false;
				}

				if (item.getText() != null && item.getText().trim().length() > 0) {
					item.getMixed().clear();
					item.addText(RandomStringUtils.randomAlphabetic(5));
				}
				for (ADXP a : item.getStreetAddressLines()) {
					a.getMixed().clear();
					a.addText(RandomStringUtils.randomAlphabetic(5));
				}

				for (ADXP a : item.getCities()) {
					a.getMixed().clear();
					a.addText(RandomStringUtils.randomAlphabetic(5));
				}

				for (ADXP a : item.getCounties()) {
					a.getMixed().clear();
					a.addText(RandomStringUtils.randomAlphabetic(5));
				}

				for (ADXP a : item.getCountries()) {
					a.getMixed().clear();
					a.addText(RandomStringUtils.randomAlphabetic(5));
				}

				for (ADXP a : item.getStates()) {
					a.getMixed().clear();
					a.addText(RandomStringUtils.randomAlphabetic(5));
				}

				for (ADXP a : item.getStreetNames()) {
					a.getMixed().clear();
					a.addText(RandomStringUtils.randomAlphabetic(5));
				}

				for (ADXP a : item.getPostalCodes()) {
					a.getMixed().clear();
					a.addText(RandomStringUtils.randomAlphabetic(5));
				}
				return true;
			}

		};
		query.getEObjects(AD.class, adFilter);

		Filter<TEL> telFilter = new Filter<TEL>() {

			@Override
			public boolean accept(TEL item) {
				if (item.isNullFlavorDefined()) {
					return false;
				}

				String avalue = item.getValue();

				if (!StringUtils.isEmpty(avalue) && avalue.indexOf('#') == 0) {
					return false;

				}

				item.setValue(RandomStringUtils.randomAlphabetic(5));
				return false;
			}
		};
		query.getEObjects(TEL.class, telFilter);

		Filter<Section> sectionFilter = new Filter<Section>() {

			@Override
			public boolean accept(Section item) {

				if (item.getText() != null) {
					ByteArrayOutputStream fa = new ByteArrayOutputStream();
					try {
						CDAUtil.saveSnippet(EcoreUtil.copy(item.getText()), fa);

						String newText = fa.toString();

						String sourceNames[] = names.toArray(new String[0]); // new String[names.size()];
						String targetNames[] = randomNames.toArray(new String[0]);
						StringUtils.replaceEach(newText, sourceNames, targetNames);

						/**
						 * The substr removes the start and end tags of the narrative
						 * "<strucdoctext xmlns=\"urn:hl7-org:v3\">".length = 37
						 * "</strucdoctext>".length = 15
						 */
						StrucDocText hhh = item.createStrucDocText(newText.substring(37, newText.length() - 15));
						item.setText(hhh);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				return false;
			}
		};
		query.getEObjects(Section.class, sectionFilter);

		Filter<Patient> patientFilter = new Filter<Patient>() {

			@Override
			public boolean accept(Patient item) {

				if (item.getBirthTime() != null && !StringUtils.isEmpty(item.getBirthTime().getValue())) {
					String currentDate = item.getBirthTime().getValue();
					if (currentDate.length() < 4) {
						currentDate += "0000";
					}

					;
					item.getBirthTime().setValue(currentDate.substring(0, 4) + "01");

				}

				return false;
			}
		};
		query.getEObjects(Patient.class, patientFilter);

		Filter<NonXMLBody> nonXMLBodyFilter = new Filter<NonXMLBody>() {

			@Override
			public boolean accept(NonXMLBody item) {

				ED ed = DatatypesFactory.eINSTANCE.createED("NON XML CONTENT REMOVED AS PART OF DEINDENTIFICATION");
				ed.setMediaType("text/plain");
				ed.setRepresentation(BinaryDataEncoding.TXT);
				item.setText(ed);

				return false;
			}

		};
		query.getEObjects(NonXMLBody.class, nonXMLBodyFilter);

		if (file.getParent() != null) {
			IPath p = file.getParent().getProjectRelativePath();

			p = p.append(folderPrefix);

			IFolder f = file.getProject().getFolder(p);
			if (!f.exists()) {
				f.create(true, true, null);
			}

			int i = file.getName().lastIndexOf(file.getFileExtension());

			IFile df = f.getFile(file.getName().substring(0, i - 1) + "_DeIdentified.xml");

			try (OutputStream fileOut = Files.newOutputStream(Paths.get(df.getLocation().toOSString()))) {
				CDAUtil.save(clinicalDocument, fileOut);
			}

		}

		clinicalDocument.eResource().unload();
	}

	ArrayList<IFile> documents = new ArrayList<IFile>();

	protected static DecimalFormat format2Places = new DecimalFormat(".##");

	protected void processFolder(IFolder folder, IProgressMonitor monitor) throws CoreException {

		int filectr = 1;
		long currentProcessingTime = 1;
		long totalBytes = 0;
		long totalBytes2 = 0;
		Stopwatch stopwatch = Stopwatch.createUnstarted();

		documents.clear();

		for (IResource resource : folder.members()) {

			if (monitor.isCanceled()) {
				monitor.done();
				break;
			}

			if (resource instanceof IFolder && !resource.getName().equals("DeIndentified")) {
				processFolder((IFolder) resource, monitor);
			}

			if (resource instanceof IFile) {
				IFile file = (IFile) resource;
				org.eclipse.core.filesystem.EFS.getStore(file.getLocationURI());
				if ("XML".equalsIgnoreCase(file.getFileExtension())) {
					documents.add(file);
					IFileStore fs1 = org.eclipse.core.filesystem.EFS.getStore(file.getLocationURI());
					totalBytes += fs1.fetchInfo().getLength();
				}
			}
		}

		totalBytes2 = totalBytes;

		monitor.setTaskName("DeIdentify Folder (" + format2Places.format(totalBytes2 / 1000000.0) + " MB) ");

		Comparator<? super IFile> c = new Comparator<IFile>() {

			@Override
			public int compare(IFile file1, IFile file2) {
				try {
					IFileStore fs1 = org.eclipse.core.filesystem.EFS.getStore(file1.getLocationURI());
					IFileStore fs2 = org.eclipse.core.filesystem.EFS.getStore(file2.getLocationURI());
					if (fs1.fetchInfo().getLength() < fs2.fetchInfo().getLength()) {
						return 1;
					} else {
						return -1;
					}
				} catch (CoreException e) {

				}
				return 0;
			}
		};
		Collections.sort(documents, c);

		currentProcessingTime = 0;
		long estimatedTimeLeft = 0;
		for (IFile document : documents) {
			monitor.worked(1);

			if (estimatedTimeLeft != 0) {
				if (estimatedTimeLeft > 60) {
					monitor.setTaskName(
						"DeIdentify Folder (" + format2Places.format(totalBytes2 / 1000000.0) +
								" MB), Estimated Time to finish : " + ((int) estimatedTimeLeft / 60) + " Minutes ");
				} else {
					monitor.setTaskName(
						"DeIdentify Folder (" + format2Places.format(totalBytes2 / 1000000.0) +
								" MB), Estimated Time to finish : " + ((int) estimatedTimeLeft) + " Seconds ");
				}
			}

			IFileStore fs1 = org.eclipse.core.filesystem.EFS.getStore(document.getLocationURI());
			long fileSize = fs1.fetchInfo().getLength();

			monitor.subTask(
				"Processing " + StringUtils.center(StringUtils.abbreviate(document.getName(), 16), 16) + "(" +
						format2Places.format(fs1.fetchInfo().getLength() / 1000000.0) + " MB)" + " File # " +
						StringUtils.center(String.valueOf(filectr++), 10) + " LAST " +
						StringUtils.center(String.valueOf(currentProcessingTime / 1000.0), 6) + " Seconds");
			try {
				stopwatch.reset();
				stopwatch.start();
				deidentifyCDA(document);
				stopwatch.stop();
				currentProcessingTime = stopwatch.elapsed(TimeUnit.MILLISECONDS);

				long ratePerSecond = fileSize / stopwatch.elapsed(TimeUnit.MILLISECONDS);

				totalBytes -= fileSize;

				if (ratePerSecond != 0) {
					estimatedTimeLeft = (totalBytes / ratePerSecond) / 1000;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			if (monitor.isCanceled()) {
				break;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {

			ProgressMonitorDialog pd = new ProgressMonitorDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());

			ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
			if (selection instanceof IStructuredSelection) {

				final IStructuredSelection iss = (IStructuredSelection) selection;

				try {
					pd.run(true, true, new IRunnableWithProgress() {

						public void run(IProgressMonitor monitor)
								throws InvocationTargetException, InterruptedException {

							try {
								@SuppressWarnings("unchecked")
								Iterator<Object> iter = iss.iterator();
								while (iter.hasNext() && !monitor.isCanceled()) {
									// IFile indexfile = null;
									Object o = iter.next();
									if (o instanceof IFolder) {
										IFolder folder = (IFolder) o;

										// indexfile = folder.getFile(
										// DATE_FORMAT3.format(new Date()) + folder.getName() + ".txt");

										monitor.beginTask("DeIdentify CDA Documents", folder.members().length);

										processFolder(folder, monitor);

									}
									if (o instanceof IFile) {
										// randomIds = new HashMap<String, String>();
										// indexfile = ((IFolder) ((IFile) o).getParent()).getFile(
										// DATE_FORMAT3.format(new Date()) +
										// ((IFolder) ((IFile) o).getParent()).getName() + ".txt");
										deidentifyCDA((IFile) o);
									}
									// if (indexfile != null) {
									//
									// StringBuilder sb2 = new StringBuilder();
									// for (String key : randomIds.keySet()) {
									//
									// if (!StringUtils.isEmpty(key)) {
									// sb2.append(key).append("\t").append(randomIds.get(key)).append(
									// '\r').append('\n');
									// }
									//
									// ;
									// }
									//
									// InputStream input = new ByteArrayInputStream(sb2.toString().getBytes());
									// if (!indexfile.exists()) {
									// indexfile.create(input, true, null);
									// } else {
									// indexfile.setContents(input, IResource.FORCE, null);
									// }
									// }
								}
							} catch (PartInitException e) {

							} catch (CoreException e) {

							} catch (Exception e) {

							}
						}
					});
				} catch (InvocationTargetException e) {

				} catch (InterruptedException e) {

				}

				for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				}

				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

				Clipboard cb = new Clipboard(Display.getDefault());

				StringBuilder sb = new StringBuilder();
				for (String key : randomIds.keySet()) {

					if (!StringUtils.isEmpty(key)) {
						sb.append(key).append(" = ").append(randomIds.get(key)).append('\r').append('\n');
					}

					;
				}

				TextTransfer textTransfer = TextTransfer.getInstance();
				cb.setContents(new Object[] { sb.toString() }, new Transfer[] { textTransfer });

				DeIdentificationDialog dlg = new DeIdentificationDialog(window.getShell());
				dlg.create();
				dlg.open();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
