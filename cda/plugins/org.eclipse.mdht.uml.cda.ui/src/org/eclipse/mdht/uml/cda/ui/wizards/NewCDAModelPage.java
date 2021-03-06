/*******************************************************************************
 * Copyright (c) 2011 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.wizards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.uml2.uml.Type;

public class NewCDAModelPage extends WizardPage {

	WizardNewProjectCreationPage newProjectPage;

	public void setNewProjectPage(WizardNewProjectCreationPage newProjectPage) {
		this.newProjectPage = newProjectPage;
	}

	HashMap<String, Type> cdaDocuments;

	Combo combo;

	Text modelName;

	public Text cdaDocumentName;

	Text templateID;

	Text assigningAuthority;

	public String getModelName() {

		return modelName.getText();
	}

	public String getBasePackage() {
		return basePackage.getText();
	}

	public String getNamespaceURI() {
		return nsURI.getText();
	}

	public String getCDADocumentName() {

		return cdaDocumentName.getText();
	}

	public String getTemplateId() {

		return templateID.getText();
	}

	/**
	 * @return the nsPrefix
	 */
	public String getNsPrefix() {
		return nsPrefix.getText();
	}

	/**
	 * @return the nsURI
	 */
	public String getNsURI() {
		return nsURI.getText();
	}

	/**
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix.getText();
	}

	public String getTemplateAssigningAuthority() {

		return assigningAuthority.getText();
	}

	public String getCDADocument() {
		return combo.getText();
	}

	@Override
	public boolean canFlipToNextPage() {
		return false;
	}

	protected NewCDAModelPage(String pageName, String title, ImageDescriptor titleImage,
			HashMap<String, Type> cdaDocuments) {
		super(pageName, title, titleImage);

		this.cdaDocuments = cdaDocuments;

	}

	public Text basePackage;

	Text nsPrefix;

	Text nsURI;

	Text packageName;

	Text prefix;

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */

	public void createControl(Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);

		GridLayout layout = new GridLayout();

		layout.numColumns = 2;

		composite.setLayout(layout);

		setControl(composite);

		new Label(composite, SWT.NONE).setText("Implementation Guide Namespace ");

		modelName = new Text(composite, SWT.NONE);
		modelName.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		new Label(composite, SWT.NONE).setText("Document ");

		cdaDocumentName = new Text(composite, SWT.NONE);
		cdaDocumentName.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		new Label(composite, SWT.NONE).setText("CDA Document Conformance Reference ");

		combo = new org.eclipse.swt.widgets.Combo(composite, SWT.DROP_DOWN | SWT.READ_ONLY);

		new Label(composite, SWT.NONE).setText("Template ID (Optional) ");

		templateID = new Text(composite, SWT.NONE);
		templateID.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		new Label(composite, SWT.NONE).setText("Assigning Authority (Optional) ");

		assigningAuthority = new Text(composite, SWT.NONE);
		assigningAuthority.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		int current = 0;

		List<String> list = new ArrayList<String>();

		list.addAll(cdaDocuments.keySet());

		Collections.sort(list);

		for (String key : list) {
			combo.add(key);
			if (key.equalsIgnoreCase("cda::ClinicalDocument")) {
				combo.select(current);
			}
			current++;
		}

		ModifyListener listener = new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				packageName.setText(cdaDocumentName.getText().toLowerCase());

				nsPrefix.setText(modelName.getText().toLowerCase());

				prefix.setText(modelName.getText().toUpperCase());

				nsURI.setText(generateNSURI(basePackage.getText(), modelName.getText().toLowerCase()));

				// try {
				// Make sure the input results in valid URI
				setPageComplete(false);
				// URI.create(nsURI.getText());
				setPageComplete(
					basePackage.getText().matches("[A-Za-z0-9\\.]*") && modelName.getText().length() > 0 &&
							cdaDocumentName.getText().length() > 0);
				// } catch (Throwable throwable) {
				//
				// }

			}

		};
		modelName.addModifyListener(listener);

		cdaDocumentName.addModifyListener(listener);

		new Label(composite, SWT.NONE).setText("Document Base Package");
		basePackage = new Text(composite, SWT.NONE);
		basePackage.setText("org.eclipse.mdht.uml.cda");
		basePackage.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		basePackage.addModifyListener(listener);

		// basePackage = new Text(composite, SWT.COLOR_GRAY);
		//
		// basePackage.setText("org.eclipse.mdht.cda");
		//
		// basePackage.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		new Label(composite, SWT.NONE).setText("Namespace URI");

		nsURI = new Text(composite, SWT.NONE);
		nsURI.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		new Label(composite, SWT.NONE).setText("Document Namespace Prefix ");

		nsPrefix = new Text(composite, SWT.READ_ONLY | SWT.COLOR_GRAY);
		nsPrefix.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		new Label(composite, SWT.NONE).setText("Package Name ");

		packageName = new Text(composite, SWT.READ_ONLY | SWT.COLOR_GRAY);

		packageName.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		new Label(composite, SWT.NONE).setText("Prefix ");

		prefix = new Text(composite, SWT.NONE);
		prefix.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		setPageComplete(false);
	}

	private static String generateNSURI(String basepackage, String modelName) {

		StringBuffer sb = new StringBuffer();
		sb.append("http://www.");
		String[] segments = basepackage.split("\\.");
		sb.append(segments.length > 2
				? segments[1]
				: "").append(".");
		sb.append(segments.length > 1
				? segments[0]
				: "");
		for (int segmentCtr = 2; segmentCtr < segments.length; segmentCtr++) {
			sb.append("/").append(segments[segmentCtr]);
		}
		sb.append("/").append(modelName);
		return sb.toString();
	}
}
