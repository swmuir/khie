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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.AccountGuarantor;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Guarantor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AccountGuarantorImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AccountGuarantorImpl#getOnHold <em>On Hold</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AccountGuarantorImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccountGuarantorImpl extends BackboneElementImpl implements AccountGuarantor {
	/**
	 * The cached value of the '{@link #getParty() <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParty()
	 * @generated
	 * @ordered
	 */
	protected Resource party;

	/**
	 * The cached value of the '{@link #getOnHold() <em>On Hold</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnHold()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean onHold;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountGuarantorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getAccountGuarantor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getParty() {
		if (party != null && party.eIsProxy()) {
			InternalEObject oldParty = (InternalEObject)party;
			party = (Resource)eResolveProxy(oldParty);
			if (party != oldParty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ACCOUNT_GUARANTOR__PARTY, oldParty, party));
			}
		}
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetParty() {
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParty(Resource newParty) {
		Resource oldParty = party;
		party = newParty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT_GUARANTOR__PARTY, oldParty, party));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getOnHold() {
		if (onHold != null && onHold.eIsProxy()) {
			InternalEObject oldOnHold = (InternalEObject)onHold;
			onHold = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldOnHold);
			if (onHold != oldOnHold) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ACCOUNT_GUARANTOR__ON_HOLD, oldOnHold, onHold));
			}
		}
		return onHold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetOnHold() {
		return onHold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnHold(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newOnHold) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldOnHold = onHold;
		onHold = newOnHold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT_GUARANTOR__ON_HOLD, oldOnHold, onHold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (Period)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ACCOUNT_GUARANTOR__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT_GUARANTOR__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.ACCOUNT_GUARANTOR__PARTY:
				if (resolve) return getParty();
				return basicGetParty();
			case ResourcesPackage.ACCOUNT_GUARANTOR__ON_HOLD:
				if (resolve) return getOnHold();
				return basicGetOnHold();
			case ResourcesPackage.ACCOUNT_GUARANTOR__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
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
			case ResourcesPackage.ACCOUNT_GUARANTOR__PARTY:
				setParty((Resource)newValue);
				return;
			case ResourcesPackage.ACCOUNT_GUARANTOR__ON_HOLD:
				setOnHold((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.ACCOUNT_GUARANTOR__PERIOD:
				setPeriod((Period)newValue);
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
			case ResourcesPackage.ACCOUNT_GUARANTOR__PARTY:
				setParty((Resource)null);
				return;
			case ResourcesPackage.ACCOUNT_GUARANTOR__ON_HOLD:
				setOnHold((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.ACCOUNT_GUARANTOR__PERIOD:
				setPeriod((Period)null);
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
			case ResourcesPackage.ACCOUNT_GUARANTOR__PARTY:
				return party != null;
			case ResourcesPackage.ACCOUNT_GUARANTOR__ON_HOLD:
				return onHold != null;
			case ResourcesPackage.ACCOUNT_GUARANTOR__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

} //AccountGuarantorImpl
