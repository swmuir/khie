/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.SequenceRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceRepositoryImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceRepositoryImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceRepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceRepositoryImpl#getDatasetId <em>Dataset Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceRepositoryImpl#getVariantsetId <em>Variantset Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceRepositoryImpl#getReadsetId <em>Readset Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceRepositoryImpl extends BackboneElementImpl implements SequenceRepository {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getDatasetId() <em>Dataset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String datasetId;

	/**
	 * The cached value of the '{@link #getVariantsetId() <em>Variantset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantsetId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String variantsetId;

	/**
	 * The cached value of the '{@link #getReadsetId() <em>Readset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadsetId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String readsetId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSequenceRepository();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Code)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_REPOSITORY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_REPOSITORY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		if (url != null && url.eIsProxy()) {
			InternalEObject oldUrl = (InternalEObject)url;
			url = (Uri)eResolveProxy(oldUrl);
			if (url != oldUrl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_REPOSITORY__URL, oldUrl, url));
			}
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_REPOSITORY__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_REPOSITORY__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.eclipse.mdht.uml.fhir.core.dataTypes.String newName) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_REPOSITORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDatasetId() {
		if (datasetId != null && datasetId.eIsProxy()) {
			InternalEObject oldDatasetId = (InternalEObject)datasetId;
			datasetId = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDatasetId);
			if (datasetId != oldDatasetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_REPOSITORY__DATASET_ID, oldDatasetId, datasetId));
			}
		}
		return datasetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDatasetId() {
		return datasetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatasetId(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDatasetId) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDatasetId = datasetId;
		datasetId = newDatasetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_REPOSITORY__DATASET_ID, oldDatasetId, datasetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getVariantsetId() {
		if (variantsetId != null && variantsetId.eIsProxy()) {
			InternalEObject oldVariantsetId = (InternalEObject)variantsetId;
			variantsetId = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldVariantsetId);
			if (variantsetId != oldVariantsetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_REPOSITORY__VARIANTSET_ID, oldVariantsetId, variantsetId));
			}
		}
		return variantsetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetVariantsetId() {
		return variantsetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariantsetId(org.eclipse.mdht.uml.fhir.core.dataTypes.String newVariantsetId) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldVariantsetId = variantsetId;
		variantsetId = newVariantsetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_REPOSITORY__VARIANTSET_ID, oldVariantsetId, variantsetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getReadsetId() {
		if (readsetId != null && readsetId.eIsProxy()) {
			InternalEObject oldReadsetId = (InternalEObject)readsetId;
			readsetId = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldReadsetId);
			if (readsetId != oldReadsetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_REPOSITORY__READSET_ID, oldReadsetId, readsetId));
			}
		}
		return readsetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetReadsetId() {
		return readsetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadsetId(org.eclipse.mdht.uml.fhir.core.dataTypes.String newReadsetId) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldReadsetId = readsetId;
		readsetId = newReadsetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_REPOSITORY__READSET_ID, oldReadsetId, readsetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.SEQUENCE_REPOSITORY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.SEQUENCE_REPOSITORY__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case ResourcesPackage.SEQUENCE_REPOSITORY__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ResourcesPackage.SEQUENCE_REPOSITORY__DATASET_ID:
				if (resolve) return getDatasetId();
				return basicGetDatasetId();
			case ResourcesPackage.SEQUENCE_REPOSITORY__VARIANTSET_ID:
				if (resolve) return getVariantsetId();
				return basicGetVariantsetId();
			case ResourcesPackage.SEQUENCE_REPOSITORY__READSET_ID:
				if (resolve) return getReadsetId();
				return basicGetReadsetId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.SEQUENCE_REPOSITORY__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.SEQUENCE_REPOSITORY__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.SEQUENCE_REPOSITORY__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEQUENCE_REPOSITORY__DATASET_ID:
				setDatasetId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEQUENCE_REPOSITORY__VARIANTSET_ID:
				setVariantsetId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEQUENCE_REPOSITORY__READSET_ID:
				setReadsetId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.SEQUENCE_REPOSITORY__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.SEQUENCE_REPOSITORY__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.SEQUENCE_REPOSITORY__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SEQUENCE_REPOSITORY__DATASET_ID:
				setDatasetId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SEQUENCE_REPOSITORY__VARIANTSET_ID:
				setVariantsetId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SEQUENCE_REPOSITORY__READSET_ID:
				setReadsetId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.SEQUENCE_REPOSITORY__TYPE:
				return type != null;
			case ResourcesPackage.SEQUENCE_REPOSITORY__URL:
				return url != null;
			case ResourcesPackage.SEQUENCE_REPOSITORY__NAME:
				return name != null;
			case ResourcesPackage.SEQUENCE_REPOSITORY__DATASET_ID:
				return datasetId != null;
			case ResourcesPackage.SEQUENCE_REPOSITORY__VARIANTSET_ID:
				return variantsetId != null;
			case ResourcesPackage.SEQUENCE_REPOSITORY__READSET_ID:
				return readsetId != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceRepositoryImpl
