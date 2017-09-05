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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent;
import org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgentNetwork;
import org.eclipse.mdht.uml.fhir.core.resources.Location;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Event Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventAgentImpl#getRoles <em>Role</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventAgentImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventAgentImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventAgentImpl#getAltId <em>Alt Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventAgentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventAgentImpl#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventAgentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventAgentImpl#getPolicies <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventAgentImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventAgentImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventAgentImpl#getPurposeOfUses <em>Purpose Of Use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuditEventAgentImpl extends BackboneElementImpl implements AuditEventAgent {
	/**
	 * The cached value of the '{@link #getRoles() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> roles;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Resource reference;

	/**
	 * The cached value of the '{@link #getUserId() <em>User Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected Identifier userId;

	/**
	 * The cached value of the '{@link #getAltId() <em>Alt Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String altId;

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
	 * The cached value of the '{@link #getRequestor() <em>Requestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestor()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean requestor;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getPolicies() <em>Policy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> policies;

	/**
	 * The cached value of the '{@link #getMedia() <em>Media</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected Coding media;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected AuditEventAgentNetwork network;

	/**
	 * The cached value of the '{@link #getPurposeOfUses() <em>Purpose Of Use</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeOfUses()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> purposeOfUses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getAuditEventAgent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getRoles() {
		if (roles == null) {
			roles = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.AUDIT_EVENT_AGENT__ROLE);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (Resource)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.AUDIT_EVENT_AGENT__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Resource newReference) {
		Resource oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getUserId() {
		if (userId != null && userId.eIsProxy()) {
			InternalEObject oldUserId = (InternalEObject)userId;
			userId = (Identifier)eResolveProxy(oldUserId);
			if (userId != oldUserId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.AUDIT_EVENT_AGENT__USER_ID, oldUserId, userId));
			}
		}
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetUserId() {
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserId(Identifier newUserId) {
		Identifier oldUserId = userId;
		userId = newUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__USER_ID, oldUserId, userId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getAltId() {
		if (altId != null && altId.eIsProxy()) {
			InternalEObject oldAltId = (InternalEObject)altId;
			altId = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldAltId);
			if (altId != oldAltId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.AUDIT_EVENT_AGENT__ALT_ID, oldAltId, altId));
			}
		}
		return altId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetAltId() {
		return altId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltId(org.eclipse.mdht.uml.fhir.core.dataTypes.String newAltId) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldAltId = altId;
		altId = newAltId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__ALT_ID, oldAltId, altId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.AUDIT_EVENT_AGENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getRequestor() {
		if (requestor != null && requestor.eIsProxy()) {
			InternalEObject oldRequestor = (InternalEObject)requestor;
			requestor = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldRequestor);
			if (requestor != oldRequestor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.AUDIT_EVENT_AGENT__REQUESTOR, oldRequestor, requestor));
			}
		}
		return requestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetRequestor() {
		return requestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestor(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newRequestor) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldRequestor = requestor;
		requestor = newRequestor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__REQUESTOR, oldRequestor, requestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.AUDIT_EVENT_AGENT__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getPolicies() {
		if (policies == null) {
			policies = new EObjectResolvingEList<Uri>(Uri.class, this, ResourcesPackage.AUDIT_EVENT_AGENT__POLICY);
		}
		return policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getMedia() {
		if (media != null && media.eIsProxy()) {
			InternalEObject oldMedia = (InternalEObject)media;
			media = (Coding)eResolveProxy(oldMedia);
			if (media != oldMedia) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.AUDIT_EVENT_AGENT__MEDIA, oldMedia, media));
			}
		}
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetMedia() {
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedia(Coding newMedia) {
		Coding oldMedia = media;
		media = newMedia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__MEDIA, oldMedia, media));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgentNetwork getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(AuditEventAgentNetwork newNetwork, NotificationChain msgs) {
		AuditEventAgentNetwork oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK, oldNetwork, newNetwork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(AuditEventAgentNetwork newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPurposeOfUses() {
		if (purposeOfUses == null) {
			purposeOfUses = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.AUDIT_EVENT_AGENT__PURPOSE_OF_USE);
		}
		return purposeOfUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK:
				return basicSetNetwork(null, msgs);
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
			case ResourcesPackage.AUDIT_EVENT_AGENT__ROLE:
				return getRoles();
			case ResourcesPackage.AUDIT_EVENT_AGENT__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case ResourcesPackage.AUDIT_EVENT_AGENT__USER_ID:
				if (resolve) return getUserId();
				return basicGetUserId();
			case ResourcesPackage.AUDIT_EVENT_AGENT__ALT_ID:
				if (resolve) return getAltId();
				return basicGetAltId();
			case ResourcesPackage.AUDIT_EVENT_AGENT__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ResourcesPackage.AUDIT_EVENT_AGENT__REQUESTOR:
				if (resolve) return getRequestor();
				return basicGetRequestor();
			case ResourcesPackage.AUDIT_EVENT_AGENT__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case ResourcesPackage.AUDIT_EVENT_AGENT__POLICY:
				return getPolicies();
			case ResourcesPackage.AUDIT_EVENT_AGENT__MEDIA:
				if (resolve) return getMedia();
				return basicGetMedia();
			case ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK:
				return getNetwork();
			case ResourcesPackage.AUDIT_EVENT_AGENT__PURPOSE_OF_USE:
				return getPurposeOfUses();
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
			case ResourcesPackage.AUDIT_EVENT_AGENT__ROLE:
				getRoles().clear();
				getRoles().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__REFERENCE:
				setReference((Resource)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__USER_ID:
				setUserId((Identifier)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__ALT_ID:
				setAltId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__REQUESTOR:
				setRequestor((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__LOCATION:
				setLocation((Location)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__POLICY:
				getPolicies().clear();
				getPolicies().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__MEDIA:
				setMedia((Coding)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK:
				setNetwork((AuditEventAgentNetwork)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__PURPOSE_OF_USE:
				getPurposeOfUses().clear();
				getPurposeOfUses().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case ResourcesPackage.AUDIT_EVENT_AGENT__ROLE:
				getRoles().clear();
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__REFERENCE:
				setReference((Resource)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__USER_ID:
				setUserId((Identifier)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__ALT_ID:
				setAltId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__REQUESTOR:
				setRequestor((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__LOCATION:
				setLocation((Location)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__POLICY:
				getPolicies().clear();
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__MEDIA:
				setMedia((Coding)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK:
				setNetwork((AuditEventAgentNetwork)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_AGENT__PURPOSE_OF_USE:
				getPurposeOfUses().clear();
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
			case ResourcesPackage.AUDIT_EVENT_AGENT__ROLE:
				return roles != null && !roles.isEmpty();
			case ResourcesPackage.AUDIT_EVENT_AGENT__REFERENCE:
				return reference != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__USER_ID:
				return userId != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__ALT_ID:
				return altId != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__NAME:
				return name != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__REQUESTOR:
				return requestor != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__LOCATION:
				return location != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__POLICY:
				return policies != null && !policies.isEmpty();
			case ResourcesPackage.AUDIT_EVENT_AGENT__MEDIA:
				return media != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__NETWORK:
				return network != null;
			case ResourcesPackage.AUDIT_EVENT_AGENT__PURPOSE_OF_USE:
				return purposeOfUses != null && !purposeOfUses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventAgentImpl
