/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Money;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.dataTypes.PositiveInt;
import org.eclipse.mdht.uml.fhir.core.resources.Claim;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimResponse;
import org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefit;
import org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitAccident;
import org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitAddedItem;
import org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitBenefitBalance;
import org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitCareTeam;
import org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitDiagnosis;
import org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitInsurance;
import org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitItem;
import org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitNote;
import org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitPayee;
import org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitPayment;
import org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitProcedure;
import org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitRelatedClaim;
import org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitSupportingInformation;
import org.eclipse.mdht.uml.fhir.core.resources.Location;
import org.eclipse.mdht.uml.fhir.core.resources.MedicationRequest;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.ReferralRequest;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getSubTypes <em>Sub Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getReferral <em>Referral</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getRelateds <em>Related</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getOriginalPrescription <em>Original Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getInformations <em>Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getCareTeams <em>Care Team</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getProcedures <em>Procedure</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getAccident <em>Accident</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getEmploymentImpacted <em>Employment Impacted</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getItems <em>Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getAddItems <em>Add Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getUnallocDeductable <em>Unalloc Deductable</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getTotalBenefit <em>Total Benefit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitImpl#getBenefitBalances <em>Benefit Balance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExplanationOfBenefitImpl extends DomainResourceImpl implements ExplanationOfBenefit {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSubTypes() <em>Sub Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subTypes;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The cached value of the '{@link #getBillablePeriod() <em>Billable Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillablePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period billablePeriod;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getEnterer() <em>Enterer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterer()
	 * @generated
	 * @ordered
	 */
	protected Practitioner enterer;

	/**
	 * The cached value of the '{@link #getInsurer() <em>Insurer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurer()
	 * @generated
	 * @ordered
	 */
	protected Organization insurer;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Practitioner provider;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization organization;

	/**
	 * The cached value of the '{@link #getReferral() <em>Referral</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferral()
	 * @generated
	 * @ordered
	 */
	protected ReferralRequest referral;

	/**
	 * The cached value of the '{@link #getFacility() <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacility()
	 * @generated
	 * @ordered
	 */
	protected Location facility;

	/**
	 * The cached value of the '{@link #getClaim() <em>Claim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaim()
	 * @generated
	 * @ordered
	 */
	protected Claim claim;

	/**
	 * The cached value of the '{@link #getClaimResponse() <em>Claim Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimResponse()
	 * @generated
	 * @ordered
	 */
	protected ClaimResponse claimResponse;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept outcome;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String disposition;

	/**
	 * The cached value of the '{@link #getRelateds() <em>Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelateds()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitRelatedClaim> relateds;

	/**
	 * The cached value of the '{@link #getPrescription() <em>Prescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescription()
	 * @generated
	 * @ordered
	 */
	protected Resource prescription;

	/**
	 * The cached value of the '{@link #getOriginalPrescription() <em>Original Prescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPrescription()
	 * @generated
	 * @ordered
	 */
	protected MedicationRequest originalPrescription;

	/**
	 * The cached value of the '{@link #getPayee() <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayee()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefitPayee payee;

	/**
	 * The cached value of the '{@link #getInformations() <em>Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitSupportingInformation> informations;

	/**
	 * The cached value of the '{@link #getCareTeams() <em>Care Team</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitCareTeam> careTeams;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitDiagnosis> diagnosis;

	/**
	 * The cached value of the '{@link #getProcedures() <em>Procedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedures()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitProcedure> procedures;

	/**
	 * The cached value of the '{@link #getPrecedence() <em>Precedence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt precedence;

	/**
	 * The cached value of the '{@link #getInsurance() <em>Insurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefitInsurance insurance;

	/**
	 * The cached value of the '{@link #getAccident() <em>Accident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccident()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefitAccident accident;

	/**
	 * The cached value of the '{@link #getEmploymentImpacted() <em>Employment Impacted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentImpacted()
	 * @generated
	 * @ordered
	 */
	protected Period employmentImpacted;

	/**
	 * The cached value of the '{@link #getHospitalization() <em>Hospitalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalization()
	 * @generated
	 * @ordered
	 */
	protected Period hospitalization;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitItem> items;

	/**
	 * The cached value of the '{@link #getAddItems() <em>Add Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitAddedItem> addItems;

	/**
	 * The cached value of the '{@link #getTotalCost() <em>Total Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected Money totalCost;

	/**
	 * The cached value of the '{@link #getUnallocDeductable() <em>Unalloc Deductable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnallocDeductable()
	 * @generated
	 * @ordered
	 */
	protected Money unallocDeductable;

	/**
	 * The cached value of the '{@link #getTotalBenefit() <em>Total Benefit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBenefit()
	 * @generated
	 * @ordered
	 */
	protected Money totalBenefit;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefitPayment payment;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept form;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitNote> notes;

	/**
	 * The cached value of the '{@link #getBenefitBalances() <em>Benefit Balance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitBalances()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitBenefitBalance> benefitBalances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getExplanationOfBenefit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Code)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CodeableConcept)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE);
		}
		return subTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getPatient() {
		if (patient != null && patient.eIsProxy()) {
			InternalEObject oldPatient = (InternalEObject)patient;
			patient = (Patient)eResolveProxy(oldPatient);
			if (patient != oldPatient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__PATIENT, oldPatient, patient));
			}
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Patient newPatient) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getBillablePeriod() {
		if (billablePeriod != null && billablePeriod.eIsProxy()) {
			InternalEObject oldBillablePeriod = (InternalEObject)billablePeriod;
			billablePeriod = (Period)eResolveProxy(oldBillablePeriod);
			if (billablePeriod != oldBillablePeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, oldBillablePeriod, billablePeriod));
			}
		}
		return billablePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetBillablePeriod() {
		return billablePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillablePeriod(Period newBillablePeriod) {
		Period oldBillablePeriod = billablePeriod;
		billablePeriod = newBillablePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, oldBillablePeriod, billablePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		if (created != null && created.eIsProxy()) {
			InternalEObject oldCreated = (InternalEObject)created;
			created = (DateTime)eResolveProxy(oldCreated);
			if (created != oldCreated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__CREATED, oldCreated, created));
			}
		}
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getEnterer() {
		if (enterer != null && enterer.eIsProxy()) {
			InternalEObject oldEnterer = (InternalEObject)enterer;
			enterer = (Practitioner)eResolveProxy(oldEnterer);
			if (enterer != oldEnterer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__ENTERER, oldEnterer, enterer));
			}
		}
		return enterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetEnterer() {
		return enterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterer(Practitioner newEnterer) {
		Practitioner oldEnterer = enterer;
		enterer = newEnterer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__ENTERER, oldEnterer, enterer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getInsurer() {
		if (insurer != null && insurer.eIsProxy()) {
			InternalEObject oldInsurer = (InternalEObject)insurer;
			insurer = (Organization)eResolveProxy(oldInsurer);
			if (insurer != oldInsurer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__INSURER, oldInsurer, insurer));
			}
		}
		return insurer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetInsurer() {
		return insurer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsurer(Organization newInsurer) {
		Organization oldInsurer = insurer;
		insurer = newInsurer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__INSURER, oldInsurer, insurer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getProvider() {
		if (provider != null && provider.eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (Practitioner)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Practitioner newProvider) {
		Practitioner oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		if (organization != null && organization.eIsProxy()) {
			InternalEObject oldOrganization = (InternalEObject)organization;
			organization = (Organization)eResolveProxy(oldOrganization);
			if (organization != oldOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION, oldOrganization, organization));
			}
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		Organization oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralRequest getReferral() {
		if (referral != null && referral.eIsProxy()) {
			InternalEObject oldReferral = (InternalEObject)referral;
			referral = (ReferralRequest)eResolveProxy(oldReferral);
			if (referral != oldReferral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__REFERRAL, oldReferral, referral));
			}
		}
		return referral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralRequest basicGetReferral() {
		return referral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferral(ReferralRequest newReferral) {
		ReferralRequest oldReferral = referral;
		referral = newReferral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__REFERRAL, oldReferral, referral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getFacility() {
		if (facility != null && facility.eIsProxy()) {
			InternalEObject oldFacility = (InternalEObject)facility;
			facility = (Location)eResolveProxy(oldFacility);
			if (facility != oldFacility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__FACILITY, oldFacility, facility));
			}
		}
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetFacility() {
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacility(Location newFacility) {
		Location oldFacility = facility;
		facility = newFacility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__FACILITY, oldFacility, facility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim getClaim() {
		if (claim != null && claim.eIsProxy()) {
			InternalEObject oldClaim = (InternalEObject)claim;
			claim = (Claim)eResolveProxy(oldClaim);
			if (claim != oldClaim) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__CLAIM, oldClaim, claim));
			}
		}
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim basicGetClaim() {
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaim(Claim newClaim) {
		Claim oldClaim = claim;
		claim = newClaim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__CLAIM, oldClaim, claim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse getClaimResponse() {
		if (claimResponse != null && claimResponse.eIsProxy()) {
			InternalEObject oldClaimResponse = (InternalEObject)claimResponse;
			claimResponse = (ClaimResponse)eResolveProxy(oldClaimResponse);
			if (claimResponse != oldClaimResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE, oldClaimResponse, claimResponse));
			}
		}
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse basicGetClaimResponse() {
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimResponse(ClaimResponse newClaimResponse) {
		ClaimResponse oldClaimResponse = claimResponse;
		claimResponse = newClaimResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE, oldClaimResponse, claimResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOutcome() {
		if (outcome != null && outcome.eIsProxy()) {
			InternalEObject oldOutcome = (InternalEObject)outcome;
			outcome = (CodeableConcept)eResolveProxy(oldOutcome);
			if (outcome != oldOutcome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__OUTCOME, oldOutcome, outcome));
			}
		}
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(CodeableConcept newOutcome) {
		CodeableConcept oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__OUTCOME, oldOutcome, outcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDisposition() {
		if (disposition != null && disposition.eIsProxy()) {
			InternalEObject oldDisposition = (InternalEObject)disposition;
			disposition = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDisposition);
			if (disposition != oldDisposition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__DISPOSITION, oldDisposition, disposition));
			}
		}
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposition(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDisposition) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__DISPOSITION, oldDisposition, disposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitRelatedClaim> getRelateds() {
		if (relateds == null) {
			relateds = new EObjectContainmentEList<ExplanationOfBenefitRelatedClaim>(ExplanationOfBenefitRelatedClaim.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT__RELATED);
		}
		return relateds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getPrescription() {
		if (prescription != null && prescription.eIsProxy()) {
			InternalEObject oldPrescription = (InternalEObject)prescription;
			prescription = (Resource)eResolveProxy(oldPrescription);
			if (prescription != oldPrescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION, oldPrescription, prescription));
			}
		}
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetPrescription() {
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescription(Resource newPrescription) {
		Resource oldPrescription = prescription;
		prescription = newPrescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION, oldPrescription, prescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequest getOriginalPrescription() {
		if (originalPrescription != null && originalPrescription.eIsProxy()) {
			InternalEObject oldOriginalPrescription = (InternalEObject)originalPrescription;
			originalPrescription = (MedicationRequest)eResolveProxy(oldOriginalPrescription);
			if (originalPrescription != oldOriginalPrescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION, oldOriginalPrescription, originalPrescription));
			}
		}
		return originalPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequest basicGetOriginalPrescription() {
		return originalPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalPrescription(MedicationRequest newOriginalPrescription) {
		MedicationRequest oldOriginalPrescription = originalPrescription;
		originalPrescription = newOriginalPrescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION, oldOriginalPrescription, originalPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitPayee getPayee() {
		return payee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayee(ExplanationOfBenefitPayee newPayee, NotificationChain msgs) {
		ExplanationOfBenefitPayee oldPayee = payee;
		payee = newPayee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYEE, oldPayee, newPayee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayee(ExplanationOfBenefitPayee newPayee) {
		if (newPayee != payee) {
			NotificationChain msgs = null;
			if (payee != null)
				msgs = ((InternalEObject)payee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYEE, null, msgs);
			if (newPayee != null)
				msgs = ((InternalEObject)newPayee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYEE, null, msgs);
			msgs = basicSetPayee(newPayee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYEE, newPayee, newPayee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitSupportingInformation> getInformations() {
		if (informations == null) {
			informations = new EObjectContainmentEList<ExplanationOfBenefitSupportingInformation>(ExplanationOfBenefitSupportingInformation.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT__INFORMATION);
		}
		return informations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitCareTeam> getCareTeams() {
		if (careTeams == null) {
			careTeams = new EObjectContainmentEList<ExplanationOfBenefitCareTeam>(ExplanationOfBenefitCareTeam.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM);
		}
		return careTeams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<ExplanationOfBenefitDiagnosis>(ExplanationOfBenefitDiagnosis.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitProcedure> getProcedures() {
		if (procedures == null) {
			procedures = new EObjectContainmentEList<ExplanationOfBenefitProcedure>(ExplanationOfBenefitProcedure.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT__PROCEDURE);
		}
		return procedures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getPrecedence() {
		if (precedence != null && precedence.eIsProxy()) {
			InternalEObject oldPrecedence = (InternalEObject)precedence;
			precedence = (PositiveInt)eResolveProxy(oldPrecedence);
			if (precedence != oldPrecedence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, oldPrecedence, precedence));
			}
		}
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetPrecedence() {
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedence(PositiveInt newPrecedence) {
		PositiveInt oldPrecedence = precedence;
		precedence = newPrecedence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, oldPrecedence, precedence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitInsurance getInsurance() {
		return insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurance(ExplanationOfBenefitInsurance newInsurance, NotificationChain msgs) {
		ExplanationOfBenefitInsurance oldInsurance = insurance;
		insurance = newInsurance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__INSURANCE, oldInsurance, newInsurance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsurance(ExplanationOfBenefitInsurance newInsurance) {
		if (newInsurance != insurance) {
			NotificationChain msgs = null;
			if (insurance != null)
				msgs = ((InternalEObject)insurance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT__INSURANCE, null, msgs);
			if (newInsurance != null)
				msgs = ((InternalEObject)newInsurance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT__INSURANCE, null, msgs);
			msgs = basicSetInsurance(newInsurance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__INSURANCE, newInsurance, newInsurance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAccident getAccident() {
		return accident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccident(ExplanationOfBenefitAccident newAccident, NotificationChain msgs) {
		ExplanationOfBenefitAccident oldAccident = accident;
		accident = newAccident;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__ACCIDENT, oldAccident, newAccident);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccident(ExplanationOfBenefitAccident newAccident) {
		if (newAccident != accident) {
			NotificationChain msgs = null;
			if (accident != null)
				msgs = ((InternalEObject)accident).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT__ACCIDENT, null, msgs);
			if (newAccident != null)
				msgs = ((InternalEObject)newAccident).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT__ACCIDENT, null, msgs);
			msgs = basicSetAccident(newAccident, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__ACCIDENT, newAccident, newAccident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEmploymentImpacted() {
		if (employmentImpacted != null && employmentImpacted.eIsProxy()) {
			InternalEObject oldEmploymentImpacted = (InternalEObject)employmentImpacted;
			employmentImpacted = (Period)eResolveProxy(oldEmploymentImpacted);
			if (employmentImpacted != oldEmploymentImpacted) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED, oldEmploymentImpacted, employmentImpacted));
			}
		}
		return employmentImpacted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetEmploymentImpacted() {
		return employmentImpacted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmploymentImpacted(Period newEmploymentImpacted) {
		Period oldEmploymentImpacted = employmentImpacted;
		employmentImpacted = newEmploymentImpacted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED, oldEmploymentImpacted, employmentImpacted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getHospitalization() {
		if (hospitalization != null && hospitalization.eIsProxy()) {
			InternalEObject oldHospitalization = (InternalEObject)hospitalization;
			hospitalization = (Period)eResolveProxy(oldHospitalization);
			if (hospitalization != oldHospitalization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION, oldHospitalization, hospitalization));
			}
		}
		return hospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetHospitalization() {
		return hospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHospitalization(Period newHospitalization) {
		Period oldHospitalization = hospitalization;
		hospitalization = newHospitalization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION, oldHospitalization, hospitalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<ExplanationOfBenefitItem>(ExplanationOfBenefitItem.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT__ITEM);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitAddedItem> getAddItems() {
		if (addItems == null) {
			addItems = new EObjectContainmentEList<ExplanationOfBenefitAddedItem>(ExplanationOfBenefitAddedItem.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM);
		}
		return addItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotalCost() {
		if (totalCost != null && totalCost.eIsProxy()) {
			InternalEObject oldTotalCost = (InternalEObject)totalCost;
			totalCost = (Money)eResolveProxy(oldTotalCost);
			if (totalCost != oldTotalCost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST, oldTotalCost, totalCost));
			}
		}
		return totalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetTotalCost() {
		return totalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCost(Money newTotalCost) {
		Money oldTotalCost = totalCost;
		totalCost = newTotalCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST, oldTotalCost, totalCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnallocDeductable() {
		if (unallocDeductable != null && unallocDeductable.eIsProxy()) {
			InternalEObject oldUnallocDeductable = (InternalEObject)unallocDeductable;
			unallocDeductable = (Money)eResolveProxy(oldUnallocDeductable);
			if (unallocDeductable != oldUnallocDeductable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE, oldUnallocDeductable, unallocDeductable));
			}
		}
		return unallocDeductable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetUnallocDeductable() {
		return unallocDeductable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnallocDeductable(Money newUnallocDeductable) {
		Money oldUnallocDeductable = unallocDeductable;
		unallocDeductable = newUnallocDeductable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE, oldUnallocDeductable, unallocDeductable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotalBenefit() {
		if (totalBenefit != null && totalBenefit.eIsProxy()) {
			InternalEObject oldTotalBenefit = (InternalEObject)totalBenefit;
			totalBenefit = (Money)eResolveProxy(oldTotalBenefit);
			if (totalBenefit != oldTotalBenefit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT, oldTotalBenefit, totalBenefit));
			}
		}
		return totalBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetTotalBenefit() {
		return totalBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalBenefit(Money newTotalBenefit) {
		Money oldTotalBenefit = totalBenefit;
		totalBenefit = newTotalBenefit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT, oldTotalBenefit, totalBenefit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitPayment getPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayment(ExplanationOfBenefitPayment newPayment, NotificationChain msgs) {
		ExplanationOfBenefitPayment oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYMENT, oldPayment, newPayment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayment(ExplanationOfBenefitPayment newPayment) {
		if (newPayment != payment) {
			NotificationChain msgs = null;
			if (payment != null)
				msgs = ((InternalEObject)payment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYMENT, null, msgs);
			if (newPayment != null)
				msgs = ((InternalEObject)newPayment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYMENT, null, msgs);
			msgs = basicSetPayment(newPayment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYMENT, newPayment, newPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getForm() {
		if (form != null && form.eIsProxy()) {
			InternalEObject oldForm = (InternalEObject)form;
			form = (CodeableConcept)eResolveProxy(oldForm);
			if (form != oldForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT__FORM, oldForm, form));
			}
		}
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(CodeableConcept newForm) {
		CodeableConcept oldForm = form;
		form = newForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT__FORM, oldForm, form));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitNote> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<ExplanationOfBenefitNote>(ExplanationOfBenefitNote.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitBenefitBalance> getBenefitBalances() {
		if (benefitBalances == null) {
			benefitBalances = new EObjectContainmentEList<ExplanationOfBenefitBenefitBalance>(ExplanationOfBenefitBenefitBalance.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE);
		}
		return benefitBalances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__RELATED:
				return ((InternalEList<?>)getRelateds()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				return basicSetPayee(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__INFORMATION:
				return ((InternalEList<?>)getInformations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM:
				return ((InternalEList<?>)getCareTeams()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				return ((InternalEList<?>)getProcedures()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__INSURANCE:
				return basicSetInsurance(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ACCIDENT:
				return basicSetAccident(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ITEM:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				return ((InternalEList<?>)getAddItems()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYMENT:
				return basicSetPayment(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				return ((InternalEList<?>)getBenefitBalances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				return getSubTypes();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				if (resolve) return getBillablePeriod();
				return basicGetBillablePeriod();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CREATED:
				if (resolve) return getCreated();
				return basicGetCreated();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ENTERER:
				if (resolve) return getEnterer();
				return basicGetEnterer();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__INSURER:
				if (resolve) return getInsurer();
				return basicGetInsurer();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				if (resolve) return getReferral();
				return basicGetReferral();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__FACILITY:
				if (resolve) return getFacility();
				return basicGetFacility();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CLAIM:
				if (resolve) return getClaim();
				return basicGetClaim();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				if (resolve) return getClaimResponse();
				return basicGetClaimResponse();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__OUTCOME:
				if (resolve) return getOutcome();
				return basicGetOutcome();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				if (resolve) return getDisposition();
				return basicGetDisposition();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__RELATED:
				return getRelateds();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				if (resolve) return getPrescription();
				return basicGetPrescription();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				if (resolve) return getOriginalPrescription();
				return basicGetOriginalPrescription();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				return getPayee();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__INFORMATION:
				return getInformations();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM:
				return getCareTeams();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				return getDiagnosis();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				return getProcedures();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				if (resolve) return getPrecedence();
				return basicGetPrecedence();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__INSURANCE:
				return getInsurance();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ACCIDENT:
				return getAccident();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				if (resolve) return getEmploymentImpacted();
				return basicGetEmploymentImpacted();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				if (resolve) return getHospitalization();
				return basicGetHospitalization();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ITEM:
				return getItems();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				return getAddItems();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST:
				if (resolve) return getTotalCost();
				return basicGetTotalCost();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				if (resolve) return getUnallocDeductable();
				return basicGetUnallocDeductable();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				if (resolve) return getTotalBenefit();
				return basicGetTotalBenefit();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYMENT:
				return getPayment();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__FORM:
				if (resolve) return getForm();
				return basicGetForm();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__NOTE:
				return getNotes();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				return getBenefitBalances();
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				getSubTypes().clear();
				getSubTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PATIENT:
				setPatient((Patient)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				setBillablePeriod((Period)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CREATED:
				setCreated((DateTime)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ENTERER:
				setEnterer((Practitioner)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__INSURER:
				setInsurer((Organization)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				setProvider((Practitioner)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				setReferral((ReferralRequest)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__FACILITY:
				setFacility((Location)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CLAIM:
				setClaim((Claim)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				setDisposition((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__RELATED:
				getRelateds().clear();
				getRelateds().addAll((Collection<? extends ExplanationOfBenefitRelatedClaim>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				setPrescription((Resource)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((MedicationRequest)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				setPayee((ExplanationOfBenefitPayee)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__INFORMATION:
				getInformations().clear();
				getInformations().addAll((Collection<? extends ExplanationOfBenefitSupportingInformation>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM:
				getCareTeams().clear();
				getCareTeams().addAll((Collection<? extends ExplanationOfBenefitCareTeam>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends ExplanationOfBenefitDiagnosis>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				getProcedures().clear();
				getProcedures().addAll((Collection<? extends ExplanationOfBenefitProcedure>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				setPrecedence((PositiveInt)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__INSURANCE:
				setInsurance((ExplanationOfBenefitInsurance)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ACCIDENT:
				setAccident((ExplanationOfBenefitAccident)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				setEmploymentImpacted((Period)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				setHospitalization((Period)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends ExplanationOfBenefitItem>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				getAddItems().clear();
				getAddItems().addAll((Collection<? extends ExplanationOfBenefitAddedItem>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST:
				setTotalCost((Money)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				setTotalBenefit((Money)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYMENT:
				setPayment((ExplanationOfBenefitPayment)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__FORM:
				setForm((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends ExplanationOfBenefitNote>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				getBenefitBalances().clear();
				getBenefitBalances().addAll((Collection<? extends ExplanationOfBenefitBenefitBalance>)newValue);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				getSubTypes().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PATIENT:
				setPatient((Patient)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				setBillablePeriod((Period)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CREATED:
				setCreated((DateTime)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ENTERER:
				setEnterer((Practitioner)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__INSURER:
				setInsurer((Organization)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				setProvider((Practitioner)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				setReferral((ReferralRequest)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__FACILITY:
				setFacility((Location)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CLAIM:
				setClaim((Claim)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				setDisposition((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__RELATED:
				getRelateds().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				setPrescription((Resource)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((MedicationRequest)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				setPayee((ExplanationOfBenefitPayee)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__INFORMATION:
				getInformations().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM:
				getCareTeams().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				getProcedures().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				setPrecedence((PositiveInt)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__INSURANCE:
				setInsurance((ExplanationOfBenefitInsurance)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ACCIDENT:
				setAccident((ExplanationOfBenefitAccident)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				setEmploymentImpacted((Period)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				setHospitalization((Period)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ITEM:
				getItems().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				getAddItems().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST:
				setTotalCost((Money)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				setTotalBenefit((Money)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYMENT:
				setPayment((ExplanationOfBenefitPayment)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__FORM:
				setForm((CodeableConcept)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				getBenefitBalances().clear();
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__STATUS:
				return status != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__TYPE:
				return type != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				return subTypes != null && !subTypes.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PATIENT:
				return patient != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				return billablePeriod != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CREATED:
				return created != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ENTERER:
				return enterer != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__INSURER:
				return insurer != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				return provider != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION:
				return organization != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				return referral != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__FACILITY:
				return facility != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CLAIM:
				return claim != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				return claimResponse != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__OUTCOME:
				return outcome != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				return disposition != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__RELATED:
				return relateds != null && !relateds.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				return prescription != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				return originalPrescription != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				return payee != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__INFORMATION:
				return informations != null && !informations.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM:
				return careTeams != null && !careTeams.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				return procedures != null && !procedures.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				return precedence != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__INSURANCE:
				return insurance != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ACCIDENT:
				return accident != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				return employmentImpacted != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				return hospitalization != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ITEM:
				return items != null && !items.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				return addItems != null && !addItems.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST:
				return totalCost != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				return unallocDeductable != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				return totalBenefit != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__PAYMENT:
				return payment != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__FORM:
				return form != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				return benefitBalances != null && !benefitBalances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitImpl
