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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Duration;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.dataTypes.PositiveInt;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;
import org.eclipse.mdht.uml.fhir.core.resources.MedicationRequestDispenseRequest;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Request Dispense Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestDispenseRequestImpl#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestDispenseRequestImpl#getNumberOfRepeatsAllowed <em>Number Of Repeats Allowed</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestDispenseRequestImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestDispenseRequestImpl#getExpectedSupplyDuration <em>Expected Supply Duration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationRequestDispenseRequestImpl#getPerformer <em>Performer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationRequestDispenseRequestImpl extends BackboneElementImpl implements MedicationRequestDispenseRequest {
	/**
	 * The cached value of the '{@link #getValidityPeriod() <em>Validity Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period validityPeriod;

	/**
	 * The cached value of the '{@link #getNumberOfRepeatsAllowed() <em>Number Of Repeats Allowed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRepeatsAllowed()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt numberOfRepeatsAllowed;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

	/**
	 * The cached value of the '{@link #getExpectedSupplyDuration() <em>Expected Supply Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedSupplyDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration expectedSupplyDuration;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Organization performer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationRequestDispenseRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationRequestDispenseRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getValidityPeriod() {
		if (validityPeriod != null && validityPeriod.eIsProxy()) {
			InternalEObject oldValidityPeriod = (InternalEObject)validityPeriod;
			validityPeriod = (Period)eResolveProxy(oldValidityPeriod);
			if (validityPeriod != oldValidityPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__VALIDITY_PERIOD, oldValidityPeriod, validityPeriod));
			}
		}
		return validityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetValidityPeriod() {
		return validityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidityPeriod(Period newValidityPeriod) {
		Period oldValidityPeriod = validityPeriod;
		validityPeriod = newValidityPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__VALIDITY_PERIOD, oldValidityPeriod, validityPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getNumberOfRepeatsAllowed() {
		if (numberOfRepeatsAllowed != null && numberOfRepeatsAllowed.eIsProxy()) {
			InternalEObject oldNumberOfRepeatsAllowed = (InternalEObject)numberOfRepeatsAllowed;
			numberOfRepeatsAllowed = (PositiveInt)eResolveProxy(oldNumberOfRepeatsAllowed);
			if (numberOfRepeatsAllowed != oldNumberOfRepeatsAllowed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED, oldNumberOfRepeatsAllowed, numberOfRepeatsAllowed));
			}
		}
		return numberOfRepeatsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetNumberOfRepeatsAllowed() {
		return numberOfRepeatsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRepeatsAllowed(PositiveInt newNumberOfRepeatsAllowed) {
		PositiveInt oldNumberOfRepeatsAllowed = numberOfRepeatsAllowed;
		numberOfRepeatsAllowed = newNumberOfRepeatsAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED, oldNumberOfRepeatsAllowed, numberOfRepeatsAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getQuantity() {
		if (quantity != null && quantity.eIsProxy()) {
			InternalEObject oldQuantity = (InternalEObject)quantity;
			quantity = (SimpleQuantity)eResolveProxy(oldQuantity);
			if (quantity != oldQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__QUANTITY, oldQuantity, quantity));
			}
		}
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(SimpleQuantity newQuantity) {
		SimpleQuantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getExpectedSupplyDuration() {
		if (expectedSupplyDuration != null && expectedSupplyDuration.eIsProxy()) {
			InternalEObject oldExpectedSupplyDuration = (InternalEObject)expectedSupplyDuration;
			expectedSupplyDuration = (Duration)eResolveProxy(oldExpectedSupplyDuration);
			if (expectedSupplyDuration != oldExpectedSupplyDuration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION, oldExpectedSupplyDuration, expectedSupplyDuration));
			}
		}
		return expectedSupplyDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration basicGetExpectedSupplyDuration() {
		return expectedSupplyDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedSupplyDuration(Duration newExpectedSupplyDuration) {
		Duration oldExpectedSupplyDuration = expectedSupplyDuration;
		expectedSupplyDuration = newExpectedSupplyDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION, oldExpectedSupplyDuration, expectedSupplyDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getPerformer() {
		if (performer != null && performer.eIsProxy()) {
			InternalEObject oldPerformer = (InternalEObject)performer;
			performer = (Organization)eResolveProxy(oldPerformer);
			if (performer != oldPerformer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__PERFORMER, oldPerformer, performer));
			}
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Organization newPerformer) {
		Organization oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__PERFORMER, oldPerformer, performer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__VALIDITY_PERIOD:
				if (resolve) return getValidityPeriod();
				return basicGetValidityPeriod();
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED:
				if (resolve) return getNumberOfRepeatsAllowed();
				return basicGetNumberOfRepeatsAllowed();
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION:
				if (resolve) return getExpectedSupplyDuration();
				return basicGetExpectedSupplyDuration();
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__PERFORMER:
				if (resolve) return getPerformer();
				return basicGetPerformer();
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
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__VALIDITY_PERIOD:
				setValidityPeriod((Period)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED:
				setNumberOfRepeatsAllowed((PositiveInt)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION:
				setExpectedSupplyDuration((Duration)newValue);
				return;
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__PERFORMER:
				setPerformer((Organization)newValue);
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
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__VALIDITY_PERIOD:
				setValidityPeriod((Period)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED:
				setNumberOfRepeatsAllowed((PositiveInt)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION:
				setExpectedSupplyDuration((Duration)null);
				return;
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__PERFORMER:
				setPerformer((Organization)null);
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
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__VALIDITY_PERIOD:
				return validityPeriod != null;
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__NUMBER_OF_REPEATS_ALLOWED:
				return numberOfRepeatsAllowed != null;
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__QUANTITY:
				return quantity != null;
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__EXPECTED_SUPPLY_DURATION:
				return expectedSupplyDuration != null;
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST__PERFORMER:
				return performer != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationRequestDispenseRequestImpl
