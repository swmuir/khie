/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Oid;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ImagingManifestStudySeries;
import org.eclipse.mdht.uml.fhir.core.resources.ImagingManifestStudySeriesInstance;
import org.eclipse.mdht.uml.fhir.core.resources.ImagingManifestStudySeriesSeriesBaseLocation;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Manifest Study Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingManifestStudySeriesImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingManifestStudySeriesImpl#getBaseLocations <em>Base Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingManifestStudySeriesImpl#getInstances <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImagingManifestStudySeriesImpl extends BackboneElementImpl implements ImagingManifestStudySeries {
	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected Oid uid;

	/**
	 * The cached value of the '{@link #getBaseLocations() <em>Base Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingManifestStudySeriesSeriesBaseLocation> baseLocations;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingManifestStudySeriesInstance> instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingManifestStudySeriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImagingManifestStudySeries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getUid() {
		if (uid != null && uid.eIsProxy()) {
			InternalEObject oldUid = (InternalEObject)uid;
			uid = (Oid)eResolveProxy(oldUid);
			if (uid != oldUid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__UID, oldUid, uid));
			}
		}
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid basicGetUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(Oid newUid) {
		Oid oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingManifestStudySeriesSeriesBaseLocation> getBaseLocations() {
		if (baseLocations == null) {
			baseLocations = new EObjectContainmentEList<ImagingManifestStudySeriesSeriesBaseLocation>(ImagingManifestStudySeriesSeriesBaseLocation.class, this, ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__BASE_LOCATION);
		}
		return baseLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingManifestStudySeriesInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<ImagingManifestStudySeriesInstance>(ImagingManifestStudySeriesInstance.class, this, ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__INSTANCE);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__BASE_LOCATION:
				return ((InternalEList<?>)getBaseLocations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__INSTANCE:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__UID:
				if (resolve) return getUid();
				return basicGetUid();
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__BASE_LOCATION:
				return getBaseLocations();
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__INSTANCE:
				return getInstances();
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
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__UID:
				setUid((Oid)newValue);
				return;
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__BASE_LOCATION:
				getBaseLocations().clear();
				getBaseLocations().addAll((Collection<? extends ImagingManifestStudySeriesSeriesBaseLocation>)newValue);
				return;
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__INSTANCE:
				getInstances().clear();
				getInstances().addAll((Collection<? extends ImagingManifestStudySeriesInstance>)newValue);
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
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__UID:
				setUid((Oid)null);
				return;
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__BASE_LOCATION:
				getBaseLocations().clear();
				return;
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__INSTANCE:
				getInstances().clear();
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
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__UID:
				return uid != null;
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__BASE_LOCATION:
				return baseLocations != null && !baseLocations.isEmpty();
			case ResourcesPackage.IMAGING_MANIFEST_STUDY_SERIES__INSTANCE:
				return instances != null && !instances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingManifestStudySeriesImpl
