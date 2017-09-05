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
import org.eclipse.mdht.uml.fhir.core.resources.EligibilityRequest;
import org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponse;
import org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponseErrors;
import org.eclipse.mdht.uml.fhir.core.resources.EligibilityResponseInsurance;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eligibility Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseImpl#getRequestProvider <em>Request Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseImpl#getRequestOrganization <em>Request Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseImpl#getInforce <em>Inforce</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseImpl#getInsurances <em>Insurance</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EligibilityResponseImpl#getErrors <em>Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EligibilityResponseImpl extends DomainResourceImpl implements EligibilityResponse {
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
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected EligibilityRequest request;

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
	 * The cached value of the '{@link #getInsurer() <em>Insurer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurer()
	 * @generated
	 * @ordered
	 */
	protected Organization insurer;

	/**
	 * The cached value of the '{@link #getInforce() <em>Inforce</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInforce()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean inforce;

	/**
	 * The cached value of the '{@link #getInsurances() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurances()
	 * @generated
	 * @ordered
	 */
	protected EList<EligibilityResponseInsurance> insurances;

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
	 * The cached value of the '{@link #getErrors() <em>Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<EligibilityResponseErrors> errors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EligibilityResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEligibilityResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.ELIGIBILITY_RESPONSE__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE__CREATED, oldCreated, created));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER, oldRequestProvider, requestProvider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER, oldRequestProvider, requestProvider));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION, oldRequestOrganization, requestOrganization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION, oldRequestOrganization, requestOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequest getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (EligibilityRequest)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequest basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(EligibilityRequest newRequest) {
		EligibilityRequest oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST, oldRequest, request));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE__OUTCOME, oldOutcome, outcome));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE__OUTCOME, oldOutcome, outcome));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE__DISPOSITION, oldDisposition, disposition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE__DISPOSITION, oldDisposition, disposition));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE__INSURER, oldInsurer, insurer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE__INSURER, oldInsurer, insurer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getInforce() {
		if (inforce != null && inforce.eIsProxy()) {
			InternalEObject oldInforce = (InternalEObject)inforce;
			inforce = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldInforce);
			if (inforce != oldInforce) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE__INFORCE, oldInforce, inforce));
			}
		}
		return inforce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetInforce() {
		return inforce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInforce(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newInforce) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldInforce = inforce;
		inforce = newInforce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE__INFORCE, oldInforce, inforce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EligibilityResponseInsurance> getInsurances() {
		if (insurances == null) {
			insurances = new EObjectContainmentEList<EligibilityResponseInsurance>(EligibilityResponseInsurance.class, this, ResourcesPackage.ELIGIBILITY_RESPONSE__INSURANCE);
		}
		return insurances;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ELIGIBILITY_RESPONSE__FORM, oldForm, form));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ELIGIBILITY_RESPONSE__FORM, oldForm, form));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EligibilityResponseErrors> getErrors() {
		if (errors == null) {
			errors = new EObjectContainmentEList<EligibilityResponseErrors>(EligibilityResponseErrors.class, this, ResourcesPackage.ELIGIBILITY_RESPONSE__ERROR);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ELIGIBILITY_RESPONSE__INSURANCE:
				return ((InternalEList<?>)getInsurances()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ELIGIBILITY_RESPONSE__ERROR:
				return ((InternalEList<?>)getErrors()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.ELIGIBILITY_RESPONSE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.ELIGIBILITY_RESPONSE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.ELIGIBILITY_RESPONSE__CREATED:
				if (resolve) return getCreated();
				return basicGetCreated();
			case ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER:
				if (resolve) return getRequestProvider();
				return basicGetRequestProvider();
			case ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION:
				if (resolve) return getRequestOrganization();
				return basicGetRequestOrganization();
			case ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case ResourcesPackage.ELIGIBILITY_RESPONSE__OUTCOME:
				if (resolve) return getOutcome();
				return basicGetOutcome();
			case ResourcesPackage.ELIGIBILITY_RESPONSE__DISPOSITION:
				if (resolve) return getDisposition();
				return basicGetDisposition();
			case ResourcesPackage.ELIGIBILITY_RESPONSE__INSURER:
				if (resolve) return getInsurer();
				return basicGetInsurer();
			case ResourcesPackage.ELIGIBILITY_RESPONSE__INFORCE:
				if (resolve) return getInforce();
				return basicGetInforce();
			case ResourcesPackage.ELIGIBILITY_RESPONSE__INSURANCE:
				return getInsurances();
			case ResourcesPackage.ELIGIBILITY_RESPONSE__FORM:
				if (resolve) return getForm();
				return basicGetForm();
			case ResourcesPackage.ELIGIBILITY_RESPONSE__ERROR:
				return getErrors();
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
			case ResourcesPackage.ELIGIBILITY_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Practitioner)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Organization)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST:
				setRequest((EligibilityRequest)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__DISPOSITION:
				setDisposition((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__INSURER:
				setInsurer((Organization)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__INFORCE:
				setInforce((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__INSURANCE:
				getInsurances().clear();
				getInsurances().addAll((Collection<? extends EligibilityResponseInsurance>)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__FORM:
				setForm((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__ERROR:
				getErrors().clear();
				getErrors().addAll((Collection<? extends EligibilityResponseErrors>)newValue);
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
			case ResourcesPackage.ELIGIBILITY_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__CREATED:
				setCreated((DateTime)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Practitioner)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Organization)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST:
				setRequest((EligibilityRequest)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__DISPOSITION:
				setDisposition((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__INSURER:
				setInsurer((Organization)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__INFORCE:
				setInforce((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__INSURANCE:
				getInsurances().clear();
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__FORM:
				setForm((CodeableConcept)null);
				return;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__ERROR:
				getErrors().clear();
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
			case ResourcesPackage.ELIGIBILITY_RESPONSE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.ELIGIBILITY_RESPONSE__STATUS:
				return status != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__CREATED:
				return created != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST_PROVIDER:
				return requestProvider != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST_ORGANIZATION:
				return requestOrganization != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__REQUEST:
				return request != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__OUTCOME:
				return outcome != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__DISPOSITION:
				return disposition != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__INSURER:
				return insurer != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__INFORCE:
				return inforce != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__INSURANCE:
				return insurances != null && !insurances.isEmpty();
			case ResourcesPackage.ELIGIBILITY_RESPONSE__FORM:
				return form != null;
			case ResourcesPackage.ELIGIBILITY_RESPONSE__ERROR:
				return errors != null && !errors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EligibilityResponseImpl
