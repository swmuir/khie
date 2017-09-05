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
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.CommunicationRequest;
import org.eclipse.mdht.uml.fhir.core.resources.CommunicationRequestPayload;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationRequestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationRequestImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationRequestImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationRequestImpl#getRecipients <em>Recipient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationRequestImpl#getPayloads <em>Payload</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationRequestImpl#getMediums <em>Medium</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationRequestImpl#getTopics <em>Topic</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationRequestImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationRequestImpl#getScheduledx <em>Scheduledx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationRequestImpl#getReasons <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationRequestImpl#getRequestedOn <em>Requested On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationRequestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CommunicationRequestImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunicationRequestImpl extends DomainResourceImpl implements CommunicationRequest {
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
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

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
	 * The cached value of the '{@link #getPayloads() <em>Payload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloads()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationRequestPayload> payloads;

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
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected Resource requester;

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
	 * The cached value of the '{@link #getScheduledx() <em>Scheduledx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledx()
	 * @generated
	 * @ordered
	 */
	protected DataType scheduledx;

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
	 * The cached value of the '{@link #getRequestedOn() <em>Requested On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime requestedOn;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Patient subject;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCommunicationRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.COMMUNICATION_REQUEST__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION_REQUEST__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_REQUEST__CATEGORY, oldCategory, category));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION_REQUEST__SENDER, oldSender, sender));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_REQUEST__SENDER, oldSender, sender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRecipients() {
		if (recipients == null) {
			recipients = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.COMMUNICATION_REQUEST__RECIPIENT);
		}
		return recipients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationRequestPayload> getPayloads() {
		if (payloads == null) {
			payloads = new EObjectContainmentEList<CommunicationRequestPayload>(CommunicationRequestPayload.class, this, ResourcesPackage.COMMUNICATION_REQUEST__PAYLOAD);
		}
		return payloads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getMediums() {
		if (mediums == null) {
			mediums = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.COMMUNICATION_REQUEST__MEDIUM);
		}
		return mediums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getRequester() {
		if (requester != null && requester.eIsProxy()) {
			InternalEObject oldRequester = (InternalEObject)requester;
			requester = (Resource)eResolveProxy(oldRequester);
			if (requester != oldRequester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION_REQUEST__REQUESTER, oldRequester, requester));
			}
		}
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(Resource newRequester) {
		Resource oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_REQUEST__REQUESTER, oldRequester, requester));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION_REQUEST__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_REQUEST__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getTopics() {
		if (topics == null) {
			topics = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.COMMUNICATION_REQUEST__TOPIC);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION_REQUEST__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_REQUEST__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getScheduledx() {
		if (scheduledx != null && scheduledx.eIsProxy()) {
			InternalEObject oldScheduledx = (InternalEObject)scheduledx;
			scheduledx = (DataType)eResolveProxy(oldScheduledx);
			if (scheduledx != oldScheduledx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION_REQUEST__SCHEDULEDX, oldScheduledx, scheduledx));
			}
		}
		return scheduledx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetScheduledx() {
		return scheduledx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledx(DataType newScheduledx) {
		DataType oldScheduledx = scheduledx;
		scheduledx = newScheduledx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_REQUEST__SCHEDULEDX, oldScheduledx, scheduledx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasons() {
		if (reasons == null) {
			reasons = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.COMMUNICATION_REQUEST__REASON);
		}
		return reasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getRequestedOn() {
		if (requestedOn != null && requestedOn.eIsProxy()) {
			InternalEObject oldRequestedOn = (InternalEObject)requestedOn;
			requestedOn = (DateTime)eResolveProxy(oldRequestedOn);
			if (requestedOn != oldRequestedOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION_REQUEST__REQUESTED_ON, oldRequestedOn, requestedOn));
			}
		}
		return requestedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetRequestedOn() {
		return requestedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedOn(DateTime newRequestedOn) {
		DateTime oldRequestedOn = requestedOn;
		requestedOn = newRequestedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_REQUEST__REQUESTED_ON, oldRequestedOn, requestedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (Patient)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION_REQUEST__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Patient newSubject) {
		Patient oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_REQUEST__SUBJECT, oldSubject, subject));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION_REQUEST__PRIORITY, oldPriority, priority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_REQUEST__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COMMUNICATION_REQUEST__PAYLOAD:
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
			case ResourcesPackage.COMMUNICATION_REQUEST__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.COMMUNICATION_REQUEST__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case ResourcesPackage.COMMUNICATION_REQUEST__SENDER:
				if (resolve) return getSender();
				return basicGetSender();
			case ResourcesPackage.COMMUNICATION_REQUEST__RECIPIENT:
				return getRecipients();
			case ResourcesPackage.COMMUNICATION_REQUEST__PAYLOAD:
				return getPayloads();
			case ResourcesPackage.COMMUNICATION_REQUEST__MEDIUM:
				return getMediums();
			case ResourcesPackage.COMMUNICATION_REQUEST__REQUESTER:
				if (resolve) return getRequester();
				return basicGetRequester();
			case ResourcesPackage.COMMUNICATION_REQUEST__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.COMMUNICATION_REQUEST__TOPIC:
				return getTopics();
			case ResourcesPackage.COMMUNICATION_REQUEST__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ResourcesPackage.COMMUNICATION_REQUEST__SCHEDULEDX:
				if (resolve) return getScheduledx();
				return basicGetScheduledx();
			case ResourcesPackage.COMMUNICATION_REQUEST__REASON:
				return getReasons();
			case ResourcesPackage.COMMUNICATION_REQUEST__REQUESTED_ON:
				if (resolve) return getRequestedOn();
				return basicGetRequestedOn();
			case ResourcesPackage.COMMUNICATION_REQUEST__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.COMMUNICATION_REQUEST__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
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
			case ResourcesPackage.COMMUNICATION_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__SENDER:
				setSender((Resource)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__RECIPIENT:
				getRecipients().clear();
				getRecipients().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__PAYLOAD:
				getPayloads().clear();
				getPayloads().addAll((Collection<? extends CommunicationRequestPayload>)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__MEDIUM:
				getMediums().clear();
				getMediums().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__REQUESTER:
				setRequester((Resource)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__TOPIC:
				getTopics().clear();
				getTopics().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__CONTEXT:
				setContext((Resource)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__SCHEDULEDX:
				setScheduledx((DataType)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__REASON:
				getReasons().clear();
				getReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__REQUESTED_ON:
				setRequestedOn((DateTime)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__SUBJECT:
				setSubject((Patient)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__PRIORITY:
				setPriority((CodeableConcept)newValue);
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
			case ResourcesPackage.COMMUNICATION_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__SENDER:
				setSender((Resource)null);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__RECIPIENT:
				getRecipients().clear();
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__PAYLOAD:
				getPayloads().clear();
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__MEDIUM:
				getMediums().clear();
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__REQUESTER:
				setRequester((Resource)null);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__TOPIC:
				getTopics().clear();
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__CONTEXT:
				setContext((Resource)null);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__SCHEDULEDX:
				setScheduledx((DataType)null);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__REASON:
				getReasons().clear();
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__REQUESTED_ON:
				setRequestedOn((DateTime)null);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__SUBJECT:
				setSubject((Patient)null);
				return;
			case ResourcesPackage.COMMUNICATION_REQUEST__PRIORITY:
				setPriority((CodeableConcept)null);
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
			case ResourcesPackage.COMMUNICATION_REQUEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.COMMUNICATION_REQUEST__CATEGORY:
				return category != null;
			case ResourcesPackage.COMMUNICATION_REQUEST__SENDER:
				return sender != null;
			case ResourcesPackage.COMMUNICATION_REQUEST__RECIPIENT:
				return recipients != null && !recipients.isEmpty();
			case ResourcesPackage.COMMUNICATION_REQUEST__PAYLOAD:
				return payloads != null && !payloads.isEmpty();
			case ResourcesPackage.COMMUNICATION_REQUEST__MEDIUM:
				return mediums != null && !mediums.isEmpty();
			case ResourcesPackage.COMMUNICATION_REQUEST__REQUESTER:
				return requester != null;
			case ResourcesPackage.COMMUNICATION_REQUEST__STATUS:
				return status != null;
			case ResourcesPackage.COMMUNICATION_REQUEST__TOPIC:
				return topics != null && !topics.isEmpty();
			case ResourcesPackage.COMMUNICATION_REQUEST__CONTEXT:
				return context != null;
			case ResourcesPackage.COMMUNICATION_REQUEST__SCHEDULEDX:
				return scheduledx != null;
			case ResourcesPackage.COMMUNICATION_REQUEST__REASON:
				return reasons != null && !reasons.isEmpty();
			case ResourcesPackage.COMMUNICATION_REQUEST__REQUESTED_ON:
				return requestedOn != null;
			case ResourcesPackage.COMMUNICATION_REQUEST__SUBJECT:
				return subject != null;
			case ResourcesPackage.COMMUNICATION_REQUEST__PRIORITY:
				return priority != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicationRequestImpl
