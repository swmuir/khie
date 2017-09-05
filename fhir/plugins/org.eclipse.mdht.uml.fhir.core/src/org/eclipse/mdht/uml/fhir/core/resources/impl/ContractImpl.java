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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.resources.Contract;
import org.eclipse.mdht.uml.fhir.core.resources.ContractAgent;
import org.eclipse.mdht.uml.fhir.core.resources.ContractComputableLanguage;
import org.eclipse.mdht.uml.fhir.core.resources.ContractFriendlyLanguage;
import org.eclipse.mdht.uml.fhir.core.resources.ContractLegalLanguage;
import org.eclipse.mdht.uml.fhir.core.resources.ContractSignatory;
import org.eclipse.mdht.uml.fhir.core.resources.ContractTerm;
import org.eclipse.mdht.uml.fhir.core.resources.ContractValuedItem;
import org.eclipse.mdht.uml.fhir.core.resources.Location;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getSubjects <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getTopics <em>Topic</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getAuthorities <em>Authority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getDomains <em>Domain</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getSubTypes <em>Sub Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getActions <em>Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getActionReasons <em>Action Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getAgents <em>Agent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getSigners <em>Signer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getValuedItems <em>Valued Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getTerms <em>Term</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getBindingx <em>Bindingx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getFriendlies <em>Friendly</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getLegals <em>Legal</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ContractImpl#getRules <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContractImpl extends DomainResourceImpl implements Contract {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected DateTime issued;

	/**
	 * The cached value of the '{@link #getApplies() <em>Applies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplies()
	 * @generated
	 * @ordered
	 */
	protected Period applies;

	/**
	 * The cached value of the '{@link #getSubjects() <em>Subject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> subjects;

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
	 * The cached value of the '{@link #getAuthorities() <em>Authority</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorities()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> authorities;

	/**
	 * The cached value of the '{@link #getDomains() <em>Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> domains;

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
	 * The cached value of the '{@link #getSubTypes() <em>Sub Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subTypes;

	/**
	 * The cached value of the '{@link #getActions() <em>Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> actions;

	/**
	 * The cached value of the '{@link #getActionReasons() <em>Action Reason</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> actionReasons;

	/**
	 * The cached value of the '{@link #getAgents() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractAgent> agents;

	/**
	 * The cached value of the '{@link #getSigners() <em>Signer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigners()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractSignatory> signers;

	/**
	 * The cached value of the '{@link #getValuedItems() <em>Valued Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractValuedItem> valuedItems;

	/**
	 * The cached value of the '{@link #getTerms() <em>Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTerm> terms;

	/**
	 * The cached value of the '{@link #getBindingx() <em>Bindingx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingx()
	 * @generated
	 * @ordered
	 */
	protected Base bindingx;

	/**
	 * The cached value of the '{@link #getFriendlies() <em>Friendly</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriendlies()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractFriendlyLanguage> friendlies;

	/**
	 * The cached value of the '{@link #getLegals() <em>Legal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegals()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractLegalLanguage> legals;

	/**
	 * The cached value of the '{@link #getRules() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractComputableLanguage> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getContract();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONTRACT__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__IDENTIFIER, oldIdentifier, identifier));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONTRACT__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getIssued() {
		if (issued != null && issued.eIsProxy()) {
			InternalEObject oldIssued = (InternalEObject)issued;
			issued = (DateTime)eResolveProxy(oldIssued);
			if (issued != oldIssued) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONTRACT__ISSUED, oldIssued, issued));
			}
		}
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssued(DateTime newIssued) {
		DateTime oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__ISSUED, oldIssued, issued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getApplies() {
		if (applies != null && applies.eIsProxy()) {
			InternalEObject oldApplies = (InternalEObject)applies;
			applies = (Period)eResolveProxy(oldApplies);
			if (applies != oldApplies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONTRACT__APPLIES, oldApplies, applies));
			}
		}
		return applies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetApplies() {
		return applies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplies(Period newApplies) {
		Period oldApplies = applies;
		applies = newApplies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__APPLIES, oldApplies, applies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getSubjects() {
		if (subjects == null) {
			subjects = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.CONTRACT__SUBJECT);
		}
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getTopics() {
		if (topics == null) {
			topics = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.CONTRACT__TOPIC);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organization> getAuthorities() {
		if (authorities == null) {
			authorities = new EObjectResolvingEList<Organization>(Organization.class, this, ResourcesPackage.CONTRACT__AUTHORITY);
		}
		return authorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getDomains() {
		if (domains == null) {
			domains = new EObjectResolvingEList<Location>(Location.class, this, ResourcesPackage.CONTRACT__DOMAIN);
		}
		return domains;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONTRACT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONTRACT__SUB_TYPE);
		}
		return subTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONTRACT__ACTION);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getActionReasons() {
		if (actionReasons == null) {
			actionReasons = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONTRACT__ACTION_REASON);
		}
		return actionReasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractAgent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<ContractAgent>(ContractAgent.class, this, ResourcesPackage.CONTRACT__AGENT);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractSignatory> getSigners() {
		if (signers == null) {
			signers = new EObjectContainmentEList<ContractSignatory>(ContractSignatory.class, this, ResourcesPackage.CONTRACT__SIGNER);
		}
		return signers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractValuedItem> getValuedItems() {
		if (valuedItems == null) {
			valuedItems = new EObjectContainmentEList<ContractValuedItem>(ContractValuedItem.class, this, ResourcesPackage.CONTRACT__VALUED_ITEM);
		}
		return valuedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractTerm> getTerms() {
		if (terms == null) {
			terms = new EObjectContainmentEList<ContractTerm>(ContractTerm.class, this, ResourcesPackage.CONTRACT__TERM);
		}
		return terms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getBindingx() {
		if (bindingx != null && bindingx.eIsProxy()) {
			InternalEObject oldBindingx = (InternalEObject)bindingx;
			bindingx = (Base)eResolveProxy(oldBindingx);
			if (bindingx != oldBindingx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONTRACT__BINDINGX, oldBindingx, bindingx));
			}
		}
		return bindingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetBindingx() {
		return bindingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingx(Base newBindingx) {
		Base oldBindingx = bindingx;
		bindingx = newBindingx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT__BINDINGX, oldBindingx, bindingx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractFriendlyLanguage> getFriendlies() {
		if (friendlies == null) {
			friendlies = new EObjectContainmentEList<ContractFriendlyLanguage>(ContractFriendlyLanguage.class, this, ResourcesPackage.CONTRACT__FRIENDLY);
		}
		return friendlies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractLegalLanguage> getLegals() {
		if (legals == null) {
			legals = new EObjectContainmentEList<ContractLegalLanguage>(ContractLegalLanguage.class, this, ResourcesPackage.CONTRACT__LEGAL);
		}
		return legals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractComputableLanguage> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<ContractComputableLanguage>(ContractComputableLanguage.class, this, ResourcesPackage.CONTRACT__RULE);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONTRACT__AGENT:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__SIGNER:
				return ((InternalEList<?>)getSigners()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__VALUED_ITEM:
				return ((InternalEList<?>)getValuedItems()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__TERM:
				return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__FRIENDLY:
				return ((InternalEList<?>)getFriendlies()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__LEGAL:
				return ((InternalEList<?>)getLegals()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT__RULE:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CONTRACT__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case ResourcesPackage.CONTRACT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.CONTRACT__ISSUED:
				if (resolve) return getIssued();
				return basicGetIssued();
			case ResourcesPackage.CONTRACT__APPLIES:
				if (resolve) return getApplies();
				return basicGetApplies();
			case ResourcesPackage.CONTRACT__SUBJECT:
				return getSubjects();
			case ResourcesPackage.CONTRACT__TOPIC:
				return getTopics();
			case ResourcesPackage.CONTRACT__AUTHORITY:
				return getAuthorities();
			case ResourcesPackage.CONTRACT__DOMAIN:
				return getDomains();
			case ResourcesPackage.CONTRACT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.CONTRACT__SUB_TYPE:
				return getSubTypes();
			case ResourcesPackage.CONTRACT__ACTION:
				return getActions();
			case ResourcesPackage.CONTRACT__ACTION_REASON:
				return getActionReasons();
			case ResourcesPackage.CONTRACT__AGENT:
				return getAgents();
			case ResourcesPackage.CONTRACT__SIGNER:
				return getSigners();
			case ResourcesPackage.CONTRACT__VALUED_ITEM:
				return getValuedItems();
			case ResourcesPackage.CONTRACT__TERM:
				return getTerms();
			case ResourcesPackage.CONTRACT__BINDINGX:
				if (resolve) return getBindingx();
				return basicGetBindingx();
			case ResourcesPackage.CONTRACT__FRIENDLY:
				return getFriendlies();
			case ResourcesPackage.CONTRACT__LEGAL:
				return getLegals();
			case ResourcesPackage.CONTRACT__RULE:
				return getRules();
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
			case ResourcesPackage.CONTRACT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.CONTRACT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CONTRACT__ISSUED:
				setIssued((DateTime)newValue);
				return;
			case ResourcesPackage.CONTRACT__APPLIES:
				setApplies((Period)newValue);
				return;
			case ResourcesPackage.CONTRACT__SUBJECT:
				getSubjects().clear();
				getSubjects().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.CONTRACT__TOPIC:
				getTopics().clear();
				getTopics().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.CONTRACT__AUTHORITY:
				getAuthorities().clear();
				getAuthorities().addAll((Collection<? extends Organization>)newValue);
				return;
			case ResourcesPackage.CONTRACT__DOMAIN:
				getDomains().clear();
				getDomains().addAll((Collection<? extends Location>)newValue);
				return;
			case ResourcesPackage.CONTRACT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONTRACT__SUB_TYPE:
				getSubTypes().clear();
				getSubTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONTRACT__ACTION:
				getActions().clear();
				getActions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONTRACT__ACTION_REASON:
				getActionReasons().clear();
				getActionReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONTRACT__AGENT:
				getAgents().clear();
				getAgents().addAll((Collection<? extends ContractAgent>)newValue);
				return;
			case ResourcesPackage.CONTRACT__SIGNER:
				getSigners().clear();
				getSigners().addAll((Collection<? extends ContractSignatory>)newValue);
				return;
			case ResourcesPackage.CONTRACT__VALUED_ITEM:
				getValuedItems().clear();
				getValuedItems().addAll((Collection<? extends ContractValuedItem>)newValue);
				return;
			case ResourcesPackage.CONTRACT__TERM:
				getTerms().clear();
				getTerms().addAll((Collection<? extends ContractTerm>)newValue);
				return;
			case ResourcesPackage.CONTRACT__BINDINGX:
				setBindingx((Base)newValue);
				return;
			case ResourcesPackage.CONTRACT__FRIENDLY:
				getFriendlies().clear();
				getFriendlies().addAll((Collection<? extends ContractFriendlyLanguage>)newValue);
				return;
			case ResourcesPackage.CONTRACT__LEGAL:
				getLegals().clear();
				getLegals().addAll((Collection<? extends ContractLegalLanguage>)newValue);
				return;
			case ResourcesPackage.CONTRACT__RULE:
				getRules().clear();
				getRules().addAll((Collection<? extends ContractComputableLanguage>)newValue);
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
			case ResourcesPackage.CONTRACT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.CONTRACT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CONTRACT__ISSUED:
				setIssued((DateTime)null);
				return;
			case ResourcesPackage.CONTRACT__APPLIES:
				setApplies((Period)null);
				return;
			case ResourcesPackage.CONTRACT__SUBJECT:
				getSubjects().clear();
				return;
			case ResourcesPackage.CONTRACT__TOPIC:
				getTopics().clear();
				return;
			case ResourcesPackage.CONTRACT__AUTHORITY:
				getAuthorities().clear();
				return;
			case ResourcesPackage.CONTRACT__DOMAIN:
				getDomains().clear();
				return;
			case ResourcesPackage.CONTRACT__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.CONTRACT__SUB_TYPE:
				getSubTypes().clear();
				return;
			case ResourcesPackage.CONTRACT__ACTION:
				getActions().clear();
				return;
			case ResourcesPackage.CONTRACT__ACTION_REASON:
				getActionReasons().clear();
				return;
			case ResourcesPackage.CONTRACT__AGENT:
				getAgents().clear();
				return;
			case ResourcesPackage.CONTRACT__SIGNER:
				getSigners().clear();
				return;
			case ResourcesPackage.CONTRACT__VALUED_ITEM:
				getValuedItems().clear();
				return;
			case ResourcesPackage.CONTRACT__TERM:
				getTerms().clear();
				return;
			case ResourcesPackage.CONTRACT__BINDINGX:
				setBindingx((Base)null);
				return;
			case ResourcesPackage.CONTRACT__FRIENDLY:
				getFriendlies().clear();
				return;
			case ResourcesPackage.CONTRACT__LEGAL:
				getLegals().clear();
				return;
			case ResourcesPackage.CONTRACT__RULE:
				getRules().clear();
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
			case ResourcesPackage.CONTRACT__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.CONTRACT__STATUS:
				return status != null;
			case ResourcesPackage.CONTRACT__ISSUED:
				return issued != null;
			case ResourcesPackage.CONTRACT__APPLIES:
				return applies != null;
			case ResourcesPackage.CONTRACT__SUBJECT:
				return subjects != null && !subjects.isEmpty();
			case ResourcesPackage.CONTRACT__TOPIC:
				return topics != null && !topics.isEmpty();
			case ResourcesPackage.CONTRACT__AUTHORITY:
				return authorities != null && !authorities.isEmpty();
			case ResourcesPackage.CONTRACT__DOMAIN:
				return domains != null && !domains.isEmpty();
			case ResourcesPackage.CONTRACT__TYPE:
				return type != null;
			case ResourcesPackage.CONTRACT__SUB_TYPE:
				return subTypes != null && !subTypes.isEmpty();
			case ResourcesPackage.CONTRACT__ACTION:
				return actions != null && !actions.isEmpty();
			case ResourcesPackage.CONTRACT__ACTION_REASON:
				return actionReasons != null && !actionReasons.isEmpty();
			case ResourcesPackage.CONTRACT__AGENT:
				return agents != null && !agents.isEmpty();
			case ResourcesPackage.CONTRACT__SIGNER:
				return signers != null && !signers.isEmpty();
			case ResourcesPackage.CONTRACT__VALUED_ITEM:
				return valuedItems != null && !valuedItems.isEmpty();
			case ResourcesPackage.CONTRACT__TERM:
				return terms != null && !terms.isEmpty();
			case ResourcesPackage.CONTRACT__BINDINGX:
				return bindingx != null;
			case ResourcesPackage.CONTRACT__FRIENDLY:
				return friendlies != null && !friendlies.isEmpty();
			case ResourcesPackage.CONTRACT__LEGAL:
				return legals != null && !legals.isEmpty();
			case ResourcesPackage.CONTRACT__RULE:
				return rules != null && !rules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractImpl
