/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Plan Activity Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getGoals <em>Goal</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getProhibited <em>Prohibited</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getScheduledx <em>Scheduledx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getProductx <em>Productx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getDailyAmount <em>Daily Amount</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail()
 * @model
 * @generated
 */
public interface CarePlanActivityDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_Category()
	 * @model
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_Definition()
	 * @model
	 * @generated
	 */
	Resource getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Resource value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_Code()
	 * @model
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getCode <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Code</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Code</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_ReasonCode()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getReasonCodes();

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Reference</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_ReasonReference()
	 * @model
	 * @generated
	 */
	EList<Condition> getReasonReferences();

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_Goal()
	 * @model
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_Status()
	 * @model required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Reason</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Reason</em>' reference.
	 * @see #setStatusReason(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_StatusReason()
	 * @model
	 * @generated
	 */
	CodeableConcept getStatusReason();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getStatusReason <em>Status Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Prohibited</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prohibited</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prohibited</em>' reference.
	 * @see #setProhibited(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_Prohibited()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getProhibited();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getProhibited <em>Prohibited</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prohibited</em>' reference.
	 * @see #getProhibited()
	 * @generated
	 */
	void setProhibited(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Scheduledx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduledx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduledx</em>' reference.
	 * @see #setScheduledx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_Scheduledx()
	 * @model
	 * @generated
	 */
	DataType getScheduledx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getScheduledx <em>Scheduledx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduledx</em>' reference.
	 * @see #getScheduledx()
	 * @generated
	 */
	void setScheduledx(DataType value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_Performer()
	 * @model
	 * @generated
	 */
	EList<Resource> getPerformers();

	/**
	 * Returns the value of the '<em><b>Productx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Productx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productx</em>' reference.
	 * @see #setProductx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_Productx()
	 * @model
	 * @generated
	 */
	Base getProductx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getProductx <em>Productx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Productx</em>' reference.
	 * @see #getProductx()
	 * @generated
	 */
	void setProductx(Base value);

	/**
	 * Returns the value of the '<em><b>Daily Amount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daily Amount</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily Amount</em>' reference.
	 * @see #setDailyAmount(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_DailyAmount()
	 * @model
	 * @generated
	 */
	SimpleQuantity getDailyAmount();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getDailyAmount <em>Daily Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Amount</em>' reference.
	 * @see #getDailyAmount()
	 * @generated
	 */
	void setDailyAmount(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' reference.
	 * @see #setQuantity(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_Quantity()
	 * @model
	 * @generated
	 */
	SimpleQuantity getQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getQuantity <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getCarePlanActivityDetail_Description()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

} // CarePlanActivityDetail
