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
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.Coverage;
import org.eclipse.mdht.uml.fhir.core.resources.EligibilityRequest;
import org.eclipse.mdht.uml.fhir.core.resources.Location;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eligibility Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityRequestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityRequestImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityRequestImpl#getServicedx <em>Servicedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityRequestImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityRequestImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityRequestImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityRequestImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityRequestImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityRequestImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityRequestImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityRequestImpl#getBusinessArrangement <em>Business Arrangement</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityRequestImpl#getBenefitCategory <em>Benefit Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityRequestImpl#getBenefitSubCategory <em>Benefit Sub Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EligibilityRequestImpl extends DomainResourceImpl implements EligibilityRequest {
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
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

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
	 * The cached value of the '{@link #getServicedx() <em>Servicedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedx()
	 * @generated
	 * @ordered
	 */
	protected DataType servicedx;

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
	 * The cached value of the '{@link #getInsurer() <em>Insurer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurer()
	 * @generated
	 * @ordered
	 */
	protected Organization insurer;

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
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected Coverage coverage;

	/**
	 * The cached value of the '{@link #getBusinessArrangement() <em>Business Arrangement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessArrangement()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String businessArrangement;

	/**
	 * The cached value of the '{@link #getBenefitCategory() <em>Benefit Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept benefitCategory;

	/**
	 * The cached value of the '{@link #getBenefitSubCategory() <em>Benefit Sub Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitSubCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept benefitSubCategory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EligibilityRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEligibilityRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.ELIGIBILITY_REQUEST__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_REQUEST__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_REQUEST__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_REQUEST__PRIORITY, oldPriority, priority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_REQUEST__PRIORITY, oldPriority, priority));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_REQUEST__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_REQUEST__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getServicedx() {
		if (servicedx != null && servicedx.eIsProxy()) {
			InternalEObject oldServicedx = (InternalEObject)servicedx;
			servicedx = (DataType)eResolveProxy(oldServicedx);
			if (servicedx != oldServicedx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_REQUEST__SERVICEDX, oldServicedx, servicedx));
			}
		}
		return servicedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetServicedx() {
		return servicedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicedx(DataType newServicedx) {
		DataType oldServicedx = servicedx;
		servicedx = newServicedx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_REQUEST__SERVICEDX, oldServicedx, servicedx));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_REQUEST__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_REQUEST__CREATED, oldCreated, created));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_REQUEST__ENTERER, oldEnterer, enterer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_REQUEST__ENTERER, oldEnterer, enterer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_REQUEST__PROVIDER, oldProvider, provider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_REQUEST__PROVIDER, oldProvider, provider));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_REQUEST__ORGANIZATION, oldOrganization, organization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_REQUEST__ORGANIZATION, oldOrganization, organization));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_REQUEST__INSURER, oldInsurer, insurer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_REQUEST__INSURER, oldInsurer, insurer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_REQUEST__FACILITY, oldFacility, facility));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_REQUEST__FACILITY, oldFacility, facility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage getCoverage() {
		if (coverage != null && coverage.eIsProxy()) {
			InternalEObject oldCoverage = (InternalEObject)coverage;
			coverage = (Coverage)eResolveProxy(oldCoverage);
			if (coverage != oldCoverage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_REQUEST__COVERAGE, oldCoverage, coverage));
			}
		}
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage basicGetCoverage() {
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverage(Coverage newCoverage) {
		Coverage oldCoverage = coverage;
		coverage = newCoverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_REQUEST__COVERAGE, oldCoverage, coverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getBusinessArrangement() {
		if (businessArrangement != null && businessArrangement.eIsProxy()) {
			InternalEObject oldBusinessArrangement = (InternalEObject)businessArrangement;
			businessArrangement = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldBusinessArrangement);
			if (businessArrangement != oldBusinessArrangement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT, oldBusinessArrangement, businessArrangement));
			}
		}
		return businessArrangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetBusinessArrangement() {
		return businessArrangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessArrangement(org.eclipse.mdht.uml.fhir.core.dataTypes.String newBusinessArrangement) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldBusinessArrangement = businessArrangement;
		businessArrangement = newBusinessArrangement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT, oldBusinessArrangement, businessArrangement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBenefitCategory() {
		if (benefitCategory != null && benefitCategory.eIsProxy()) {
			InternalEObject oldBenefitCategory = (InternalEObject)benefitCategory;
			benefitCategory = (CodeableConcept)eResolveProxy(oldBenefitCategory);
			if (benefitCategory != oldBenefitCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY, oldBenefitCategory, benefitCategory));
			}
		}
		return benefitCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetBenefitCategory() {
		return benefitCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitCategory(CodeableConcept newBenefitCategory) {
		CodeableConcept oldBenefitCategory = benefitCategory;
		benefitCategory = newBenefitCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY, oldBenefitCategory, benefitCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBenefitSubCategory() {
		if (benefitSubCategory != null && benefitSubCategory.eIsProxy()) {
			InternalEObject oldBenefitSubCategory = (InternalEObject)benefitSubCategory;
			benefitSubCategory = (CodeableConcept)eResolveProxy(oldBenefitSubCategory);
			if (benefitSubCategory != oldBenefitSubCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY, oldBenefitSubCategory, benefitSubCategory));
			}
		}
		return benefitSubCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetBenefitSubCategory() {
		return benefitSubCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitSubCategory(CodeableConcept newBenefitSubCategory) {
		CodeableConcept oldBenefitSubCategory = benefitSubCategory;
		benefitSubCategory = newBenefitSubCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY, oldBenefitSubCategory, benefitSubCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.ELIGIBILITY_REQUEST__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.ELIGIBILITY_REQUEST__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.ELIGIBILITY_REQUEST__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
			case ResourcesPackage.ELIGIBILITY_REQUEST__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case ResourcesPackage.ELIGIBILITY_REQUEST__SERVICEDX:
				if (resolve) return getServicedx();
				return basicGetServicedx();
			case ResourcesPackage.ELIGIBILITY_REQUEST__CREATED:
				if (resolve) return getCreated();
				return basicGetCreated();
			case ResourcesPackage.ELIGIBILITY_REQUEST__ENTERER:
				if (resolve) return getEnterer();
				return basicGetEnterer();
			case ResourcesPackage.ELIGIBILITY_REQUEST__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case ResourcesPackage.ELIGIBILITY_REQUEST__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case ResourcesPackage.ELIGIBILITY_REQUEST__INSURER:
				if (resolve) return getInsurer();
				return basicGetInsurer();
			case ResourcesPackage.ELIGIBILITY_REQUEST__FACILITY:
				if (resolve) return getFacility();
				return basicGetFacility();
			case ResourcesPackage.ELIGIBILITY_REQUEST__COVERAGE:
				if (resolve) return getCoverage();
				return basicGetCoverage();
			case ResourcesPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT:
				if (resolve) return getBusinessArrangement();
				return basicGetBusinessArrangement();
			case ResourcesPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY:
				if (resolve) return getBenefitCategory();
				return basicGetBenefitCategory();
			case ResourcesPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY:
				if (resolve) return getBenefitSubCategory();
				return basicGetBenefitSubCategory();
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
			case ResourcesPackage.ELIGIBILITY_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__PATIENT:
				setPatient((Patient)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__SERVICEDX:
				setServicedx((DataType)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__CREATED:
				setCreated((DateTime)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__ENTERER:
				setEnterer((Practitioner)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__PROVIDER:
				setProvider((Practitioner)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__INSURER:
				setInsurer((Organization)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__FACILITY:
				setFacility((Location)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__COVERAGE:
				setCoverage((Coverage)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT:
				setBusinessArrangement((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY:
				setBenefitCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY:
				setBenefitSubCategory((CodeableConcept)newValue);
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
			case ResourcesPackage.ELIGIBILITY_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__PATIENT:
				setPatient((Patient)null);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__SERVICEDX:
				setServicedx((DataType)null);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__CREATED:
				setCreated((DateTime)null);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__ENTERER:
				setEnterer((Practitioner)null);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__PROVIDER:
				setProvider((Practitioner)null);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__INSURER:
				setInsurer((Organization)null);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__FACILITY:
				setFacility((Location)null);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__COVERAGE:
				setCoverage((Coverage)null);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT:
				setBusinessArrangement((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY:
				setBenefitCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY:
				setBenefitSubCategory((CodeableConcept)null);
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
			case ResourcesPackage.ELIGIBILITY_REQUEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.ELIGIBILITY_REQUEST__STATUS:
				return status != null;
			case ResourcesPackage.ELIGIBILITY_REQUEST__PRIORITY:
				return priority != null;
			case ResourcesPackage.ELIGIBILITY_REQUEST__PATIENT:
				return patient != null;
			case ResourcesPackage.ELIGIBILITY_REQUEST__SERVICEDX:
				return servicedx != null;
			case ResourcesPackage.ELIGIBILITY_REQUEST__CREATED:
				return created != null;
			case ResourcesPackage.ELIGIBILITY_REQUEST__ENTERER:
				return enterer != null;
			case ResourcesPackage.ELIGIBILITY_REQUEST__PROVIDER:
				return provider != null;
			case ResourcesPackage.ELIGIBILITY_REQUEST__ORGANIZATION:
				return organization != null;
			case ResourcesPackage.ELIGIBILITY_REQUEST__INSURER:
				return insurer != null;
			case ResourcesPackage.ELIGIBILITY_REQUEST__FACILITY:
				return facility != null;
			case ResourcesPackage.ELIGIBILITY_REQUEST__COVERAGE:
				return coverage != null;
			case ResourcesPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT:
				return businessArrangement != null;
			case ResourcesPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY:
				return benefitCategory != null;
			case ResourcesPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY:
				return benefitSubCategory != null;
		}
		return super.eIsSet(featureID);
	}

} //EligibilityRequestImpl
