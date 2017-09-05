/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Report Teardown Teardown Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestReportTeardownTeardownAction#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestReportTeardownTeardownAction()
 * @model
 * @generated
 */
public interface TestReportTeardownTeardownAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(TestReportSetupSetupActionOperation)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestReportTeardownTeardownAction_Operation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TestReportSetupSetupActionOperation getOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestReportTeardownTeardownAction#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(TestReportSetupSetupActionOperation value);

} // TestReportTeardownTeardownAction
