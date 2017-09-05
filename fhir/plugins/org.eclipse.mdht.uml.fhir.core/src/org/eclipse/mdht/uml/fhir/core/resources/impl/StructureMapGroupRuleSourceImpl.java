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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Id;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Map Group Rule Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleSourceImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleSourceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleSourceImpl#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleSourceImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleSourceImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleSourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleSourceImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleSourceImpl#getListMode <em>List Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleSourceImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleSourceImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleSourceImpl#getCheck <em>Check</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureMapGroupRuleSourceImpl extends BackboneElementImpl implements StructureMapGroupRuleSource {
	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean required;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Id context;

	/**
	 * The cached value of the '{@link #getContextType() <em>Context Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextType()
	 * @generated
	 * @ordered
	 */
	protected Code contextType;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String max;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String type;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String element;

	/**
	 * The cached value of the '{@link #getListMode() <em>List Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListMode()
	 * @generated
	 * @ordered
	 */
	protected Code listMode;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Id variable;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String condition;

	/**
	 * The cached value of the '{@link #getCheck() <em>Check</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String check;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureMapGroupRuleSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getStructureMapGroupRuleSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getRequired() {
		if (required != null && required.eIsProxy()) {
			InternalEObject oldRequired = (InternalEObject)required;
			required = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldRequired);
			if (required != oldRequired) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__REQUIRED, oldRequired, required));
			}
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newRequired) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Id)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Id newContext) {
		Id oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getContextType() {
		if (contextType != null && contextType.eIsProxy()) {
			InternalEObject oldContextType = (InternalEObject)contextType;
			contextType = (Code)eResolveProxy(oldContextType);
			if (contextType != oldContextType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT_TYPE, oldContextType, contextType));
			}
		}
		return contextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetContextType() {
		return contextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextType(Code newContextType) {
		Code oldContextType = contextType;
		contextType = newContextType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT_TYPE, oldContextType, contextType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getMin() {
		if (min != null && min.eIsProxy()) {
			InternalEObject oldMin = (InternalEObject)min;
			min = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldMin);
			if (min != oldMin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MIN, oldMin, min));
			}
		}
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newMin) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getMax() {
		if (max != null && max.eIsProxy()) {
			InternalEObject oldMax = (InternalEObject)max;
			max = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldMax);
			if (max != oldMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MAX, oldMax, max));
			}
		}
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(org.eclipse.mdht.uml.fhir.core.dataTypes.String newMax) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(org.eclipse.mdht.uml.fhir.core.dataTypes.String newType) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(org.eclipse.mdht.uml.fhir.core.dataTypes.String newElement) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getListMode() {
		if (listMode != null && listMode.eIsProxy()) {
			InternalEObject oldListMode = (InternalEObject)listMode;
			listMode = (Code)eResolveProxy(oldListMode);
			if (listMode != oldListMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LIST_MODE, oldListMode, listMode));
			}
		}
		return listMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetListMode() {
		return listMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListMode(Code newListMode) {
		Code oldListMode = listMode;
		listMode = newListMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LIST_MODE, oldListMode, listMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Id)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Id newVariable) {
		Id oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject)condition;
			condition = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(org.eclipse.mdht.uml.fhir.core.dataTypes.String newCondition) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getCheck() {
		if (check != null && check.eIsProxy()) {
			InternalEObject oldCheck = (InternalEObject)check;
			check = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldCheck);
			if (check != oldCheck) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CHECK, oldCheck, check));
			}
		}
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetCheck() {
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheck(org.eclipse.mdht.uml.fhir.core.dataTypes.String newCheck) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldCheck = check;
		check = newCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CHECK, oldCheck, check));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__REQUIRED:
				if (resolve) return getRequired();
				return basicGetRequired();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT_TYPE:
				if (resolve) return getContextType();
				return basicGetContextType();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MIN:
				if (resolve) return getMin();
				return basicGetMin();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MAX:
				if (resolve) return getMax();
				return basicGetMax();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LIST_MODE:
				if (resolve) return getListMode();
				return basicGetListMode();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CHECK:
				if (resolve) return getCheck();
				return basicGetCheck();
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__REQUIRED:
				setRequired((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT:
				setContext((Id)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT_TYPE:
				setContextType((Code)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MIN:
				setMin((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MAX:
				setMax((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__TYPE:
				setType((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__ELEMENT:
				setElement((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LIST_MODE:
				setListMode((Code)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__VARIABLE:
				setVariable((Id)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONDITION:
				setCondition((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CHECK:
				setCheck((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__REQUIRED:
				setRequired((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT:
				setContext((Id)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT_TYPE:
				setContextType((Code)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MIN:
				setMin((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MAX:
				setMax((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__TYPE:
				setType((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__ELEMENT:
				setElement((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LIST_MODE:
				setListMode((Code)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__VARIABLE:
				setVariable((Id)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONDITION:
				setCondition((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CHECK:
				setCheck((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__REQUIRED:
				return required != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT:
				return context != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT_TYPE:
				return contextType != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MIN:
				return min != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MAX:
				return max != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__TYPE:
				return type != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__ELEMENT:
				return element != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LIST_MODE:
				return listMode != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__VARIABLE:
				return variable != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONDITION:
				return condition != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CHECK:
				return check != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureMapGroupRuleSourceImpl
