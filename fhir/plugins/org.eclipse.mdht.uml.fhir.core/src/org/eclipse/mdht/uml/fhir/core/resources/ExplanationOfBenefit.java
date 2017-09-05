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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Money;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.dataTypes.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getSubTypes <em>Sub Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getReferral <em>Referral</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getRelateds <em>Related</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getOriginalPrescription <em>Original Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getInformations <em>Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getCareTeams <em>Care Team</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getProcedures <em>Procedure</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getAccident <em>Accident</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getEmploymentImpacted <em>Employment Impacted</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getItems <em>Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getAddItems <em>Add Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getUnallocDeductable <em>Unalloc Deductable</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getTotalBenefit <em>Total Benefit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getForm <em>Form</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getBenefitBalances <em>Benefit Balance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit()
 * @model
 * @generated
 */
public interface ExplanationOfBenefit extends DomainResource {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Identifier()
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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Status()
	 * @model
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Type()
	 * @model
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Type</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_SubType()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getSubTypes();

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Patient()
	 * @model
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getPatient <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Billable Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billable Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billable Period</em>' reference.
	 * @see #setBillablePeriod(Period)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_BillablePeriod()
	 * @model
	 * @generated
	 */
	Period getBillablePeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getBillablePeriod <em>Billable Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billable Period</em>' reference.
	 * @see #getBillablePeriod()
	 * @generated
	 */
	void setBillablePeriod(Period value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Created()
	 * @model
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getCreated <em>Created</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Enterer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enterer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enterer</em>' reference.
	 * @see #setEnterer(Practitioner)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Enterer()
	 * @model
	 * @generated
	 */
	Practitioner getEnterer();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getEnterer <em>Enterer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterer</em>' reference.
	 * @see #getEnterer()
	 * @generated
	 */
	void setEnterer(Practitioner value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Insurer()
	 * @model
	 * @generated
	 */
	Organization getInsurer();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getInsurer <em>Insurer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurer</em>' reference.
	 * @see #getInsurer()
	 * @generated
	 */
	void setInsurer(Organization value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference.
	 * @see #setProvider(Practitioner)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Provider()
	 * @model
	 * @generated
	 */
	Practitioner getProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getProvider <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Practitioner value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' reference.
	 * @see #setOrganization(Organization)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Organization()
	 * @model
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getOrganization <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Referral</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referral</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referral</em>' reference.
	 * @see #setReferral(ReferralRequest)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Referral()
	 * @model
	 * @generated
	 */
	ReferralRequest getReferral();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getReferral <em>Referral</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referral</em>' reference.
	 * @see #getReferral()
	 * @generated
	 */
	void setReferral(ReferralRequest value);

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility</em>' reference.
	 * @see #setFacility(Location)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Facility()
	 * @model
	 * @generated
	 */
	Location getFacility();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getFacility <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Location value);

	/**
	 * Returns the value of the '<em><b>Claim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim</em>' reference.
	 * @see #setClaim(Claim)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Claim()
	 * @model
	 * @generated
	 */
	Claim getClaim();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getClaim <em>Claim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim</em>' reference.
	 * @see #getClaim()
	 * @generated
	 */
	void setClaim(Claim value);

	/**
	 * Returns the value of the '<em><b>Claim Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Response</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Response</em>' reference.
	 * @see #setClaimResponse(ClaimResponse)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_ClaimResponse()
	 * @model
	 * @generated
	 */
	ClaimResponse getClaimResponse();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getClaimResponse <em>Claim Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Response</em>' reference.
	 * @see #getClaimResponse()
	 * @generated
	 */
	void setClaimResponse(ClaimResponse value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Outcome()
	 * @model
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getOutcome <em>Outcome</em>}' reference.
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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Disposition()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getDisposition();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getDisposition <em>Disposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Related</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitRelatedClaim}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Related()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitRelatedClaim> getRelateds();

	/**
	 * Returns the value of the '<em><b>Prescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescription</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescription</em>' reference.
	 * @see #setPrescription(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Prescription()
	 * @model
	 * @generated
	 */
	Resource getPrescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getPrescription <em>Prescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription</em>' reference.
	 * @see #getPrescription()
	 * @generated
	 */
	void setPrescription(Resource value);

	/**
	 * Returns the value of the '<em><b>Original Prescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Prescription</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Prescription</em>' reference.
	 * @see #setOriginalPrescription(MedicationRequest)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_OriginalPrescription()
	 * @model
	 * @generated
	 */
	MedicationRequest getOriginalPrescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getOriginalPrescription <em>Original Prescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Prescription</em>' reference.
	 * @see #getOriginalPrescription()
	 * @generated
	 */
	void setOriginalPrescription(MedicationRequest value);

	/**
	 * Returns the value of the '<em><b>Payee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payee</em>' containment reference.
	 * @see #setPayee(ExplanationOfBenefitPayee)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Payee()
	 * @model containment="true"
	 * @generated
	 */
	ExplanationOfBenefitPayee getPayee();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getPayee <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee</em>' containment reference.
	 * @see #getPayee()
	 * @generated
	 */
	void setPayee(ExplanationOfBenefitPayee value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitSupportingInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Information()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitSupportingInformation> getInformations();

	/**
	 * Returns the value of the '<em><b>Care Team</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitCareTeam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Care Team</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Care Team</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_CareTeam()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitCareTeam> getCareTeams();

	/**
	 * Returns the value of the '<em><b>Diagnosis</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitDiagnosis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosis</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Diagnosis()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitDiagnosis> getDiagnosis();

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitProcedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Procedure()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitProcedure> getProcedures();

	/**
	 * Returns the value of the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence</em>' reference.
	 * @see #setPrecedence(PositiveInt)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Precedence()
	 * @model
	 * @generated
	 */
	PositiveInt getPrecedence();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getPrecedence <em>Precedence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedence</em>' reference.
	 * @see #getPrecedence()
	 * @generated
	 */
	void setPrecedence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Insurance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insurance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurance</em>' containment reference.
	 * @see #setInsurance(ExplanationOfBenefitInsurance)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Insurance()
	 * @model containment="true"
	 * @generated
	 */
	ExplanationOfBenefitInsurance getInsurance();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getInsurance <em>Insurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance</em>' containment reference.
	 * @see #getInsurance()
	 * @generated
	 */
	void setInsurance(ExplanationOfBenefitInsurance value);

	/**
	 * Returns the value of the '<em><b>Accident</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accident</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accident</em>' containment reference.
	 * @see #setAccident(ExplanationOfBenefitAccident)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Accident()
	 * @model containment="true"
	 * @generated
	 */
	ExplanationOfBenefitAccident getAccident();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getAccident <em>Accident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accident</em>' containment reference.
	 * @see #getAccident()
	 * @generated
	 */
	void setAccident(ExplanationOfBenefitAccident value);

	/**
	 * Returns the value of the '<em><b>Employment Impacted</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employment Impacted</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employment Impacted</em>' reference.
	 * @see #setEmploymentImpacted(Period)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_EmploymentImpacted()
	 * @model
	 * @generated
	 */
	Period getEmploymentImpacted();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getEmploymentImpacted <em>Employment Impacted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employment Impacted</em>' reference.
	 * @see #getEmploymentImpacted()
	 * @generated
	 */
	void setEmploymentImpacted(Period value);

	/**
	 * Returns the value of the '<em><b>Hospitalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hospitalization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hospitalization</em>' reference.
	 * @see #setHospitalization(Period)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Hospitalization()
	 * @model
	 * @generated
	 */
	Period getHospitalization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getHospitalization <em>Hospitalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hospitalization</em>' reference.
	 * @see #getHospitalization()
	 * @generated
	 */
	void setHospitalization(Period value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitItem> getItems();

	/**
	 * Returns the value of the '<em><b>Add Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitAddedItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Item</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_AddItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitAddedItem> getAddItems();

	/**
	 * Returns the value of the '<em><b>Total Cost</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Cost</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cost</em>' reference.
	 * @see #setTotalCost(Money)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_TotalCost()
	 * @model
	 * @generated
	 */
	Money getTotalCost();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getTotalCost <em>Total Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cost</em>' reference.
	 * @see #getTotalCost()
	 * @generated
	 */
	void setTotalCost(Money value);

	/**
	 * Returns the value of the '<em><b>Unalloc Deductable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unalloc Deductable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unalloc Deductable</em>' reference.
	 * @see #setUnallocDeductable(Money)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_UnallocDeductable()
	 * @model
	 * @generated
	 */
	Money getUnallocDeductable();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getUnallocDeductable <em>Unalloc Deductable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unalloc Deductable</em>' reference.
	 * @see #getUnallocDeductable()
	 * @generated
	 */
	void setUnallocDeductable(Money value);

	/**
	 * Returns the value of the '<em><b>Total Benefit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Benefit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Benefit</em>' reference.
	 * @see #setTotalBenefit(Money)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_TotalBenefit()
	 * @model
	 * @generated
	 */
	Money getTotalBenefit();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getTotalBenefit <em>Total Benefit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Benefit</em>' reference.
	 * @see #getTotalBenefit()
	 * @generated
	 */
	void setTotalBenefit(Money value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference.
	 * @see #setPayment(ExplanationOfBenefitPayment)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Payment()
	 * @model containment="true"
	 * @generated
	 */
	ExplanationOfBenefitPayment getPayment();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getPayment <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' containment reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(ExplanationOfBenefitPayment value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Form()
	 * @model
	 * @generated
	 */
	CodeableConcept getForm();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit#getForm <em>Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitNote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitNote> getNotes();

	/**
	 * Returns the value of the '<em><b>Benefit Balance</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitBenefitBalance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Balance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Balance</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getExplanationOfBenefit_BenefitBalance()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitBenefitBalance> getBenefitBalances();

} // ExplanationOfBenefit
