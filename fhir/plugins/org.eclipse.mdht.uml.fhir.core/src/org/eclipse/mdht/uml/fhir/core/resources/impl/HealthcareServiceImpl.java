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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.Endpoint;
import org.eclipse.mdht.uml.fhir.core.resources.HealthcareService;
import org.eclipse.mdht.uml.fhir.core.resources.HealthcareServiceAvailableTime;
import org.eclipse.mdht.uml.fhir.core.resources.HealthcareServiceNotAvailable;
import org.eclipse.mdht.uml.fhir.core.resources.Location;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Healthcare Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getProvidedBy <em>Provided By</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getServiceTypes <em>Service Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getSpecialties <em>Specialty</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getLocations <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getExtraDetails <em>Extra Details</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getCoverageAreas <em>Coverage Area</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getServiceProvisionCodes <em>Service Provision Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getEligibility <em>Eligibility</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getEligibilityNote <em>Eligibility Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getProgramNames <em>Program Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getCharacteristics <em>Characteristic</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getReferralMethods <em>Referral Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getAppointmentRequired <em>Appointment Required</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getAvailableTimes <em>Available Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getNotAvailables <em>Not Available</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getAvailabilityExceptions <em>Availability Exceptions</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.HealthcareServiceImpl#getEndpoints <em>Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HealthcareServiceImpl extends DomainResourceImpl implements HealthcareService {
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
	 * The cached value of the '{@link #getActive() <em>Active</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean active;

	/**
	 * The cached value of the '{@link #getProvidedBy() <em>Provided By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedBy()
	 * @generated
	 * @ordered
	 */
	protected Organization providedBy;

	/**
	 * The cached value of the '{@link #getServiceCategory() <em>Service Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept serviceCategory;

	/**
	 * The cached value of the '{@link #getServiceTypes() <em>Service Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceTypes;

	/**
	 * The cached value of the '{@link #getSpecialties() <em>Specialty</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialties()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialties;

	/**
	 * The cached value of the '{@link #getLocations() <em>Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String serviceName;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String comment;

	/**
	 * The cached value of the '{@link #getExtraDetails() <em>Extra Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraDetails()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String extraDetails;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected Attachment photo;

	/**
	 * The cached value of the '{@link #getTelecoms() <em>Telecom</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecoms()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecoms;

	/**
	 * The cached value of the '{@link #getCoverageAreas() <em>Coverage Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> coverageAreas;

	/**
	 * The cached value of the '{@link #getServiceProvisionCodes() <em>Service Provision Code</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProvisionCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceProvisionCodes;

	/**
	 * The cached value of the '{@link #getEligibility() <em>Eligibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEligibility()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept eligibility;

	/**
	 * The cached value of the '{@link #getEligibilityNote() <em>Eligibility Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEligibilityNote()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String eligibilityNote;

	/**
	 * The cached value of the '{@link #getProgramNames() <em>Program Name</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramNames()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> programNames;

	/**
	 * The cached value of the '{@link #getCharacteristics() <em>Characteristic</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> characteristics;

	/**
	 * The cached value of the '{@link #getReferralMethods() <em>Referral Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> referralMethods;

	/**
	 * The cached value of the '{@link #getPublicKey() <em>Public Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String publicKey;

	/**
	 * The cached value of the '{@link #getAppointmentRequired() <em>Appointment Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentRequired()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean appointmentRequired;

	/**
	 * The cached value of the '{@link #getAvailableTimes() <em>Available Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<HealthcareServiceAvailableTime> availableTimes;

	/**
	 * The cached value of the '{@link #getNotAvailables() <em>Not Available</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotAvailables()
	 * @generated
	 * @ordered
	 */
	protected EList<HealthcareServiceNotAvailable> notAvailables;

	/**
	 * The cached value of the '{@link #getAvailabilityExceptions() <em>Availability Exceptions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityExceptions()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String availabilityExceptions;

	/**
	 * The cached value of the '{@link #getEndpoints() <em>Endpoint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Endpoint> endpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthcareServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getHealthcareService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.HEALTHCARE_SERVICE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getActive() {
		if (active != null && active.eIsProxy()) {
			InternalEObject oldActive = (InternalEObject)active;
			active = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldActive);
			if (active != oldActive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HEALTHCARE_SERVICE__ACTIVE, oldActive, active));
			}
		}
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newActive) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getProvidedBy() {
		if (providedBy != null && providedBy.eIsProxy()) {
			InternalEObject oldProvidedBy = (InternalEObject)providedBy;
			providedBy = (Organization)eResolveProxy(oldProvidedBy);
			if (providedBy != oldProvidedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HEALTHCARE_SERVICE__PROVIDED_BY, oldProvidedBy, providedBy));
			}
		}
		return providedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetProvidedBy() {
		return providedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedBy(Organization newProvidedBy) {
		Organization oldProvidedBy = providedBy;
		providedBy = newProvidedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__PROVIDED_BY, oldProvidedBy, providedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getServiceCategory() {
		if (serviceCategory != null && serviceCategory.eIsProxy()) {
			InternalEObject oldServiceCategory = (InternalEObject)serviceCategory;
			serviceCategory = (CodeableConcept)eResolveProxy(oldServiceCategory);
			if (serviceCategory != oldServiceCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_CATEGORY, oldServiceCategory, serviceCategory));
			}
		}
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetServiceCategory() {
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCategory(CodeableConcept newServiceCategory) {
		CodeableConcept oldServiceCategory = serviceCategory;
		serviceCategory = newServiceCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_CATEGORY, oldServiceCategory, serviceCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getServiceTypes() {
		if (serviceTypes == null) {
			serviceTypes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_TYPE);
		}
		return serviceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialties() {
		if (specialties == null) {
			specialties = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.HEALTHCARE_SERVICE__SPECIALTY);
		}
		return specialties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectResolvingEList<Location>(Location.class, this, ResourcesPackage.HEALTHCARE_SERVICE__LOCATION);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getServiceName() {
		if (serviceName != null && serviceName.eIsProxy()) {
			InternalEObject oldServiceName = (InternalEObject)serviceName;
			serviceName = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldServiceName);
			if (serviceName != oldServiceName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_NAME, oldServiceName, serviceName));
			}
		}
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(org.eclipse.mdht.uml.fhir.core.dataTypes.String newServiceName) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getComment() {
		if (comment != null && comment.eIsProxy()) {
			InternalEObject oldComment = (InternalEObject)comment;
			comment = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldComment);
			if (comment != oldComment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HEALTHCARE_SERVICE__COMMENT, oldComment, comment));
			}
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(org.eclipse.mdht.uml.fhir.core.dataTypes.String newComment) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getExtraDetails() {
		if (extraDetails != null && extraDetails.eIsProxy()) {
			InternalEObject oldExtraDetails = (InternalEObject)extraDetails;
			extraDetails = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldExtraDetails);
			if (extraDetails != oldExtraDetails) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS, oldExtraDetails, extraDetails));
			}
		}
		return extraDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetExtraDetails() {
		return extraDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraDetails(org.eclipse.mdht.uml.fhir.core.dataTypes.String newExtraDetails) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldExtraDetails = extraDetails;
		extraDetails = newExtraDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS, oldExtraDetails, extraDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getPhoto() {
		if (photo != null && photo.eIsProxy()) {
			InternalEObject oldPhoto = (InternalEObject)photo;
			photo = (Attachment)eResolveProxy(oldPhoto);
			if (photo != oldPhoto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HEALTHCARE_SERVICE__PHOTO, oldPhoto, photo));
			}
		}
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment basicGetPhoto() {
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoto(Attachment newPhoto) {
		Attachment oldPhoto = photo;
		photo = newPhoto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__PHOTO, oldPhoto, photo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectResolvingEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.HEALTHCARE_SERVICE__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getCoverageAreas() {
		if (coverageAreas == null) {
			coverageAreas = new EObjectResolvingEList<Location>(Location.class, this, ResourcesPackage.HEALTHCARE_SERVICE__COVERAGE_AREA);
		}
		return coverageAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getServiceProvisionCodes() {
		if (serviceProvisionCodes == null) {
			serviceProvisionCodes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE);
		}
		return serviceProvisionCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getEligibility() {
		if (eligibility != null && eligibility.eIsProxy()) {
			InternalEObject oldEligibility = (InternalEObject)eligibility;
			eligibility = (CodeableConcept)eResolveProxy(oldEligibility);
			if (eligibility != oldEligibility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY, oldEligibility, eligibility));
			}
		}
		return eligibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetEligibility() {
		return eligibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEligibility(CodeableConcept newEligibility) {
		CodeableConcept oldEligibility = eligibility;
		eligibility = newEligibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY, oldEligibility, eligibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getEligibilityNote() {
		if (eligibilityNote != null && eligibilityNote.eIsProxy()) {
			InternalEObject oldEligibilityNote = (InternalEObject)eligibilityNote;
			eligibilityNote = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldEligibilityNote);
			if (eligibilityNote != oldEligibilityNote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY_NOTE, oldEligibilityNote, eligibilityNote));
			}
		}
		return eligibilityNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetEligibilityNote() {
		return eligibilityNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEligibilityNote(org.eclipse.mdht.uml.fhir.core.dataTypes.String newEligibilityNote) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldEligibilityNote = eligibilityNote;
		eligibilityNote = newEligibilityNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY_NOTE, oldEligibilityNote, eligibilityNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> getProgramNames() {
		if (programNames == null) {
			programNames = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.dataTypes.String>(org.eclipse.mdht.uml.fhir.core.dataTypes.String.class, this, ResourcesPackage.HEALTHCARE_SERVICE__PROGRAM_NAME);
		}
		return programNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCharacteristics() {
		if (characteristics == null) {
			characteristics = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.HEALTHCARE_SERVICE__CHARACTERISTIC);
		}
		return characteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReferralMethods() {
		if (referralMethods == null) {
			referralMethods = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD);
		}
		return referralMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getPublicKey() {
		if (publicKey != null && publicKey.eIsProxy()) {
			InternalEObject oldPublicKey = (InternalEObject)publicKey;
			publicKey = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldPublicKey);
			if (publicKey != oldPublicKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HEALTHCARE_SERVICE__PUBLIC_KEY, oldPublicKey, publicKey));
			}
		}
		return publicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetPublicKey() {
		return publicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicKey(org.eclipse.mdht.uml.fhir.core.dataTypes.String newPublicKey) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldPublicKey = publicKey;
		publicKey = newPublicKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__PUBLIC_KEY, oldPublicKey, publicKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getAppointmentRequired() {
		if (appointmentRequired != null && appointmentRequired.eIsProxy()) {
			InternalEObject oldAppointmentRequired = (InternalEObject)appointmentRequired;
			appointmentRequired = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldAppointmentRequired);
			if (appointmentRequired != oldAppointmentRequired) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED, oldAppointmentRequired, appointmentRequired));
			}
		}
		return appointmentRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetAppointmentRequired() {
		return appointmentRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppointmentRequired(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newAppointmentRequired) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldAppointmentRequired = appointmentRequired;
		appointmentRequired = newAppointmentRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED, oldAppointmentRequired, appointmentRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HealthcareServiceAvailableTime> getAvailableTimes() {
		if (availableTimes == null) {
			availableTimes = new EObjectContainmentEList<HealthcareServiceAvailableTime>(HealthcareServiceAvailableTime.class, this, ResourcesPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME);
		}
		return availableTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HealthcareServiceNotAvailable> getNotAvailables() {
		if (notAvailables == null) {
			notAvailables = new EObjectContainmentEList<HealthcareServiceNotAvailable>(HealthcareServiceNotAvailable.class, this, ResourcesPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE);
		}
		return notAvailables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getAvailabilityExceptions() {
		if (availabilityExceptions != null && availabilityExceptions.eIsProxy()) {
			InternalEObject oldAvailabilityExceptions = (InternalEObject)availabilityExceptions;
			availabilityExceptions = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldAvailabilityExceptions);
			if (availabilityExceptions != oldAvailabilityExceptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS, oldAvailabilityExceptions, availabilityExceptions));
			}
		}
		return availabilityExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetAvailabilityExceptions() {
		return availabilityExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailabilityExceptions(org.eclipse.mdht.uml.fhir.core.dataTypes.String newAvailabilityExceptions) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldAvailabilityExceptions = availabilityExceptions;
		availabilityExceptions = newAvailabilityExceptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS, oldAvailabilityExceptions, availabilityExceptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Endpoint> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectResolvingEList<Endpoint>(Endpoint.class, this, ResourcesPackage.HEALTHCARE_SERVICE__ENDPOINT);
		}
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				return ((InternalEList<?>)getAvailableTimes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				return ((InternalEList<?>)getNotAvailables()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.HEALTHCARE_SERVICE__ACTIVE:
				if (resolve) return getActive();
				return basicGetActive();
			case ResourcesPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				if (resolve) return getProvidedBy();
				return basicGetProvidedBy();
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_CATEGORY:
				if (resolve) return getServiceCategory();
				return basicGetServiceCategory();
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_TYPE:
				return getServiceTypes();
			case ResourcesPackage.HEALTHCARE_SERVICE__SPECIALTY:
				return getSpecialties();
			case ResourcesPackage.HEALTHCARE_SERVICE__LOCATION:
				return getLocations();
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_NAME:
				if (resolve) return getServiceName();
				return basicGetServiceName();
			case ResourcesPackage.HEALTHCARE_SERVICE__COMMENT:
				if (resolve) return getComment();
				return basicGetComment();
			case ResourcesPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				if (resolve) return getExtraDetails();
				return basicGetExtraDetails();
			case ResourcesPackage.HEALTHCARE_SERVICE__PHOTO:
				if (resolve) return getPhoto();
				return basicGetPhoto();
			case ResourcesPackage.HEALTHCARE_SERVICE__TELECOM:
				return getTelecoms();
			case ResourcesPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				return getCoverageAreas();
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				return getServiceProvisionCodes();
			case ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				if (resolve) return getEligibility();
				return basicGetEligibility();
			case ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY_NOTE:
				if (resolve) return getEligibilityNote();
				return basicGetEligibilityNote();
			case ResourcesPackage.HEALTHCARE_SERVICE__PROGRAM_NAME:
				return getProgramNames();
			case ResourcesPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				return getCharacteristics();
			case ResourcesPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				return getReferralMethods();
			case ResourcesPackage.HEALTHCARE_SERVICE__PUBLIC_KEY:
				if (resolve) return getPublicKey();
				return basicGetPublicKey();
			case ResourcesPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				if (resolve) return getAppointmentRequired();
				return basicGetAppointmentRequired();
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				return getAvailableTimes();
			case ResourcesPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				return getNotAvailables();
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				if (resolve) return getAvailabilityExceptions();
				return basicGetAvailabilityExceptions();
			case ResourcesPackage.HEALTHCARE_SERVICE__ENDPOINT:
				return getEndpoints();
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
			case ResourcesPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				setProvidedBy((Organization)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_CATEGORY:
				setServiceCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_TYPE:
				getServiceTypes().clear();
				getServiceTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__SPECIALTY:
				getSpecialties().clear();
				getSpecialties().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__LOCATION:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_NAME:
				setServiceName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__COMMENT:
				setComment((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				setExtraDetails((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__PHOTO:
				setPhoto((Attachment)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				getCoverageAreas().clear();
				getCoverageAreas().addAll((Collection<? extends Location>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				getServiceProvisionCodes().clear();
				getServiceProvisionCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				setEligibility((CodeableConcept)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY_NOTE:
				setEligibilityNote((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__PROGRAM_NAME:
				getProgramNames().clear();
				getProgramNames().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				getCharacteristics().clear();
				getCharacteristics().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				getReferralMethods().clear();
				getReferralMethods().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__PUBLIC_KEY:
				setPublicKey((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				setAppointmentRequired((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				getAvailableTimes().clear();
				getAvailableTimes().addAll((Collection<? extends HealthcareServiceAvailableTime>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				getNotAvailables().clear();
				getNotAvailables().addAll((Collection<? extends HealthcareServiceNotAvailable>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				setAvailabilityExceptions((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__ENDPOINT:
				getEndpoints().clear();
				getEndpoints().addAll((Collection<? extends Endpoint>)newValue);
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
			case ResourcesPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				setProvidedBy((Organization)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_CATEGORY:
				setServiceCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_TYPE:
				getServiceTypes().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__SPECIALTY:
				getSpecialties().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__LOCATION:
				getLocations().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_NAME:
				setServiceName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__COMMENT:
				setComment((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				setExtraDetails((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__PHOTO:
				setPhoto((Attachment)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__TELECOM:
				getTelecoms().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				getCoverageAreas().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				getServiceProvisionCodes().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				setEligibility((CodeableConcept)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY_NOTE:
				setEligibilityNote((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__PROGRAM_NAME:
				getProgramNames().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				getCharacteristics().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				getReferralMethods().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__PUBLIC_KEY:
				setPublicKey((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				setAppointmentRequired((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				getAvailableTimes().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				getNotAvailables().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				setAvailabilityExceptions((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__ENDPOINT:
				getEndpoints().clear();
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
			case ResourcesPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__ACTIVE:
				return active != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				return providedBy != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_CATEGORY:
				return serviceCategory != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_TYPE:
				return serviceTypes != null && !serviceTypes.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__SPECIALTY:
				return specialties != null && !specialties.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__LOCATION:
				return locations != null && !locations.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_NAME:
				return serviceName != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__COMMENT:
				return comment != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				return extraDetails != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__PHOTO:
				return photo != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				return coverageAreas != null && !coverageAreas.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				return serviceProvisionCodes != null && !serviceProvisionCodes.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				return eligibility != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY_NOTE:
				return eligibilityNote != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__PROGRAM_NAME:
				return programNames != null && !programNames.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				return characteristics != null && !characteristics.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				return referralMethods != null && !referralMethods.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__PUBLIC_KEY:
				return publicKey != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				return appointmentRequired != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				return availableTimes != null && !availableTimes.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				return notAvailables != null && !notAvailables.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				return availabilityExceptions != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__ENDPOINT:
				return endpoints != null && !endpoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HealthcareServiceImpl
