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
import org.eclipse.mdht.uml.fhir.core.resources.ImagingManifestStudy;
import org.eclipse.mdht.uml.fhir.core.resources.ImagingManifestStudySeries;
import org.eclipse.mdht.uml.fhir.core.resources.ImagingManifestStudyStudyBaseLocation;
import org.eclipse.mdht.uml.fhir.core.resources.ImagingStudy;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Manifest Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingManifestStudyImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingManifestStudyImpl#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingManifestStudyImpl#getBaseLocations <em>Base Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImagingManifestStudyImpl#getSeries <em>Series</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImagingManifestStudyImpl extends BackboneElementImpl implements ImagingManifestStudy {
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
	 * The cached value of the '{@link #getImagingStudy() <em>Imaging Study</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagingStudy()
	 * @generated
	 * @ordered
	 */
	protected ImagingStudy imagingStudy;

	/**
	 * The cached value of the '{@link #getBaseLocations() <em>Base Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingManifestStudyStudyBaseLocation> baseLocations;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingManifestStudySeries> series;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingManifestStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImagingManifestStudy();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMAGING_MANIFEST_STUDY__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_MANIFEST_STUDY__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudy getImagingStudy() {
		if (imagingStudy != null && imagingStudy.eIsProxy()) {
			InternalEObject oldImagingStudy = (InternalEObject)imagingStudy;
			imagingStudy = (ImagingStudy)eResolveProxy(oldImagingStudy);
			if (imagingStudy != oldImagingStudy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMAGING_MANIFEST_STUDY__IMAGING_STUDY, oldImagingStudy, imagingStudy));
			}
		}
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudy basicGetImagingStudy() {
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagingStudy(ImagingStudy newImagingStudy) {
		ImagingStudy oldImagingStudy = imagingStudy;
		imagingStudy = newImagingStudy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_MANIFEST_STUDY__IMAGING_STUDY, oldImagingStudy, imagingStudy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingManifestStudyStudyBaseLocation> getBaseLocations() {
		if (baseLocations == null) {
			baseLocations = new EObjectContainmentEList<ImagingManifestStudyStudyBaseLocation>(ImagingManifestStudyStudyBaseLocation.class, this, ResourcesPackage.IMAGING_MANIFEST_STUDY__BASE_LOCATION);
		}
		return baseLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingManifestStudySeries> getSeries() {
		if (series == null) {
			series = new EObjectContainmentEList<ImagingManifestStudySeries>(ImagingManifestStudySeries.class, this, ResourcesPackage.IMAGING_MANIFEST_STUDY__SERIES);
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__BASE_LOCATION:
				return ((InternalEList<?>)getBaseLocations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__SERIES:
				return ((InternalEList<?>)getSeries()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__UID:
				if (resolve) return getUid();
				return basicGetUid();
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__IMAGING_STUDY:
				if (resolve) return getImagingStudy();
				return basicGetImagingStudy();
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__BASE_LOCATION:
				return getBaseLocations();
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__SERIES:
				return getSeries();
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
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__UID:
				setUid((Oid)newValue);
				return;
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__IMAGING_STUDY:
				setImagingStudy((ImagingStudy)newValue);
				return;
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__BASE_LOCATION:
				getBaseLocations().clear();
				getBaseLocations().addAll((Collection<? extends ImagingManifestStudyStudyBaseLocation>)newValue);
				return;
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__SERIES:
				getSeries().clear();
				getSeries().addAll((Collection<? extends ImagingManifestStudySeries>)newValue);
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
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__UID:
				setUid((Oid)null);
				return;
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__IMAGING_STUDY:
				setImagingStudy((ImagingStudy)null);
				return;
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__BASE_LOCATION:
				getBaseLocations().clear();
				return;
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__SERIES:
				getSeries().clear();
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
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__UID:
				return uid != null;
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__IMAGING_STUDY:
				return imagingStudy != null;
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__BASE_LOCATION:
				return baseLocations != null && !baseLocations.isEmpty();
			case ResourcesPackage.IMAGING_MANIFEST_STUDY__SERIES:
				return series != null && !series.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingManifestStudyImpl
