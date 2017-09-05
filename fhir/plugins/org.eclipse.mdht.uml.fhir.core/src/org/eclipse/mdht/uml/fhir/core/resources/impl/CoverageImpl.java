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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.dataTypes.PositiveInt;
import org.eclipse.mdht.uml.fhir.core.resources.Contract;
import org.eclipse.mdht.uml.fhir.core.resources.Coverage;
import org.eclipse.mdht.uml.fhir.core.resources.CoverageGroup;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getPolicyHolder <em>Policy Holder</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getSubscriberId <em>Subscriber Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getBeneficiary <em>Beneficiary</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getPayors <em>Payor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getDependent <em>Dependent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageImpl#getContracts <em>Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoverageImpl extends DomainResourceImpl implements Coverage {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getPolicyHolder() <em>Policy Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyHolder()
	 * @generated
	 * @ordered
	 */
	protected Resource policyHolder;

	/**
	 * The cached value of the '{@link #getSubscriber() <em>Subscriber</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriber()
	 * @generated
	 * @ordered
	 */
	protected Resource subscriber;

	/**
	 * The cached value of the '{@link #getSubscriberId() <em>Subscriber Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String subscriberId;

	/**
	 * The cached value of the '{@link #getBeneficiary() <em>Beneficiary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeneficiary()
	 * @generated
	 * @ordered
	 */
	protected Patient beneficiary;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relationship;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getPayors() <em>Payor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayors()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> payors;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected CoverageGroup group;

	/**
	 * The cached value of the '{@link #getDependent() <em>Dependent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependent()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String dependent;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String sequence;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt order;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String network;

	/**
	 * The cached value of the '{@link #getContracts() <em>Contract</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContracts()
	 * @generated
	 * @ordered
	 */
	protected EList<Contract> contracts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCoverage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.COVERAGE__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CodeableConcept)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getPolicyHolder() {
		if (policyHolder != null && policyHolder.eIsProxy()) {
			InternalEObject oldPolicyHolder = (InternalEObject)policyHolder;
			policyHolder = (Resource)eResolveProxy(oldPolicyHolder);
			if (policyHolder != oldPolicyHolder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE__POLICY_HOLDER, oldPolicyHolder, policyHolder));
			}
		}
		return policyHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetPolicyHolder() {
		return policyHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyHolder(Resource newPolicyHolder) {
		Resource oldPolicyHolder = policyHolder;
		policyHolder = newPolicyHolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__POLICY_HOLDER, oldPolicyHolder, policyHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSubscriber() {
		if (subscriber != null && subscriber.eIsProxy()) {
			InternalEObject oldSubscriber = (InternalEObject)subscriber;
			subscriber = (Resource)eResolveProxy(oldSubscriber);
			if (subscriber != oldSubscriber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE__SUBSCRIBER, oldSubscriber, subscriber));
			}
		}
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetSubscriber() {
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriber(Resource newSubscriber) {
		Resource oldSubscriber = subscriber;
		subscriber = newSubscriber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__SUBSCRIBER, oldSubscriber, subscriber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getSubscriberId() {
		if (subscriberId != null && subscriberId.eIsProxy()) {
			InternalEObject oldSubscriberId = (InternalEObject)subscriberId;
			subscriberId = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldSubscriberId);
			if (subscriberId != oldSubscriberId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE__SUBSCRIBER_ID, oldSubscriberId, subscriberId));
			}
		}
		return subscriberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetSubscriberId() {
		return subscriberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberId(org.eclipse.mdht.uml.fhir.core.dataTypes.String newSubscriberId) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldSubscriberId = subscriberId;
		subscriberId = newSubscriberId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__SUBSCRIBER_ID, oldSubscriberId, subscriberId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getBeneficiary() {
		if (beneficiary != null && beneficiary.eIsProxy()) {
			InternalEObject oldBeneficiary = (InternalEObject)beneficiary;
			beneficiary = (Patient)eResolveProxy(oldBeneficiary);
			if (beneficiary != oldBeneficiary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE__BENEFICIARY, oldBeneficiary, beneficiary));
			}
		}
		return beneficiary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetBeneficiary() {
		return beneficiary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeneficiary(Patient newBeneficiary) {
		Patient oldBeneficiary = beneficiary;
		beneficiary = newBeneficiary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__BENEFICIARY, oldBeneficiary, beneficiary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRelationship() {
		if (relationship != null && relationship.eIsProxy()) {
			InternalEObject oldRelationship = (InternalEObject)relationship;
			relationship = (CodeableConcept)eResolveProxy(oldRelationship);
			if (relationship != oldRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE__RELATIONSHIP, oldRelationship, relationship));
			}
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(CodeableConcept newRelationship) {
		CodeableConcept oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__RELATIONSHIP, oldRelationship, relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (Period)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getPayors() {
		if (payors == null) {
			payors = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.COVERAGE__PAYOR);
		}
		return payors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageGroup getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(CoverageGroup newGroup, NotificationChain msgs) {
		CoverageGroup oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(CoverageGroup newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDependent() {
		if (dependent != null && dependent.eIsProxy()) {
			InternalEObject oldDependent = (InternalEObject)dependent;
			dependent = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDependent);
			if (dependent != oldDependent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE__DEPENDENT, oldDependent, dependent));
			}
		}
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDependent() {
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependent(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDependent) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDependent = dependent;
		dependent = newDependent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__DEPENDENT, oldDependent, dependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getSequence() {
		if (sequence != null && sequence.eIsProxy()) {
			InternalEObject oldSequence = (InternalEObject)sequence;
			sequence = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldSequence);
			if (sequence != oldSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE__SEQUENCE, oldSequence, sequence));
			}
		}
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(org.eclipse.mdht.uml.fhir.core.dataTypes.String newSequence) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getOrder() {
		if (order != null && order.eIsProxy()) {
			InternalEObject oldOrder = (InternalEObject)order;
			order = (PositiveInt)eResolveProxy(oldOrder);
			if (order != oldOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE__ORDER, oldOrder, order));
			}
		}
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(PositiveInt newOrder) {
		PositiveInt oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject)network;
			network = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE__NETWORK, oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(org.eclipse.mdht.uml.fhir.core.dataTypes.String newNetwork) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contract> getContracts() {
		if (contracts == null) {
			contracts = new EObjectResolvingEList<Contract>(Contract.class, this, ResourcesPackage.COVERAGE__CONTRACT);
		}
		return contracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COVERAGE__GROUP:
				return basicSetGroup(null, msgs);
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
			case ResourcesPackage.COVERAGE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.COVERAGE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.COVERAGE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.COVERAGE__POLICY_HOLDER:
				if (resolve) return getPolicyHolder();
				return basicGetPolicyHolder();
			case ResourcesPackage.COVERAGE__SUBSCRIBER:
				if (resolve) return getSubscriber();
				return basicGetSubscriber();
			case ResourcesPackage.COVERAGE__SUBSCRIBER_ID:
				if (resolve) return getSubscriberId();
				return basicGetSubscriberId();
			case ResourcesPackage.COVERAGE__BENEFICIARY:
				if (resolve) return getBeneficiary();
				return basicGetBeneficiary();
			case ResourcesPackage.COVERAGE__RELATIONSHIP:
				if (resolve) return getRelationship();
				return basicGetRelationship();
			case ResourcesPackage.COVERAGE__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case ResourcesPackage.COVERAGE__PAYOR:
				return getPayors();
			case ResourcesPackage.COVERAGE__GROUP:
				return getGroup();
			case ResourcesPackage.COVERAGE__DEPENDENT:
				if (resolve) return getDependent();
				return basicGetDependent();
			case ResourcesPackage.COVERAGE__SEQUENCE:
				if (resolve) return getSequence();
				return basicGetSequence();
			case ResourcesPackage.COVERAGE__ORDER:
				if (resolve) return getOrder();
				return basicGetOrder();
			case ResourcesPackage.COVERAGE__NETWORK:
				if (resolve) return getNetwork();
				return basicGetNetwork();
			case ResourcesPackage.COVERAGE__CONTRACT:
				return getContracts();
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
			case ResourcesPackage.COVERAGE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.COVERAGE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.COVERAGE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COVERAGE__POLICY_HOLDER:
				setPolicyHolder((Resource)newValue);
				return;
			case ResourcesPackage.COVERAGE__SUBSCRIBER:
				setSubscriber((Resource)newValue);
				return;
			case ResourcesPackage.COVERAGE__SUBSCRIBER_ID:
				setSubscriberId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE__BENEFICIARY:
				setBeneficiary((Patient)newValue);
				return;
			case ResourcesPackage.COVERAGE__RELATIONSHIP:
				setRelationship((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COVERAGE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.COVERAGE__PAYOR:
				getPayors().clear();
				getPayors().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.COVERAGE__GROUP:
				setGroup((CoverageGroup)newValue);
				return;
			case ResourcesPackage.COVERAGE__DEPENDENT:
				setDependent((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE__SEQUENCE:
				setSequence((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE__ORDER:
				setOrder((PositiveInt)newValue);
				return;
			case ResourcesPackage.COVERAGE__NETWORK:
				setNetwork((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE__CONTRACT:
				getContracts().clear();
				getContracts().addAll((Collection<? extends Contract>)newValue);
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
			case ResourcesPackage.COVERAGE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.COVERAGE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.COVERAGE__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.COVERAGE__POLICY_HOLDER:
				setPolicyHolder((Resource)null);
				return;
			case ResourcesPackage.COVERAGE__SUBSCRIBER:
				setSubscriber((Resource)null);
				return;
			case ResourcesPackage.COVERAGE__SUBSCRIBER_ID:
				setSubscriberId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE__BENEFICIARY:
				setBeneficiary((Patient)null);
				return;
			case ResourcesPackage.COVERAGE__RELATIONSHIP:
				setRelationship((CodeableConcept)null);
				return;
			case ResourcesPackage.COVERAGE__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.COVERAGE__PAYOR:
				getPayors().clear();
				return;
			case ResourcesPackage.COVERAGE__GROUP:
				setGroup((CoverageGroup)null);
				return;
			case ResourcesPackage.COVERAGE__DEPENDENT:
				setDependent((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE__SEQUENCE:
				setSequence((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE__ORDER:
				setOrder((PositiveInt)null);
				return;
			case ResourcesPackage.COVERAGE__NETWORK:
				setNetwork((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE__CONTRACT:
				getContracts().clear();
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
			case ResourcesPackage.COVERAGE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.COVERAGE__STATUS:
				return status != null;
			case ResourcesPackage.COVERAGE__TYPE:
				return type != null;
			case ResourcesPackage.COVERAGE__POLICY_HOLDER:
				return policyHolder != null;
			case ResourcesPackage.COVERAGE__SUBSCRIBER:
				return subscriber != null;
			case ResourcesPackage.COVERAGE__SUBSCRIBER_ID:
				return subscriberId != null;
			case ResourcesPackage.COVERAGE__BENEFICIARY:
				return beneficiary != null;
			case ResourcesPackage.COVERAGE__RELATIONSHIP:
				return relationship != null;
			case ResourcesPackage.COVERAGE__PERIOD:
				return period != null;
			case ResourcesPackage.COVERAGE__PAYOR:
				return payors != null && !payors.isEmpty();
			case ResourcesPackage.COVERAGE__GROUP:
				return group != null;
			case ResourcesPackage.COVERAGE__DEPENDENT:
				return dependent != null;
			case ResourcesPackage.COVERAGE__SEQUENCE:
				return sequence != null;
			case ResourcesPackage.COVERAGE__ORDER:
				return order != null;
			case ResourcesPackage.COVERAGE__NETWORK:
				return network != null;
			case ResourcesPackage.COVERAGE__CONTRACT:
				return contracts != null && !contracts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoverageImpl
