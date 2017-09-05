/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Intolerance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getClinicalStatus <em>Clinical Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getVerificationStatus <em>Verification Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getCategories <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getOnsetx <em>Onsetx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getAssertedDate <em>Asserted Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getAsserter <em>Asserter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getLastOccurrence <em>Last Occurrence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getReactions <em>Reaction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance()
 * @model
 * @generated
 */
public interface AllergyIntolerance extends DomainResource {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Clinical Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clinical Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinical Status</em>' reference.
	 * @see #setClinicalStatus(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance_ClinicalStatus()
	 * @model
	 * @generated
	 */
	Code getClinicalStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getClinicalStatus <em>Clinical Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Status</em>' reference.
	 * @see #getClinicalStatus()
	 * @generated
	 */
	void setClinicalStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Verification Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Status</em>' reference.
	 * @see #setVerificationStatus(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance_VerificationStatus()
	 * @model required="true"
	 * @generated
	 */
	Code getVerificationStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getVerificationStatus <em>Verification Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Status</em>' reference.
	 * @see #getVerificationStatus()
	 * @generated
	 */
	void setVerificationStatus(Code value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance_Type()
	 * @model
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance_Category()
	 * @model
	 * @generated
	 */
	EList<Code> getCategories();

	/**
	 * Returns the value of the '<em><b>Criticality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criticality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criticality</em>' reference.
	 * @see #setCriticality(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance_Criticality()
	 * @model
	 * @generated
	 */
	Code getCriticality();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getCriticality <em>Criticality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality</em>' reference.
	 * @see #getCriticality()
	 * @generated
	 */
	void setCriticality(Code value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance_Code()
	 * @model
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getCode <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance_Patient()
	 * @model required="true"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getPatient <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Onsetx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onsetx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onsetx</em>' reference.
	 * @see #setOnsetx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance_Onsetx()
	 * @model
	 * @generated
	 */
	DataType getOnsetx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getOnsetx <em>Onsetx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onsetx</em>' reference.
	 * @see #getOnsetx()
	 * @generated
	 */
	void setOnsetx(DataType value);

	/**
	 * Returns the value of the '<em><b>Asserted Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asserted Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asserted Date</em>' reference.
	 * @see #setAssertedDate(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance_AssertedDate()
	 * @model
	 * @generated
	 */
	DateTime getAssertedDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getAssertedDate <em>Asserted Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asserted Date</em>' reference.
	 * @see #getAssertedDate()
	 * @generated
	 */
	void setAssertedDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Recorder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorder</em>' reference.
	 * @see #setRecorder(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance_Recorder()
	 * @model
	 * @generated
	 */
	Resource getRecorder();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getRecorder <em>Recorder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder</em>' reference.
	 * @see #getRecorder()
	 * @generated
	 */
	void setRecorder(Resource value);

	/**
	 * Returns the value of the '<em><b>Asserter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asserter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asserter</em>' reference.
	 * @see #setAsserter(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance_Asserter()
	 * @model
	 * @generated
	 */
	Resource getAsserter();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getAsserter <em>Asserter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asserter</em>' reference.
	 * @see #getAsserter()
	 * @generated
	 */
	void setAsserter(Resource value);

	/**
	 * Returns the value of the '<em><b>Last Occurrence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Occurrence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Occurrence</em>' reference.
	 * @see #setLastOccurrence(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance_LastOccurrence()
	 * @model
	 * @generated
	 */
	DateTime getLastOccurrence();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntolerance#getLastOccurrence <em>Last Occurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Occurrence</em>' reference.
	 * @see #getLastOccurrence()
	 * @generated
	 */
	void setLastOccurrence(DateTime value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance_Note()
	 * @model
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Reaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.AllergyIntoleranceReaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reaction</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getAllergyIntolerance_Reaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<AllergyIntoleranceReaction> getReactions();

} // AllergyIntolerance
