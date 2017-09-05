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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.Communication;
import org.eclipse.mdht.uml.fhir.core.resources.CommunicationPayload;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getParents <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getMediums <em>Medium</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getTopics <em>Topic</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getSent <em>Sent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getReceived <em>Received</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getRecipients <em>Recipient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getReasons <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getPayloads <em>Payload</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationImpl#getNotes <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunicationImpl extends DomainResourceImpl implements Communication {
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
	 * The cached value of the '{@link #getBasedOns() <em>Based On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOns()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> basedOns;

	/**
	 * The cached value of the '{@link #getParents() <em>Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> parents;

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
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getMediums() <em>Medium</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediums()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> mediums;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Resource subject;

	/**
	 * The cached value of the '{@link #getTopics() <em>Topic</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> topics;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Resource context;

	/**
	 * The cached value of the '{@link #getSent() <em>Sent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSent()
	 * @generated
	 * @ordered
	 */
	protected DateTime sent;

	/**
	 * The cached value of the '{@link #getReceived() <em>Received</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceived()
	 * @generated
	 * @ordered
	 */
	protected DateTime received;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Resource sender;

	/**
	 * The cached value of the '{@link #getRecipients() <em>Recipient</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipients()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> recipients;

	/**
	 * The cached value of the '{@link #getReasons() <em>Reason</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasons;

	/**
	 * The cached value of the '{@link #getPayloads() <em>Payload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloads()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationPayload> payloads;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCommunication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.COMMUNICATION__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.COMMUNICATION__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getParents() {
		if (parents == null) {
			parents = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.COMMUNICATION__PARENT);
		}
		return parents;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (CodeableConcept)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getMediums() {
		if (mediums == null) {
			mediums = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.COMMUNICATION__MEDIUM);
		}
		return mediums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (Resource)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Resource newSubject) {
		Resource oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getTopics() {
		if (topics == null) {
			topics = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.COMMUNICATION__TOPIC);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Resource)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Resource newContext) {
		Resource oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getSent() {
		if (sent != null && sent.eIsProxy()) {
			InternalEObject oldSent = (InternalEObject)sent;
			sent = (DateTime)eResolveProxy(oldSent);
			if (sent != oldSent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION__SENT, oldSent, sent));
			}
		}
		return sent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetSent() {
		return sent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSent(DateTime newSent) {
		DateTime oldSent = sent;
		sent = newSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION__SENT, oldSent, sent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getReceived() {
		if (received != null && received.eIsProxy()) {
			InternalEObject oldReceived = (InternalEObject)received;
			received = (DateTime)eResolveProxy(oldReceived);
			if (received != oldReceived) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION__RECEIVED, oldReceived, received));
			}
		}
		return received;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetReceived() {
		return received;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceived(DateTime newReceived) {
		DateTime oldReceived = received;
		received = newReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION__RECEIVED, oldReceived, received));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject)sender;
			sender = (Resource)eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(Resource newSender) {
		Resource oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION__SENDER, oldSender, sender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRecipients() {
		if (recipients == null) {
			recipients = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.COMMUNICATION__RECIPIENT);
		}
		return recipients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasons() {
		if (reasons == null) {
			reasons = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.COMMUNICATION__REASON);
		}
		return reasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationPayload> getPayloads() {
		if (payloads == null) {
			payloads = new EObjectContainmentEList<CommunicationPayload>(CommunicationPayload.class, this, ResourcesPackage.COMMUNICATION__PAYLOAD);
		}
		return payloads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.COMMUNICATION__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COMMUNICATION__PAYLOAD:
				return ((InternalEList<?>)getPayloads()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.COMMUNICATION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.COMMUNICATION__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.COMMUNICATION__PARENT:
				return getParents();
			case ResourcesPackage.COMMUNICATION__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.COMMUNICATION__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case ResourcesPackage.COMMUNICATION__MEDIUM:
				return getMediums();
			case ResourcesPackage.COMMUNICATION__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.COMMUNICATION__TOPIC:
				return getTopics();
			case ResourcesPackage.COMMUNICATION__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ResourcesPackage.COMMUNICATION__SENT:
				if (resolve) return getSent();
				return basicGetSent();
			case ResourcesPackage.COMMUNICATION__RECEIVED:
				if (resolve) return getReceived();
				return basicGetReceived();
			case ResourcesPackage.COMMUNICATION__SENDER:
				if (resolve) return getSender();
				return basicGetSender();
			case ResourcesPackage.COMMUNICATION__RECIPIENT:
				return getRecipients();
			case ResourcesPackage.COMMUNICATION__REASON:
				return getReasons();
			case ResourcesPackage.COMMUNICATION__PAYLOAD:
				return getPayloads();
			case ResourcesPackage.COMMUNICATION__NOTE:
				return getNotes();
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
			case ResourcesPackage.COMMUNICATION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.COMMUNICATION__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.COMMUNICATION__PARENT:
				getParents().clear();
				getParents().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.COMMUNICATION__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.COMMUNICATION__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COMMUNICATION__MEDIUM:
				getMediums().clear();
				getMediums().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.COMMUNICATION__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case ResourcesPackage.COMMUNICATION__TOPIC:
				getTopics().clear();
				getTopics().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.COMMUNICATION__CONTEXT:
				setContext((Resource)newValue);
				return;
			case ResourcesPackage.COMMUNICATION__SENT:
				setSent((DateTime)newValue);
				return;
			case ResourcesPackage.COMMUNICATION__RECEIVED:
				setReceived((DateTime)newValue);
				return;
			case ResourcesPackage.COMMUNICATION__SENDER:
				setSender((Resource)newValue);
				return;
			case ResourcesPackage.COMMUNICATION__RECIPIENT:
				getRecipients().clear();
				getRecipients().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.COMMUNICATION__REASON:
				getReasons().clear();
				getReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.COMMUNICATION__PAYLOAD:
				getPayloads().clear();
				getPayloads().addAll((Collection<? extends CommunicationPayload>)newValue);
				return;
			case ResourcesPackage.COMMUNICATION__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
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
			case ResourcesPackage.COMMUNICATION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.COMMUNICATION__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.COMMUNICATION__PARENT:
				getParents().clear();
				return;
			case ResourcesPackage.COMMUNICATION__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.COMMUNICATION__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.COMMUNICATION__MEDIUM:
				getMediums().clear();
				return;
			case ResourcesPackage.COMMUNICATION__SUBJECT:
				setSubject((Resource)null);
				return;
			case ResourcesPackage.COMMUNICATION__TOPIC:
				getTopics().clear();
				return;
			case ResourcesPackage.COMMUNICATION__CONTEXT:
				setContext((Resource)null);
				return;
			case ResourcesPackage.COMMUNICATION__SENT:
				setSent((DateTime)null);
				return;
			case ResourcesPackage.COMMUNICATION__RECEIVED:
				setReceived((DateTime)null);
				return;
			case ResourcesPackage.COMMUNICATION__SENDER:
				setSender((Resource)null);
				return;
			case ResourcesPackage.COMMUNICATION__RECIPIENT:
				getRecipients().clear();
				return;
			case ResourcesPackage.COMMUNICATION__REASON:
				getReasons().clear();
				return;
			case ResourcesPackage.COMMUNICATION__PAYLOAD:
				getPayloads().clear();
				return;
			case ResourcesPackage.COMMUNICATION__NOTE:
				getNotes().clear();
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
			case ResourcesPackage.COMMUNICATION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.COMMUNICATION__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.COMMUNICATION__PARENT:
				return parents != null && !parents.isEmpty();
			case ResourcesPackage.COMMUNICATION__STATUS:
				return status != null;
			case ResourcesPackage.COMMUNICATION__CATEGORY:
				return category != null;
			case ResourcesPackage.COMMUNICATION__MEDIUM:
				return mediums != null && !mediums.isEmpty();
			case ResourcesPackage.COMMUNICATION__SUBJECT:
				return subject != null;
			case ResourcesPackage.COMMUNICATION__TOPIC:
				return topics != null && !topics.isEmpty();
			case ResourcesPackage.COMMUNICATION__CONTEXT:
				return context != null;
			case ResourcesPackage.COMMUNICATION__SENT:
				return sent != null;
			case ResourcesPackage.COMMUNICATION__RECEIVED:
				return received != null;
			case ResourcesPackage.COMMUNICATION__SENDER:
				return sender != null;
			case ResourcesPackage.COMMUNICATION__RECIPIENT:
				return recipients != null && !recipients.isEmpty();
			case ResourcesPackage.COMMUNICATION__REASON:
				return reasons != null && !reasons.isEmpty();
			case ResourcesPackage.COMMUNICATION__PAYLOAD:
				return payloads != null && !payloads.isEmpty();
			case ResourcesPackage.COMMUNICATION__NOTE:
				return notes != null && !notes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommunicationImpl
