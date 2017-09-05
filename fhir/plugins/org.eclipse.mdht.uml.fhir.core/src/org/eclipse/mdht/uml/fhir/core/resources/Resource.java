/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Id;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Meta;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Resource#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Resource#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Resource#getImplicitRules <em>Implicit Rules</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.Resource#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource extends Base {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' reference.
	 * @see #setId(Id)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getResource_Id()
	 * @model
	 * @generated
	 */
	Id getId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.Resource#getId <em>Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(Id value);

	/**
	 * Returns the value of the '<em><b>Meta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' reference.
	 * @see #setMeta(Meta)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getResource_Meta()
	 * @model
	 * @generated
	 */
	Meta getMeta();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.Resource#getMeta <em>Meta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta</em>' reference.
	 * @see #getMeta()
	 * @generated
	 */
	void setMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Implicit Rules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicit Rules</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Rules</em>' reference.
	 * @see #setImplicitRules(Uri)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getResource_ImplicitRules()
	 * @model
	 * @generated
	 */
	Uri getImplicitRules();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.Resource#getImplicitRules <em>Implicit Rules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Rules</em>' reference.
	 * @see #getImplicitRules()
	 * @generated
	 */
	void setImplicitRules(Uri value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference.
	 * @see #setLanguage(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getResource_Language()
	 * @model
	 * @generated
	 */
	Code getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.Resource#getLanguage <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Code value);

} // Resource
