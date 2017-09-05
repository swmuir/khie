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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ClinicalImpressionFinding;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Impression Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionFindingImpl#getItemx <em>Itemx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClinicalImpressionFindingImpl#getBasis <em>Basis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalImpressionFindingImpl extends BackboneElementImpl implements ClinicalImpressionFinding {
	/**
	 * The cached value of the '{@link #getItemx() <em>Itemx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemx()
	 * @generated
	 * @ordered
	 */
	protected Base itemx;

	/**
	 * The cached value of the '{@link #getBasis() <em>Basis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasis()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String basis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalImpressionFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClinicalImpressionFinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getItemx() {
		if (itemx != null && itemx.eIsProxy()) {
			InternalEObject oldItemx = (InternalEObject)itemx;
			itemx = (Base)eResolveProxy(oldItemx);
			if (itemx != oldItemx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEMX, oldItemx, itemx));
			}
		}
		return itemx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetItemx() {
		return itemx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemx(Base newItemx) {
		Base oldItemx = itemx;
		itemx = newItemx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEMX, oldItemx, itemx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getBasis() {
		if (basis != null && basis.eIsProxy()) {
			InternalEObject oldBasis = (InternalEObject)basis;
			basis = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldBasis);
			if (basis != oldBasis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLINICAL_IMPRESSION_FINDING__BASIS, oldBasis, basis));
			}
		}
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetBasis() {
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasis(org.eclipse.mdht.uml.fhir.core.dataTypes.String newBasis) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldBasis = basis;
		basis = newBasis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLINICAL_IMPRESSION_FINDING__BASIS, oldBasis, basis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEMX:
				if (resolve) return getItemx();
				return basicGetItemx();
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__BASIS:
				if (resolve) return getBasis();
				return basicGetBasis();
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
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEMX:
				setItemx((Base)newValue);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__BASIS:
				setBasis((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEMX:
				setItemx((Base)null);
				return;
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__BASIS:
				setBasis((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__ITEMX:
				return itemx != null;
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING__BASIS:
				return basis != null;
		}
		return super.eIsSet(featureID);
	}

} //ClinicalImpressionFindingImpl
