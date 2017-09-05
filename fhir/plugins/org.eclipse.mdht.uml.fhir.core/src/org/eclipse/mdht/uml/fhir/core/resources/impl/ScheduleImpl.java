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
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.Schedule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ScheduleImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ScheduleImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ScheduleImpl#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ScheduleImpl#getServiceTypes <em>Service Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ScheduleImpl#getSpecialties <em>Specialty</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ScheduleImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ScheduleImpl#getPlanningHorizon <em>Planning Horizon</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ScheduleImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduleImpl extends DomainResourceImpl implements Schedule {
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
	 * The cached value of the '{@link #getActive() <em>Active</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean active;

	/**
	 * The cached value of the '{@link #getServiceCategory() <em>Service Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept serviceCategory;

	/**
	 * The cached value of the '{@link #getServiceTypes() <em>Service Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceTypes;

	/**
	 * The cached value of the '{@link #getSpecialties() <em>Specialty</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialties()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialties;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected Resource actor;

	/**
	 * The cached value of the '{@link #getPlanningHorizon() <em>Planning Horizon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanningHorizon()
	 * @generated
	 * @ordered
	 */
	protected Period planningHorizon;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSchedule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.SCHEDULE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getActive() {
		if (active != null && active.eIsProxy()) {
			InternalEObject oldActive = (InternalEObject)active;
			active = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldActive);
			if (active != oldActive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SCHEDULE__ACTIVE, oldActive, active));
			}
		}
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newActive) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SCHEDULE__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getServiceCategory() {
		if (serviceCategory != null && serviceCategory.eIsProxy()) {
			InternalEObject oldServiceCategory = (InternalEObject)serviceCategory;
			serviceCategory = (CodeableConcept)eResolveProxy(oldServiceCategory);
			if (serviceCategory != oldServiceCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SCHEDULE__SERVICE_CATEGORY, oldServiceCategory, serviceCategory));
			}
		}
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetServiceCategory() {
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCategory(CodeableConcept newServiceCategory) {
		CodeableConcept oldServiceCategory = serviceCategory;
		serviceCategory = newServiceCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SCHEDULE__SERVICE_CATEGORY, oldServiceCategory, serviceCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getServiceTypes() {
		if (serviceTypes == null) {
			serviceTypes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SCHEDULE__SERVICE_TYPE);
		}
		return serviceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialties() {
		if (specialties == null) {
			specialties = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SCHEDULE__SPECIALTY);
		}
		return specialties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getActor() {
		if (actor != null && actor.eIsProxy()) {
			InternalEObject oldActor = (InternalEObject)actor;
			actor = (Resource)eResolveProxy(oldActor);
			if (actor != oldActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SCHEDULE__ACTOR, oldActor, actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(Resource newActor) {
		Resource oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SCHEDULE__ACTOR, oldActor, actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPlanningHorizon() {
		if (planningHorizon != null && planningHorizon.eIsProxy()) {
			InternalEObject oldPlanningHorizon = (InternalEObject)planningHorizon;
			planningHorizon = (Period)eResolveProxy(oldPlanningHorizon);
			if (planningHorizon != oldPlanningHorizon) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SCHEDULE__PLANNING_HORIZON, oldPlanningHorizon, planningHorizon));
			}
		}
		return planningHorizon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetPlanningHorizon() {
		return planningHorizon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanningHorizon(Period newPlanningHorizon) {
		Period oldPlanningHorizon = planningHorizon;
		planningHorizon = newPlanningHorizon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SCHEDULE__PLANNING_HORIZON, oldPlanningHorizon, planningHorizon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getComment() {
		if (comment != null && comment.eIsProxy()) {
			InternalEObject oldComment = (InternalEObject)comment;
			comment = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldComment);
			if (comment != oldComment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SCHEDULE__COMMENT, oldComment, comment));
			}
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(org.eclipse.mdht.uml.fhir.core.dataTypes.String newComment) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SCHEDULE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.SCHEDULE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.SCHEDULE__ACTIVE:
				if (resolve) return getActive();
				return basicGetActive();
			case ResourcesPackage.SCHEDULE__SERVICE_CATEGORY:
				if (resolve) return getServiceCategory();
				return basicGetServiceCategory();
			case ResourcesPackage.SCHEDULE__SERVICE_TYPE:
				return getServiceTypes();
			case ResourcesPackage.SCHEDULE__SPECIALTY:
				return getSpecialties();
			case ResourcesPackage.SCHEDULE__ACTOR:
				if (resolve) return getActor();
				return basicGetActor();
			case ResourcesPackage.SCHEDULE__PLANNING_HORIZON:
				if (resolve) return getPlanningHorizon();
				return basicGetPlanningHorizon();
			case ResourcesPackage.SCHEDULE__COMMENT:
				if (resolve) return getComment();
				return basicGetComment();
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
			case ResourcesPackage.SCHEDULE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.SCHEDULE__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.SCHEDULE__SERVICE_CATEGORY:
				setServiceCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SCHEDULE__SERVICE_TYPE:
				getServiceTypes().clear();
				getServiceTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SCHEDULE__SPECIALTY:
				getSpecialties().clear();
				getSpecialties().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SCHEDULE__ACTOR:
				setActor((Resource)newValue);
				return;
			case ResourcesPackage.SCHEDULE__PLANNING_HORIZON:
				setPlanningHorizon((Period)newValue);
				return;
			case ResourcesPackage.SCHEDULE__COMMENT:
				setComment((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.SCHEDULE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.SCHEDULE__ACTIVE:
				setActive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.SCHEDULE__SERVICE_CATEGORY:
				setServiceCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.SCHEDULE__SERVICE_TYPE:
				getServiceTypes().clear();
				return;
			case ResourcesPackage.SCHEDULE__SPECIALTY:
				getSpecialties().clear();
				return;
			case ResourcesPackage.SCHEDULE__ACTOR:
				setActor((Resource)null);
				return;
			case ResourcesPackage.SCHEDULE__PLANNING_HORIZON:
				setPlanningHorizon((Period)null);
				return;
			case ResourcesPackage.SCHEDULE__COMMENT:
				setComment((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.SCHEDULE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.SCHEDULE__ACTIVE:
				return active != null;
			case ResourcesPackage.SCHEDULE__SERVICE_CATEGORY:
				return serviceCategory != null;
			case ResourcesPackage.SCHEDULE__SERVICE_TYPE:
				return serviceTypes != null && !serviceTypes.isEmpty();
			case ResourcesPackage.SCHEDULE__SPECIALTY:
				return specialties != null && !specialties.isEmpty();
			case ResourcesPackage.SCHEDULE__ACTOR:
				return actor != null;
			case ResourcesPackage.SCHEDULE__PLANNING_HORIZON:
				return planningHorizon != null;
			case ResourcesPackage.SCHEDULE__COMMENT:
				return comment != null;
		}
		return super.eIsSet(featureID);
	}

} //ScheduleImpl
