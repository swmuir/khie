/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage;
import org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TriggerDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TriggerDefinitionImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TriggerDefinitionImpl#getEventTimingx <em>Event Timingx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.TriggerDefinitionImpl#getEventData <em>Event Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerDefinitionImpl extends DataTypeImpl implements TriggerDefinition {
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
	 * The cached value of the '{@link #getEventName() <em>Event Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String eventName;

	/**
	 * The cached value of the '{@link #getEventTimingx() <em>Event Timingx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTimingx()
	 * @generated
	 * @ordered
	 */
	protected Base eventTimingx;

	/**
	 * The cached value of the '{@link #getEventData() <em>Event Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventData()
	 * @generated
	 * @ordered
	 */
	protected DataRequirement eventData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.TRIGGER_DEFINITION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TRIGGER_DEFINITION__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TRIGGER_DEFINITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getEventName() {
		if (eventName != null && eventName.eIsProxy()) {
			InternalEObject oldEventName = (InternalEObject)eventName;
			eventName = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldEventName);
			if (eventName != oldEventName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TRIGGER_DEFINITION__EVENT_NAME, oldEventName, eventName));
			}
		}
		return eventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetEventName() {
		return eventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventName(org.eclipse.mdht.uml.fhir.core.dataTypes.String newEventName) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldEventName = eventName;
		eventName = newEventName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TRIGGER_DEFINITION__EVENT_NAME, oldEventName, eventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getEventTimingx() {
		if (eventTimingx != null && eventTimingx.eIsProxy()) {
			InternalEObject oldEventTimingx = (InternalEObject)eventTimingx;
			eventTimingx = (Base)eResolveProxy(oldEventTimingx);
			if (eventTimingx != oldEventTimingx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TRIGGER_DEFINITION__EVENT_TIMINGX, oldEventTimingx, eventTimingx));
			}
		}
		return eventTimingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetEventTimingx() {
		return eventTimingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventTimingx(Base newEventTimingx) {
		Base oldEventTimingx = eventTimingx;
		eventTimingx = newEventTimingx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TRIGGER_DEFINITION__EVENT_TIMINGX, oldEventTimingx, eventTimingx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirement getEventData() {
		if (eventData != null && eventData.eIsProxy()) {
			InternalEObject oldEventData = (InternalEObject)eventData;
			eventData = (DataRequirement)eResolveProxy(oldEventData);
			if (eventData != oldEventData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.TRIGGER_DEFINITION__EVENT_DATA, oldEventData, eventData));
			}
		}
		return eventData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirement basicGetEventData() {
		return eventData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventData(DataRequirement newEventData) {
		DataRequirement oldEventData = eventData;
		eventData = newEventData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TRIGGER_DEFINITION__EVENT_DATA, oldEventData, eventData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.TRIGGER_DEFINITION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case DataTypesPackage.TRIGGER_DEFINITION__EVENT_NAME:
				if (resolve) return getEventName();
				return basicGetEventName();
			case DataTypesPackage.TRIGGER_DEFINITION__EVENT_TIMINGX:
				if (resolve) return getEventTimingx();
				return basicGetEventTimingx();
			case DataTypesPackage.TRIGGER_DEFINITION__EVENT_DATA:
				if (resolve) return getEventData();
				return basicGetEventData();
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
			case DataTypesPackage.TRIGGER_DEFINITION__TYPE:
				setType((Code)newValue);
				return;
			case DataTypesPackage.TRIGGER_DEFINITION__EVENT_NAME:
				setEventName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case DataTypesPackage.TRIGGER_DEFINITION__EVENT_TIMINGX:
				setEventTimingx((Base)newValue);
				return;
			case DataTypesPackage.TRIGGER_DEFINITION__EVENT_DATA:
				setEventData((DataRequirement)newValue);
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
			case DataTypesPackage.TRIGGER_DEFINITION__TYPE:
				setType((Code)null);
				return;
			case DataTypesPackage.TRIGGER_DEFINITION__EVENT_NAME:
				setEventName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case DataTypesPackage.TRIGGER_DEFINITION__EVENT_TIMINGX:
				setEventTimingx((Base)null);
				return;
			case DataTypesPackage.TRIGGER_DEFINITION__EVENT_DATA:
				setEventData((DataRequirement)null);
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
			case DataTypesPackage.TRIGGER_DEFINITION__TYPE:
				return type != null;
			case DataTypesPackage.TRIGGER_DEFINITION__EVENT_NAME:
				return eventName != null;
			case DataTypesPackage.TRIGGER_DEFINITION__EVENT_TIMINGX:
				return eventTimingx != null;
			case DataTypesPackage.TRIGGER_DEFINITION__EVENT_DATA:
				return eventData != null;
		}
		return super.eIsSet(featureID);
	}

} //TriggerDefinitionImpl
