/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getEventTimingx <em>Event Timingx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getEventData <em>Event Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTriggerDefinition()
 * @model
 * @generated
 */
public interface TriggerDefinition extends DataType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTriggerDefinition_Type()
	 * @model required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Event Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Name</em>' reference.
	 * @see #setEventName(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTriggerDefinition_EventName()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getEventName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getEventName <em>Event Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Name</em>' reference.
	 * @see #getEventName()
	 * @generated
	 */
	void setEventName(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Event Timingx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Timingx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Timingx</em>' reference.
	 * @see #setEventTimingx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTriggerDefinition_EventTimingx()
	 * @model
	 * @generated
	 */
	Base getEventTimingx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getEventTimingx <em>Event Timingx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Timingx</em>' reference.
	 * @see #getEventTimingx()
	 * @generated
	 */
	void setEventTimingx(Base value);

	/**
	 * Returns the value of the '<em><b>Event Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Data</em>' reference.
	 * @see #setEventData(DataRequirement)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getTriggerDefinition_EventData()
	 * @model
	 * @generated
	 */
	DataRequirement getEventData();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.TriggerDefinition#getEventData <em>Event Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Data</em>' reference.
	 * @see #getEventData()
	 * @generated
	 */
	void setEventData(DataRequirement value);

} // TriggerDefinition
