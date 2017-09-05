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
import org.eclipse.mdht.uml.fhir.core.resources.Claim;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimAccident;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimCareTeam;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimDiagnosis;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimInsurance;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimItem;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimPayee;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimProcedure;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimRelatedClaim;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimSpecialCondition;
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
 * An implementation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getSubTypes <em>Sub Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getFundsReserve <em>Funds Reserve</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getRelateds <em>Related</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getOriginalPrescription <em>Original Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getReferral <em>Referral</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getCareTeams <em>Care Team</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getInformations <em>Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getProcedures <em>Procedure</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getInsurances <em>Insurance</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getAccident <em>Accident</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getEmploymentImpacted <em>Employment Impacted</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getItems <em>Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimImpl#getTotal <em>Total</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimImpl extends DomainResourceImpl implements Claim {
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
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Code use;

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
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

	/**
	 * The cached value of the '{@link #getFundsReserve() <em>Funds Reserve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundsReserve()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept fundsReserve;

	/**
	 * The cached value of the '{@link #getRelateds() <em>Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelateds()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimRelatedClaim> relateds;

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
	protected ClaimPayee payee;

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
	 * The cached value of the '{@link #getCareTeams() <em>Care Team</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimCareTeam> careTeams;

	/**
	 * The cached value of the '{@link #getInformations() <em>Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimSpecialCondition> informations;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimDiagnosis> diagnosis;

	/**
	 * The cached value of the '{@link #getProcedures() <em>Procedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedures()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimProcedure> procedures;

	/**
	 * The cached value of the '{@link #getInsurances() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurances()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimInsurance> insurances;

	/**
	 * The cached value of the '{@link #getAccident() <em>Accident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccident()
	 * @generated
	 * @ordered
	 */
	protected ClaimAccident accident;

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
	protected EList<ClaimItem> items;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected Money total;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClaim();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.CLAIM__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CLAIM__SUB_TYPE);
		}
		return subTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getUse() {
		if (use != null && use.eIsProxy()) {
			InternalEObject oldUse = (InternalEObject)use;
			use = (Code)eResolveProxy(oldUse);
			if (use != oldUse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__USE, oldUse, use));
			}
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Code newUse) {
		Code oldUse = use;
		use = newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__USE, oldUse, use));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__PATIENT, oldPatient, patient));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__BILLABLE_PERIOD, oldBillablePeriod, billablePeriod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__BILLABLE_PERIOD, oldBillablePeriod, billablePeriod));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__CREATED, oldCreated, created));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__ENTERER, oldEnterer, enterer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__ENTERER, oldEnterer, enterer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__INSURER, oldInsurer, insurer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__INSURER, oldInsurer, insurer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__PROVIDER, oldProvider, provider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__PROVIDER, oldProvider, provider));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__ORGANIZATION, oldOrganization, organization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPriority() {
		if (priority != null && priority.eIsProxy()) {
			InternalEObject oldPriority = (InternalEObject)priority;
			priority = (CodeableConcept)eResolveProxy(oldPriority);
			if (priority != oldPriority) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__PRIORITY, oldPriority, priority));
			}
		}
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(CodeableConcept newPriority) {
		CodeableConcept oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFundsReserve() {
		if (fundsReserve != null && fundsReserve.eIsProxy()) {
			InternalEObject oldFundsReserve = (InternalEObject)fundsReserve;
			fundsReserve = (CodeableConcept)eResolveProxy(oldFundsReserve);
			if (fundsReserve != oldFundsReserve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__FUNDS_RESERVE, oldFundsReserve, fundsReserve));
			}
		}
		return fundsReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetFundsReserve() {
		return fundsReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFundsReserve(CodeableConcept newFundsReserve) {
		CodeableConcept oldFundsReserve = fundsReserve;
		fundsReserve = newFundsReserve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__FUNDS_RESERVE, oldFundsReserve, fundsReserve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimRelatedClaim> getRelateds() {
		if (relateds == null) {
			relateds = new EObjectContainmentEList<ClaimRelatedClaim>(ClaimRelatedClaim.class, this, ResourcesPackage.CLAIM__RELATED);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__PRESCRIPTION, oldPrescription, prescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__PRESCRIPTION, oldPrescription, prescription));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__ORIGINAL_PRESCRIPTION, oldOriginalPrescription, originalPrescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__ORIGINAL_PRESCRIPTION, oldOriginalPrescription, originalPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimPayee getPayee() {
		return payee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayee(ClaimPayee newPayee, NotificationChain msgs) {
		ClaimPayee oldPayee = payee;
		payee = newPayee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__PAYEE, oldPayee, newPayee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayee(ClaimPayee newPayee) {
		if (newPayee != payee) {
			NotificationChain msgs = null;
			if (payee != null)
				msgs = ((InternalEObject)payee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM__PAYEE, null, msgs);
			if (newPayee != null)
				msgs = ((InternalEObject)newPayee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM__PAYEE, null, msgs);
			msgs = basicSetPayee(newPayee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__PAYEE, newPayee, newPayee));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__REFERRAL, oldReferral, referral));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__REFERRAL, oldReferral, referral));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__FACILITY, oldFacility, facility));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__FACILITY, oldFacility, facility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimCareTeam> getCareTeams() {
		if (careTeams == null) {
			careTeams = new EObjectContainmentEList<ClaimCareTeam>(ClaimCareTeam.class, this, ResourcesPackage.CLAIM__CARE_TEAM);
		}
		return careTeams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimSpecialCondition> getInformations() {
		if (informations == null) {
			informations = new EObjectContainmentEList<ClaimSpecialCondition>(ClaimSpecialCondition.class, this, ResourcesPackage.CLAIM__INFORMATION);
		}
		return informations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<ClaimDiagnosis>(ClaimDiagnosis.class, this, ResourcesPackage.CLAIM__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimProcedure> getProcedures() {
		if (procedures == null) {
			procedures = new EObjectContainmentEList<ClaimProcedure>(ClaimProcedure.class, this, ResourcesPackage.CLAIM__PROCEDURE);
		}
		return procedures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimInsurance> getInsurances() {
		if (insurances == null) {
			insurances = new EObjectContainmentEList<ClaimInsurance>(ClaimInsurance.class, this, ResourcesPackage.CLAIM__INSURANCE);
		}
		return insurances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimAccident getAccident() {
		return accident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccident(ClaimAccident newAccident, NotificationChain msgs) {
		ClaimAccident oldAccident = accident;
		accident = newAccident;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__ACCIDENT, oldAccident, newAccident);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccident(ClaimAccident newAccident) {
		if (newAccident != accident) {
			NotificationChain msgs = null;
			if (accident != null)
				msgs = ((InternalEObject)accident).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM__ACCIDENT, null, msgs);
			if (newAccident != null)
				msgs = ((InternalEObject)newAccident).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM__ACCIDENT, null, msgs);
			msgs = basicSetAccident(newAccident, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__ACCIDENT, newAccident, newAccident));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__EMPLOYMENT_IMPACTED, oldEmploymentImpacted, employmentImpacted));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__EMPLOYMENT_IMPACTED, oldEmploymentImpacted, employmentImpacted));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__HOSPITALIZATION, oldHospitalization, hospitalization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__HOSPITALIZATION, oldHospitalization, hospitalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<ClaimItem>(ClaimItem.class, this, ResourcesPackage.CLAIM__ITEM);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotal() {
		if (total != null && total.eIsProxy()) {
			InternalEObject oldTotal = (InternalEObject)total;
			total = (Money)eResolveProxy(oldTotal);
			if (total != oldTotal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM__TOTAL, oldTotal, total));
			}
		}
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(Money newTotal) {
		Money oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CLAIM__RELATED:
				return ((InternalEList<?>)getRelateds()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM__PAYEE:
				return basicSetPayee(null, msgs);
			case ResourcesPackage.CLAIM__CARE_TEAM:
				return ((InternalEList<?>)getCareTeams()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM__INFORMATION:
				return ((InternalEList<?>)getInformations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM__PROCEDURE:
				return ((InternalEList<?>)getProcedures()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM__INSURANCE:
				return ((InternalEList<?>)getInsurances()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM__ACCIDENT:
				return basicSetAccident(null, msgs);
			case ResourcesPackage.CLAIM__ITEM:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CLAIM__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.CLAIM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.CLAIM__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.CLAIM__SUB_TYPE:
				return getSubTypes();
			case ResourcesPackage.CLAIM__USE:
				if (resolve) return getUse();
				return basicGetUse();
			case ResourcesPackage.CLAIM__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case ResourcesPackage.CLAIM__BILLABLE_PERIOD:
				if (resolve) return getBillablePeriod();
				return basicGetBillablePeriod();
			case ResourcesPackage.CLAIM__CREATED:
				if (resolve) return getCreated();
				return basicGetCreated();
			case ResourcesPackage.CLAIM__ENTERER:
				if (resolve) return getEnterer();
				return basicGetEnterer();
			case ResourcesPackage.CLAIM__INSURER:
				if (resolve) return getInsurer();
				return basicGetInsurer();
			case ResourcesPackage.CLAIM__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case ResourcesPackage.CLAIM__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case ResourcesPackage.CLAIM__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
			case ResourcesPackage.CLAIM__FUNDS_RESERVE:
				if (resolve) return getFundsReserve();
				return basicGetFundsReserve();
			case ResourcesPackage.CLAIM__RELATED:
				return getRelateds();
			case ResourcesPackage.CLAIM__PRESCRIPTION:
				if (resolve) return getPrescription();
				return basicGetPrescription();
			case ResourcesPackage.CLAIM__ORIGINAL_PRESCRIPTION:
				if (resolve) return getOriginalPrescription();
				return basicGetOriginalPrescription();
			case ResourcesPackage.CLAIM__PAYEE:
				return getPayee();
			case ResourcesPackage.CLAIM__REFERRAL:
				if (resolve) return getReferral();
				return basicGetReferral();
			case ResourcesPackage.CLAIM__FACILITY:
				if (resolve) return getFacility();
				return basicGetFacility();
			case ResourcesPackage.CLAIM__CARE_TEAM:
				return getCareTeams();
			case ResourcesPackage.CLAIM__INFORMATION:
				return getInformations();
			case ResourcesPackage.CLAIM__DIAGNOSIS:
				return getDiagnosis();
			case ResourcesPackage.CLAIM__PROCEDURE:
				return getProcedures();
			case ResourcesPackage.CLAIM__INSURANCE:
				return getInsurances();
			case ResourcesPackage.CLAIM__ACCIDENT:
				return getAccident();
			case ResourcesPackage.CLAIM__EMPLOYMENT_IMPACTED:
				if (resolve) return getEmploymentImpacted();
				return basicGetEmploymentImpacted();
			case ResourcesPackage.CLAIM__HOSPITALIZATION:
				if (resolve) return getHospitalization();
				return basicGetHospitalization();
			case ResourcesPackage.CLAIM__ITEM:
				return getItems();
			case ResourcesPackage.CLAIM__TOTAL:
				if (resolve) return getTotal();
				return basicGetTotal();
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
			case ResourcesPackage.CLAIM__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.CLAIM__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CLAIM__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM__SUB_TYPE:
				getSubTypes().clear();
				getSubTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CLAIM__USE:
				setUse((Code)newValue);
				return;
			case ResourcesPackage.CLAIM__PATIENT:
				setPatient((Patient)newValue);
				return;
			case ResourcesPackage.CLAIM__BILLABLE_PERIOD:
				setBillablePeriod((Period)newValue);
				return;
			case ResourcesPackage.CLAIM__CREATED:
				setCreated((DateTime)newValue);
				return;
			case ResourcesPackage.CLAIM__ENTERER:
				setEnterer((Practitioner)newValue);
				return;
			case ResourcesPackage.CLAIM__INSURER:
				setInsurer((Organization)newValue);
				return;
			case ResourcesPackage.CLAIM__PROVIDER:
				setProvider((Practitioner)newValue);
				return;
			case ResourcesPackage.CLAIM__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case ResourcesPackage.CLAIM__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM__FUNDS_RESERVE:
				setFundsReserve((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CLAIM__RELATED:
				getRelateds().clear();
				getRelateds().addAll((Collection<? extends ClaimRelatedClaim>)newValue);
				return;
			case ResourcesPackage.CLAIM__PRESCRIPTION:
				setPrescription((Resource)newValue);
				return;
			case ResourcesPackage.CLAIM__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((MedicationRequest)newValue);
				return;
			case ResourcesPackage.CLAIM__PAYEE:
				setPayee((ClaimPayee)newValue);
				return;
			case ResourcesPackage.CLAIM__REFERRAL:
				setReferral((ReferralRequest)newValue);
				return;
			case ResourcesPackage.CLAIM__FACILITY:
				setFacility((Location)newValue);
				return;
			case ResourcesPackage.CLAIM__CARE_TEAM:
				getCareTeams().clear();
				getCareTeams().addAll((Collection<? extends ClaimCareTeam>)newValue);
				return;
			case ResourcesPackage.CLAIM__INFORMATION:
				getInformations().clear();
				getInformations().addAll((Collection<? extends ClaimSpecialCondition>)newValue);
				return;
			case ResourcesPackage.CLAIM__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends ClaimDiagnosis>)newValue);
				return;
			case ResourcesPackage.CLAIM__PROCEDURE:
				getProcedures().clear();
				getProcedures().addAll((Collection<? extends ClaimProcedure>)newValue);
				return;
			case ResourcesPackage.CLAIM__INSURANCE:
				getInsurances().clear();
				getInsurances().addAll((Collection<? extends ClaimInsurance>)newValue);
				return;
			case ResourcesPackage.CLAIM__ACCIDENT:
				setAccident((ClaimAccident)newValue);
				return;
			case ResourcesPackage.CLAIM__EMPLOYMENT_IMPACTED:
				setEmploymentImpacted((Period)newValue);
				return;
			case ResourcesPackage.CLAIM__HOSPITALIZATION:
				setHospitalization((Period)newValue);
				return;
			case ResourcesPackage.CLAIM__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends ClaimItem>)newValue);
				return;
			case ResourcesPackage.CLAIM__TOTAL:
				setTotal((Money)newValue);
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
			case ResourcesPackage.CLAIM__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.CLAIM__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CLAIM__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM__SUB_TYPE:
				getSubTypes().clear();
				return;
			case ResourcesPackage.CLAIM__USE:
				setUse((Code)null);
				return;
			case ResourcesPackage.CLAIM__PATIENT:
				setPatient((Patient)null);
				return;
			case ResourcesPackage.CLAIM__BILLABLE_PERIOD:
				setBillablePeriod((Period)null);
				return;
			case ResourcesPackage.CLAIM__CREATED:
				setCreated((DateTime)null);
				return;
			case ResourcesPackage.CLAIM__ENTERER:
				setEnterer((Practitioner)null);
				return;
			case ResourcesPackage.CLAIM__INSURER:
				setInsurer((Organization)null);
				return;
			case ResourcesPackage.CLAIM__PROVIDER:
				setProvider((Practitioner)null);
				return;
			case ResourcesPackage.CLAIM__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case ResourcesPackage.CLAIM__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM__FUNDS_RESERVE:
				setFundsReserve((CodeableConcept)null);
				return;
			case ResourcesPackage.CLAIM__RELATED:
				getRelateds().clear();
				return;
			case ResourcesPackage.CLAIM__PRESCRIPTION:
				setPrescription((Resource)null);
				return;
			case ResourcesPackage.CLAIM__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((MedicationRequest)null);
				return;
			case ResourcesPackage.CLAIM__PAYEE:
				setPayee((ClaimPayee)null);
				return;
			case ResourcesPackage.CLAIM__REFERRAL:
				setReferral((ReferralRequest)null);
				return;
			case ResourcesPackage.CLAIM__FACILITY:
				setFacility((Location)null);
				return;
			case ResourcesPackage.CLAIM__CARE_TEAM:
				getCareTeams().clear();
				return;
			case ResourcesPackage.CLAIM__INFORMATION:
				getInformations().clear();
				return;
			case ResourcesPackage.CLAIM__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case ResourcesPackage.CLAIM__PROCEDURE:
				getProcedures().clear();
				return;
			case ResourcesPackage.CLAIM__INSURANCE:
				getInsurances().clear();
				return;
			case ResourcesPackage.CLAIM__ACCIDENT:
				setAccident((ClaimAccident)null);
				return;
			case ResourcesPackage.CLAIM__EMPLOYMENT_IMPACTED:
				setEmploymentImpacted((Period)null);
				return;
			case ResourcesPackage.CLAIM__HOSPITALIZATION:
				setHospitalization((Period)null);
				return;
			case ResourcesPackage.CLAIM__ITEM:
				getItems().clear();
				return;
			case ResourcesPackage.CLAIM__TOTAL:
				setTotal((Money)null);
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
			case ResourcesPackage.CLAIM__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.CLAIM__STATUS:
				return status != null;
			case ResourcesPackage.CLAIM__TYPE:
				return type != null;
			case ResourcesPackage.CLAIM__SUB_TYPE:
				return subTypes != null && !subTypes.isEmpty();
			case ResourcesPackage.CLAIM__USE:
				return use != null;
			case ResourcesPackage.CLAIM__PATIENT:
				return patient != null;
			case ResourcesPackage.CLAIM__BILLABLE_PERIOD:
				return billablePeriod != null;
			case ResourcesPackage.CLAIM__CREATED:
				return created != null;
			case ResourcesPackage.CLAIM__ENTERER:
				return enterer != null;
			case ResourcesPackage.CLAIM__INSURER:
				return insurer != null;
			case ResourcesPackage.CLAIM__PROVIDER:
				return provider != null;
			case ResourcesPackage.CLAIM__ORGANIZATION:
				return organization != null;
			case ResourcesPackage.CLAIM__PRIORITY:
				return priority != null;
			case ResourcesPackage.CLAIM__FUNDS_RESERVE:
				return fundsReserve != null;
			case ResourcesPackage.CLAIM__RELATED:
				return relateds != null && !relateds.isEmpty();
			case ResourcesPackage.CLAIM__PRESCRIPTION:
				return prescription != null;
			case ResourcesPackage.CLAIM__ORIGINAL_PRESCRIPTION:
				return originalPrescription != null;
			case ResourcesPackage.CLAIM__PAYEE:
				return payee != null;
			case ResourcesPackage.CLAIM__REFERRAL:
				return referral != null;
			case ResourcesPackage.CLAIM__FACILITY:
				return facility != null;
			case ResourcesPackage.CLAIM__CARE_TEAM:
				return careTeams != null && !careTeams.isEmpty();
			case ResourcesPackage.CLAIM__INFORMATION:
				return informations != null && !informations.isEmpty();
			case ResourcesPackage.CLAIM__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case ResourcesPackage.CLAIM__PROCEDURE:
				return procedures != null && !procedures.isEmpty();
			case ResourcesPackage.CLAIM__INSURANCE:
				return insurances != null && !insurances.isEmpty();
			case ResourcesPackage.CLAIM__ACCIDENT:
				return accident != null;
			case ResourcesPackage.CLAIM__EMPLOYMENT_IMPACTED:
				return employmentImpacted != null;
			case ResourcesPackage.CLAIM__HOSPITALIZATION:
				return hospitalization != null;
			case ResourcesPackage.CLAIM__ITEM:
				return items != null && !items.isEmpty();
			case ResourcesPackage.CLAIM__TOTAL:
				return total != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimImpl
