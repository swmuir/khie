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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.DiagnosticRequest;
import org.eclipse.mdht.uml.fhir.core.resources.Provenance;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getDefinitions <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getRequisition <em>Requisition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getOccurrencex <em>Occurrencex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getPerformerType <em>Performer Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getSupportingInformations <em>Supporting Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DiagnosticRequestImpl#getRelevantHistories <em>Relevant History</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagnosticRequestImpl extends DomainResourceImpl implements DiagnosticRequest {
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
	 * The cached value of the '{@link #getDefinitions() <em>Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> definitions;

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
	 * The cached value of the '{@link #getReplaces() <em>Replaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> replaces;

	/**
	 * The cached value of the '{@link #getRequisition() <em>Requisition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequisition()
	 * @generated
	 * @ordered
	 */
	protected Identifier requisition;

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
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected Code intent;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Code priority;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

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
	 * The cached value of the '{@link #getOccurrencex() <em>Occurrencex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencex()
	 * @generated
	 * @ordered
	 */
	protected DataType occurrencex;

	/**
	 * The cached value of the '{@link #getAuthoredOn() <em>Authored On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoredOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime authoredOn;

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
	 * The cached value of the '{@link #getPerformerType() <em>Performer Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept performerType;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Resource performer;

	/**
	 * The cached value of the '{@link #getReasonCodes() <em>Reason Code</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCodes;

	/**
	 * The cached value of the '{@link #getReasonReferences() <em>Reason Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> reasonReferences;

	/**
	 * The cached value of the '{@link #getSupportingInformations() <em>Supporting Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> supportingInformations;

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
	 * The cached value of the '{@link #getRelevantHistories() <em>Relevant History</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevantHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<Provenance> relevantHistories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDiagnosticRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.DIAGNOSTIC_REQUEST__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DIAGNOSTIC_REQUEST__DEFINITION);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DIAGNOSTIC_REQUEST__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getReplaces() {
		if (replaces == null) {
			replaces = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DIAGNOSTIC_REQUEST__REPLACES);
		}
		return replaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getRequisition() {
		if (requisition != null && requisition.eIsProxy()) {
			InternalEObject oldRequisition = (InternalEObject)requisition;
			requisition = (Identifier)eResolveProxy(oldRequisition);
			if (requisition != oldRequisition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REQUEST__REQUISITION, oldRequisition, requisition));
			}
		}
		return requisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetRequisition() {
		return requisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequisition(Identifier newRequisition) {
		Identifier oldRequisition = requisition;
		requisition = newRequisition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REQUEST__REQUISITION, oldRequisition, requisition));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REQUEST__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REQUEST__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getIntent() {
		if (intent != null && intent.eIsProxy()) {
			InternalEObject oldIntent = (InternalEObject)intent;
			intent = (Code)eResolveProxy(oldIntent);
			if (intent != oldIntent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REQUEST__INTENT, oldIntent, intent));
			}
		}
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(Code newIntent) {
		Code oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REQUEST__INTENT, oldIntent, intent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getPriority() {
		if (priority != null && priority.eIsProxy()) {
			InternalEObject oldPriority = (InternalEObject)priority;
			priority = (Code)eResolveProxy(oldPriority);
			if (priority != oldPriority) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REQUEST__PRIORITY, oldPriority, priority));
			}
		}
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Code newPriority) {
		Code oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REQUEST__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (CodeableConcept)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REQUEST__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REQUEST__CODE, oldCode, code));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REQUEST__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REQUEST__SUBJECT, oldSubject, subject));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REQUEST__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REQUEST__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOccurrencex() {
		if (occurrencex != null && occurrencex.eIsProxy()) {
			InternalEObject oldOccurrencex = (InternalEObject)occurrencex;
			occurrencex = (DataType)eResolveProxy(oldOccurrencex);
			if (occurrencex != oldOccurrencex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REQUEST__OCCURRENCEX, oldOccurrencex, occurrencex));
			}
		}
		return occurrencex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetOccurrencex() {
		return occurrencex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrencex(DataType newOccurrencex) {
		DataType oldOccurrencex = occurrencex;
		occurrencex = newOccurrencex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REQUEST__OCCURRENCEX, oldOccurrencex, occurrencex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getAuthoredOn() {
		if (authoredOn != null && authoredOn.eIsProxy()) {
			InternalEObject oldAuthoredOn = (InternalEObject)authoredOn;
			authoredOn = (DateTime)eResolveProxy(oldAuthoredOn);
			if (authoredOn != oldAuthoredOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REQUEST__AUTHORED_ON, oldAuthoredOn, authoredOn));
			}
		}
		return authoredOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetAuthoredOn() {
		return authoredOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthoredOn(DateTime newAuthoredOn) {
		DateTime oldAuthoredOn = authoredOn;
		authoredOn = newAuthoredOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REQUEST__AUTHORED_ON, oldAuthoredOn, authoredOn));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REQUEST__REQUESTER, oldRequester, requester));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REQUEST__REQUESTER, oldRequester, requester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPerformerType() {
		if (performerType != null && performerType.eIsProxy()) {
			InternalEObject oldPerformerType = (InternalEObject)performerType;
			performerType = (CodeableConcept)eResolveProxy(oldPerformerType);
			if (performerType != oldPerformerType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REQUEST__PERFORMER_TYPE, oldPerformerType, performerType));
			}
		}
		return performerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetPerformerType() {
		return performerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformerType(CodeableConcept newPerformerType) {
		CodeableConcept oldPerformerType = performerType;
		performerType = newPerformerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REQUEST__PERFORMER_TYPE, oldPerformerType, performerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getPerformer() {
		if (performer != null && performer.eIsProxy()) {
			InternalEObject oldPerformer = (InternalEObject)performer;
			performer = (Resource)eResolveProxy(oldPerformer);
			if (performer != oldPerformer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DIAGNOSTIC_REQUEST__PERFORMER, oldPerformer, performer));
			}
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Resource newPerformer) {
		Resource oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REQUEST__PERFORMER, oldPerformer, performer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.DIAGNOSTIC_REQUEST__REASON_CODE);
		}
		return reasonCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getReasonReferences() {
		if (reasonReferences == null) {
			reasonReferences = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DIAGNOSTIC_REQUEST__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getSupportingInformations() {
		if (supportingInformations == null) {
			supportingInformations = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DIAGNOSTIC_REQUEST__SUPPORTING_INFORMATION);
		}
		return supportingInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.DIAGNOSTIC_REQUEST__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provenance> getRelevantHistories() {
		if (relevantHistories == null) {
			relevantHistories = new EObjectResolvingEList<Provenance>(Provenance.class, this, ResourcesPackage.DIAGNOSTIC_REQUEST__RELEVANT_HISTORY);
		}
		return relevantHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.DIAGNOSTIC_REQUEST__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__DEFINITION:
				return getDefinitions();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REPLACES:
				return getReplaces();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REQUISITION:
				if (resolve) return getRequisition();
				return basicGetRequisition();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__INTENT:
				if (resolve) return getIntent();
				return basicGetIntent();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__OCCURRENCEX:
				if (resolve) return getOccurrencex();
				return basicGetOccurrencex();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__AUTHORED_ON:
				if (resolve) return getAuthoredOn();
				return basicGetAuthoredOn();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REQUESTER:
				if (resolve) return getRequester();
				return basicGetRequester();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__PERFORMER_TYPE:
				if (resolve) return getPerformerType();
				return basicGetPerformerType();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__PERFORMER:
				if (resolve) return getPerformer();
				return basicGetPerformer();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__SUPPORTING_INFORMATION:
				return getSupportingInformations();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__NOTE:
				return getNotes();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__RELEVANT_HISTORY:
				return getRelevantHistories();
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
			case ResourcesPackage.DIAGNOSTIC_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__DEFINITION:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REPLACES:
				getReplaces().clear();
				getReplaces().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REQUISITION:
				setRequisition((Identifier)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__INTENT:
				setIntent((Code)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__PRIORITY:
				setPriority((Code)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__CONTEXT:
				setContext((Resource)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__OCCURRENCEX:
				setOccurrencex((DataType)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REQUESTER:
				setRequester((Resource)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__PERFORMER:
				setPerformer((Resource)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				getSupportingInformations().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__RELEVANT_HISTORY:
				getRelevantHistories().clear();
				getRelevantHistories().addAll((Collection<? extends Provenance>)newValue);
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
			case ResourcesPackage.DIAGNOSTIC_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__DEFINITION:
				getDefinitions().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REPLACES:
				getReplaces().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REQUISITION:
				setRequisition((Identifier)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__INTENT:
				setIntent((Code)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__PRIORITY:
				setPriority((Code)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__SUBJECT:
				setSubject((Resource)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__CONTEXT:
				setContext((Resource)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__OCCURRENCEX:
				setOccurrencex((DataType)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REQUESTER:
				setRequester((Resource)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__PERFORMER:
				setPerformer((Resource)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__SUPPORTING_INFORMATION:
				getSupportingInformations().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__RELEVANT_HISTORY:
				getRelevantHistories().clear();
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
			case ResourcesPackage.DIAGNOSTIC_REQUEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__DEFINITION:
				return definitions != null && !definitions.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REPLACES:
				return replaces != null && !replaces.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REQUISITION:
				return requisition != null;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__STATUS:
				return status != null;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__INTENT:
				return intent != null;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__PRIORITY:
				return priority != null;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__CODE:
				return code != null;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__SUBJECT:
				return subject != null;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__CONTEXT:
				return context != null;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__OCCURRENCEX:
				return occurrencex != null;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__AUTHORED_ON:
				return authoredOn != null;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REQUESTER:
				return requester != null;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__PERFORMER_TYPE:
				return performerType != null;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__PERFORMER:
				return performer != null;
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__SUPPORTING_INFORMATION:
				return supportingInformations != null && !supportingInformations.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.DIAGNOSTIC_REQUEST__RELEVANT_HISTORY:
				return relevantHistories != null && !relevantHistories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagnosticRequestImpl
