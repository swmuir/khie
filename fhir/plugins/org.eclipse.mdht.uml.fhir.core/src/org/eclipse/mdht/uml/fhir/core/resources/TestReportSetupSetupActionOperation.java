/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Markdown;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Report Setup Setup Action Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestReportSetupSetupActionOperation#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestReportSetupSetupActionOperation#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestReportSetupSetupActionOperation#getDetail <em>Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestReportSetupSetupActionOperation()
 * @model
 * @generated
 */
public interface TestReportSetupSetupActionOperation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestReportSetupSetupActionOperation_Result()
	 * @model required="true"
	 * @generated
	 */
	Code getResult();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestReportSetupSetupActionOperation#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Code value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(Markdown)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestReportSetupSetupActionOperation_Message()
	 * @model
	 * @generated
	 */
	Markdown getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestReportSetupSetupActionOperation#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Markdown value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' reference.
	 * @see #setDetail(Uri)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestReportSetupSetupActionOperation_Detail()
	 * @model
	 * @generated
	 */
	Uri getDetail();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestReportSetupSetupActionOperation#getDetail <em>Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(Uri value);

} // TestReportSetupSetupActionOperation
