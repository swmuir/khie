/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eligibility Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getRequestProvider <em>Request Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getRequestOrganization <em>Request Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getInforce <em>Inforce</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getInsurances <em>Insurance</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getForm <em>Form</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getErrors <em>Error</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponse()
 * @model
 * @generated
 */
public interface EligibilityResponse extends DomainResource {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponse_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponse_Status()
	 * @model
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' reference.
	 * @see #setCreated(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponse_Created()
	 * @model
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getCreated <em>Created</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Request Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Provider</em>' reference.
	 * @see #setRequestProvider(Practitioner)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponse_RequestProvider()
	 * @model
	 * @generated
	 */
	Practitioner getRequestProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getRequestProvider <em>Request Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Provider</em>' reference.
	 * @see #getRequestProvider()
	 * @generated
	 */
	void setRequestProvider(Practitioner value);

	/**
	 * Returns the value of the '<em><b>Request Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Organization</em>' reference.
	 * @see #setRequestOrganization(Organization)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponse_RequestOrganization()
	 * @model
	 * @generated
	 */
	Organization getRequestOrganization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getRequestOrganization <em>Request Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Organization</em>' reference.
	 * @see #getRequestOrganization()
	 * @generated
	 */
	void setRequestOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference.
	 * @see #setRequest(EligibilityRequest)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponse_Request()
	 * @model
	 * @generated
	 */
	EligibilityRequest getRequest();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getRequest <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(EligibilityRequest value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' reference.
	 * @see #setOutcome(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponse_Outcome()
	 * @model
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getOutcome <em>Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disposition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disposition</em>' reference.
	 * @see #setDisposition(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponse_Disposition()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getDisposition();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getDisposition <em>Disposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Insurer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insurer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurer</em>' reference.
	 * @see #setInsurer(Organization)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponse_Insurer()
	 * @model
	 * @generated
	 */
	Organization getInsurer();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getInsurer <em>Insurer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurer</em>' reference.
	 * @see #getInsurer()
	 * @generated
	 */
	void setInsurer(Organization value);

	/**
	 * Returns the value of the '<em><b>Inforce</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inforce</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inforce</em>' reference.
	 * @see #setInforce(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponse_Inforce()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getInforce();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getInforce <em>Inforce</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inforce</em>' reference.
	 * @see #getInforce()
	 * @generated
	 */
	void setInforce(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Insurance</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponseInsurance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insurance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurance</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponse_Insurance()
	 * @model containment="true"
	 * @generated
	 */
	EList<EligibilityResponseInsurance> getInsurances();

	/**
	 * Returns the value of the '<em><b>Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' reference.
	 * @see #setForm(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponse_Form()
	 * @model
	 * @generated
	 */
	CodeableConcept getForm();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse#getForm <em>Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponseErrors}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getEligibilityResponse_Error()
	 * @model containment="true"
	 * @generated
	 */
	EList<EligibilityResponseErrors> getErrors();

} // EligibilityResponse
