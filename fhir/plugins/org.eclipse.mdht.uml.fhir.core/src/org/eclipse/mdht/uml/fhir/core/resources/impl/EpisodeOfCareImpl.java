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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.resources.Account;
import org.eclipse.mdht.uml.fhir.core.resources.CareTeam;
import org.eclipse.mdht.uml.fhir.core.resources.Condition;
import org.eclipse.mdht.uml.fhir.core.resources.EpisodeOfCare;
import org.eclipse.mdht.uml.fhir.core.resources.EpisodeOfCareStatusHistory;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.Patient;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.ReferralRequest;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Episode Of Care</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EpisodeOfCareImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EpisodeOfCareImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EpisodeOfCareImpl#getStatusHistories <em>Status History</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EpisodeOfCareImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EpisodeOfCareImpl#getConditions <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EpisodeOfCareImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EpisodeOfCareImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EpisodeOfCareImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EpisodeOfCareImpl#getReferralRequests <em>Referral Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EpisodeOfCareImpl#getCareManager <em>Care Manager</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EpisodeOfCareImpl#getTeams <em>Team</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.EpisodeOfCareImpl#getAccounts <em>Account</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EpisodeOfCareImpl extends DomainResourceImpl implements EpisodeOfCare {
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
	 * The cached value of the '{@link #getStatusHistories() <em>Status History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<EpisodeOfCareStatusHistory> statusHistories;

	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> types;

	/**
	 * The cached value of the '{@link #getConditions() <em>Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The cached value of the '{@link #getManagingOrganization() <em>Managing Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization managingOrganization;

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
	 * The cached value of the '{@link #getReferralRequests() <em>Referral Request</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferralRequest> referralRequests;

	/**
	 * The cached value of the '{@link #getCareManager() <em>Care Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareManager()
	 * @generated
	 * @ordered
	 */
	protected Practitioner careManager;

	/**
	 * The cached value of the '{@link #getTeams() <em>Team</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<CareTeam> teams;

	/**
	 * The cached value of the '{@link #getAccounts() <em>Account</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Account> accounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpisodeOfCareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEpisodeOfCare();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.EPISODE_OF_CARE__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EPISODE_OF_CARE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EPISODE_OF_CARE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EpisodeOfCareStatusHistory> getStatusHistories() {
		if (statusHistories == null) {
			statusHistories = new EObjectContainmentEList<EpisodeOfCareStatusHistory>(EpisodeOfCareStatusHistory.class, this, ResourcesPackage.EPISODE_OF_CARE__STATUS_HISTORY);
		}
		return statusHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EPISODE_OF_CARE__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectResolvingEList<Condition>(Condition.class, this, ResourcesPackage.EPISODE_OF_CARE__CONDITION);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getPatient() {
		if (patient != null && patient.eIsProxy()) {
			InternalEObject oldPatient = (InternalEObject)patient;
			patient = (Patient)eResolveProxy(oldPatient);
			if (patient != oldPatient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EPISODE_OF_CARE__PATIENT, oldPatient, patient));
			}
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Patient newPatient) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EPISODE_OF_CARE__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getManagingOrganization() {
		if (managingOrganization != null && managingOrganization.eIsProxy()) {
			InternalEObject oldManagingOrganization = (InternalEObject)managingOrganization;
			managingOrganization = (Organization)eResolveProxy(oldManagingOrganization);
			if (managingOrganization != oldManagingOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION, oldManagingOrganization, managingOrganization));
			}
		}
		return managingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetManagingOrganization() {
		return managingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagingOrganization(Organization newManagingOrganization) {
		Organization oldManagingOrganization = managingOrganization;
		managingOrganization = newManagingOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION, oldManagingOrganization, managingOrganization));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EPISODE_OF_CARE__PERIOD, oldPeriod, period));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EPISODE_OF_CARE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferralRequest> getReferralRequests() {
		if (referralRequests == null) {
			referralRequests = new EObjectResolvingEList<ReferralRequest>(ReferralRequest.class, this, ResourcesPackage.EPISODE_OF_CARE__REFERRAL_REQUEST);
		}
		return referralRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getCareManager() {
		if (careManager != null && careManager.eIsProxy()) {
			InternalEObject oldCareManager = (InternalEObject)careManager;
			careManager = (Practitioner)eResolveProxy(oldCareManager);
			if (careManager != oldCareManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EPISODE_OF_CARE__CARE_MANAGER, oldCareManager, careManager));
			}
		}
		return careManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetCareManager() {
		return careManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCareManager(Practitioner newCareManager) {
		Practitioner oldCareManager = careManager;
		careManager = newCareManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EPISODE_OF_CARE__CARE_MANAGER, oldCareManager, careManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CareTeam> getTeams() {
		if (teams == null) {
			teams = new EObjectResolvingEList<CareTeam>(CareTeam.class, this, ResourcesPackage.EPISODE_OF_CARE__TEAM);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Account> getAccounts() {
		if (accounts == null) {
			accounts = new EObjectResolvingEList<Account>(Account.class, this, ResourcesPackage.EPISODE_OF_CARE__ACCOUNT);
		}
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EPISODE_OF_CARE__STATUS_HISTORY:
				return ((InternalEList<?>)getStatusHistories()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.EPISODE_OF_CARE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.EPISODE_OF_CARE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.EPISODE_OF_CARE__STATUS_HISTORY:
				return getStatusHistories();
			case ResourcesPackage.EPISODE_OF_CARE__TYPE:
				return getTypes();
			case ResourcesPackage.EPISODE_OF_CARE__CONDITION:
				return getConditions();
			case ResourcesPackage.EPISODE_OF_CARE__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case ResourcesPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				if (resolve) return getManagingOrganization();
				return basicGetManagingOrganization();
			case ResourcesPackage.EPISODE_OF_CARE__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case ResourcesPackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				return getReferralRequests();
			case ResourcesPackage.EPISODE_OF_CARE__CARE_MANAGER:
				if (resolve) return getCareManager();
				return basicGetCareManager();
			case ResourcesPackage.EPISODE_OF_CARE__TEAM:
				return getTeams();
			case ResourcesPackage.EPISODE_OF_CARE__ACCOUNT:
				return getAccounts();
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
			case ResourcesPackage.EPISODE_OF_CARE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__STATUS_HISTORY:
				getStatusHistories().clear();
				getStatusHistories().addAll((Collection<? extends EpisodeOfCareStatusHistory>)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__CONDITION:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__PATIENT:
				setPatient((Patient)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				setManagingOrganization((Organization)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				getReferralRequests().clear();
				getReferralRequests().addAll((Collection<? extends ReferralRequest>)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__CARE_MANAGER:
				setCareManager((Practitioner)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__TEAM:
				getTeams().clear();
				getTeams().addAll((Collection<? extends CareTeam>)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__ACCOUNT:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends Account>)newValue);
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
			case ResourcesPackage.EPISODE_OF_CARE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.EPISODE_OF_CARE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__STATUS_HISTORY:
				getStatusHistories().clear();
				return;
			case ResourcesPackage.EPISODE_OF_CARE__TYPE:
				getTypes().clear();
				return;
			case ResourcesPackage.EPISODE_OF_CARE__CONDITION:
				getConditions().clear();
				return;
			case ResourcesPackage.EPISODE_OF_CARE__PATIENT:
				setPatient((Patient)null);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				setManagingOrganization((Organization)null);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				getReferralRequests().clear();
				return;
			case ResourcesPackage.EPISODE_OF_CARE__CARE_MANAGER:
				setCareManager((Practitioner)null);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__TEAM:
				getTeams().clear();
				return;
			case ResourcesPackage.EPISODE_OF_CARE__ACCOUNT:
				getAccounts().clear();
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
			case ResourcesPackage.EPISODE_OF_CARE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.EPISODE_OF_CARE__STATUS:
				return status != null;
			case ResourcesPackage.EPISODE_OF_CARE__STATUS_HISTORY:
				return statusHistories != null && !statusHistories.isEmpty();
			case ResourcesPackage.EPISODE_OF_CARE__TYPE:
				return types != null && !types.isEmpty();
			case ResourcesPackage.EPISODE_OF_CARE__CONDITION:
				return conditions != null && !conditions.isEmpty();
			case ResourcesPackage.EPISODE_OF_CARE__PATIENT:
				return patient != null;
			case ResourcesPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case ResourcesPackage.EPISODE_OF_CARE__PERIOD:
				return period != null;
			case ResourcesPackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				return referralRequests != null && !referralRequests.isEmpty();
			case ResourcesPackage.EPISODE_OF_CARE__CARE_MANAGER:
				return careManager != null;
			case ResourcesPackage.EPISODE_OF_CARE__TEAM:
				return teams != null && !teams.isEmpty();
			case ResourcesPackage.EPISODE_OF_CARE__ACCOUNT:
				return accounts != null && !accounts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EpisodeOfCareImpl
