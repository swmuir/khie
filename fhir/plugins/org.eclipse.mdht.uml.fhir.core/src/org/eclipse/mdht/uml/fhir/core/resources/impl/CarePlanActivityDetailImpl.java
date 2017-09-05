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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;
import org.eclipse.mdht.uml.fhir.core.resources.CarePlanActivityDetail;
import org.eclipse.mdht.uml.fhir.core.resources.Condition;
import org.eclipse.mdht.uml.fhir.core.resources.Goal;
import org.eclipse.mdht.uml.fhir.core.resources.Location;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Plan Activity Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getGoals <em>Goal</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getProhibited <em>Prohibited</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getScheduledx <em>Scheduledx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getProductx <em>Productx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getDailyAmount <em>Daily Amount</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CarePlanActivityDetailImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarePlanActivityDetailImpl extends BackboneElementImpl implements CarePlanActivityDetail {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

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
	protected EList<Condition> reasonReferences;

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
	 * The cached value of the '{@link #getProhibited() <em>Prohibited</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProhibited()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean prohibited;

	/**
	 * The cached value of the '{@link #getScheduledx() <em>Scheduledx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledx()
	 * @generated
	 * @ordered
	 */
	protected DataType scheduledx;

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
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> performers;

	/**
	 * The cached value of the '{@link #getProductx() <em>Productx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductx()
	 * @generated
	 * @ordered
	 */
	protected Base productx;

	/**
	 * The cached value of the '{@link #getDailyAmount() <em>Daily Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyAmount()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity dailyAmount;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarePlanActivityDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCarePlanActivityDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (CodeableConcept)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CATEGORY, oldCategory, category));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DEFINITION, oldDefinition, definition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DEFINITION, oldDefinition, definition));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_CODE);
		}
		return reasonCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getReasonReferences() {
		if (reasonReferences == null) {
			reasonReferences = new EObjectResolvingEList<Condition>(Condition.class, this, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectResolvingEList<Goal>(Goal.class, this, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__GOAL);
		}
		return goals;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS_REASON, oldStatusReason, statusReason));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS_REASON, oldStatusReason, statusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getProhibited() {
		if (prohibited != null && prohibited.eIsProxy()) {
			InternalEObject oldProhibited = (InternalEObject)prohibited;
			prohibited = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldProhibited);
			if (prohibited != oldProhibited) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PROHIBITED, oldProhibited, prohibited));
			}
		}
		return prohibited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetProhibited() {
		return prohibited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProhibited(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newProhibited) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldProhibited = prohibited;
		prohibited = newProhibited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PROHIBITED, oldProhibited, prohibited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getScheduledx() {
		if (scheduledx != null && scheduledx.eIsProxy()) {
			InternalEObject oldScheduledx = (InternalEObject)scheduledx;
			scheduledx = (DataType)eResolveProxy(oldScheduledx);
			if (scheduledx != oldScheduledx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__SCHEDULEDX, oldScheduledx, scheduledx));
			}
		}
		return scheduledx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetScheduledx() {
		return scheduledx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledx(DataType newScheduledx) {
		DataType oldScheduledx = scheduledx;
		scheduledx = newScheduledx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__SCHEDULEDX, oldScheduledx, scheduledx));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getPerformers() {
		if (performers == null) {
			performers = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getProductx() {
		if (productx != null && productx.eIsProxy()) {
			InternalEObject oldProductx = (InternalEObject)productx;
			productx = (Base)eResolveProxy(oldProductx);
			if (productx != oldProductx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PRODUCTX, oldProductx, productx));
			}
		}
		return productx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetProductx() {
		return productx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductx(Base newProductx) {
		Base oldProductx = productx;
		productx = newProductx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PRODUCTX, oldProductx, productx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getDailyAmount() {
		if (dailyAmount != null && dailyAmount.eIsProxy()) {
			InternalEObject oldDailyAmount = (InternalEObject)dailyAmount;
			dailyAmount = (SimpleQuantity)eResolveProxy(oldDailyAmount);
			if (dailyAmount != oldDailyAmount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DAILY_AMOUNT, oldDailyAmount, dailyAmount));
			}
		}
		return dailyAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetDailyAmount() {
		return dailyAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDailyAmount(SimpleQuantity newDailyAmount) {
		SimpleQuantity oldDailyAmount = dailyAmount;
		dailyAmount = newDailyAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DAILY_AMOUNT, oldDailyAmount, dailyAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getQuantity() {
		if (quantity != null && quantity.eIsProxy()) {
			InternalEObject oldQuantity = (InternalEObject)quantity;
			quantity = (SimpleQuantity)eResolveProxy(oldQuantity);
			if (quantity != oldQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__QUANTITY, oldQuantity, quantity));
			}
		}
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(SimpleQuantity newQuantity) {
		SimpleQuantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__QUANTITY, oldQuantity, quantity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__GOAL:
				return getGoals();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS_REASON:
				if (resolve) return getStatusReason();
				return basicGetStatusReason();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PROHIBITED:
				if (resolve) return getProhibited();
				return basicGetProhibited();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__SCHEDULEDX:
				if (resolve) return getScheduledx();
				return basicGetScheduledx();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PERFORMER:
				return getPerformers();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PRODUCTX:
				if (resolve) return getProductx();
				return basicGetProductx();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DAILY_AMOUNT:
				if (resolve) return getDailyAmount();
				return basicGetDailyAmount();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
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
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DEFINITION:
				setDefinition((Resource)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Condition>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__GOAL:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS_REASON:
				setStatusReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PROHIBITED:
				setProhibited((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__SCHEDULEDX:
				setScheduledx((DataType)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__LOCATION:
				setLocation((Location)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PRODUCTX:
				setProductx((Base)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DAILY_AMOUNT:
				setDailyAmount((SimpleQuantity)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DEFINITION:
				setDefinition((Resource)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__GOAL:
				getGoals().clear();
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS_REASON:
				setStatusReason((CodeableConcept)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PROHIBITED:
				setProhibited((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__SCHEDULEDX:
				setScheduledx((DataType)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__LOCATION:
				setLocation((Location)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PERFORMER:
				getPerformers().clear();
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PRODUCTX:
				setProductx((Base)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DAILY_AMOUNT:
				setDailyAmount((SimpleQuantity)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CATEGORY:
				return category != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DEFINITION:
				return definition != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__CODE:
				return code != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__GOAL:
				return goals != null && !goals.isEmpty();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS:
				return status != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__STATUS_REASON:
				return statusReason != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PROHIBITED:
				return prohibited != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__SCHEDULEDX:
				return scheduledx != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__LOCATION:
				return location != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PERFORMER:
				return performers != null && !performers.isEmpty();
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__PRODUCTX:
				return productx != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DAILY_AMOUNT:
				return dailyAmount != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__QUANTITY:
				return quantity != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
	}

} //CarePlanActivityDetailImpl
