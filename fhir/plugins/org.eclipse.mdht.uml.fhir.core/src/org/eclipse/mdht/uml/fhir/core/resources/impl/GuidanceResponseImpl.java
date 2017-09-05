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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Id;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.Device;
import org.eclipse.mdht.uml.fhir.core.resources.GuidanceResponse;
import org.eclipse.mdht.uml.fhir.core.resources.OperationOutcome;
import org.eclipse.mdht.uml.fhir.core.resources.Parameters;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.ServiceDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guidance Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GuidanceResponseImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GuidanceResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GuidanceResponseImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GuidanceResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GuidanceResponseImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GuidanceResponseImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GuidanceResponseImpl#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GuidanceResponseImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GuidanceResponseImpl#getReasonx <em>Reasonx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GuidanceResponseImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GuidanceResponseImpl#getEvaluationMessages <em>Evaluation Message</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GuidanceResponseImpl#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GuidanceResponseImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GuidanceResponseImpl#getDataRequirements <em>Data Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuidanceResponseImpl extends DomainResourceImpl implements GuidanceResponse {
	/**
	 * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected Id requestId;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected ServiceDefinition module;

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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Resource subject;

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
	 * The cached value of the '{@link #getOccurrenceDateTime() <em>Occurrence Date Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime occurrenceDateTime;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Device performer;

	/**
	 * The cached value of the '{@link #getReasonx() <em>Reasonx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonx()
	 * @generated
	 * @ordered
	 */
	protected Base reasonx;

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
	 * The cached value of the '{@link #getEvaluationMessages() <em>Evaluation Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationOutcome> evaluationMessages;

	/**
	 * The cached value of the '{@link #getOutputParameters() <em>Output Parameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameters()
	 * @generated
	 * @ordered
	 */
	protected Parameters outputParameters;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected Resource result;

	/**
	 * The cached value of the '{@link #getDataRequirements() <em>Data Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirement> dataRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuidanceResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getGuidanceResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getRequestId() {
		if (requestId != null && requestId.eIsProxy()) {
			InternalEObject oldRequestId = (InternalEObject)requestId;
			requestId = (Id)eResolveProxy(oldRequestId);
			if (requestId != oldRequestId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_ID, oldRequestId, requestId));
			}
		}
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetRequestId() {
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestId(Id newRequestId) {
		Id oldRequestId = requestId;
		requestId = newRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_ID, oldRequestId, requestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (Identifier)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GUIDANCE_RESPONSE__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDefinition getModule() {
		if (module != null && module.eIsProxy()) {
			InternalEObject oldModule = (InternalEObject)module;
			module = (ServiceDefinition)eResolveProxy(oldModule);
			if (module != oldModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GUIDANCE_RESPONSE__MODULE, oldModule, module));
			}
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDefinition basicGetModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(ServiceDefinition newModule) {
		ServiceDefinition oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__MODULE, oldModule, module));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GUIDANCE_RESPONSE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT, oldSubject, subject));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GUIDANCE_RESPONSE__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getOccurrenceDateTime() {
		if (occurrenceDateTime != null && occurrenceDateTime.eIsProxy()) {
			InternalEObject oldOccurrenceDateTime = (InternalEObject)occurrenceDateTime;
			occurrenceDateTime = (DateTime)eResolveProxy(oldOccurrenceDateTime);
			if (occurrenceDateTime != oldOccurrenceDateTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME, oldOccurrenceDateTime, occurrenceDateTime));
			}
		}
		return occurrenceDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetOccurrenceDateTime() {
		return occurrenceDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceDateTime(DateTime newOccurrenceDateTime) {
		DateTime oldOccurrenceDateTime = occurrenceDateTime;
		occurrenceDateTime = newOccurrenceDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME, oldOccurrenceDateTime, occurrenceDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getPerformer() {
		if (performer != null && performer.eIsProxy()) {
			InternalEObject oldPerformer = (InternalEObject)performer;
			performer = (Device)eResolveProxy(oldPerformer);
			if (performer != oldPerformer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER, oldPerformer, performer));
			}
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Device newPerformer) {
		Device oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER, oldPerformer, performer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getReasonx() {
		if (reasonx != null && reasonx.eIsProxy()) {
			InternalEObject oldReasonx = (InternalEObject)reasonx;
			reasonx = (Base)eResolveProxy(oldReasonx);
			if (reasonx != oldReasonx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GUIDANCE_RESPONSE__REASONX, oldReasonx, reasonx));
			}
		}
		return reasonx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetReasonx() {
		return reasonx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonx(Base newReasonx) {
		Base oldReasonx = reasonx;
		reasonx = newReasonx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__REASONX, oldReasonx, reasonx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.GUIDANCE_RESPONSE__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationOutcome> getEvaluationMessages() {
		if (evaluationMessages == null) {
			evaluationMessages = new EObjectResolvingEList<OperationOutcome>(OperationOutcome.class, this, ResourcesPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE);
		}
		return evaluationMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters getOutputParameters() {
		if (outputParameters != null && outputParameters.eIsProxy()) {
			InternalEObject oldOutputParameters = (InternalEObject)outputParameters;
			outputParameters = (Parameters)eResolveProxy(oldOutputParameters);
			if (outputParameters != oldOutputParameters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, oldOutputParameters, outputParameters));
			}
		}
		return outputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters basicGetOutputParameters() {
		return outputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputParameters(Parameters newOutputParameters) {
		Parameters oldOutputParameters = outputParameters;
		outputParameters = newOutputParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS, oldOutputParameters, outputParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResult() {
		if (result != null && result.eIsProxy()) {
			InternalEObject oldResult = (InternalEObject)result;
			result = (Resource)eResolveProxy(oldResult);
			if (result != oldResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GUIDANCE_RESPONSE__RESULT, oldResult, result));
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(Resource newResult) {
		Resource oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GUIDANCE_RESPONSE__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRequirement> getDataRequirements() {
		if (dataRequirements == null) {
			dataRequirements = new EObjectResolvingEList<DataRequirement>(DataRequirement.class, this, ResourcesPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT);
		}
		return dataRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_ID:
				if (resolve) return getRequestId();
				return basicGetRequestId();
			case ResourcesPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case ResourcesPackage.GUIDANCE_RESPONSE__MODULE:
				if (resolve) return getModule();
				return basicGetModule();
			case ResourcesPackage.GUIDANCE_RESPONSE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.GUIDANCE_RESPONSE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				if (resolve) return getOccurrenceDateTime();
				return basicGetOccurrenceDateTime();
			case ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER:
				if (resolve) return getPerformer();
				return basicGetPerformer();
			case ResourcesPackage.GUIDANCE_RESPONSE__REASONX:
				if (resolve) return getReasonx();
				return basicGetReasonx();
			case ResourcesPackage.GUIDANCE_RESPONSE__NOTE:
				return getNotes();
			case ResourcesPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return getEvaluationMessages();
			case ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				if (resolve) return getOutputParameters();
				return basicGetOutputParameters();
			case ResourcesPackage.GUIDANCE_RESPONSE__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
			case ResourcesPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				return getDataRequirements();
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
			case ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_ID:
				setRequestId((Id)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__MODULE:
				setModule((ServiceDefinition)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__CONTEXT:
				setContext((Resource)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER:
				setPerformer((Device)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__REASONX:
				setReasonx((Base)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				getEvaluationMessages().clear();
				getEvaluationMessages().addAll((Collection<? extends OperationOutcome>)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				setOutputParameters((Parameters)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__RESULT:
				setResult((Resource)newValue);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				getDataRequirements().clear();
				getDataRequirements().addAll((Collection<? extends DataRequirement>)newValue);
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
			case ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_ID:
				setRequestId((Id)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__MODULE:
				setModule((ServiceDefinition)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT:
				setSubject((Resource)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__CONTEXT:
				setContext((Resource)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER:
				setPerformer((Device)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__REASONX:
				setReasonx((Base)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				getEvaluationMessages().clear();
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				setOutputParameters((Parameters)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__RESULT:
				setResult((Resource)null);
				return;
			case ResourcesPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				getDataRequirements().clear();
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
			case ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_ID:
				return requestId != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__MODULE:
				return module != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__STATUS:
				return status != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT:
				return subject != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__CONTEXT:
				return context != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME:
				return occurrenceDateTime != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER:
				return performer != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__REASONX:
				return reasonx != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE:
				return evaluationMessages != null && !evaluationMessages.isEmpty();
			case ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS:
				return outputParameters != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__RESULT:
				return result != null;
			case ResourcesPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT:
				return dataRequirements != null && !dataRequirements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GuidanceResponseImpl
