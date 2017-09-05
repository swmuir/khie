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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Address;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Attachment;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Date;
import org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.PatientAnimal;
import org.eclipse.mdht.uml.fhir.core.resources.PatientCommunication;
import org.eclipse.mdht.uml.fhir.core.resources.PatientContact;
import org.eclipse.mdht.uml.fhir.core.resources.PatientLink;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getNames <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getDeceasedx <em>Deceasedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getAddresses <em>Address</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getMaritalStatus <em>Marital Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getMultipleBirthx <em>Multiple Birthx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getPhotos <em>Photo</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getAnimal <em>Animal</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getCommunications <em>Communication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getGeneralPractitioners <em>General Practitioner</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PatientImpl#getLinks <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientImpl extends DomainResourceImpl implements Patient {
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
	 * The cached value of the '{@link #getNames() <em>Name</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected EList<HumanName> names;

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
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Code gender;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected Date birthDate;

	/**
	 * The cached value of the '{@link #getDeceasedx() <em>Deceasedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedx()
	 * @generated
	 * @ordered
	 */
	protected DataType deceasedx;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Address</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> addresses;

	/**
	 * The cached value of the '{@link #getMaritalStatus() <em>Marital Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaritalStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept maritalStatus;

	/**
	 * The cached value of the '{@link #getMultipleBirthx() <em>Multiple Birthx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleBirthx()
	 * @generated
	 * @ordered
	 */
	protected DataType multipleBirthx;

	/**
	 * The cached value of the '{@link #getPhotos() <em>Photo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotos()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> photos;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientContact> contacts;

	/**
	 * The cached value of the '{@link #getAnimal() <em>Animal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimal()
	 * @generated
	 * @ordered
	 */
	protected PatientAnimal animal;

	/**
	 * The cached value of the '{@link #getCommunications() <em>Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunications()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientCommunication> communications;

	/**
	 * The cached value of the '{@link #getGeneralPractitioners() <em>General Practitioner</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralPractitioners()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> generalPractitioners;

	/**
	 * The cached value of the '{@link #getManagingOrganization() <em>Managing Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization managingOrganization;

	/**
	 * The cached value of the '{@link #getLinks() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientLink> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getPatient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.PATIENT__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PATIENT__ACTIVE, oldActive, active));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HumanName> getNames() {
		if (names == null) {
			names = new EObjectResolvingEList<HumanName>(HumanName.class, this, ResourcesPackage.PATIENT__NAME);
		}
		return names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectResolvingEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.PATIENT__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getGender() {
		if (gender != null && gender.eIsProxy()) {
			InternalEObject oldGender = (InternalEObject)gender;
			gender = (Code)eResolveProxy(oldGender);
			if (gender != oldGender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PATIENT__GENDER, oldGender, gender));
			}
		}
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Code newGender) {
		Code oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthDate() {
		if (birthDate != null && birthDate.eIsProxy()) {
			InternalEObject oldBirthDate = (InternalEObject)birthDate;
			birthDate = (Date)eResolveProxy(oldBirthDate);
			if (birthDate != oldBirthDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PATIENT__BIRTH_DATE, oldBirthDate, birthDate));
			}
		}
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthDate(Date newBirthDate) {
		Date oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__BIRTH_DATE, oldBirthDate, birthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDeceasedx() {
		if (deceasedx != null && deceasedx.eIsProxy()) {
			InternalEObject oldDeceasedx = (InternalEObject)deceasedx;
			deceasedx = (DataType)eResolveProxy(oldDeceasedx);
			if (deceasedx != oldDeceasedx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PATIENT__DECEASEDX, oldDeceasedx, deceasedx));
			}
		}
		return deceasedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDeceasedx() {
		return deceasedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeceasedx(DataType newDeceasedx) {
		DataType oldDeceasedx = deceasedx;
		deceasedx = newDeceasedx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__DECEASEDX, oldDeceasedx, deceasedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectResolvingEList<Address>(Address.class, this, ResourcesPackage.PATIENT__ADDRESS);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMaritalStatus() {
		if (maritalStatus != null && maritalStatus.eIsProxy()) {
			InternalEObject oldMaritalStatus = (InternalEObject)maritalStatus;
			maritalStatus = (CodeableConcept)eResolveProxy(oldMaritalStatus);
			if (maritalStatus != oldMaritalStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PATIENT__MARITAL_STATUS, oldMaritalStatus, maritalStatus));
			}
		}
		return maritalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetMaritalStatus() {
		return maritalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaritalStatus(CodeableConcept newMaritalStatus) {
		CodeableConcept oldMaritalStatus = maritalStatus;
		maritalStatus = newMaritalStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__MARITAL_STATUS, oldMaritalStatus, maritalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getMultipleBirthx() {
		if (multipleBirthx != null && multipleBirthx.eIsProxy()) {
			InternalEObject oldMultipleBirthx = (InternalEObject)multipleBirthx;
			multipleBirthx = (DataType)eResolveProxy(oldMultipleBirthx);
			if (multipleBirthx != oldMultipleBirthx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PATIENT__MULTIPLE_BIRTHX, oldMultipleBirthx, multipleBirthx));
			}
		}
		return multipleBirthx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetMultipleBirthx() {
		return multipleBirthx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleBirthx(DataType newMultipleBirthx) {
		DataType oldMultipleBirthx = multipleBirthx;
		multipleBirthx = newMultipleBirthx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__MULTIPLE_BIRTHX, oldMultipleBirthx, multipleBirthx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getPhotos() {
		if (photos == null) {
			photos = new EObjectResolvingEList<Attachment>(Attachment.class, this, ResourcesPackage.PATIENT__PHOTO);
		}
		return photos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientContact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<PatientContact>(PatientContact.class, this, ResourcesPackage.PATIENT__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAnimal getAnimal() {
		return animal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimal(PatientAnimal newAnimal, NotificationChain msgs) {
		PatientAnimal oldAnimal = animal;
		animal = newAnimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__ANIMAL, oldAnimal, newAnimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimal(PatientAnimal newAnimal) {
		if (newAnimal != animal) {
			NotificationChain msgs = null;
			if (animal != null)
				msgs = ((InternalEObject)animal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__ANIMAL, null, msgs);
			if (newAnimal != null)
				msgs = ((InternalEObject)newAnimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PATIENT__ANIMAL, null, msgs);
			msgs = basicSetAnimal(newAnimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__ANIMAL, newAnimal, newAnimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientCommunication> getCommunications() {
		if (communications == null) {
			communications = new EObjectContainmentEList<PatientCommunication>(PatientCommunication.class, this, ResourcesPackage.PATIENT__COMMUNICATION);
		}
		return communications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getGeneralPractitioners() {
		if (generalPractitioners == null) {
			generalPractitioners = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.PATIENT__GENERAL_PRACTITIONER);
		}
		return generalPractitioners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getManagingOrganization() {
		if (managingOrganization != null && managingOrganization.eIsProxy()) {
			InternalEObject oldManagingOrganization = (InternalEObject)managingOrganization;
			managingOrganization = (Organization)eResolveProxy(oldManagingOrganization);
			if (managingOrganization != oldManagingOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PATIENT__MANAGING_ORGANIZATION, oldManagingOrganization, managingOrganization));
			}
		}
		return managingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetManagingOrganization() {
		return managingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagingOrganization(Organization newManagingOrganization) {
		Organization oldManagingOrganization = managingOrganization;
		managingOrganization = newManagingOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PATIENT__MANAGING_ORGANIZATION, oldManagingOrganization, managingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<PatientLink>(PatientLink.class, this, ResourcesPackage.PATIENT__LINK);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PATIENT__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PATIENT__ANIMAL:
				return basicSetAnimal(null, msgs);
			case ResourcesPackage.PATIENT__COMMUNICATION:
				return ((InternalEList<?>)getCommunications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PATIENT__LINK:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.PATIENT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.PATIENT__ACTIVE:
				if (resolve) return getActive();
				return basicGetActive();
			case ResourcesPackage.PATIENT__NAME:
				return getNames();
			case ResourcesPackage.PATIENT__TELECOM:
				return getTelecoms();
			case ResourcesPackage.PATIENT__GENDER:
				if (resolve) return getGender();
				return basicGetGender();
			case ResourcesPackage.PATIENT__BIRTH_DATE:
				if (resolve) return getBirthDate();
				return basicGetBirthDate();
			case ResourcesPackage.PATIENT__DECEASEDX:
				if (resolve) return getDeceasedx();
				return basicGetDeceasedx();
			case ResourcesPackage.PATIENT__ADDRESS:
				return getAddresses();
			case ResourcesPackage.PATIENT__MARITAL_STATUS:
				if (resolve) return getMaritalStatus();
				return basicGetMaritalStatus();
			case ResourcesPackage.PATIENT__MULTIPLE_BIRTHX:
				if (resolve) return getMultipleBirthx();
				return basicGetMultipleBirthx();
			case ResourcesPackage.PATIENT__PHOTO:
				return getPhotos();
			case ResourcesPackage.PATIENT__CONTACT:
				return getContacts();
			case ResourcesPackage.PATIENT__ANIMAL:
				return getAnimal();
			case ResourcesPackage.PATIENT__COMMUNICATION:
				return getCommunications();
			case ResourcesPackage.PATIENT__GENERAL_PRACTITIONER:
				return getGeneralPractitioners();
			case ResourcesPackage.PATIENT__MANAGING_ORGANIZATION:
				if (resolve) return getManagingOrganization();
				return basicGetManagingOrganization();
			case ResourcesPackage.PATIENT__LINK:
				return getLinks();
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
			case ResourcesPackage.PATIENT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.PATIENT__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.PATIENT__NAME:
				getNames().clear();
				getNames().addAll((Collection<? extends HumanName>)newValue);
				return;
			case ResourcesPackage.PATIENT__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.PATIENT__GENDER:
				setGender((Code)newValue);
				return;
			case ResourcesPackage.PATIENT__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case ResourcesPackage.PATIENT__DECEASEDX:
				setDeceasedx((DataType)newValue);
				return;
			case ResourcesPackage.PATIENT__ADDRESS:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
				return;
			case ResourcesPackage.PATIENT__MARITAL_STATUS:
				setMaritalStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PATIENT__MULTIPLE_BIRTHX:
				setMultipleBirthx((DataType)newValue);
				return;
			case ResourcesPackage.PATIENT__PHOTO:
				getPhotos().clear();
				getPhotos().addAll((Collection<? extends Attachment>)newValue);
				return;
			case ResourcesPackage.PATIENT__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends PatientContact>)newValue);
				return;
			case ResourcesPackage.PATIENT__ANIMAL:
				setAnimal((PatientAnimal)newValue);
				return;
			case ResourcesPackage.PATIENT__COMMUNICATION:
				getCommunications().clear();
				getCommunications().addAll((Collection<? extends PatientCommunication>)newValue);
				return;
			case ResourcesPackage.PATIENT__GENERAL_PRACTITIONER:
				getGeneralPractitioners().clear();
				getGeneralPractitioners().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.PATIENT__MANAGING_ORGANIZATION:
				setManagingOrganization((Organization)newValue);
				return;
			case ResourcesPackage.PATIENT__LINK:
				getLinks().clear();
				getLinks().addAll((Collection<? extends PatientLink>)newValue);
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
			case ResourcesPackage.PATIENT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.PATIENT__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.PATIENT__NAME:
				getNames().clear();
				return;
			case ResourcesPackage.PATIENT__TELECOM:
				getTelecoms().clear();
				return;
			case ResourcesPackage.PATIENT__GENDER:
				setGender((Code)null);
				return;
			case ResourcesPackage.PATIENT__BIRTH_DATE:
				setBirthDate((Date)null);
				return;
			case ResourcesPackage.PATIENT__DECEASEDX:
				setDeceasedx((DataType)null);
				return;
			case ResourcesPackage.PATIENT__ADDRESS:
				getAddresses().clear();
				return;
			case ResourcesPackage.PATIENT__MARITAL_STATUS:
				setMaritalStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.PATIENT__MULTIPLE_BIRTHX:
				setMultipleBirthx((DataType)null);
				return;
			case ResourcesPackage.PATIENT__PHOTO:
				getPhotos().clear();
				return;
			case ResourcesPackage.PATIENT__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.PATIENT__ANIMAL:
				setAnimal((PatientAnimal)null);
				return;
			case ResourcesPackage.PATIENT__COMMUNICATION:
				getCommunications().clear();
				return;
			case ResourcesPackage.PATIENT__GENERAL_PRACTITIONER:
				getGeneralPractitioners().clear();
				return;
			case ResourcesPackage.PATIENT__MANAGING_ORGANIZATION:
				setManagingOrganization((Organization)null);
				return;
			case ResourcesPackage.PATIENT__LINK:
				getLinks().clear();
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
			case ResourcesPackage.PATIENT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.PATIENT__ACTIVE:
				return active != null;
			case ResourcesPackage.PATIENT__NAME:
				return names != null && !names.isEmpty();
			case ResourcesPackage.PATIENT__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case ResourcesPackage.PATIENT__GENDER:
				return gender != null;
			case ResourcesPackage.PATIENT__BIRTH_DATE:
				return birthDate != null;
			case ResourcesPackage.PATIENT__DECEASEDX:
				return deceasedx != null;
			case ResourcesPackage.PATIENT__ADDRESS:
				return addresses != null && !addresses.isEmpty();
			case ResourcesPackage.PATIENT__MARITAL_STATUS:
				return maritalStatus != null;
			case ResourcesPackage.PATIENT__MULTIPLE_BIRTHX:
				return multipleBirthx != null;
			case ResourcesPackage.PATIENT__PHOTO:
				return photos != null && !photos.isEmpty();
			case ResourcesPackage.PATIENT__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.PATIENT__ANIMAL:
				return animal != null;
			case ResourcesPackage.PATIENT__COMMUNICATION:
				return communications != null && !communications.isEmpty();
			case ResourcesPackage.PATIENT__GENERAL_PRACTITIONER:
				return generalPractitioners != null && !generalPractitioners.isEmpty();
			case ResourcesPackage.PATIENT__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case ResourcesPackage.PATIENT__LINK:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PatientImpl
