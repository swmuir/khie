/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.DocumentReferenceContent;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Reference Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DocumentReferenceContentImpl#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DocumentReferenceContentImpl#getFormats <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentReferenceContentImpl extends BackboneElementImpl implements DocumentReferenceContent {
	/**
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachment;

	/**
	 * The cached value of the '{@link #getFormats() <em>Format</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> formats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentReferenceContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDocumentReferenceContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachment() {
		if (attachment != null && attachment.eIsProxy()) {
			InternalEObject oldAttachment = (InternalEObject)attachment;
			attachment = (Attachment)eResolveProxy(oldAttachment);
			if (attachment != oldAttachment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT, oldAttachment, attachment));
			}
		}
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment basicGetAttachment() {
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment(Attachment newAttachment) {
		Attachment oldAttachment = attachment;
		attachment = newAttachment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT, oldAttachment, attachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getFormats() {
		if (formats == null) {
			formats = new EObjectResolvingEList<Coding>(Coding.class, this, ResourcesPackage.DOCUMENT_REFERENCE_CONTENT__FORMAT);
		}
		return formats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				if (resolve) return getAttachment();
				return basicGetAttachment();
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTENT__FORMAT:
				return getFormats();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				setAttachment((Attachment)newValue);
				return;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTENT__FORMAT:
				getFormats().clear();
				getFormats().addAll((Collection<? extends Coding>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				setAttachment((Attachment)null);
				return;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTENT__FORMAT:
				getFormats().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				return attachment != null;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTENT__FORMAT:
				return formats != null && !formats.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentReferenceContentImpl
