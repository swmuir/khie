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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Id;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.TestScriptRulesetRulesetRule;
import org.eclipse.mdht.uml.fhir.core.resources.TestScriptRulesetRulesetRuleRulesetRuleParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Ruleset Ruleset Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptRulesetRulesetRuleImpl#getRuleId <em>Rule Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptRulesetRulesetRuleImpl#getParams <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestScriptRulesetRulesetRuleImpl extends BackboneElementImpl implements TestScriptRulesetRulesetRule {
	/**
	 * The cached value of the '{@link #getRuleId() <em>Rule Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleId()
	 * @generated
	 * @ordered
	 */
	protected Id ruleId;

	/**
	 * The cached value of the '{@link #getParams() <em>Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptRulesetRulesetRuleRulesetRuleParam> params;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptRulesetRulesetRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTestScriptRulesetRulesetRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getRuleId() {
		if (ruleId != null && ruleId.eIsProxy()) {
			InternalEObject oldRuleId = (InternalEObject)ruleId;
			ruleId = (Id)eResolveProxy(oldRuleId);
			if (ruleId != oldRuleId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE__RULE_ID, oldRuleId, ruleId));
			}
		}
		return ruleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetRuleId() {
		return ruleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleId(Id newRuleId) {
		Id oldRuleId = ruleId;
		ruleId = newRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE__RULE_ID, oldRuleId, ruleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptRulesetRulesetRuleRulesetRuleParam> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<TestScriptRulesetRulesetRuleRulesetRuleParam>(TestScriptRulesetRulesetRuleRulesetRuleParam.class, this, ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE__PARAM);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE__PARAM:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE__RULE_ID:
				if (resolve) return getRuleId();
				return basicGetRuleId();
			case ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE__PARAM:
				return getParams();
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
			case ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE__RULE_ID:
				setRuleId((Id)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE__PARAM:
				getParams().clear();
				getParams().addAll((Collection<? extends TestScriptRulesetRulesetRuleRulesetRuleParam>)newValue);
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
			case ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE__RULE_ID:
				setRuleId((Id)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE__PARAM:
				getParams().clear();
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
			case ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE__RULE_ID:
				return ruleId != null;
			case ResourcesPackage.TEST_SCRIPT_RULESET_RULESET_RULE__PARAM:
				return params != null && !params.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestScriptRulesetRulesetRuleImpl
