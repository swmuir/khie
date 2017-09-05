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
 * A representation of the model object '<em><b>Test Script Setup Setup Action Assert Action Assert Ruleset Action Assert Ruleset Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule#getRuleId <em>Rule Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule#getParams <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule()
 * @model
 * @generated
 */
public interface TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Rule Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Id</em>' reference.
	 * @see #setRuleId(Id)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule_RuleId()
	 * @model required="true"
	 * @generated
	 */
	Id getRuleId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule#getRuleId <em>Rule Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Id</em>' reference.
	 * @see #getRuleId()
	 * @generated
	 */
	void setRuleId(Id value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule_Param()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRuleParam> getParams();

} // TestScriptSetupSetupActionAssertActionAssertRulesetActionAssertRulesetRule
