/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Report Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestReportSetup#getActions <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestReportSetup()
 * @model
 * @generated
 */
public interface TestReportSetup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.TestReportSetupSetupAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestReportSetup_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TestReportSetupSetupAction> getActions();

} // TestReportSetup
