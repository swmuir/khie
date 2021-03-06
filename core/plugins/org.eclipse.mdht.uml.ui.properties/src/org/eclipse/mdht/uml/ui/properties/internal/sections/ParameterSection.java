/*******************************************************************************
 * Copyright (c) 2006, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - Handle element wrappers (artf3238)
 *                        - implement handling of live validation roll-back (artf3318)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.eclipse.mdht.uml.ui.properties.sections.WrapperAwareModelerPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Parameter;

/**
 * The general properties section for Property.
 *
 * $Id: $
 */
public class ParameterSection extends WrapperAwareModelerPropertySection {

	private Parameter parameter;

	private CLabel typeName;

	private Button typeButton;

	private void openPropertyTypeDialog(final Parameter param) {
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(param);

		final NamedElement type = DialogLaunchUtil.chooseElement(
			new java.lang.Class[] { org.eclipse.uml2.uml.Class.class, DataType.class }, editingDomain.getResourceSet(),
			getPart().getSite().getShell());

		if (type != null) {
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Set Type") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					param.setType((Classifier) type);

					return Status.OK_STATUS;
				}
			};

			execute(operation);
		}
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormData data = null;

		Shell shell = new Shell();
		GC gc = new GC(shell);
		gc.setFont(shell.getFont());
		Point point = gc.textExtent("");//$NON-NLS-1$
		int buttonHeight = point.y + 10;
		gc.dispose();
		shell.dispose();

		CLabel typeLabel = getWidgetFactory().createCLabel(composite, "Type:"); //$NON-NLS-1$
		typeName = getWidgetFactory().createCLabel(composite, ""); //$NON-NLS-1$

		typeButton = getWidgetFactory().createButton(composite, "Select Type...", SWT.PUSH); //$NON-NLS-1$
		typeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				openPropertyTypeDialog(parameter);
			}
		});

		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(typeName, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, 0);
		typeLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.right = new FormAttachment(typeButton, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, 0);
		typeName.setLayoutData(data);

		data = new FormData();
		data.right = new FormAttachment(70, 0);
		data.top = new FormAttachment(0, 0);
		data.height = buttonHeight;
		typeButton.setLayoutData(data);

	}

	@Override
	protected boolean isReadOnly() {
		if (parameter != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(parameter);
			if (editingDomain != null && editingDomain.isReadOnly(parameter.eResource())) {
				return true;
			}
		}

		return super.isReadOnly();
	}

	/*
	 * Override super implementation to allow for objects that are not IAdaptable.
	 *
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection#addToEObjectList(java.lang.Object)
	 */
	@Override
	protected boolean addToEObjectList(Object object) {
		boolean added = super.addToEObjectList(object);
		if (!added && object instanceof Element) {
			getEObjectList().add(object);
			added = true;
		}
		return added;
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();
		if (element instanceof View) {
			element = ((View) element).getElement();
		}
		Assert.isTrue(element instanceof Parameter);
		this.parameter = (Parameter) element;
	}

	@Override
	public void dispose() {
		super.dispose();

	}

	@Override
	public void refresh() {
		if (parameter.getType() != null && parameter.getType().getQualifiedName() != null) {
			typeName.setText(parameter.getType().getQualifiedName());
		} else {
			typeName.setText("");
		}

		if (isReadOnly()) {
			typeButton.setEnabled(false);
		} else {
			typeButton.setEnabled(true);
		}
	}

	/**
	 * Update if nessesary, upon receiving the model event.
	 *
	 * @see #aboutToBeShown()
	 * @see #aboutToBeHidden()
	 * @param notification
	 *            -
	 *            even notification
	 * @param element
	 *            -
	 *            element that has changed
	 */
	@Override
	public void update(final Notification notification, EObject element) {
		if (!isDisposed()) {
			postUpdateRequest(new Runnable() {

				public void run() {
					if (!isDisposed() && !isNotifierDeleted(notification)) {
						refresh();
					}
				}
			});
		}
	}

}
