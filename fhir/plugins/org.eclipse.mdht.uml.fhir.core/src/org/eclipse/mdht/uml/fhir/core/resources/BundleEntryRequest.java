/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Instant;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Entry Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.BundleEntryRequest#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.BundleEntryRequest#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.BundleEntryRequest#getIfNoneMatch <em>If None Match</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.BundleEntryRequest#getIfModifiedSince <em>If Modified Since</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.BundleEntryRequest#getIfMatch <em>If Match</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.BundleEntryRequest#getIfNoneExist <em>If None Exist</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getBundleEntryRequest()
 * @model
 * @generated
 */
public interface BundleEntryRequest extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getBundleEntryRequest_Method()
	 * @model required="true"
	 * @generated
	 */
	Code getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.BundleEntryRequest#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Code value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' reference.
	 * @see #setUrl(Uri)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getBundleEntryRequest_Url()
	 * @model required="true"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.BundleEntryRequest#getUrl <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>If None Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If None Match</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If None Match</em>' reference.
	 * @see #setIfNoneMatch(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getBundleEntryRequest_IfNoneMatch()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getIfNoneMatch();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.BundleEntryRequest#getIfNoneMatch <em>If None Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If None Match</em>' reference.
	 * @see #getIfNoneMatch()
	 * @generated
	 */
	void setIfNoneMatch(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>If Modified Since</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Modified Since</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Modified Since</em>' reference.
	 * @see #setIfModifiedSince(Instant)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getBundleEntryRequest_IfModifiedSince()
	 * @model
	 * @generated
	 */
	Instant getIfModifiedSince();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.BundleEntryRequest#getIfModifiedSince <em>If Modified Since</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Modified Since</em>' reference.
	 * @see #getIfModifiedSince()
	 * @generated
	 */
	void setIfModifiedSince(Instant value);

	/**
	 * Returns the value of the '<em><b>If Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Match</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Match</em>' reference.
	 * @see #setIfMatch(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getBundleEntryRequest_IfMatch()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getIfMatch();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.BundleEntryRequest#getIfMatch <em>If Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Match</em>' reference.
	 * @see #getIfMatch()
	 * @generated
	 */
	void setIfMatch(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>If None Exist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If None Exist</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If None Exist</em>' reference.
	 * @see #setIfNoneExist(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getBundleEntryRequest_IfNoneExist()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getIfNoneExist();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.BundleEntryRequest#getIfNoneExist <em>If None Exist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If None Exist</em>' reference.
	 * @see #getIfNoneExist()
	 * @generated
	 */
	void setIfNoneExist(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

} // BundleEntryRequest
