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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.ContactPoint;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.resources.Endpoint;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EndpointImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EndpointImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EndpointImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EndpointImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EndpointImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EndpointImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EndpointImpl#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EndpointImpl#getPayloadTypes <em>Payload Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EndpointImpl#getPayloadMimeTypes <em>Payload Mime Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EndpointImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EndpointImpl#getHeaders <em>Header</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EndpointImpl#getPublicKey <em>Public Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndpointImpl extends DomainResourceImpl implements Endpoint {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String name;

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
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> contacts;

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
	 * The cached value of the '{@link #getConnectionType() <em>Connection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected Coding connectionType;

	/**
	 * The cached value of the '{@link #getPayloadTypes() <em>Payload Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> payloadTypes;

	/**
	 * The cached value of the '{@link #getPayloadMimeTypes() <em>Payload Mime Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadMimeTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> payloadMimeTypes;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Uri address;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Header</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> headers;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.ENDPOINT__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ENDPOINT__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ENDPOINT__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.eclipse.mdht.uml.fhir.core.dataTypes.String newName) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ENDPOINT__MANAGING_ORGANIZATION, oldManagingOrganization, managingOrganization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__MANAGING_ORGANIZATION, oldManagingOrganization, managingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getContacts() {
		if (contacts == null) {
			contacts = new EObjectResolvingEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.ENDPOINT__CONTACT);
		}
		return contacts;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ENDPOINT__PERIOD, oldPeriod, period));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getConnectionType() {
		if (connectionType != null && connectionType.eIsProxy()) {
			InternalEObject oldConnectionType = (InternalEObject)connectionType;
			connectionType = (Coding)eResolveProxy(oldConnectionType);
			if (connectionType != oldConnectionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ENDPOINT__CONNECTION_TYPE, oldConnectionType, connectionType));
			}
		}
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetConnectionType() {
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionType(Coding newConnectionType) {
		Coding oldConnectionType = connectionType;
		connectionType = newConnectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__CONNECTION_TYPE, oldConnectionType, connectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPayloadTypes() {
		if (payloadTypes == null) {
			payloadTypes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.ENDPOINT__PAYLOAD_TYPE);
		}
		return payloadTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getPayloadMimeTypes() {
		if (payloadMimeTypes == null) {
			payloadMimeTypes = new EObjectResolvingEList<Code>(Code.class, this, ResourcesPackage.ENDPOINT__PAYLOAD_MIME_TYPE);
		}
		return payloadMimeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getAddress() {
		if (address != null && address.eIsProxy()) {
			InternalEObject oldAddress = (InternalEObject)address;
			address = (Uri)eResolveProxy(oldAddress);
			if (address != oldAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ENDPOINT__ADDRESS, oldAddress, address));
			}
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(Uri newAddress) {
		Uri oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> getHeaders() {
		if (headers == null) {
			headers = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.dataTypes.String>(org.eclipse.mdht.uml.fhir.core.dataTypes.String.class, this, ResourcesPackage.ENDPOINT__HEADER);
		}
		return headers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ENDPOINT__PUBLIC_KEY, oldPublicKey, publicKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__PUBLIC_KEY, oldPublicKey, publicKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.ENDPOINT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.ENDPOINT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.ENDPOINT__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ResourcesPackage.ENDPOINT__MANAGING_ORGANIZATION:
				if (resolve) return getManagingOrganization();
				return basicGetManagingOrganization();
			case ResourcesPackage.ENDPOINT__CONTACT:
				return getContacts();
			case ResourcesPackage.ENDPOINT__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case ResourcesPackage.ENDPOINT__CONNECTION_TYPE:
				if (resolve) return getConnectionType();
				return basicGetConnectionType();
			case ResourcesPackage.ENDPOINT__PAYLOAD_TYPE:
				return getPayloadTypes();
			case ResourcesPackage.ENDPOINT__PAYLOAD_MIME_TYPE:
				return getPayloadMimeTypes();
			case ResourcesPackage.ENDPOINT__ADDRESS:
				if (resolve) return getAddress();
				return basicGetAddress();
			case ResourcesPackage.ENDPOINT__HEADER:
				return getHeaders();
			case ResourcesPackage.ENDPOINT__PUBLIC_KEY:
				if (resolve) return getPublicKey();
				return basicGetPublicKey();
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
			case ResourcesPackage.ENDPOINT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.ENDPOINT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.ENDPOINT__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ENDPOINT__MANAGING_ORGANIZATION:
				setManagingOrganization((Organization)newValue);
				return;
			case ResourcesPackage.ENDPOINT__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.ENDPOINT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.ENDPOINT__CONNECTION_TYPE:
				setConnectionType((Coding)newValue);
				return;
			case ResourcesPackage.ENDPOINT__PAYLOAD_TYPE:
				getPayloadTypes().clear();
				getPayloadTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.ENDPOINT__PAYLOAD_MIME_TYPE:
				getPayloadMimeTypes().clear();
				getPayloadMimeTypes().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.ENDPOINT__ADDRESS:
				setAddress((Uri)newValue);
				return;
			case ResourcesPackage.ENDPOINT__HEADER:
				getHeaders().clear();
				getHeaders().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.ENDPOINT__PUBLIC_KEY:
				setPublicKey((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.ENDPOINT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.ENDPOINT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.ENDPOINT__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.ENDPOINT__MANAGING_ORGANIZATION:
				setManagingOrganization((Organization)null);
				return;
			case ResourcesPackage.ENDPOINT__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.ENDPOINT__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.ENDPOINT__CONNECTION_TYPE:
				setConnectionType((Coding)null);
				return;
			case ResourcesPackage.ENDPOINT__PAYLOAD_TYPE:
				getPayloadTypes().clear();
				return;
			case ResourcesPackage.ENDPOINT__PAYLOAD_MIME_TYPE:
				getPayloadMimeTypes().clear();
				return;
			case ResourcesPackage.ENDPOINT__ADDRESS:
				setAddress((Uri)null);
				return;
			case ResourcesPackage.ENDPOINT__HEADER:
				getHeaders().clear();
				return;
			case ResourcesPackage.ENDPOINT__PUBLIC_KEY:
				setPublicKey((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.ENDPOINT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.ENDPOINT__STATUS:
				return status != null;
			case ResourcesPackage.ENDPOINT__NAME:
				return name != null;
			case ResourcesPackage.ENDPOINT__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case ResourcesPackage.ENDPOINT__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.ENDPOINT__PERIOD:
				return period != null;
			case ResourcesPackage.ENDPOINT__CONNECTION_TYPE:
				return connectionType != null;
			case ResourcesPackage.ENDPOINT__PAYLOAD_TYPE:
				return payloadTypes != null && !payloadTypes.isEmpty();
			case ResourcesPackage.ENDPOINT__PAYLOAD_MIME_TYPE:
				return payloadMimeTypes != null && !payloadMimeTypes.isEmpty();
			case ResourcesPackage.ENDPOINT__ADDRESS:
				return address != null;
			case ResourcesPackage.ENDPOINT__HEADER:
				return headers != null && !headers.isEmpty();
			case ResourcesPackage.ENDPOINT__PUBLIC_KEY:
				return publicKey != null;
		}
		return super.eIsSet(featureID);
	}

} //EndpointImpl
