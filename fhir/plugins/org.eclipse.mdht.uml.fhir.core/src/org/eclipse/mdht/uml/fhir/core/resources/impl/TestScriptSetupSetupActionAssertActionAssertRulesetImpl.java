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
import org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssertActionAssertRuleset;
import org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Setup Setup Action Assert Action Assert Ruleset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertActionAssertRulesetImpl#getRulesetId <em>Ruleset Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertActionAssertRulesetImpl#getRules <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestScriptSetupSetupActionAssertActionAssertRulesetImpl extends BackboneElementImpl implements TestScriptSetupSetupActionAssertActionAssertRuleset {
	/**
	 * The cached value of the '{@link #getRulesetId() <em>Ruleset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulesetId()
	 * @generated
	 * @ordered
	 */
	protected Id rulesetId;

	/**
	 * The cached value of the '{@link #getRules() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptSetupSetupActionAssertActionAssertRulesetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTestScriptSetupSetupActionAssertActionAssertRuleset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getRulesetId() {
		if (rulesetId != null && rulesetId.eIsProxy()) {
			InternalEObject oldRulesetId = (InternalEObject)rulesetId;
			rulesetId = (Id)eResolveProxy(oldRulesetId);
			if (rulesetId != oldRulesetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET__RULESET_ID, oldRulesetId, rulesetId));
			}
		}
		return rulesetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetRulesetId() {
		return rulesetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRulesetId(Id newRulesetId) {
		Id oldRulesetId = rulesetId;
		rulesetId = newRulesetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET__RULESET_ID, oldRulesetId, rulesetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule>(TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule.class, this, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET__RULE);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET__RULE:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET__RULESET_ID:
				if (resolve) return getRulesetId();
				return basicGetRulesetId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET__RULE:
				return getRules();
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET__RULESET_ID:
				setRulesetId((Id)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET__RULE:
				getRules().clear();
				getRules().addAll((Collection<? extends TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule>)newValue);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET__RULESET_ID:
				setRulesetId((Id)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET__RULE:
				getRules().clear();
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET__RULESET_ID:
				return rulesetId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT_ACTION_ASSERT_RULESET__RULE:
				return rules != null && !rules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestScriptSetupSetupActionAssertActionAssertRulesetImpl
