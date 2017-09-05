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
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.resources.Endpoint;
import org.eclipse.mdht.uml.fhir.core.resources.HealthcareService;
import org.eclipse.mdht.uml.fhir.core.resources.Location;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.PractitionerRole;
import org.eclipse.mdht.uml.fhir.core.resources.PractitionerRoleAvailableTime;
import org.eclipse.mdht.uml.fhir.core.resources.PractitionerRoleNotAvailable;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practitioner Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerRoleImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerRoleImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerRoleImpl#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerRoleImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerRoleImpl#getCodes <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerRoleImpl#getSpecialties <em>Specialty</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerRoleImpl#getLocations <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerRoleImpl#getHealthcareServices <em>Healthcare Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerRoleImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerRoleImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerRoleImpl#getAvailableTimes <em>Available Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerRoleImpl#getNotAvailables <em>Not Available</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerRoleImpl#getAvailabilityExceptions <em>Availability Exceptions</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerRoleImpl#getEndpoints <em>Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PractitionerRoleImpl extends DomainResourceImpl implements PractitionerRole {
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
	 * The cached value of the '{@link #getPractitioner() <em>Practitioner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPractitioner()
	 * @generated
	 * @ordered
	 */
	protected Practitioner practitioner;

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
	 * The cached value of the '{@link #getCodes() <em>Code</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> codes;

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
	 * The cached value of the '{@link #getHealthcareServices() <em>Healthcare Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthcareServices()
	 * @generated
	 * @ordered
	 */
	protected EList<HealthcareService> healthcareServices;

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
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getAvailableTimes() <em>Available Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<PractitionerRoleAvailableTime> availableTimes;

	/**
	 * The cached value of the '{@link #getNotAvailables() <em>Not Available</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotAvailables()
	 * @generated
	 * @ordered
	 */
	protected EList<PractitionerRoleNotAvailable> notAvailables;

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
	protected PractitionerRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getPractitionerRole();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PRACTITIONER_ROLE__ORGANIZATION, oldOrganization, organization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCodes() {
		if (codes == null) {
			codes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PRACTITIONER_ROLE__CODE);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialties() {
		if (specialties == null) {
			specialties = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PRACTITIONER_ROLE__SPECIALTY);
		}
		return specialties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.PRACTITIONER_ROLE__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PRACTITIONER_ROLE__ACTIVE, oldActive, active));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getPractitioner() {
		if (practitioner != null && practitioner.eIsProxy()) {
			InternalEObject oldPractitioner = (InternalEObject)practitioner;
			practitioner = (Practitioner)eResolveProxy(oldPractitioner);
			if (practitioner != oldPractitioner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PRACTITIONER_ROLE__PRACTITIONER, oldPractitioner, practitioner));
			}
		}
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetPractitioner() {
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPractitioner(Practitioner newPractitioner) {
		Practitioner oldPractitioner = practitioner;
		practitioner = newPractitioner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE__PRACTITIONER, oldPractitioner, practitioner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectResolvingEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.PRACTITIONER_ROLE__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (Period)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PRACTITIONER_ROLE__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PractitionerRoleAvailableTime> getAvailableTimes() {
		if (availableTimes == null) {
			availableTimes = new EObjectContainmentEList<PractitionerRoleAvailableTime>(PractitionerRoleAvailableTime.class, this, ResourcesPackage.PRACTITIONER_ROLE__AVAILABLE_TIME);
		}
		return availableTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PractitionerRoleNotAvailable> getNotAvailables() {
		if (notAvailables == null) {
			notAvailables = new EObjectContainmentEList<PractitionerRoleNotAvailable>(PractitionerRoleNotAvailable.class, this, ResourcesPackage.PRACTITIONER_ROLE__NOT_AVAILABLE);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PRACTITIONER_ROLE__AVAILABILITY_EXCEPTIONS, oldAvailabilityExceptions, availabilityExceptions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER_ROLE__AVAILABILITY_EXCEPTIONS, oldAvailabilityExceptions, availabilityExceptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectResolvingEList<Location>(Location.class, this, ResourcesPackage.PRACTITIONER_ROLE__LOCATION);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HealthcareService> getHealthcareServices() {
		if (healthcareServices == null) {
			healthcareServices = new EObjectResolvingEList<HealthcareService>(HealthcareService.class, this, ResourcesPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE);
		}
		return healthcareServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Endpoint> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectResolvingEList<Endpoint>(Endpoint.class, this, ResourcesPackage.PRACTITIONER_ROLE__ENDPOINT);
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
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABLE_TIME:
				return ((InternalEList<?>)getAvailableTimes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER_ROLE__NOT_AVAILABLE:
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
			case ResourcesPackage.PRACTITIONER_ROLE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.PRACTITIONER_ROLE__ACTIVE:
				if (resolve) return getActive();
				return basicGetActive();
			case ResourcesPackage.PRACTITIONER_ROLE__PRACTITIONER:
				if (resolve) return getPractitioner();
				return basicGetPractitioner();
			case ResourcesPackage.PRACTITIONER_ROLE__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case ResourcesPackage.PRACTITIONER_ROLE__CODE:
				return getCodes();
			case ResourcesPackage.PRACTITIONER_ROLE__SPECIALTY:
				return getSpecialties();
			case ResourcesPackage.PRACTITIONER_ROLE__LOCATION:
				return getLocations();
			case ResourcesPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				return getHealthcareServices();
			case ResourcesPackage.PRACTITIONER_ROLE__TELECOM:
				return getTelecoms();
			case ResourcesPackage.PRACTITIONER_ROLE__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABLE_TIME:
				return getAvailableTimes();
			case ResourcesPackage.PRACTITIONER_ROLE__NOT_AVAILABLE:
				return getNotAvailables();
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABILITY_EXCEPTIONS:
				if (resolve) return getAvailabilityExceptions();
				return basicGetAvailabilityExceptions();
			case ResourcesPackage.PRACTITIONER_ROLE__ENDPOINT:
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
			case ResourcesPackage.PRACTITIONER_ROLE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__PRACTITIONER:
				setPractitioner((Practitioner)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__SPECIALTY:
				getSpecialties().clear();
				getSpecialties().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__LOCATION:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				getHealthcareServices().clear();
				getHealthcareServices().addAll((Collection<? extends HealthcareService>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABLE_TIME:
				getAvailableTimes().clear();
				getAvailableTimes().addAll((Collection<? extends PractitionerRoleAvailableTime>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__NOT_AVAILABLE:
				getNotAvailables().clear();
				getNotAvailables().addAll((Collection<? extends PractitionerRoleNotAvailable>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABILITY_EXCEPTIONS:
				setAvailabilityExceptions((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__ENDPOINT:
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
			case ResourcesPackage.PRACTITIONER_ROLE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__PRACTITIONER:
				setPractitioner((Practitioner)null);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__CODE:
				getCodes().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__SPECIALTY:
				getSpecialties().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__LOCATION:
				getLocations().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				getHealthcareServices().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__TELECOM:
				getTelecoms().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABLE_TIME:
				getAvailableTimes().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__NOT_AVAILABLE:
				getNotAvailables().clear();
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABILITY_EXCEPTIONS:
				setAvailabilityExceptions((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.PRACTITIONER_ROLE__ENDPOINT:
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
			case ResourcesPackage.PRACTITIONER_ROLE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__ACTIVE:
				return active != null;
			case ResourcesPackage.PRACTITIONER_ROLE__PRACTITIONER:
				return practitioner != null;
			case ResourcesPackage.PRACTITIONER_ROLE__ORGANIZATION:
				return organization != null;
			case ResourcesPackage.PRACTITIONER_ROLE__CODE:
				return codes != null && !codes.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__SPECIALTY:
				return specialties != null && !specialties.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__LOCATION:
				return locations != null && !locations.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__HEALTHCARE_SERVICE:
				return healthcareServices != null && !healthcareServices.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__PERIOD:
				return period != null;
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABLE_TIME:
				return availableTimes != null && !availableTimes.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__NOT_AVAILABLE:
				return notAvailables != null && !notAvailables.isEmpty();
			case ResourcesPackage.PRACTITIONER_ROLE__AVAILABILITY_EXCEPTIONS:
				return availabilityExceptions != null;
			case ResourcesPackage.PRACTITIONER_ROLE__ENDPOINT:
				return endpoints != null && !endpoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PractitionerRoleImpl
