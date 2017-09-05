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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Instant;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Signature;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.resources.Location;
import org.eclipse.mdht.uml.fhir.core.resources.Provenance;
import org.eclipse.mdht.uml.fhir.core.resources.ProvenanceAgent;
import org.eclipse.mdht.uml.fhir.core.resources.ProvenanceEntity;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provenance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProvenanceImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProvenanceImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProvenanceImpl#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProvenanceImpl#getReasons <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProvenanceImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProvenanceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProvenanceImpl#getPolicies <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProvenanceImpl#getAgents <em>Agent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProvenanceImpl#getEntities <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ProvenanceImpl#getSignatures <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvenanceImpl extends DomainResourceImpl implements Provenance {
	/**
	 * The cached value of the '{@link #getTargets() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> targets;

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
	 * The cached value of the '{@link #getRecorded() <em>Recorded</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorded()
	 * @generated
	 * @ordered
	 */
	protected Instant recorded;

	/**
	 * The cached value of the '{@link #getReasons() <em>Reason</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> reasons;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Coding activity;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getPolicies() <em>Policy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> policies;

	/**
	 * The cached value of the '{@link #getAgents() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvenanceAgent> agents;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvenanceEntity> entities;

	/**
	 * The cached value of the '{@link #getSignatures() <em>Signature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Signature> signatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getProvenance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.PROVENANCE__TARGET);
		}
		return targets;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROVENANCE__PERIOD, oldPeriod, period));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE__PERIOD, oldPeriod, period));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROVENANCE__RECORDED, oldRecorded, recorded));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE__RECORDED, oldRecorded, recorded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getReasons() {
		if (reasons == null) {
			reasons = new EObjectResolvingEList<Coding>(Coding.class, this, ResourcesPackage.PROVENANCE__REASON);
		}
		return reasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject)activity;
			activity = (Coding)eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROVENANCE__ACTIVITY, oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Coding newActivity) {
		Coding oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROVENANCE__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROVENANCE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getPolicies() {
		if (policies == null) {
			policies = new EObjectResolvingEList<Uri>(Uri.class, this, ResourcesPackage.PROVENANCE__POLICY);
		}
		return policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvenanceAgent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<ProvenanceAgent>(ProvenanceAgent.class, this, ResourcesPackage.PROVENANCE__AGENT);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvenanceEntity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<ProvenanceEntity>(ProvenanceEntity.class, this, ResourcesPackage.PROVENANCE__ENTITY);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signature> getSignatures() {
		if (signatures == null) {
			signatures = new EObjectResolvingEList<Signature>(Signature.class, this, ResourcesPackage.PROVENANCE__SIGNATURE);
		}
		return signatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PROVENANCE__AGENT:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PROVENANCE__ENTITY:
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
			case ResourcesPackage.PROVENANCE__TARGET:
				return getTargets();
			case ResourcesPackage.PROVENANCE__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case ResourcesPackage.PROVENANCE__RECORDED:
				if (resolve) return getRecorded();
				return basicGetRecorded();
			case ResourcesPackage.PROVENANCE__REASON:
				return getReasons();
			case ResourcesPackage.PROVENANCE__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
			case ResourcesPackage.PROVENANCE__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case ResourcesPackage.PROVENANCE__POLICY:
				return getPolicies();
			case ResourcesPackage.PROVENANCE__AGENT:
				return getAgents();
			case ResourcesPackage.PROVENANCE__ENTITY:
				return getEntities();
			case ResourcesPackage.PROVENANCE__SIGNATURE:
				return getSignatures();
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
			case ResourcesPackage.PROVENANCE__TARGET:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.PROVENANCE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.PROVENANCE__RECORDED:
				setRecorded((Instant)newValue);
				return;
			case ResourcesPackage.PROVENANCE__REASON:
				getReasons().clear();
				getReasons().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.PROVENANCE__ACTIVITY:
				setActivity((Coding)newValue);
				return;
			case ResourcesPackage.PROVENANCE__LOCATION:
				setLocation((Location)newValue);
				return;
			case ResourcesPackage.PROVENANCE__POLICY:
				getPolicies().clear();
				getPolicies().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.PROVENANCE__AGENT:
				getAgents().clear();
				getAgents().addAll((Collection<? extends ProvenanceAgent>)newValue);
				return;
			case ResourcesPackage.PROVENANCE__ENTITY:
				getEntities().clear();
				getEntities().addAll((Collection<? extends ProvenanceEntity>)newValue);
				return;
			case ResourcesPackage.PROVENANCE__SIGNATURE:
				getSignatures().clear();
				getSignatures().addAll((Collection<? extends Signature>)newValue);
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
			case ResourcesPackage.PROVENANCE__TARGET:
				getTargets().clear();
				return;
			case ResourcesPackage.PROVENANCE__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.PROVENANCE__RECORDED:
				setRecorded((Instant)null);
				return;
			case ResourcesPackage.PROVENANCE__REASON:
				getReasons().clear();
				return;
			case ResourcesPackage.PROVENANCE__ACTIVITY:
				setActivity((Coding)null);
				return;
			case ResourcesPackage.PROVENANCE__LOCATION:
				setLocation((Location)null);
				return;
			case ResourcesPackage.PROVENANCE__POLICY:
				getPolicies().clear();
				return;
			case ResourcesPackage.PROVENANCE__AGENT:
				getAgents().clear();
				return;
			case ResourcesPackage.PROVENANCE__ENTITY:
				getEntities().clear();
				return;
			case ResourcesPackage.PROVENANCE__SIGNATURE:
				getSignatures().clear();
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
			case ResourcesPackage.PROVENANCE__TARGET:
				return targets != null && !targets.isEmpty();
			case ResourcesPackage.PROVENANCE__PERIOD:
				return period != null;
			case ResourcesPackage.PROVENANCE__RECORDED:
				return recorded != null;
			case ResourcesPackage.PROVENANCE__REASON:
				return reasons != null && !reasons.isEmpty();
			case ResourcesPackage.PROVENANCE__ACTIVITY:
				return activity != null;
			case ResourcesPackage.PROVENANCE__LOCATION:
				return location != null;
			case ResourcesPackage.PROVENANCE__POLICY:
				return policies != null && !policies.isEmpty();
			case ResourcesPackage.PROVENANCE__AGENT:
				return agents != null && !agents.isEmpty();
			case ResourcesPackage.PROVENANCE__ENTITY:
				return entities != null && !entities.isEmpty();
			case ResourcesPackage.PROVENANCE__SIGNATURE:
				return signatures != null && !signatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvenanceImpl
