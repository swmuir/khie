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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Id;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget;
import org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTargetParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Map Group Rule Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleTargetImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleTargetImpl#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleTargetImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleTargetImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleTargetImpl#getListModes <em>List Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleTargetImpl#getListRuleId <em>List Rule Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleTargetImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleTargetImpl#getParameters <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureMapGroupRuleTargetImpl extends BackboneElementImpl implements StructureMapGroupRuleTarget {
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
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String element;

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
	 * The cached value of the '{@link #getListModes() <em>List Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> listModes;

	/**
	 * The cached value of the '{@link #getListRuleId() <em>List Rule Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListRuleId()
	 * @generated
	 * @ordered
	 */
	protected Id listRuleId;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected Code transform;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapGroupRuleTargetParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureMapGroupRuleTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getStructureMapGroupRuleTarget();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT, oldContext, context));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT_TYPE, oldContextType, contextType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT_TYPE, oldContextType, contextType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__ELEMENT, oldElement, element));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__ELEMENT, oldElement, element));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__VARIABLE, oldVariable, variable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getListModes() {
		if (listModes == null) {
			listModes = new EObjectResolvingEList<Code>(Code.class, this, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_MODE);
		}
		return listModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getListRuleId() {
		if (listRuleId != null && listRuleId.eIsProxy()) {
			InternalEObject oldListRuleId = (InternalEObject)listRuleId;
			listRuleId = (Id)eResolveProxy(oldListRuleId);
			if (listRuleId != oldListRuleId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_RULE_ID, oldListRuleId, listRuleId));
			}
		}
		return listRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetListRuleId() {
		return listRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListRuleId(Id newListRuleId) {
		Id oldListRuleId = listRuleId;
		listRuleId = newListRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_RULE_ID, oldListRuleId, listRuleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getTransform() {
		if (transform != null && transform.eIsProxy()) {
			InternalEObject oldTransform = (InternalEObject)transform;
			transform = (Code)eResolveProxy(oldTransform);
			if (transform != oldTransform) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__TRANSFORM, oldTransform, transform));
			}
		}
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(Code newTransform) {
		Code oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__TRANSFORM, oldTransform, transform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapGroupRuleTargetParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<StructureMapGroupRuleTargetParameter>(StructureMapGroupRuleTargetParameter.class, this, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__PARAMETER);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__PARAMETER:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT_TYPE:
				if (resolve) return getContextType();
				return basicGetContextType();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_MODE:
				return getListModes();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_RULE_ID:
				if (resolve) return getListRuleId();
				return basicGetListRuleId();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__TRANSFORM:
				if (resolve) return getTransform();
				return basicGetTransform();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__PARAMETER:
				return getParameters();
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT:
				setContext((Id)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT_TYPE:
				setContextType((Code)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__ELEMENT:
				setElement((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__VARIABLE:
				setVariable((Id)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_MODE:
				getListModes().clear();
				getListModes().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_RULE_ID:
				setListRuleId((Id)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__TRANSFORM:
				setTransform((Code)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection<? extends StructureMapGroupRuleTargetParameter>)newValue);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT:
				setContext((Id)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT_TYPE:
				setContextType((Code)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__ELEMENT:
				setElement((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__VARIABLE:
				setVariable((Id)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_MODE:
				getListModes().clear();
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_RULE_ID:
				setListRuleId((Id)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__TRANSFORM:
				setTransform((Code)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__PARAMETER:
				getParameters().clear();
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT:
				return context != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT_TYPE:
				return contextType != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__ELEMENT:
				return element != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__VARIABLE:
				return variable != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_MODE:
				return listModes != null && !listModes.isEmpty();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_RULE_ID:
				return listRuleId != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__TRANSFORM:
				return transform != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__PARAMETER:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructureMapGroupRuleTargetImpl
