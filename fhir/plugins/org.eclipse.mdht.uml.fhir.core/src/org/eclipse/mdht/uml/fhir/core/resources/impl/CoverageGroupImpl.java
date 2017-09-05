/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.CoverageGroup;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageGroupImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageGroupImpl#getGroupDisplay <em>Group Display</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageGroupImpl#getSubGroup <em>Sub Group</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageGroupImpl#getSubGroupDisplay <em>Sub Group Display</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageGroupImpl#getPlan <em>Plan</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageGroupImpl#getPlanDisplay <em>Plan Display</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageGroupImpl#getSubPlan <em>Sub Plan</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageGroupImpl#getSubPlanDisplay <em>Sub Plan Display</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageGroupImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageGroupImpl#getClassDisplay <em>Class Display</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageGroupImpl#getSubClass <em>Sub Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CoverageGroupImpl#getSubClassDisplay <em>Sub Class Display</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoverageGroupImpl extends BackboneElementImpl implements CoverageGroup {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String group;

	/**
	 * The cached value of the '{@link #getGroupDisplay() <em>Group Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String groupDisplay;

	/**
	 * The cached value of the '{@link #getSubGroup() <em>Sub Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGroup()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String subGroup;

	/**
	 * The cached value of the '{@link #getSubGroupDisplay() <em>Sub Group Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGroupDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String subGroupDisplay;

	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String plan;

	/**
	 * The cached value of the '{@link #getPlanDisplay() <em>Plan Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String planDisplay;

	/**
	 * The cached value of the '{@link #getSubPlan() <em>Sub Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPlan()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String subPlan;

	/**
	 * The cached value of the '{@link #getSubPlanDisplay() <em>Sub Plan Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPlanDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String subPlanDisplay;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String class_;

	/**
	 * The cached value of the '{@link #getClassDisplay() <em>Class Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String classDisplay;

	/**
	 * The cached value of the '{@link #getSubClass() <em>Sub Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClass()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String subClass;

	/**
	 * The cached value of the '{@link #getSubClassDisplay() <em>Sub Class Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String subClassDisplay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCoverageGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE_GROUP__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(org.eclipse.mdht.uml.fhir.core.dataTypes.String newGroup) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_GROUP__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getGroupDisplay() {
		if (groupDisplay != null && groupDisplay.eIsProxy()) {
			InternalEObject oldGroupDisplay = (InternalEObject)groupDisplay;
			groupDisplay = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldGroupDisplay);
			if (groupDisplay != oldGroupDisplay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE_GROUP__GROUP_DISPLAY, oldGroupDisplay, groupDisplay));
			}
		}
		return groupDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetGroupDisplay() {
		return groupDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupDisplay(org.eclipse.mdht.uml.fhir.core.dataTypes.String newGroupDisplay) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldGroupDisplay = groupDisplay;
		groupDisplay = newGroupDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_GROUP__GROUP_DISPLAY, oldGroupDisplay, groupDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getSubGroup() {
		if (subGroup != null && subGroup.eIsProxy()) {
			InternalEObject oldSubGroup = (InternalEObject)subGroup;
			subGroup = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldSubGroup);
			if (subGroup != oldSubGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE_GROUP__SUB_GROUP, oldSubGroup, subGroup));
			}
		}
		return subGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetSubGroup() {
		return subGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubGroup(org.eclipse.mdht.uml.fhir.core.dataTypes.String newSubGroup) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldSubGroup = subGroup;
		subGroup = newSubGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_GROUP__SUB_GROUP, oldSubGroup, subGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getSubGroupDisplay() {
		if (subGroupDisplay != null && subGroupDisplay.eIsProxy()) {
			InternalEObject oldSubGroupDisplay = (InternalEObject)subGroupDisplay;
			subGroupDisplay = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldSubGroupDisplay);
			if (subGroupDisplay != oldSubGroupDisplay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE_GROUP__SUB_GROUP_DISPLAY, oldSubGroupDisplay, subGroupDisplay));
			}
		}
		return subGroupDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetSubGroupDisplay() {
		return subGroupDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubGroupDisplay(org.eclipse.mdht.uml.fhir.core.dataTypes.String newSubGroupDisplay) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldSubGroupDisplay = subGroupDisplay;
		subGroupDisplay = newSubGroupDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_GROUP__SUB_GROUP_DISPLAY, oldSubGroupDisplay, subGroupDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getPlan() {
		if (plan != null && plan.eIsProxy()) {
			InternalEObject oldPlan = (InternalEObject)plan;
			plan = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldPlan);
			if (plan != oldPlan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE_GROUP__PLAN, oldPlan, plan));
			}
		}
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetPlan() {
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan(org.eclipse.mdht.uml.fhir.core.dataTypes.String newPlan) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldPlan = plan;
		plan = newPlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_GROUP__PLAN, oldPlan, plan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getPlanDisplay() {
		if (planDisplay != null && planDisplay.eIsProxy()) {
			InternalEObject oldPlanDisplay = (InternalEObject)planDisplay;
			planDisplay = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldPlanDisplay);
			if (planDisplay != oldPlanDisplay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE_GROUP__PLAN_DISPLAY, oldPlanDisplay, planDisplay));
			}
		}
		return planDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetPlanDisplay() {
		return planDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanDisplay(org.eclipse.mdht.uml.fhir.core.dataTypes.String newPlanDisplay) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldPlanDisplay = planDisplay;
		planDisplay = newPlanDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_GROUP__PLAN_DISPLAY, oldPlanDisplay, planDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getSubPlan() {
		if (subPlan != null && subPlan.eIsProxy()) {
			InternalEObject oldSubPlan = (InternalEObject)subPlan;
			subPlan = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldSubPlan);
			if (subPlan != oldSubPlan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE_GROUP__SUB_PLAN, oldSubPlan, subPlan));
			}
		}
		return subPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetSubPlan() {
		return subPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubPlan(org.eclipse.mdht.uml.fhir.core.dataTypes.String newSubPlan) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldSubPlan = subPlan;
		subPlan = newSubPlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_GROUP__SUB_PLAN, oldSubPlan, subPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getSubPlanDisplay() {
		if (subPlanDisplay != null && subPlanDisplay.eIsProxy()) {
			InternalEObject oldSubPlanDisplay = (InternalEObject)subPlanDisplay;
			subPlanDisplay = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldSubPlanDisplay);
			if (subPlanDisplay != oldSubPlanDisplay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE_GROUP__SUB_PLAN_DISPLAY, oldSubPlanDisplay, subPlanDisplay));
			}
		}
		return subPlanDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetSubPlanDisplay() {
		return subPlanDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubPlanDisplay(org.eclipse.mdht.uml.fhir.core.dataTypes.String newSubPlanDisplay) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldSubPlanDisplay = subPlanDisplay;
		subPlanDisplay = newSubPlanDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_GROUP__SUB_PLAN_DISPLAY, oldSubPlanDisplay, subPlanDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE_GROUP__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_(org.eclipse.mdht.uml.fhir.core.dataTypes.String newClass) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_GROUP__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getClassDisplay() {
		if (classDisplay != null && classDisplay.eIsProxy()) {
			InternalEObject oldClassDisplay = (InternalEObject)classDisplay;
			classDisplay = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldClassDisplay);
			if (classDisplay != oldClassDisplay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE_GROUP__CLASS_DISPLAY, oldClassDisplay, classDisplay));
			}
		}
		return classDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetClassDisplay() {
		return classDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassDisplay(org.eclipse.mdht.uml.fhir.core.dataTypes.String newClassDisplay) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldClassDisplay = classDisplay;
		classDisplay = newClassDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_GROUP__CLASS_DISPLAY, oldClassDisplay, classDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getSubClass() {
		if (subClass != null && subClass.eIsProxy()) {
			InternalEObject oldSubClass = (InternalEObject)subClass;
			subClass = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldSubClass);
			if (subClass != oldSubClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE_GROUP__SUB_CLASS, oldSubClass, subClass));
			}
		}
		return subClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetSubClass() {
		return subClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubClass(org.eclipse.mdht.uml.fhir.core.dataTypes.String newSubClass) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldSubClass = subClass;
		subClass = newSubClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_GROUP__SUB_CLASS, oldSubClass, subClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getSubClassDisplay() {
		if (subClassDisplay != null && subClassDisplay.eIsProxy()) {
			InternalEObject oldSubClassDisplay = (InternalEObject)subClassDisplay;
			subClassDisplay = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldSubClassDisplay);
			if (subClassDisplay != oldSubClassDisplay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COVERAGE_GROUP__SUB_CLASS_DISPLAY, oldSubClassDisplay, subClassDisplay));
			}
		}
		return subClassDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetSubClassDisplay() {
		return subClassDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubClassDisplay(org.eclipse.mdht.uml.fhir.core.dataTypes.String newSubClassDisplay) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldSubClassDisplay = subClassDisplay;
		subClassDisplay = newSubClassDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_GROUP__SUB_CLASS_DISPLAY, oldSubClassDisplay, subClassDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.COVERAGE_GROUP__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case ResourcesPackage.COVERAGE_GROUP__GROUP_DISPLAY:
				if (resolve) return getGroupDisplay();
				return basicGetGroupDisplay();
			case ResourcesPackage.COVERAGE_GROUP__SUB_GROUP:
				if (resolve) return getSubGroup();
				return basicGetSubGroup();
			case ResourcesPackage.COVERAGE_GROUP__SUB_GROUP_DISPLAY:
				if (resolve) return getSubGroupDisplay();
				return basicGetSubGroupDisplay();
			case ResourcesPackage.COVERAGE_GROUP__PLAN:
				if (resolve) return getPlan();
				return basicGetPlan();
			case ResourcesPackage.COVERAGE_GROUP__PLAN_DISPLAY:
				if (resolve) return getPlanDisplay();
				return basicGetPlanDisplay();
			case ResourcesPackage.COVERAGE_GROUP__SUB_PLAN:
				if (resolve) return getSubPlan();
				return basicGetSubPlan();
			case ResourcesPackage.COVERAGE_GROUP__SUB_PLAN_DISPLAY:
				if (resolve) return getSubPlanDisplay();
				return basicGetSubPlanDisplay();
			case ResourcesPackage.COVERAGE_GROUP__CLASS:
				if (resolve) return getClass_();
				return basicGetClass_();
			case ResourcesPackage.COVERAGE_GROUP__CLASS_DISPLAY:
				if (resolve) return getClassDisplay();
				return basicGetClassDisplay();
			case ResourcesPackage.COVERAGE_GROUP__SUB_CLASS:
				if (resolve) return getSubClass();
				return basicGetSubClass();
			case ResourcesPackage.COVERAGE_GROUP__SUB_CLASS_DISPLAY:
				if (resolve) return getSubClassDisplay();
				return basicGetSubClassDisplay();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.COVERAGE_GROUP__GROUP:
				setGroup((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE_GROUP__GROUP_DISPLAY:
				setGroupDisplay((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE_GROUP__SUB_GROUP:
				setSubGroup((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE_GROUP__SUB_GROUP_DISPLAY:
				setSubGroupDisplay((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE_GROUP__PLAN:
				setPlan((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE_GROUP__PLAN_DISPLAY:
				setPlanDisplay((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE_GROUP__SUB_PLAN:
				setSubPlan((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE_GROUP__SUB_PLAN_DISPLAY:
				setSubPlanDisplay((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE_GROUP__CLASS:
				setClass_((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE_GROUP__CLASS_DISPLAY:
				setClassDisplay((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE_GROUP__SUB_CLASS:
				setSubClass((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE_GROUP__SUB_CLASS_DISPLAY:
				setSubClassDisplay((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.COVERAGE_GROUP__GROUP:
				setGroup((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE_GROUP__GROUP_DISPLAY:
				setGroupDisplay((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE_GROUP__SUB_GROUP:
				setSubGroup((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE_GROUP__SUB_GROUP_DISPLAY:
				setSubGroupDisplay((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE_GROUP__PLAN:
				setPlan((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE_GROUP__PLAN_DISPLAY:
				setPlanDisplay((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE_GROUP__SUB_PLAN:
				setSubPlan((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE_GROUP__SUB_PLAN_DISPLAY:
				setSubPlanDisplay((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE_GROUP__CLASS:
				setClass_((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE_GROUP__CLASS_DISPLAY:
				setClassDisplay((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE_GROUP__SUB_CLASS:
				setSubClass((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE_GROUP__SUB_CLASS_DISPLAY:
				setSubClassDisplay((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.COVERAGE_GROUP__GROUP:
				return group != null;
			case ResourcesPackage.COVERAGE_GROUP__GROUP_DISPLAY:
				return groupDisplay != null;
			case ResourcesPackage.COVERAGE_GROUP__SUB_GROUP:
				return subGroup != null;
			case ResourcesPackage.COVERAGE_GROUP__SUB_GROUP_DISPLAY:
				return subGroupDisplay != null;
			case ResourcesPackage.COVERAGE_GROUP__PLAN:
				return plan != null;
			case ResourcesPackage.COVERAGE_GROUP__PLAN_DISPLAY:
				return planDisplay != null;
			case ResourcesPackage.COVERAGE_GROUP__SUB_PLAN:
				return subPlan != null;
			case ResourcesPackage.COVERAGE_GROUP__SUB_PLAN_DISPLAY:
				return subPlanDisplay != null;
			case ResourcesPackage.COVERAGE_GROUP__CLASS:
				return class_ != null;
			case ResourcesPackage.COVERAGE_GROUP__CLASS_DISPLAY:
				return classDisplay != null;
			case ResourcesPackage.COVERAGE_GROUP__SUB_CLASS:
				return subClass != null;
			case ResourcesPackage.COVERAGE_GROUP__SUB_CLASS_DISPLAY:
				return subClassDisplay != null;
		}
		return super.eIsSet(featureID);
	}

} //CoverageGroupImpl
