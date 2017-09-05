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
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.DeviceUseRequest;
import org.eclipse.mdht.uml.fhir.core.resources.Provenance;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Use Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getDefinitions <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getRequisition <em>Requisition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getDevicex <em>Devicex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getOccurrencex <em>Occurrencex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getAuthored <em>Authored</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getPerformerType <em>Performer Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getSupportingInfos <em>Supporting Info</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceUseRequestImpl#getRelevantHistories <em>Relevant History</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceUseRequestImpl extends DomainResourceImpl implements DeviceUseRequest {
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
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept stage;

	/**
	 * The cached value of the '{@link #getDevicex() <em>Devicex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicex()
	 * @generated
	 * @ordered
	 */
	protected Base devicex;

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
	 * The cached value of the '{@link #getAuthored() <em>Authored</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthored()
	 * @generated
	 * @ordered
	 */
	protected DateTime authored;

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
	 * The cached value of the '{@link #getSupportingInfos() <em>Supporting Info</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> supportingInfos;

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
	protected DeviceUseRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDeviceUseRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.DEVICE_USE_REQUEST__IDENTIFIER);
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
			definitions = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DEVICE_USE_REQUEST__DEFINITION);
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
			basedOns = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DEVICE_USE_REQUEST__BASED_ON);
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
			replaces = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DEVICE_USE_REQUEST__REPLACES);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_REQUEST__REQUISITION, oldRequisition, requisition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_REQUEST__REQUISITION, oldRequisition, requisition));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_REQUEST__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_REQUEST__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStage() {
		if (stage != null && stage.eIsProxy()) {
			InternalEObject oldStage = (InternalEObject)stage;
			stage = (CodeableConcept)eResolveProxy(oldStage);
			if (stage != oldStage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_REQUEST__STAGE, oldStage, stage));
			}
		}
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(CodeableConcept newStage) {
		CodeableConcept oldStage = stage;
		stage = newStage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_REQUEST__STAGE, oldStage, stage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getDevicex() {
		if (devicex != null && devicex.eIsProxy()) {
			InternalEObject oldDevicex = (InternalEObject)devicex;
			devicex = (Base)eResolveProxy(oldDevicex);
			if (devicex != oldDevicex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_REQUEST__DEVICEX, oldDevicex, devicex));
			}
		}
		return devicex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetDevicex() {
		return devicex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevicex(Base newDevicex) {
		Base oldDevicex = devicex;
		devicex = newDevicex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_REQUEST__DEVICEX, oldDevicex, devicex));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_REQUEST__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_REQUEST__SUBJECT, oldSubject, subject));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_REQUEST__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_REQUEST__CONTEXT, oldContext, context));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_REQUEST__OCCURRENCEX, oldOccurrencex, occurrencex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_REQUEST__OCCURRENCEX, oldOccurrencex, occurrencex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getAuthored() {
		if (authored != null && authored.eIsProxy()) {
			InternalEObject oldAuthored = (InternalEObject)authored;
			authored = (DateTime)eResolveProxy(oldAuthored);
			if (authored != oldAuthored) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_REQUEST__AUTHORED, oldAuthored, authored));
			}
		}
		return authored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetAuthored() {
		return authored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthored(DateTime newAuthored) {
		DateTime oldAuthored = authored;
		authored = newAuthored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_REQUEST__AUTHORED, oldAuthored, authored));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_REQUEST__REQUESTER, oldRequester, requester));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_REQUEST__REQUESTER, oldRequester, requester));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_REQUEST__PERFORMER_TYPE, oldPerformerType, performerType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_REQUEST__PERFORMER_TYPE, oldPerformerType, performerType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_USE_REQUEST__PERFORMER, oldPerformer, performer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_REQUEST__PERFORMER, oldPerformer, performer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.DEVICE_USE_REQUEST__REASON_CODE);
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
			reasonReferences = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DEVICE_USE_REQUEST__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getSupportingInfos() {
		if (supportingInfos == null) {
			supportingInfos = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.DEVICE_USE_REQUEST__SUPPORTING_INFO);
		}
		return supportingInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.DEVICE_USE_REQUEST__NOTE);
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
			relevantHistories = new EObjectResolvingEList<Provenance>(Provenance.class, this, ResourcesPackage.DEVICE_USE_REQUEST__RELEVANT_HISTORY);
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
			case ResourcesPackage.DEVICE_USE_REQUEST__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.DEVICE_USE_REQUEST__DEFINITION:
				return getDefinitions();
			case ResourcesPackage.DEVICE_USE_REQUEST__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.DEVICE_USE_REQUEST__REPLACES:
				return getReplaces();
			case ResourcesPackage.DEVICE_USE_REQUEST__REQUISITION:
				if (resolve) return getRequisition();
				return basicGetRequisition();
			case ResourcesPackage.DEVICE_USE_REQUEST__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.DEVICE_USE_REQUEST__STAGE:
				if (resolve) return getStage();
				return basicGetStage();
			case ResourcesPackage.DEVICE_USE_REQUEST__DEVICEX:
				if (resolve) return getDevicex();
				return basicGetDevicex();
			case ResourcesPackage.DEVICE_USE_REQUEST__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.DEVICE_USE_REQUEST__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ResourcesPackage.DEVICE_USE_REQUEST__OCCURRENCEX:
				if (resolve) return getOccurrencex();
				return basicGetOccurrencex();
			case ResourcesPackage.DEVICE_USE_REQUEST__AUTHORED:
				if (resolve) return getAuthored();
				return basicGetAuthored();
			case ResourcesPackage.DEVICE_USE_REQUEST__REQUESTER:
				if (resolve) return getRequester();
				return basicGetRequester();
			case ResourcesPackage.DEVICE_USE_REQUEST__PERFORMER_TYPE:
				if (resolve) return getPerformerType();
				return basicGetPerformerType();
			case ResourcesPackage.DEVICE_USE_REQUEST__PERFORMER:
				if (resolve) return getPerformer();
				return basicGetPerformer();
			case ResourcesPackage.DEVICE_USE_REQUEST__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.DEVICE_USE_REQUEST__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.DEVICE_USE_REQUEST__SUPPORTING_INFO:
				return getSupportingInfos();
			case ResourcesPackage.DEVICE_USE_REQUEST__NOTE:
				return getNotes();
			case ResourcesPackage.DEVICE_USE_REQUEST__RELEVANT_HISTORY:
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
			case ResourcesPackage.DEVICE_USE_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__DEFINITION:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__REPLACES:
				getReplaces().clear();
				getReplaces().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__REQUISITION:
				setRequisition((Identifier)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__STAGE:
				setStage((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__DEVICEX:
				setDevicex((Base)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__CONTEXT:
				setContext((Resource)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__OCCURRENCEX:
				setOccurrencex((DataType)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__AUTHORED:
				setAuthored((DateTime)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__REQUESTER:
				setRequester((Resource)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__PERFORMER:
				setPerformer((Resource)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__SUPPORTING_INFO:
				getSupportingInfos().clear();
				getSupportingInfos().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__RELEVANT_HISTORY:
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
			case ResourcesPackage.DEVICE_USE_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__DEFINITION:
				getDefinitions().clear();
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__REPLACES:
				getReplaces().clear();
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__REQUISITION:
				setRequisition((Identifier)null);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__STAGE:
				setStage((CodeableConcept)null);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__DEVICEX:
				setDevicex((Base)null);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__SUBJECT:
				setSubject((Resource)null);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__CONTEXT:
				setContext((Resource)null);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__OCCURRENCEX:
				setOccurrencex((DataType)null);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__AUTHORED:
				setAuthored((DateTime)null);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__REQUESTER:
				setRequester((Resource)null);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)null);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__PERFORMER:
				setPerformer((Resource)null);
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__SUPPORTING_INFO:
				getSupportingInfos().clear();
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.DEVICE_USE_REQUEST__RELEVANT_HISTORY:
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
			case ResourcesPackage.DEVICE_USE_REQUEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.DEVICE_USE_REQUEST__DEFINITION:
				return definitions != null && !definitions.isEmpty();
			case ResourcesPackage.DEVICE_USE_REQUEST__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.DEVICE_USE_REQUEST__REPLACES:
				return replaces != null && !replaces.isEmpty();
			case ResourcesPackage.DEVICE_USE_REQUEST__REQUISITION:
				return requisition != null;
			case ResourcesPackage.DEVICE_USE_REQUEST__STATUS:
				return status != null;
			case ResourcesPackage.DEVICE_USE_REQUEST__STAGE:
				return stage != null;
			case ResourcesPackage.DEVICE_USE_REQUEST__DEVICEX:
				return devicex != null;
			case ResourcesPackage.DEVICE_USE_REQUEST__SUBJECT:
				return subject != null;
			case ResourcesPackage.DEVICE_USE_REQUEST__CONTEXT:
				return context != null;
			case ResourcesPackage.DEVICE_USE_REQUEST__OCCURRENCEX:
				return occurrencex != null;
			case ResourcesPackage.DEVICE_USE_REQUEST__AUTHORED:
				return authored != null;
			case ResourcesPackage.DEVICE_USE_REQUEST__REQUESTER:
				return requester != null;
			case ResourcesPackage.DEVICE_USE_REQUEST__PERFORMER_TYPE:
				return performerType != null;
			case ResourcesPackage.DEVICE_USE_REQUEST__PERFORMER:
				return performer != null;
			case ResourcesPackage.DEVICE_USE_REQUEST__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.DEVICE_USE_REQUEST__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.DEVICE_USE_REQUEST__SUPPORTING_INFO:
				return supportingInfos != null && !supportingInfos.isEmpty();
			case ResourcesPackage.DEVICE_USE_REQUEST__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.DEVICE_USE_REQUEST__RELEVANT_HISTORY:
				return relevantHistories != null && !relevantHistories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceUseRequestImpl
