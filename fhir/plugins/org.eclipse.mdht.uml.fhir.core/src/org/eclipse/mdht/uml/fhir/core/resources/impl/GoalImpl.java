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
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Date;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.Goal;
import org.eclipse.mdht.uml.fhir.core.resources.GoalOutcome;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GoalImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GoalImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GoalImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GoalImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GoalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GoalImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GoalImpl#getStartx <em>Startx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GoalImpl#getTargetx <em>Targetx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GoalImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GoalImpl#getStatusReasons <em>Status Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GoalImpl#getExpressedBy <em>Expressed By</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GoalImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GoalImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.GoalImpl#getOutcomes <em>Outcome</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalImpl extends DomainResourceImpl implements Goal {
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
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept description;

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
	 * The cached value of the '{@link #getStartx() <em>Startx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartx()
	 * @generated
	 * @ordered
	 */
	protected DataType startx;

	/**
	 * The cached value of the '{@link #getTargetx() <em>Targetx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetx()
	 * @generated
	 * @ordered
	 */
	protected DataType targetx;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected Date statusDate;

	/**
	 * The cached value of the '{@link #getStatusReasons() <em>Status Reason</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> statusReasons;

	/**
	 * The cached value of the '{@link #getExpressedBy() <em>Expressed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressedBy()
	 * @generated
	 * @ordered
	 */
	protected Resource expressedBy;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> addresses;

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
	 * The cached value of the '{@link #getOutcomes() <em>Outcome</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomes()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalOutcome> outcomes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getGoal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.GOAL__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GOAL__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategories() {
		if (categories == null) {
			categories = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.GOAL__CATEGORY);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPriority() {
		if (priority != null && priority.eIsProxy()) {
			InternalEObject oldPriority = (InternalEObject)priority;
			priority = (CodeableConcept)eResolveProxy(oldPriority);
			if (priority != oldPriority) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GOAL__PRIORITY, oldPriority, priority));
			}
		}
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(CodeableConcept newPriority) {
		CodeableConcept oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (CodeableConcept)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GOAL__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(CodeableConcept newDescription) {
		CodeableConcept oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GOAL__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getStartx() {
		if (startx != null && startx.eIsProxy()) {
			InternalEObject oldStartx = (InternalEObject)startx;
			startx = (DataType)eResolveProxy(oldStartx);
			if (startx != oldStartx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GOAL__STARTX, oldStartx, startx));
			}
		}
		return startx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetStartx() {
		return startx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartx(DataType newStartx) {
		DataType oldStartx = startx;
		startx = newStartx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__STARTX, oldStartx, startx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getTargetx() {
		if (targetx != null && targetx.eIsProxy()) {
			InternalEObject oldTargetx = (InternalEObject)targetx;
			targetx = (DataType)eResolveProxy(oldTargetx);
			if (targetx != oldTargetx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GOAL__TARGETX, oldTargetx, targetx));
			}
		}
		return targetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetTargetx() {
		return targetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetx(DataType newTargetx) {
		DataType oldTargetx = targetx;
		targetx = newTargetx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__TARGETX, oldTargetx, targetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStatusDate() {
		if (statusDate != null && statusDate.eIsProxy()) {
			InternalEObject oldStatusDate = (InternalEObject)statusDate;
			statusDate = (Date)eResolveProxy(oldStatusDate);
			if (statusDate != oldStatusDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GOAL__STATUS_DATE, oldStatusDate, statusDate));
			}
		}
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDate(Date newStatusDate) {
		Date oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__STATUS_DATE, oldStatusDate, statusDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getStatusReasons() {
		if (statusReasons == null) {
			statusReasons = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.GOAL__STATUS_REASON);
		}
		return statusReasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getExpressedBy() {
		if (expressedBy != null && expressedBy.eIsProxy()) {
			InternalEObject oldExpressedBy = (InternalEObject)expressedBy;
			expressedBy = (Resource)eResolveProxy(oldExpressedBy);
			if (expressedBy != oldExpressedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.GOAL__EXPRESSED_BY, oldExpressedBy, expressedBy));
			}
		}
		return expressedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetExpressedBy() {
		return expressedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressedBy(Resource newExpressedBy) {
		Resource oldExpressedBy = expressedBy;
		expressedBy = newExpressedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GOAL__EXPRESSED_BY, oldExpressedBy, expressedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.GOAL__ADDRESSES);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.GOAL__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalOutcome> getOutcomes() {
		if (outcomes == null) {
			outcomes = new EObjectContainmentEList<GoalOutcome>(GoalOutcome.class, this, ResourcesPackage.GOAL__OUTCOME);
		}
		return outcomes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.GOAL__OUTCOME:
				return ((InternalEList<?>)getOutcomes()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.GOAL__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.GOAL__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.GOAL__CATEGORY:
				return getCategories();
			case ResourcesPackage.GOAL__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
			case ResourcesPackage.GOAL__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.GOAL__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.GOAL__STARTX:
				if (resolve) return getStartx();
				return basicGetStartx();
			case ResourcesPackage.GOAL__TARGETX:
				if (resolve) return getTargetx();
				return basicGetTargetx();
			case ResourcesPackage.GOAL__STATUS_DATE:
				if (resolve) return getStatusDate();
				return basicGetStatusDate();
			case ResourcesPackage.GOAL__STATUS_REASON:
				return getStatusReasons();
			case ResourcesPackage.GOAL__EXPRESSED_BY:
				if (resolve) return getExpressedBy();
				return basicGetExpressedBy();
			case ResourcesPackage.GOAL__ADDRESSES:
				return getAddresses();
			case ResourcesPackage.GOAL__NOTE:
				return getNotes();
			case ResourcesPackage.GOAL__OUTCOME:
				return getOutcomes();
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
			case ResourcesPackage.GOAL__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.GOAL__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.GOAL__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.GOAL__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case ResourcesPackage.GOAL__DESCRIPTION:
				setDescription((CodeableConcept)newValue);
				return;
			case ResourcesPackage.GOAL__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case ResourcesPackage.GOAL__STARTX:
				setStartx((DataType)newValue);
				return;
			case ResourcesPackage.GOAL__TARGETX:
				setTargetx((DataType)newValue);
				return;
			case ResourcesPackage.GOAL__STATUS_DATE:
				setStatusDate((Date)newValue);
				return;
			case ResourcesPackage.GOAL__STATUS_REASON:
				getStatusReasons().clear();
				getStatusReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.GOAL__EXPRESSED_BY:
				setExpressedBy((Resource)newValue);
				return;
			case ResourcesPackage.GOAL__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.GOAL__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.GOAL__OUTCOME:
				getOutcomes().clear();
				getOutcomes().addAll((Collection<? extends GoalOutcome>)newValue);
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
			case ResourcesPackage.GOAL__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.GOAL__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.GOAL__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.GOAL__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case ResourcesPackage.GOAL__DESCRIPTION:
				setDescription((CodeableConcept)null);
				return;
			case ResourcesPackage.GOAL__SUBJECT:
				setSubject((Resource)null);
				return;
			case ResourcesPackage.GOAL__STARTX:
				setStartx((DataType)null);
				return;
			case ResourcesPackage.GOAL__TARGETX:
				setTargetx((DataType)null);
				return;
			case ResourcesPackage.GOAL__STATUS_DATE:
				setStatusDate((Date)null);
				return;
			case ResourcesPackage.GOAL__STATUS_REASON:
				getStatusReasons().clear();
				return;
			case ResourcesPackage.GOAL__EXPRESSED_BY:
				setExpressedBy((Resource)null);
				return;
			case ResourcesPackage.GOAL__ADDRESSES:
				getAddresses().clear();
				return;
			case ResourcesPackage.GOAL__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.GOAL__OUTCOME:
				getOutcomes().clear();
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
			case ResourcesPackage.GOAL__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.GOAL__STATUS:
				return status != null;
			case ResourcesPackage.GOAL__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.GOAL__PRIORITY:
				return priority != null;
			case ResourcesPackage.GOAL__DESCRIPTION:
				return description != null;
			case ResourcesPackage.GOAL__SUBJECT:
				return subject != null;
			case ResourcesPackage.GOAL__STARTX:
				return startx != null;
			case ResourcesPackage.GOAL__TARGETX:
				return targetx != null;
			case ResourcesPackage.GOAL__STATUS_DATE:
				return statusDate != null;
			case ResourcesPackage.GOAL__STATUS_REASON:
				return statusReasons != null && !statusReasons.isEmpty();
			case ResourcesPackage.GOAL__EXPRESSED_BY:
				return expressedBy != null;
			case ResourcesPackage.GOAL__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
			case ResourcesPackage.GOAL__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.GOAL__OUTCOME:
				return outcomes != null && !outcomes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
