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
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.MedicationProductBatch;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Product Batch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationProductBatchImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationProductBatchImpl#getExpirationDate <em>Expiration Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationProductBatchImpl extends BackboneElementImpl implements MedicationProductBatch {
	/**
	 * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String lotNumber;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime expirationDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationProductBatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationProductBatch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getLotNumber() {
		if (lotNumber != null && lotNumber.eIsProxy()) {
			InternalEObject oldLotNumber = (InternalEObject)lotNumber;
			lotNumber = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldLotNumber);
			if (lotNumber != oldLotNumber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_PRODUCT_BATCH__LOT_NUMBER, oldLotNumber, lotNumber));
			}
		}
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetLotNumber() {
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLotNumber(org.eclipse.mdht.uml.fhir.core.dataTypes.String newLotNumber) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldLotNumber = lotNumber;
		lotNumber = newLotNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_PRODUCT_BATCH__LOT_NUMBER, oldLotNumber, lotNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getExpirationDate() {
		if (expirationDate != null && expirationDate.eIsProxy()) {
			InternalEObject oldExpirationDate = (InternalEObject)expirationDate;
			expirationDate = (DateTime)eResolveProxy(oldExpirationDate);
			if (expirationDate != oldExpirationDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_PRODUCT_BATCH__EXPIRATION_DATE, oldExpirationDate, expirationDate));
			}
		}
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(DateTime newExpirationDate) {
		DateTime oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_PRODUCT_BATCH__EXPIRATION_DATE, oldExpirationDate, expirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_PRODUCT_BATCH__LOT_NUMBER:
				if (resolve) return getLotNumber();
				return basicGetLotNumber();
			case ResourcesPackage.MEDICATION_PRODUCT_BATCH__EXPIRATION_DATE:
				if (resolve) return getExpirationDate();
				return basicGetExpirationDate();
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
			case ResourcesPackage.MEDICATION_PRODUCT_BATCH__LOT_NUMBER:
				setLotNumber((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEDICATION_PRODUCT_BATCH__EXPIRATION_DATE:
				setExpirationDate((DateTime)newValue);
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
			case ResourcesPackage.MEDICATION_PRODUCT_BATCH__LOT_NUMBER:
				setLotNumber((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.MEDICATION_PRODUCT_BATCH__EXPIRATION_DATE:
				setExpirationDate((DateTime)null);
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
			case ResourcesPackage.MEDICATION_PRODUCT_BATCH__LOT_NUMBER:
				return lotNumber != null;
			case ResourcesPackage.MEDICATION_PRODUCT_BATCH__EXPIRATION_DATE:
				return expirationDate != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationProductBatchImpl
