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
import org.eclipse.mdht.uml.fhir.core.resources.CommunicationRequest;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.ProcessResponse;
import org.eclipse.mdht.uml.fhir.core.resources.ProcessResponseNote;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcessResponseImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcessResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcessResponseImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcessResponseImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcessResponseImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcessResponseImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcessResponseImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcessResponseImpl#getRequestProvider <em>Request Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcessResponseImpl#getRequestOrganization <em>Request Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcessResponseImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcessResponseImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcessResponseImpl#getErrors <em>Error</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProcessResponseImpl#getCommunicationRequests <em>Communication Request</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessResponseImpl extends DomainResourceImpl implements ProcessResponse {
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
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

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
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Resource request;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept outcome;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String disposition;

	/**
	 * The cached value of the '{@link #getRequestProvider() <em>Request Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestProvider()
	 * @generated
	 * @ordered
	 */
	protected Practitioner requestProvider;

	/**
	 * The cached value of the '{@link #getRequestOrganization() <em>Request Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization requestOrganization;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept form;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessResponseNote> notes;

	/**
	 * The cached value of the '{@link #getErrors() <em>Error</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> errors;

	/**
	 * The cached value of the '{@link #getCommunicationRequests() <em>Communication Request</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationRequest> communicationRequests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getProcessResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.PROCESS_RESPONSE__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCESS_RESPONSE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCESS_RESPONSE__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCESS_RESPONSE__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCESS_RESPONSE__CREATED, oldCreated, created));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCESS_RESPONSE__ORGANIZATION, oldOrganization, organization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCESS_RESPONSE__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (Resource)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCESS_RESPONSE__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Resource newRequest) {
		Resource oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCESS_RESPONSE__REQUEST, oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOutcome() {
		if (outcome != null && outcome.eIsProxy()) {
			InternalEObject oldOutcome = (InternalEObject)outcome;
			outcome = (CodeableConcept)eResolveProxy(oldOutcome);
			if (outcome != oldOutcome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCESS_RESPONSE__OUTCOME, oldOutcome, outcome));
			}
		}
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(CodeableConcept newOutcome) {
		CodeableConcept oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCESS_RESPONSE__OUTCOME, oldOutcome, outcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDisposition() {
		if (disposition != null && disposition.eIsProxy()) {
			InternalEObject oldDisposition = (InternalEObject)disposition;
			disposition = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDisposition);
			if (disposition != oldDisposition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCESS_RESPONSE__DISPOSITION, oldDisposition, disposition));
			}
		}
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposition(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDisposition) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCESS_RESPONSE__DISPOSITION, oldDisposition, disposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getRequestProvider() {
		if (requestProvider != null && requestProvider.eIsProxy()) {
			InternalEObject oldRequestProvider = (InternalEObject)requestProvider;
			requestProvider = (Practitioner)eResolveProxy(oldRequestProvider);
			if (requestProvider != oldRequestProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCESS_RESPONSE__REQUEST_PROVIDER, oldRequestProvider, requestProvider));
			}
		}
		return requestProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetRequestProvider() {
		return requestProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestProvider(Practitioner newRequestProvider) {
		Practitioner oldRequestProvider = requestProvider;
		requestProvider = newRequestProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCESS_RESPONSE__REQUEST_PROVIDER, oldRequestProvider, requestProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getRequestOrganization() {
		if (requestOrganization != null && requestOrganization.eIsProxy()) {
			InternalEObject oldRequestOrganization = (InternalEObject)requestOrganization;
			requestOrganization = (Organization)eResolveProxy(oldRequestOrganization);
			if (requestOrganization != oldRequestOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCESS_RESPONSE__REQUEST_ORGANIZATION, oldRequestOrganization, requestOrganization));
			}
		}
		return requestOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetRequestOrganization() {
		return requestOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestOrganization(Organization newRequestOrganization) {
		Organization oldRequestOrganization = requestOrganization;
		requestOrganization = newRequestOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCESS_RESPONSE__REQUEST_ORGANIZATION, oldRequestOrganization, requestOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getForm() {
		if (form != null && form.eIsProxy()) {
			InternalEObject oldForm = (InternalEObject)form;
			form = (CodeableConcept)eResolveProxy(oldForm);
			if (form != oldForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCESS_RESPONSE__FORM, oldForm, form));
			}
		}
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(CodeableConcept newForm) {
		CodeableConcept oldForm = form;
		form = newForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCESS_RESPONSE__FORM, oldForm, form));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessResponseNote> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<ProcessResponseNote>(ProcessResponseNote.class, this, ResourcesPackage.PROCESS_RESPONSE__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getErrors() {
		if (errors == null) {
			errors = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PROCESS_RESPONSE__ERROR);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationRequest> getCommunicationRequests() {
		if (communicationRequests == null) {
			communicationRequests = new EObjectResolvingEList<CommunicationRequest>(CommunicationRequest.class, this, ResourcesPackage.PROCESS_RESPONSE__COMMUNICATION_REQUEST);
		}
		return communicationRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PROCESS_RESPONSE__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.PROCESS_RESPONSE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.PROCESS_RESPONSE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.PROCESS_RESPONSE__CREATED:
				if (resolve) return getCreated();
				return basicGetCreated();
			case ResourcesPackage.PROCESS_RESPONSE__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case ResourcesPackage.PROCESS_RESPONSE__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case ResourcesPackage.PROCESS_RESPONSE__OUTCOME:
				if (resolve) return getOutcome();
				return basicGetOutcome();
			case ResourcesPackage.PROCESS_RESPONSE__DISPOSITION:
				if (resolve) return getDisposition();
				return basicGetDisposition();
			case ResourcesPackage.PROCESS_RESPONSE__REQUEST_PROVIDER:
				if (resolve) return getRequestProvider();
				return basicGetRequestProvider();
			case ResourcesPackage.PROCESS_RESPONSE__REQUEST_ORGANIZATION:
				if (resolve) return getRequestOrganization();
				return basicGetRequestOrganization();
			case ResourcesPackage.PROCESS_RESPONSE__FORM:
				if (resolve) return getForm();
				return basicGetForm();
			case ResourcesPackage.PROCESS_RESPONSE__NOTE:
				return getNotes();
			case ResourcesPackage.PROCESS_RESPONSE__ERROR:
				return getErrors();
			case ResourcesPackage.PROCESS_RESPONSE__COMMUNICATION_REQUEST:
				return getCommunicationRequests();
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
			case ResourcesPackage.PROCESS_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__REQUEST:
				setRequest((Resource)newValue);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__DISPOSITION:
				setDisposition((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Practitioner)newValue);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Organization)newValue);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__FORM:
				setForm((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends ProcessResponseNote>)newValue);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__ERROR:
				getErrors().clear();
				getErrors().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__COMMUNICATION_REQUEST:
				getCommunicationRequests().clear();
				getCommunicationRequests().addAll((Collection<? extends CommunicationRequest>)newValue);
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
			case ResourcesPackage.PROCESS_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.PROCESS_RESPONSE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__CREATED:
				setCreated((DateTime)null);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__REQUEST:
				setRequest((Resource)null);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__DISPOSITION:
				setDisposition((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Practitioner)null);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Organization)null);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__FORM:
				setForm((CodeableConcept)null);
				return;
			case ResourcesPackage.PROCESS_RESPONSE__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.PROCESS_RESPONSE__ERROR:
				getErrors().clear();
				return;
			case ResourcesPackage.PROCESS_RESPONSE__COMMUNICATION_REQUEST:
				getCommunicationRequests().clear();
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
			case ResourcesPackage.PROCESS_RESPONSE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.PROCESS_RESPONSE__STATUS:
				return status != null;
			case ResourcesPackage.PROCESS_RESPONSE__CREATED:
				return created != null;
			case ResourcesPackage.PROCESS_RESPONSE__ORGANIZATION:
				return organization != null;
			case ResourcesPackage.PROCESS_RESPONSE__REQUEST:
				return request != null;
			case ResourcesPackage.PROCESS_RESPONSE__OUTCOME:
				return outcome != null;
			case ResourcesPackage.PROCESS_RESPONSE__DISPOSITION:
				return disposition != null;
			case ResourcesPackage.PROCESS_RESPONSE__REQUEST_PROVIDER:
				return requestProvider != null;
			case ResourcesPackage.PROCESS_RESPONSE__REQUEST_ORGANIZATION:
				return requestOrganization != null;
			case ResourcesPackage.PROCESS_RESPONSE__FORM:
				return form != null;
			case ResourcesPackage.PROCESS_RESPONSE__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.PROCESS_RESPONSE__ERROR:
				return errors != null && !errors.isEmpty();
			case ResourcesPackage.PROCESS_RESPONSE__COMMUNICATION_REQUEST:
				return communicationRequests != null && !communicationRequests.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessResponseImpl
