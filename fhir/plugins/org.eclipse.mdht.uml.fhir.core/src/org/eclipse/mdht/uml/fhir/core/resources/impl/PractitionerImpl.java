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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Date;
import org.eclipse.mdht.uml.fhir.core.dataTypes.HumanName;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.PractitionerQualification;
import org.eclipse.mdht.uml.fhir.core.resources.PractitionerRole;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practitioner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerImpl#getNames <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerImpl#getAddresses <em>Address</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerImpl#getPhotos <em>Photo</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerImpl#getRoles <em>Role</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerImpl#getQualifications <em>Qualification</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.PractitionerImpl#getCommunications <em>Communication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PractitionerImpl extends DomainResourceImpl implements Practitioner {
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
	 * The cached value of the '{@link #getAddresses() <em>Address</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> addresses;

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
	 * The cached value of the '{@link #getPhotos() <em>Photo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotos()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> photos;

	/**
	 * The cached value of the '{@link #getRoles() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<PractitionerRole> roles;

	/**
	 * The cached value of the '{@link #getQualifications() <em>Qualification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifications()
	 * @generated
	 * @ordered
	 */
	protected EList<PractitionerQualification> qualifications;

	/**
	 * The cached value of the '{@link #getCommunications() <em>Communication</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunications()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> communications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PractitionerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getPractitioner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.PRACTITIONER__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PRACTITIONER__ACTIVE, oldActive, active));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HumanName> getNames() {
		if (names == null) {
			names = new EObjectResolvingEList<HumanName>(HumanName.class, this, ResourcesPackage.PRACTITIONER__NAME);
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
			telecoms = new EObjectResolvingEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.PRACTITIONER__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectResolvingEList<Address>(Address.class, this, ResourcesPackage.PRACTITIONER__ADDRESS);
		}
		return addresses;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PRACTITIONER__GENDER, oldGender, gender));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER__GENDER, oldGender, gender));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PRACTITIONER__BIRTH_DATE, oldBirthDate, birthDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PRACTITIONER__BIRTH_DATE, oldBirthDate, birthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getPhotos() {
		if (photos == null) {
			photos = new EObjectResolvingEList<Attachment>(Attachment.class, this, ResourcesPackage.PRACTITIONER__PHOTO);
		}
		return photos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PractitionerRole> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<PractitionerRole>(PractitionerRole.class, this, ResourcesPackage.PRACTITIONER__ROLE);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PractitionerQualification> getQualifications() {
		if (qualifications == null) {
			qualifications = new EObjectContainmentEList<PractitionerQualification>(PractitionerQualification.class, this, ResourcesPackage.PRACTITIONER__QUALIFICATION);
		}
		return qualifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCommunications() {
		if (communications == null) {
			communications = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PRACTITIONER__COMMUNICATION);
		}
		return communications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PRACTITIONER__ROLE:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PRACTITIONER__QUALIFICATION:
				return ((InternalEList<?>)getQualifications()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.PRACTITIONER__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.PRACTITIONER__ACTIVE:
				if (resolve) return getActive();
				return basicGetActive();
			case ResourcesPackage.PRACTITIONER__NAME:
				return getNames();
			case ResourcesPackage.PRACTITIONER__TELECOM:
				return getTelecoms();
			case ResourcesPackage.PRACTITIONER__ADDRESS:
				return getAddresses();
			case ResourcesPackage.PRACTITIONER__GENDER:
				if (resolve) return getGender();
				return basicGetGender();
			case ResourcesPackage.PRACTITIONER__BIRTH_DATE:
				if (resolve) return getBirthDate();
				return basicGetBirthDate();
			case ResourcesPackage.PRACTITIONER__PHOTO:
				return getPhotos();
			case ResourcesPackage.PRACTITIONER__ROLE:
				return getRoles();
			case ResourcesPackage.PRACTITIONER__QUALIFICATION:
				return getQualifications();
			case ResourcesPackage.PRACTITIONER__COMMUNICATION:
				return getCommunications();
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
			case ResourcesPackage.PRACTITIONER__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__NAME:
				getNames().clear();
				getNames().addAll((Collection<? extends HumanName>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__ADDRESS:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__GENDER:
				setGender((Code)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__PHOTO:
				getPhotos().clear();
				getPhotos().addAll((Collection<? extends Attachment>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__ROLE:
				getRoles().clear();
				getRoles().addAll((Collection<? extends PractitionerRole>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__QUALIFICATION:
				getQualifications().clear();
				getQualifications().addAll((Collection<? extends PractitionerQualification>)newValue);
				return;
			case ResourcesPackage.PRACTITIONER__COMMUNICATION:
				getCommunications().clear();
				getCommunications().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case ResourcesPackage.PRACTITIONER__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.PRACTITIONER__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.PRACTITIONER__NAME:
				getNames().clear();
				return;
			case ResourcesPackage.PRACTITIONER__TELECOM:
				getTelecoms().clear();
				return;
			case ResourcesPackage.PRACTITIONER__ADDRESS:
				getAddresses().clear();
				return;
			case ResourcesPackage.PRACTITIONER__GENDER:
				setGender((Code)null);
				return;
			case ResourcesPackage.PRACTITIONER__BIRTH_DATE:
				setBirthDate((Date)null);
				return;
			case ResourcesPackage.PRACTITIONER__PHOTO:
				getPhotos().clear();
				return;
			case ResourcesPackage.PRACTITIONER__ROLE:
				getRoles().clear();
				return;
			case ResourcesPackage.PRACTITIONER__QUALIFICATION:
				getQualifications().clear();
				return;
			case ResourcesPackage.PRACTITIONER__COMMUNICATION:
				getCommunications().clear();
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
			case ResourcesPackage.PRACTITIONER__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.PRACTITIONER__ACTIVE:
				return active != null;
			case ResourcesPackage.PRACTITIONER__NAME:
				return names != null && !names.isEmpty();
			case ResourcesPackage.PRACTITIONER__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case ResourcesPackage.PRACTITIONER__ADDRESS:
				return addresses != null && !addresses.isEmpty();
			case ResourcesPackage.PRACTITIONER__GENDER:
				return gender != null;
			case ResourcesPackage.PRACTITIONER__BIRTH_DATE:
				return birthDate != null;
			case ResourcesPackage.PRACTITIONER__PHOTO:
				return photos != null && !photos.isEmpty();
			case ResourcesPackage.PRACTITIONER__ROLE:
				return roles != null && !roles.isEmpty();
			case ResourcesPackage.PRACTITIONER__QUALIFICATION:
				return qualifications != null && !qualifications.isEmpty();
			case ResourcesPackage.PRACTITIONER__COMMUNICATION:
				return communications != null && !communications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PractitionerImpl
