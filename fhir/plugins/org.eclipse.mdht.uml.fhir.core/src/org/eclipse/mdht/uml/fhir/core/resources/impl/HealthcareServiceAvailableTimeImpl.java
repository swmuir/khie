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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Time;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.HealthcareServiceAvailableTime;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Healthcare Service Available Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceAvailableTimeImpl#getDaysOfWeeks <em>Days Of Week</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceAvailableTimeImpl#getAllDay <em>All Day</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceAvailableTimeImpl#getAvailableStartTime <em>Available Start Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceAvailableTimeImpl#getAvailableEndTime <em>Available End Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HealthcareServiceAvailableTimeImpl extends BackboneElementImpl implements HealthcareServiceAvailableTime {
	/**
	 * The cached value of the '{@link #getDaysOfWeeks() <em>Days Of Week</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysOfWeeks()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> daysOfWeeks;

	/**
	 * The cached value of the '{@link #getAllDay() <em>All Day</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllDay()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean allDay;

	/**
	 * The cached value of the '{@link #getAvailableStartTime() <em>Available Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableStartTime()
	 * @generated
	 * @ordered
	 */
	protected Time availableStartTime;

	/**
	 * The cached value of the '{@link #getAvailableEndTime() <em>Available End Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableEndTime()
	 * @generated
	 * @ordered
	 */
	protected Time availableEndTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthcareServiceAvailableTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getHealthcareServiceAvailableTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getDaysOfWeeks() {
		if (daysOfWeeks == null) {
			daysOfWeeks = new EObjectResolvingEList<Code>(Code.class, this, ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__DAYS_OF_WEEK);
		}
		return daysOfWeeks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getAllDay() {
		if (allDay != null && allDay.eIsProxy()) {
			InternalEObject oldAllDay = (InternalEObject)allDay;
			allDay = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldAllDay);
			if (allDay != oldAllDay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__ALL_DAY, oldAllDay, allDay));
			}
		}
		return allDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetAllDay() {
		return allDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllDay(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newAllDay) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldAllDay = allDay;
		allDay = newAllDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__ALL_DAY, oldAllDay, allDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getAvailableStartTime() {
		if (availableStartTime != null && availableStartTime.eIsProxy()) {
			InternalEObject oldAvailableStartTime = (InternalEObject)availableStartTime;
			availableStartTime = (Time)eResolveProxy(oldAvailableStartTime);
			if (availableStartTime != oldAvailableStartTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_START_TIME, oldAvailableStartTime, availableStartTime));
			}
		}
		return availableStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetAvailableStartTime() {
		return availableStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableStartTime(Time newAvailableStartTime) {
		Time oldAvailableStartTime = availableStartTime;
		availableStartTime = newAvailableStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_START_TIME, oldAvailableStartTime, availableStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getAvailableEndTime() {
		if (availableEndTime != null && availableEndTime.eIsProxy()) {
			InternalEObject oldAvailableEndTime = (InternalEObject)availableEndTime;
			availableEndTime = (Time)eResolveProxy(oldAvailableEndTime);
			if (availableEndTime != oldAvailableEndTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_END_TIME, oldAvailableEndTime, availableEndTime));
			}
		}
		return availableEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetAvailableEndTime() {
		return availableEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableEndTime(Time newAvailableEndTime) {
		Time oldAvailableEndTime = availableEndTime;
		availableEndTime = newAvailableEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_END_TIME, oldAvailableEndTime, availableEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__DAYS_OF_WEEK:
				return getDaysOfWeeks();
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__ALL_DAY:
				if (resolve) return getAllDay();
				return basicGetAllDay();
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_START_TIME:
				if (resolve) return getAvailableStartTime();
				return basicGetAvailableStartTime();
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_END_TIME:
				if (resolve) return getAvailableEndTime();
				return basicGetAvailableEndTime();
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
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__DAYS_OF_WEEK:
				getDaysOfWeeks().clear();
				getDaysOfWeeks().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__ALL_DAY:
				setAllDay((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_START_TIME:
				setAvailableStartTime((Time)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_END_TIME:
				setAvailableEndTime((Time)newValue);
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
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__DAYS_OF_WEEK:
				getDaysOfWeeks().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__ALL_DAY:
				setAllDay((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_START_TIME:
				setAvailableStartTime((Time)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_END_TIME:
				setAvailableEndTime((Time)null);
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
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__DAYS_OF_WEEK:
				return daysOfWeeks != null && !daysOfWeeks.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__ALL_DAY:
				return allDay != null;
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_START_TIME:
				return availableStartTime != null;
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME__AVAILABLE_END_TIME:
				return availableEndTime != null;
		}
		return super.eIsSet(featureID);
	}

} //HealthcareServiceAvailableTimeImpl
