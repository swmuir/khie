/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Id;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Setup Setup Action Assert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getCompareToSourceId <em>Compare To Source Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getCompareToSourceExpression <em>Compare To Source Expression</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getCompareToSourcePath <em>Compare To Source Path</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getHeaderField <em>Header Field</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getMinimumId <em>Minimum Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getNavigationLinks <em>Navigation Links</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getRequestUrl <em>Request Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getResponse <em>Response</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getRule <em>Rule</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getValidateProfileId <em>Validate Profile Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getWarningOnly <em>Warning Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert()
 * @model
 * @generated
 */
public interface TestScriptSetupSetupActionAssert extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Label()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Description()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' reference.
	 * @see #setDirection(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Direction()
	 * @model
	 * @generated
	 */
	Code getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getDirection <em>Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Code value);

	/**
	 * Returns the value of the '<em><b>Compare To Source Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compare To Source Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare To Source Id</em>' reference.
	 * @see #setCompareToSourceId(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_CompareToSourceId()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getCompareToSourceId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getCompareToSourceId <em>Compare To Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare To Source Id</em>' reference.
	 * @see #getCompareToSourceId()
	 * @generated
	 */
	void setCompareToSourceId(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Compare To Source Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compare To Source Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare To Source Expression</em>' reference.
	 * @see #setCompareToSourceExpression(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_CompareToSourceExpression()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getCompareToSourceExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getCompareToSourceExpression <em>Compare To Source Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare To Source Expression</em>' reference.
	 * @see #getCompareToSourceExpression()
	 * @generated
	 */
	void setCompareToSourceExpression(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Compare To Source Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compare To Source Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare To Source Path</em>' reference.
	 * @see #setCompareToSourcePath(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_CompareToSourcePath()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getCompareToSourcePath();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getCompareToSourcePath <em>Compare To Source Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare To Source Path</em>' reference.
	 * @see #getCompareToSourcePath()
	 * @generated
	 */
	void setCompareToSourcePath(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' reference.
	 * @see #setContentType(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_ContentType()
	 * @model
	 * @generated
	 */
	Code getContentType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getContentType <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Code value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Expression()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Header Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Field</em>' reference.
	 * @see #setHeaderField(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_HeaderField()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getHeaderField();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getHeaderField <em>Header Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Field</em>' reference.
	 * @see #getHeaderField()
	 * @generated
	 */
	void setHeaderField(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Minimum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Id</em>' reference.
	 * @see #setMinimumId(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_MinimumId()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getMinimumId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getMinimumId <em>Minimum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Id</em>' reference.
	 * @see #getMinimumId()
	 * @generated
	 */
	void setMinimumId(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Navigation Links</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Links</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Links</em>' reference.
	 * @see #setNavigationLinks(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_NavigationLinks()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getNavigationLinks();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getNavigationLinks <em>Navigation Links</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Links</em>' reference.
	 * @see #getNavigationLinks()
	 * @generated
	 */
	void setNavigationLinks(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' reference.
	 * @see #setOperator(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Operator()
	 * @model
	 * @generated
	 */
	Code getOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getOperator <em>Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Code value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' reference.
	 * @see #setPath(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Path()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getPath();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getPath <em>Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Request Url</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Url</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Url</em>' reference.
	 * @see #setRequestUrl(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_RequestUrl()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getRequestUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getRequestUrl <em>Request Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Url</em>' reference.
	 * @see #getRequestUrl()
	 * @generated
	 */
	void setRequestUrl(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Resource()
	 * @model
	 * @generated
	 */
	Code getResource();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Code value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' reference.
	 * @see #setResponse(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Response()
	 * @model
	 * @generated
	 */
	Code getResponse();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getResponse <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Code value);

	/**
	 * Returns the value of the '<em><b>Response Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Code</em>' reference.
	 * @see #setResponseCode(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_ResponseCode()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getResponseCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getResponseCode <em>Response Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Code</em>' reference.
	 * @see #getResponseCode()
	 * @generated
	 */
	void setResponseCode(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(TestScriptSetupSetupActionAssertActionAssertRule)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Rule()
	 * @model containment="true"
	 * @generated
	 */
	TestScriptSetupSetupActionAssertActionAssertRule getRule();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(TestScriptSetupSetupActionAssertActionAssertRule value);

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruleset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruleset</em>' containment reference.
	 * @see #setRuleset(TestScriptSetupSetupActionAssertActionAssertRuleset)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Ruleset()
	 * @model containment="true"
	 * @generated
	 */
	TestScriptSetupSetupActionAssertActionAssertRuleset getRuleset();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getRuleset <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruleset</em>' containment reference.
	 * @see #getRuleset()
	 * @generated
	 */
	void setRuleset(TestScriptSetupSetupActionAssertActionAssertRuleset value);

	/**
	 * Returns the value of the '<em><b>Source Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Id</em>' reference.
	 * @see #setSourceId(Id)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_SourceId()
	 * @model
	 * @generated
	 */
	Id getSourceId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getSourceId <em>Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' reference.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(Id value);

	/**
	 * Returns the value of the '<em><b>Validate Profile Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate Profile Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Profile Id</em>' reference.
	 * @see #setValidateProfileId(Id)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_ValidateProfileId()
	 * @model
	 * @generated
	 */
	Id getValidateProfileId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getValidateProfileId <em>Validate Profile Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Profile Id</em>' reference.
	 * @see #getValidateProfileId()
	 * @generated
	 */
	void setValidateProfileId(Id value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Value()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Warning Only</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warning Only</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning Only</em>' reference.
	 * @see #setWarningOnly(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_WarningOnly()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getWarningOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert#getWarningOnly <em>Warning Only</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning Only</em>' reference.
	 * @see #getWarningOnly()
	 * @generated
	 */
	void setWarningOnly(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean value);

} // TestScriptSetupSetupActionAssert
