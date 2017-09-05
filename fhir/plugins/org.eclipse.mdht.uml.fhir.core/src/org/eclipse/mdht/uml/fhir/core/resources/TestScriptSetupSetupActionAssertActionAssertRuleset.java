/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Id;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Setup Setup Action Assert Action Assert Ruleset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssertActionAssertRuleset#getRulesetId <em>Ruleset Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssertActionAssertRuleset#getRules <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssertActionAssertRuleset()
 * @model
 * @generated
 */
public interface TestScriptSetupSetupActionAssertActionAssertRuleset extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Ruleset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruleset Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruleset Id</em>' reference.
	 * @see #setRulesetId(Id)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssertActionAssertRuleset_RulesetId()
	 * @model required="true"
	 * @generated
	 */
	Id getRulesetId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssertActionAssertRuleset#getRulesetId <em>Ruleset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruleset Id</em>' reference.
	 * @see #getRulesetId()
	 * @generated
	 */
	void setRulesetId(Id value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssertActionAssertRuleset_Rule()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule> getRules();

} // TestScriptSetupSetupActionAssertActionAssertRuleset
