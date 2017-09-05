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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.resources.Provenance;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.Task;
import org.eclipse.mdht.uml.fhir.core.resources.TaskOutput;
import org.eclipse.mdht.uml.fhir.core.resources.TaskParameter;
import org.eclipse.mdht.uml.fhir.core.resources.TaskRequester;
import org.eclipse.mdht.uml.fhir.core.resources.TaskRestriction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getDefinitionx <em>Definitionx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getBusinessStatus <em>Business Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getExecutionPeriod <em>Execution Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getPerformerTypes <em>Performer Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getRelevantHistories <em>Relevant History</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TaskImpl#getOutputs <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends DomainResourceImpl implements Task {
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
	 * The cached value of the '{@link #getDefinitionx() <em>Definitionx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionx()
	 * @generated
	 * @ordered
	 */
	protected Base definitionx;

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
	 * The cached value of the '{@link #getGroupIdentifier() <em>Group Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier groupIdentifier;

	/**
	 * The cached value of the '{@link #getPartOfs() <em>Part Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfs()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> partOfs;

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
	 * The cached value of the '{@link #getStatusReason() <em>Status Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept statusReason;

	/**
	 * The cached value of the '{@link #getBusinessStatus() <em>Business Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept businessStatus;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected Resource focus;

	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected Resource for_;

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
	 * The cached value of the '{@link #getExecutionPeriod() <em>Execution Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period executionPeriod;

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
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected DateTime lastModified;

	/**
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected TaskRequester requester;

	/**
	 * The cached value of the '{@link #getPerformerTypes() <em>Performer Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> performerTypes;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Resource owner;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reason;

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
	 * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestriction()
	 * @generated
	 * @ordered
	 */
	protected TaskRestriction restriction;

	/**
	 * The cached value of the '{@link #getInputs() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskParameter> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskOutput> outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.TASK__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getDefinitionx() {
		if (definitionx != null && definitionx.eIsProxy()) {
			InternalEObject oldDefinitionx = (InternalEObject)definitionx;
			definitionx = (Base)eResolveProxy(oldDefinitionx);
			if (definitionx != oldDefinitionx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__DEFINITIONX, oldDefinitionx, definitionx));
			}
		}
		return definitionx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetDefinitionx() {
		return definitionx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionx(Base newDefinitionx) {
		Base oldDefinitionx = definitionx;
		definitionx = newDefinitionx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__DEFINITIONX, oldDefinitionx, definitionx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.TASK__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getGroupIdentifier() {
		if (groupIdentifier != null && groupIdentifier.eIsProxy()) {
			InternalEObject oldGroupIdentifier = (InternalEObject)groupIdentifier;
			groupIdentifier = (Identifier)eResolveProxy(oldGroupIdentifier);
			if (groupIdentifier != oldGroupIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__GROUP_IDENTIFIER, oldGroupIdentifier, groupIdentifier));
			}
		}
		return groupIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetGroupIdentifier() {
		return groupIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupIdentifier(Identifier newGroupIdentifier) {
		Identifier oldGroupIdentifier = groupIdentifier;
		groupIdentifier = newGroupIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__GROUP_IDENTIFIER, oldGroupIdentifier, groupIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getPartOfs() {
		if (partOfs == null) {
			partOfs = new EObjectResolvingEList<Task>(Task.class, this, ResourcesPackage.TASK__PART_OF);
		}
		return partOfs;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatusReason() {
		if (statusReason != null && statusReason.eIsProxy()) {
			InternalEObject oldStatusReason = (InternalEObject)statusReason;
			statusReason = (CodeableConcept)eResolveProxy(oldStatusReason);
			if (statusReason != oldStatusReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__STATUS_REASON, oldStatusReason, statusReason));
			}
		}
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetStatusReason() {
		return statusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusReason(CodeableConcept newStatusReason) {
		CodeableConcept oldStatusReason = statusReason;
		statusReason = newStatusReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__STATUS_REASON, oldStatusReason, statusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBusinessStatus() {
		if (businessStatus != null && businessStatus.eIsProxy()) {
			InternalEObject oldBusinessStatus = (InternalEObject)businessStatus;
			businessStatus = (CodeableConcept)eResolveProxy(oldBusinessStatus);
			if (businessStatus != oldBusinessStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__BUSINESS_STATUS, oldBusinessStatus, businessStatus));
			}
		}
		return businessStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetBusinessStatus() {
		return businessStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessStatus(CodeableConcept newBusinessStatus) {
		CodeableConcept oldBusinessStatus = businessStatus;
		businessStatus = newBusinessStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__BUSINESS_STATUS, oldBusinessStatus, businessStatus));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__INTENT, oldIntent, intent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__INTENT, oldIntent, intent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__PRIORITY, oldPriority, priority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__PRIORITY, oldPriority, priority));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getFocus() {
		if (focus != null && focus.eIsProxy()) {
			InternalEObject oldFocus = (InternalEObject)focus;
			focus = (Resource)eResolveProxy(oldFocus);
			if (focus != oldFocus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__FOCUS, oldFocus, focus));
			}
		}
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocus(Resource newFocus) {
		Resource oldFocus = focus;
		focus = newFocus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__FOCUS, oldFocus, focus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getFor() {
		if (for_ != null && for_.eIsProxy()) {
			InternalEObject oldFor = (InternalEObject)for_;
			for_ = (Resource)eResolveProxy(oldFor);
			if (for_ != oldFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__FOR, oldFor, for_));
			}
		}
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetFor() {
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(Resource newFor) {
		Resource oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__FOR, oldFor, for_));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getExecutionPeriod() {
		if (executionPeriod != null && executionPeriod.eIsProxy()) {
			InternalEObject oldExecutionPeriod = (InternalEObject)executionPeriod;
			executionPeriod = (Period)eResolveProxy(oldExecutionPeriod);
			if (executionPeriod != oldExecutionPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__EXECUTION_PERIOD, oldExecutionPeriod, executionPeriod));
			}
		}
		return executionPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetExecutionPeriod() {
		return executionPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionPeriod(Period newExecutionPeriod) {
		Period oldExecutionPeriod = executionPeriod;
		executionPeriod = newExecutionPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__EXECUTION_PERIOD, oldExecutionPeriod, executionPeriod));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__AUTHORED_ON, oldAuthoredOn, authoredOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__AUTHORED_ON, oldAuthoredOn, authoredOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getLastModified() {
		if (lastModified != null && lastModified.eIsProxy()) {
			InternalEObject oldLastModified = (InternalEObject)lastModified;
			lastModified = (DateTime)eResolveProxy(oldLastModified);
			if (lastModified != oldLastModified) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__LAST_MODIFIED, oldLastModified, lastModified));
			}
		}
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModified(DateTime newLastModified) {
		DateTime oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__LAST_MODIFIED, oldLastModified, lastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRequester getRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequester(TaskRequester newRequester, NotificationChain msgs) {
		TaskRequester oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__REQUESTER, oldRequester, newRequester);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(TaskRequester newRequester) {
		if (newRequester != requester) {
			NotificationChain msgs = null;
			if (requester != null)
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__REQUESTER, newRequester, newRequester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPerformerTypes() {
		if (performerTypes == null) {
			performerTypes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.TASK__PERFORMER_TYPE);
		}
		return performerTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Resource)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Resource newOwner) {
		Resource oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReason() {
		if (reason != null && reason.eIsProxy()) {
			InternalEObject oldReason = (InternalEObject)reason;
			reason = (CodeableConcept)eResolveProxy(oldReason);
			if (reason != oldReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TASK__REASON, oldReason, reason));
			}
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(CodeableConcept newReason) {
		CodeableConcept oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__REASON, oldReason, reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.TASK__NOTE);
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
			relevantHistories = new EObjectResolvingEList<Provenance>(Provenance.class, this, ResourcesPackage.TASK__RELEVANT_HISTORY);
		}
		return relevantHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRestriction getRestriction() {
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestriction(TaskRestriction newRestriction, NotificationChain msgs) {
		TaskRestriction oldRestriction = restriction;
		restriction = newRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__RESTRICTION, oldRestriction, newRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestriction(TaskRestriction newRestriction) {
		if (newRestriction != restriction) {
			NotificationChain msgs = null;
			if (restriction != null)
				msgs = ((InternalEObject)restriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__RESTRICTION, null, msgs);
			if (newRestriction != null)
				msgs = ((InternalEObject)newRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TASK__RESTRICTION, null, msgs);
			msgs = basicSetRestriction(newRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TASK__RESTRICTION, newRestriction, newRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskParameter> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<TaskParameter>(TaskParameter.class, this, ResourcesPackage.TASK__INPUT);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskOutput> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<TaskOutput>(TaskOutput.class, this, ResourcesPackage.TASK__OUTPUT);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TASK__REQUESTER:
				return basicSetRequester(null, msgs);
			case ResourcesPackage.TASK__RESTRICTION:
				return basicSetRestriction(null, msgs);
			case ResourcesPackage.TASK__INPUT:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TASK__OUTPUT:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.TASK__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.TASK__DEFINITIONX:
				if (resolve) return getDefinitionx();
				return basicGetDefinitionx();
			case ResourcesPackage.TASK__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.TASK__GROUP_IDENTIFIER:
				if (resolve) return getGroupIdentifier();
				return basicGetGroupIdentifier();
			case ResourcesPackage.TASK__PART_OF:
				return getPartOfs();
			case ResourcesPackage.TASK__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.TASK__STATUS_REASON:
				if (resolve) return getStatusReason();
				return basicGetStatusReason();
			case ResourcesPackage.TASK__BUSINESS_STATUS:
				if (resolve) return getBusinessStatus();
				return basicGetBusinessStatus();
			case ResourcesPackage.TASK__INTENT:
				if (resolve) return getIntent();
				return basicGetIntent();
			case ResourcesPackage.TASK__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
			case ResourcesPackage.TASK__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case ResourcesPackage.TASK__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.TASK__FOCUS:
				if (resolve) return getFocus();
				return basicGetFocus();
			case ResourcesPackage.TASK__FOR:
				if (resolve) return getFor();
				return basicGetFor();
			case ResourcesPackage.TASK__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ResourcesPackage.TASK__EXECUTION_PERIOD:
				if (resolve) return getExecutionPeriod();
				return basicGetExecutionPeriod();
			case ResourcesPackage.TASK__AUTHORED_ON:
				if (resolve) return getAuthoredOn();
				return basicGetAuthoredOn();
			case ResourcesPackage.TASK__LAST_MODIFIED:
				if (resolve) return getLastModified();
				return basicGetLastModified();
			case ResourcesPackage.TASK__REQUESTER:
				return getRequester();
			case ResourcesPackage.TASK__PERFORMER_TYPE:
				return getPerformerTypes();
			case ResourcesPackage.TASK__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case ResourcesPackage.TASK__REASON:
				if (resolve) return getReason();
				return basicGetReason();
			case ResourcesPackage.TASK__NOTE:
				return getNotes();
			case ResourcesPackage.TASK__RELEVANT_HISTORY:
				return getRelevantHistories();
			case ResourcesPackage.TASK__RESTRICTION:
				return getRestriction();
			case ResourcesPackage.TASK__INPUT:
				return getInputs();
			case ResourcesPackage.TASK__OUTPUT:
				return getOutputs();
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
			case ResourcesPackage.TASK__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.TASK__DEFINITIONX:
				setDefinitionx((Base)newValue);
				return;
			case ResourcesPackage.TASK__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.TASK__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.TASK__PART_OF:
				getPartOfs().clear();
				getPartOfs().addAll((Collection<? extends Task>)newValue);
				return;
			case ResourcesPackage.TASK__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.TASK__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.TASK__BUSINESS_STATUS:
				setBusinessStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.TASK__INTENT:
				setIntent((Code)newValue);
				return;
			case ResourcesPackage.TASK__PRIORITY:
				setPriority((Code)newValue);
				return;
			case ResourcesPackage.TASK__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.TASK__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TASK__FOCUS:
				setFocus((Resource)newValue);
				return;
			case ResourcesPackage.TASK__FOR:
				setFor((Resource)newValue);
				return;
			case ResourcesPackage.TASK__CONTEXT:
				setContext((Resource)newValue);
				return;
			case ResourcesPackage.TASK__EXECUTION_PERIOD:
				setExecutionPeriod((Period)newValue);
				return;
			case ResourcesPackage.TASK__AUTHORED_ON:
				setAuthoredOn((DateTime)newValue);
				return;
			case ResourcesPackage.TASK__LAST_MODIFIED:
				setLastModified((DateTime)newValue);
				return;
			case ResourcesPackage.TASK__REQUESTER:
				setRequester((TaskRequester)newValue);
				return;
			case ResourcesPackage.TASK__PERFORMER_TYPE:
				getPerformerTypes().clear();
				getPerformerTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.TASK__OWNER:
				setOwner((Resource)newValue);
				return;
			case ResourcesPackage.TASK__REASON:
				setReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.TASK__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.TASK__RELEVANT_HISTORY:
				getRelevantHistories().clear();
				getRelevantHistories().addAll((Collection<? extends Provenance>)newValue);
				return;
			case ResourcesPackage.TASK__RESTRICTION:
				setRestriction((TaskRestriction)newValue);
				return;
			case ResourcesPackage.TASK__INPUT:
				getInputs().clear();
				getInputs().addAll((Collection<? extends TaskParameter>)newValue);
				return;
			case ResourcesPackage.TASK__OUTPUT:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends TaskOutput>)newValue);
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
			case ResourcesPackage.TASK__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.TASK__DEFINITIONX:
				setDefinitionx((Base)null);
				return;
			case ResourcesPackage.TASK__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.TASK__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)null);
				return;
			case ResourcesPackage.TASK__PART_OF:
				getPartOfs().clear();
				return;
			case ResourcesPackage.TASK__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.TASK__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case ResourcesPackage.TASK__BUSINESS_STATUS:
				setBusinessStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.TASK__INTENT:
				setIntent((Code)null);
				return;
			case ResourcesPackage.TASK__PRIORITY:
				setPriority((Code)null);
				return;
			case ResourcesPackage.TASK__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.TASK__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TASK__FOCUS:
				setFocus((Resource)null);
				return;
			case ResourcesPackage.TASK__FOR:
				setFor((Resource)null);
				return;
			case ResourcesPackage.TASK__CONTEXT:
				setContext((Resource)null);
				return;
			case ResourcesPackage.TASK__EXECUTION_PERIOD:
				setExecutionPeriod((Period)null);
				return;
			case ResourcesPackage.TASK__AUTHORED_ON:
				setAuthoredOn((DateTime)null);
				return;
			case ResourcesPackage.TASK__LAST_MODIFIED:
				setLastModified((DateTime)null);
				return;
			case ResourcesPackage.TASK__REQUESTER:
				setRequester((TaskRequester)null);
				return;
			case ResourcesPackage.TASK__PERFORMER_TYPE:
				getPerformerTypes().clear();
				return;
			case ResourcesPackage.TASK__OWNER:
				setOwner((Resource)null);
				return;
			case ResourcesPackage.TASK__REASON:
				setReason((CodeableConcept)null);
				return;
			case ResourcesPackage.TASK__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.TASK__RELEVANT_HISTORY:
				getRelevantHistories().clear();
				return;
			case ResourcesPackage.TASK__RESTRICTION:
				setRestriction((TaskRestriction)null);
				return;
			case ResourcesPackage.TASK__INPUT:
				getInputs().clear();
				return;
			case ResourcesPackage.TASK__OUTPUT:
				getOutputs().clear();
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
			case ResourcesPackage.TASK__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.TASK__DEFINITIONX:
				return definitionx != null;
			case ResourcesPackage.TASK__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.TASK__GROUP_IDENTIFIER:
				return groupIdentifier != null;
			case ResourcesPackage.TASK__PART_OF:
				return partOfs != null && !partOfs.isEmpty();
			case ResourcesPackage.TASK__STATUS:
				return status != null;
			case ResourcesPackage.TASK__STATUS_REASON:
				return statusReason != null;
			case ResourcesPackage.TASK__BUSINESS_STATUS:
				return businessStatus != null;
			case ResourcesPackage.TASK__INTENT:
				return intent != null;
			case ResourcesPackage.TASK__PRIORITY:
				return priority != null;
			case ResourcesPackage.TASK__CODE:
				return code != null;
			case ResourcesPackage.TASK__DESCRIPTION:
				return description != null;
			case ResourcesPackage.TASK__FOCUS:
				return focus != null;
			case ResourcesPackage.TASK__FOR:
				return for_ != null;
			case ResourcesPackage.TASK__CONTEXT:
				return context != null;
			case ResourcesPackage.TASK__EXECUTION_PERIOD:
				return executionPeriod != null;
			case ResourcesPackage.TASK__AUTHORED_ON:
				return authoredOn != null;
			case ResourcesPackage.TASK__LAST_MODIFIED:
				return lastModified != null;
			case ResourcesPackage.TASK__REQUESTER:
				return requester != null;
			case ResourcesPackage.TASK__PERFORMER_TYPE:
				return performerTypes != null && !performerTypes.isEmpty();
			case ResourcesPackage.TASK__OWNER:
				return owner != null;
			case ResourcesPackage.TASK__REASON:
				return reason != null;
			case ResourcesPackage.TASK__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.TASK__RELEVANT_HISTORY:
				return relevantHistories != null && !relevantHistories.isEmpty();
			case ResourcesPackage.TASK__RESTRICTION:
				return restriction != null;
			case ResourcesPackage.TASK__INPUT:
				return inputs != null && !inputs.isEmpty();
			case ResourcesPackage.TASK__OUTPUT:
				return outputs != null && !outputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskImpl
