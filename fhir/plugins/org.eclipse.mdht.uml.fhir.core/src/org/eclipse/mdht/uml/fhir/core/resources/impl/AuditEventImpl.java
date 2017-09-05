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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Instant;
import org.eclipse.mdht.uml.fhir.core.resources.AuditEvent;
import org.eclipse.mdht.uml.fhir.core.resources.AuditEventAgent;
import org.eclipse.mdht.uml.fhir.core.resources.AuditEventEntity;
import org.eclipse.mdht.uml.fhir.core.resources.AuditEventSource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventImpl#getSubtypes <em>Subtype</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventImpl#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventImpl#getOutcomeDesc <em>Outcome Desc</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventImpl#getPurposeOfEvents <em>Purpose Of Event</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventImpl#getAgents <em>Agent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AuditEventImpl#getEntities <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuditEventImpl extends DomainResourceImpl implements AuditEvent {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getSubtypes() <em>Subtype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> subtypes;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Code action;

	/**
	 * The cached value of the '{@link #getRecorded() <em>Recorded</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorded()
	 * @generated
	 * @ordered
	 */
	protected Instant recorded;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected Code outcome;

	/**
	 * The cached value of the '{@link #getOutcomeDesc() <em>Outcome Desc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomeDesc()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String outcomeDesc;

	/**
	 * The cached value of the '{@link #getPurposeOfEvents() <em>Purpose Of Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeOfEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> purposeOfEvents;

	/**
	 * The cached value of the '{@link #getAgents() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditEventAgent> agents;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected AuditEventSource source;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditEventEntity> entities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getAuditEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Coding)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.AUDIT_EVENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSubtypes() {
		if (subtypes == null) {
			subtypes = new EObjectResolvingEList<Coding>(Coding.class, this, ResourcesPackage.AUDIT_EVENT__SUBTYPE);
		}
		return subtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Code)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.AUDIT_EVENT__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Code newAction) {
		Code oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getRecorded() {
		if (recorded != null && recorded.eIsProxy()) {
			InternalEObject oldRecorded = (InternalEObject)recorded;
			recorded = (Instant)eResolveProxy(oldRecorded);
			if (recorded != oldRecorded) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.AUDIT_EVENT__RECORDED, oldRecorded, recorded));
			}
		}
		return recorded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetRecorded() {
		return recorded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorded(Instant newRecorded) {
		Instant oldRecorded = recorded;
		recorded = newRecorded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__RECORDED, oldRecorded, recorded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getOutcome() {
		if (outcome != null && outcome.eIsProxy()) {
			InternalEObject oldOutcome = (InternalEObject)outcome;
			outcome = (Code)eResolveProxy(oldOutcome);
			if (outcome != oldOutcome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.AUDIT_EVENT__OUTCOME, oldOutcome, outcome));
			}
		}
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(Code newOutcome) {
		Code oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__OUTCOME, oldOutcome, outcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getOutcomeDesc() {
		if (outcomeDesc != null && outcomeDesc.eIsProxy()) {
			InternalEObject oldOutcomeDesc = (InternalEObject)outcomeDesc;
			outcomeDesc = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldOutcomeDesc);
			if (outcomeDesc != oldOutcomeDesc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.AUDIT_EVENT__OUTCOME_DESC, oldOutcomeDesc, outcomeDesc));
			}
		}
		return outcomeDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetOutcomeDesc() {
		return outcomeDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcomeDesc(org.eclipse.mdht.uml.fhir.core.dataTypes.String newOutcomeDesc) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldOutcomeDesc = outcomeDesc;
		outcomeDesc = newOutcomeDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__OUTCOME_DESC, oldOutcomeDesc, outcomeDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPurposeOfEvents() {
		if (purposeOfEvents == null) {
			purposeOfEvents = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.AUDIT_EVENT__PURPOSE_OF_EVENT);
		}
		return purposeOfEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuditEventAgent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<AuditEventAgent>(AuditEventAgent.class, this, ResourcesPackage.AUDIT_EVENT__AGENT);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSource getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(AuditEventSource newSource, NotificationChain msgs) {
		AuditEventSource oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AuditEventSource newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuditEventEntity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<AuditEventEntity>(AuditEventEntity.class, this, ResourcesPackage.AUDIT_EVENT__ENTITY);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.AUDIT_EVENT__AGENT:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.AUDIT_EVENT__SOURCE:
				return basicSetSource(null, msgs);
			case ResourcesPackage.AUDIT_EVENT__ENTITY:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.AUDIT_EVENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.AUDIT_EVENT__SUBTYPE:
				return getSubtypes();
			case ResourcesPackage.AUDIT_EVENT__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case ResourcesPackage.AUDIT_EVENT__RECORDED:
				if (resolve) return getRecorded();
				return basicGetRecorded();
			case ResourcesPackage.AUDIT_EVENT__OUTCOME:
				if (resolve) return getOutcome();
				return basicGetOutcome();
			case ResourcesPackage.AUDIT_EVENT__OUTCOME_DESC:
				if (resolve) return getOutcomeDesc();
				return basicGetOutcomeDesc();
			case ResourcesPackage.AUDIT_EVENT__PURPOSE_OF_EVENT:
				return getPurposeOfEvents();
			case ResourcesPackage.AUDIT_EVENT__AGENT:
				return getAgents();
			case ResourcesPackage.AUDIT_EVENT__SOURCE:
				return getSource();
			case ResourcesPackage.AUDIT_EVENT__ENTITY:
				return getEntities();
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
			case ResourcesPackage.AUDIT_EVENT__TYPE:
				setType((Coding)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__SUBTYPE:
				getSubtypes().clear();
				getSubtypes().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__ACTION:
				setAction((Code)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__RECORDED:
				setRecorded((Instant)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__OUTCOME:
				setOutcome((Code)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__OUTCOME_DESC:
				setOutcomeDesc((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__PURPOSE_OF_EVENT:
				getPurposeOfEvents().clear();
				getPurposeOfEvents().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__AGENT:
				getAgents().clear();
				getAgents().addAll((Collection<? extends AuditEventAgent>)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__SOURCE:
				setSource((AuditEventSource)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT__ENTITY:
				getEntities().clear();
				getEntities().addAll((Collection<? extends AuditEventEntity>)newValue);
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
			case ResourcesPackage.AUDIT_EVENT__TYPE:
				setType((Coding)null);
				return;
			case ResourcesPackage.AUDIT_EVENT__SUBTYPE:
				getSubtypes().clear();
				return;
			case ResourcesPackage.AUDIT_EVENT__ACTION:
				setAction((Code)null);
				return;
			case ResourcesPackage.AUDIT_EVENT__RECORDED:
				setRecorded((Instant)null);
				return;
			case ResourcesPackage.AUDIT_EVENT__OUTCOME:
				setOutcome((Code)null);
				return;
			case ResourcesPackage.AUDIT_EVENT__OUTCOME_DESC:
				setOutcomeDesc((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.AUDIT_EVENT__PURPOSE_OF_EVENT:
				getPurposeOfEvents().clear();
				return;
			case ResourcesPackage.AUDIT_EVENT__AGENT:
				getAgents().clear();
				return;
			case ResourcesPackage.AUDIT_EVENT__SOURCE:
				setSource((AuditEventSource)null);
				return;
			case ResourcesPackage.AUDIT_EVENT__ENTITY:
				getEntities().clear();
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
			case ResourcesPackage.AUDIT_EVENT__TYPE:
				return type != null;
			case ResourcesPackage.AUDIT_EVENT__SUBTYPE:
				return subtypes != null && !subtypes.isEmpty();
			case ResourcesPackage.AUDIT_EVENT__ACTION:
				return action != null;
			case ResourcesPackage.AUDIT_EVENT__RECORDED:
				return recorded != null;
			case ResourcesPackage.AUDIT_EVENT__OUTCOME:
				return outcome != null;
			case ResourcesPackage.AUDIT_EVENT__OUTCOME_DESC:
				return outcomeDesc != null;
			case ResourcesPackage.AUDIT_EVENT__PURPOSE_OF_EVENT:
				return purposeOfEvents != null && !purposeOfEvents.isEmpty();
			case ResourcesPackage.AUDIT_EVENT__AGENT:
				return agents != null && !agents.isEmpty();
			case ResourcesPackage.AUDIT_EVENT__SOURCE:
				return source != null;
			case ResourcesPackage.AUDIT_EVENT__ENTITY:
				return entities != null && !entities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventImpl
