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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.resources.CarePlan;
import org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivity;
import org.eclipse.mdht.uml.fhir.core.resources.CarePlanRelatedPlan;
import org.eclipse.mdht.uml.fhir.core.resources.CareTeam;
import org.eclipse.mdht.uml.fhir.core.resources.Condition;
import org.eclipse.mdht.uml.fhir.core.resources.Goal;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getCareTeams <em>Care Team</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getSupports <em>Support</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getRelatedPlans <em>Related Plan</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getGoals <em>Goal</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getActivities <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanImpl#getNote <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarePlanImpl extends DomainResourceImpl implements CarePlan {
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
	 * The cached value of the '{@link #getCategories() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> categories;

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
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected DateTime modified;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Author</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> authors;

	/**
	 * The cached value of the '{@link #getCareTeams() <em>Care Team</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<CareTeam> careTeams;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> addresses;

	/**
	 * The cached value of the '{@link #getSupports() <em>Support</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupports()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> supports;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Resource definition;

	/**
	 * The cached value of the '{@link #getRelatedPlans() <em>Related Plan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<CarePlanRelatedPlan> relatedPlans;

	/**
	 * The cached value of the '{@link #getGoals() <em>Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goals;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<CarePlanActivity> activities;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected Annotation note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarePlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCarePlan();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.CARE_PLAN__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategories() {
		if (categories == null) {
			categories = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CARE_PLAN__CATEGORY);
		}
		return categories;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN__SUBJECT, oldSubject, subject));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN__CONTEXT, oldContext, context));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN__PERIOD, oldPeriod, period));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getModified() {
		if (modified != null && modified.eIsProxy()) {
			InternalEObject oldModified = (InternalEObject)modified;
			modified = (DateTime)eResolveProxy(oldModified);
			if (modified != oldModified) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN__MODIFIED, oldModified, modified));
			}
		}
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(DateTime newModified) {
		DateTime oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getAuthors() {
		if (authors == null) {
			authors = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.CARE_PLAN__AUTHOR);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CareTeam> getCareTeams() {
		if (careTeams == null) {
			careTeams = new EObjectResolvingEList<CareTeam>(CareTeam.class, this, ResourcesPackage.CARE_PLAN__CARE_TEAM);
		}
		return careTeams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectResolvingEList<Condition>(Condition.class, this, ResourcesPackage.CARE_PLAN__ADDRESSES);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getSupports() {
		if (supports == null) {
			supports = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.CARE_PLAN__SUPPORT);
		}
		return supports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (Resource)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Resource newDefinition) {
		Resource oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarePlanRelatedPlan> getRelatedPlans() {
		if (relatedPlans == null) {
			relatedPlans = new EObjectContainmentEList<CarePlanRelatedPlan>(CarePlanRelatedPlan.class, this, ResourcesPackage.CARE_PLAN__RELATED_PLAN);
		}
		return relatedPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectResolvingEList<Goal>(Goal.class, this, ResourcesPackage.CARE_PLAN__GOAL);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarePlanActivity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<CarePlanActivity>(CarePlanActivity.class, this, ResourcesPackage.CARE_PLAN__ACTIVITY);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getNote() {
		if (note != null && note.eIsProxy()) {
			InternalEObject oldNote = (InternalEObject)note;
			note = (Annotation)eResolveProxy(oldNote);
			if (note != oldNote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN__NOTE, oldNote, note));
			}
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation basicGetNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(Annotation newNote) {
		Annotation oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CARE_PLAN__RELATED_PLAN:
				return ((InternalEList<?>)getRelatedPlans()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CARE_PLAN__ACTIVITY:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CARE_PLAN__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.CARE_PLAN__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.CARE_PLAN__CATEGORY:
				return getCategories();
			case ResourcesPackage.CARE_PLAN__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.CARE_PLAN__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.CARE_PLAN__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ResourcesPackage.CARE_PLAN__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case ResourcesPackage.CARE_PLAN__MODIFIED:
				if (resolve) return getModified();
				return basicGetModified();
			case ResourcesPackage.CARE_PLAN__AUTHOR:
				return getAuthors();
			case ResourcesPackage.CARE_PLAN__CARE_TEAM:
				return getCareTeams();
			case ResourcesPackage.CARE_PLAN__ADDRESSES:
				return getAddresses();
			case ResourcesPackage.CARE_PLAN__SUPPORT:
				return getSupports();
			case ResourcesPackage.CARE_PLAN__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case ResourcesPackage.CARE_PLAN__RELATED_PLAN:
				return getRelatedPlans();
			case ResourcesPackage.CARE_PLAN__GOAL:
				return getGoals();
			case ResourcesPackage.CARE_PLAN__ACTIVITY:
				return getActivities();
			case ResourcesPackage.CARE_PLAN__NOTE:
				if (resolve) return getNote();
				return basicGetNote();
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
			case ResourcesPackage.CARE_PLAN__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__CONTEXT:
				setContext((Resource)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__MODIFIED:
				setModified((DateTime)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__CARE_TEAM:
				getCareTeams().clear();
				getCareTeams().addAll((Collection<? extends CareTeam>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Condition>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__SUPPORT:
				getSupports().clear();
				getSupports().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__DEFINITION:
				setDefinition((Resource)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__RELATED_PLAN:
				getRelatedPlans().clear();
				getRelatedPlans().addAll((Collection<? extends CarePlanRelatedPlan>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__GOAL:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__ACTIVITY:
				getActivities().clear();
				getActivities().addAll((Collection<? extends CarePlanActivity>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN__NOTE:
				setNote((Annotation)newValue);
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
			case ResourcesPackage.CARE_PLAN__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.CARE_PLAN__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CARE_PLAN__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.CARE_PLAN__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CARE_PLAN__SUBJECT:
				setSubject((Resource)null);
				return;
			case ResourcesPackage.CARE_PLAN__CONTEXT:
				setContext((Resource)null);
				return;
			case ResourcesPackage.CARE_PLAN__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.CARE_PLAN__MODIFIED:
				setModified((DateTime)null);
				return;
			case ResourcesPackage.CARE_PLAN__AUTHOR:
				getAuthors().clear();
				return;
			case ResourcesPackage.CARE_PLAN__CARE_TEAM:
				getCareTeams().clear();
				return;
			case ResourcesPackage.CARE_PLAN__ADDRESSES:
				getAddresses().clear();
				return;
			case ResourcesPackage.CARE_PLAN__SUPPORT:
				getSupports().clear();
				return;
			case ResourcesPackage.CARE_PLAN__DEFINITION:
				setDefinition((Resource)null);
				return;
			case ResourcesPackage.CARE_PLAN__RELATED_PLAN:
				getRelatedPlans().clear();
				return;
			case ResourcesPackage.CARE_PLAN__GOAL:
				getGoals().clear();
				return;
			case ResourcesPackage.CARE_PLAN__ACTIVITY:
				getActivities().clear();
				return;
			case ResourcesPackage.CARE_PLAN__NOTE:
				setNote((Annotation)null);
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
			case ResourcesPackage.CARE_PLAN__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.CARE_PLAN__STATUS:
				return status != null;
			case ResourcesPackage.CARE_PLAN__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.CARE_PLAN__DESCRIPTION:
				return description != null;
			case ResourcesPackage.CARE_PLAN__SUBJECT:
				return subject != null;
			case ResourcesPackage.CARE_PLAN__CONTEXT:
				return context != null;
			case ResourcesPackage.CARE_PLAN__PERIOD:
				return period != null;
			case ResourcesPackage.CARE_PLAN__MODIFIED:
				return modified != null;
			case ResourcesPackage.CARE_PLAN__AUTHOR:
				return authors != null && !authors.isEmpty();
			case ResourcesPackage.CARE_PLAN__CARE_TEAM:
				return careTeams != null && !careTeams.isEmpty();
			case ResourcesPackage.CARE_PLAN__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
			case ResourcesPackage.CARE_PLAN__SUPPORT:
				return supports != null && !supports.isEmpty();
			case ResourcesPackage.CARE_PLAN__DEFINITION:
				return definition != null;
			case ResourcesPackage.CARE_PLAN__RELATED_PLAN:
				return relatedPlans != null && !relatedPlans.isEmpty();
			case ResourcesPackage.CARE_PLAN__GOAL:
				return goals != null && !goals.isEmpty();
			case ResourcesPackage.CARE_PLAN__ACTIVITY:
				return activities != null && !activities.isEmpty();
			case ResourcesPackage.CARE_PLAN__NOTE:
				return note != null;
		}
		return super.eIsSet(featureID);
	}

} //CarePlanImpl
