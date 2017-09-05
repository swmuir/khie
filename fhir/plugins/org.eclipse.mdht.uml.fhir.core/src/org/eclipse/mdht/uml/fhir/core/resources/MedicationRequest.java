/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getDefinitions <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getRequisition <em>Requisition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getStage <em>Stage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getSupportingInformations <em>Supporting Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getDateWritten <em>Date Written</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getDosageInstructions <em>Dosage Instruction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getDispenseRequest <em>Dispense Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getPriorPrescription <em>Prior Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getEventHistories <em>Event History</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest()
 * @model
 * @generated
 */
public interface MedicationRequest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_Definition()
	 * @model
	 * @generated
	 */
	EList<Resource> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_BasedOn()
	 * @model
	 * @generated
	 */
	EList<Resource> getBasedOns();

	/**
	 * Returns the value of the '<em><b>Requisition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requisition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requisition</em>' reference.
	 * @see #setRequisition(Identifier)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_Requisition()
	 * @model
	 * @generated
	 */
	Identifier getRequisition();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getRequisition <em>Requisition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requisition</em>' reference.
	 * @see #getRequisition()
	 * @generated
	 */
	void setRequisition(Identifier value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_Status()
	 * @model
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' reference.
	 * @see #setStage(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_Stage()
	 * @model required="true"
	 * @generated
	 */
	CodeableConcept getStage();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getStage <em>Stage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' reference.
	 * @see #getStage()
	 * @generated
	 */
	void setStage(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Medicationx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicationx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicationx</em>' reference.
	 * @see #setMedicationx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_Medicationx()
	 * @model required="true"
	 * @generated
	 */
	Base getMedicationx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getMedicationx <em>Medicationx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicationx</em>' reference.
	 * @see #getMedicationx()
	 * @generated
	 */
	void setMedicationx(Base value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' reference.
	 * @see #setPatient(Patient)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_Patient()
	 * @model required="true"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getPatient <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_Context()
	 * @model
	 * @generated
	 */
	Resource getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Resource value);

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Information</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Information</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_SupportingInformation()
	 * @model
	 * @generated
	 */
	EList<Resource> getSupportingInformations();

	/**
	 * Returns the value of the '<em><b>Date Written</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Written</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Written</em>' reference.
	 * @see #setDateWritten(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_DateWritten()
	 * @model
	 * @generated
	 */
	DateTime getDateWritten();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getDateWritten <em>Date Written</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Written</em>' reference.
	 * @see #getDateWritten()
	 * @generated
	 */
	void setDateWritten(DateTime value);

	/**
	 * Returns the value of the '<em><b>Requester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requester</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requester</em>' reference.
	 * @see #setRequester(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_Requester()
	 * @model
	 * @generated
	 */
	Resource getRequester();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getRequester <em>Requester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requester</em>' reference.
	 * @see #getRequester()
	 * @generated
	 */
	void setRequester(Resource value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_ReasonCode()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getReasonCodes();

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Reference</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_ReasonReference()
	 * @model
	 * @generated
	 */
	EList<Resource> getReasonReferences();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_Note()
	 * @model
	 * @generated
	 */
	EList<Annotation> getNotes();

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_Category()
	 * @model
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dosage Instruction</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dosage Instruction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dosage Instruction</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_DosageInstruction()
	 * @model
	 * @generated
	 */
	EList<DosageInstruction> getDosageInstructions();

	/**
	 * Returns the value of the '<em><b>Dispense Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispense Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispense Request</em>' containment reference.
	 * @see #setDispenseRequest(MedicationRequestDispenseRequest)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_DispenseRequest()
	 * @model containment="true"
	 * @generated
	 */
	MedicationRequestDispenseRequest getDispenseRequest();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getDispenseRequest <em>Dispense Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispense Request</em>' containment reference.
	 * @see #getDispenseRequest()
	 * @generated
	 */
	void setDispenseRequest(MedicationRequestDispenseRequest value);

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference.
	 * @see #setSubstitution(MedicationRequestSubstitution)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_Substitution()
	 * @model containment="true"
	 * @generated
	 */
	MedicationRequestSubstitution getSubstitution();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getSubstitution <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitution</em>' containment reference.
	 * @see #getSubstitution()
	 * @generated
	 */
	void setSubstitution(MedicationRequestSubstitution value);

	/**
	 * Returns the value of the '<em><b>Prior Prescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Prescription</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Prescription</em>' reference.
	 * @see #setPriorPrescription(MedicationRequest)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_PriorPrescription()
	 * @model
	 * @generated
	 */
	MedicationRequest getPriorPrescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest#getPriorPrescription <em>Prior Prescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prior Prescription</em>' reference.
	 * @see #getPriorPrescription()
	 * @generated
	 */
	void setPriorPrescription(MedicationRequest value);

	/**
	 * Returns the value of the '<em><b>Event History</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Provenance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event History</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event History</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationRequest_EventHistory()
	 * @model
	 * @generated
	 */
	EList<Provenance> getEventHistories();

} // MedicationRequest
