/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Element3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getTargetProfile <em>Target Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getAggregations <em>Aggregation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getVersioning <em>Versioning</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getElementDefinitionElement3()
 * @model
 * @generated
 */
public interface ElementDefinitionElement3 extends Element {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' reference.
	 * @see #setCode(Uri)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getElementDefinitionElement3_Code()
	 * @model required="true"
	 * @generated
	 */
	Uri getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getCode <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Uri value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' reference.
	 * @see #setProfile(Uri)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getElementDefinitionElement3_Profile()
	 * @model
	 * @generated
	 */
	Uri getProfile();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getProfile <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Uri value);

	/**
	 * Returns the value of the '<em><b>Target Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Profile</em>' reference.
	 * @see #setTargetProfile(Uri)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getElementDefinitionElement3_TargetProfile()
	 * @model
	 * @generated
	 */
	Uri getTargetProfile();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getTargetProfile <em>Target Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Profile</em>' reference.
	 * @see #getTargetProfile()
	 * @generated
	 */
	void setTargetProfile(Uri value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getElementDefinitionElement3_Aggregation()
	 * @model
	 * @generated
	 */
	EList<Code> getAggregations();

	/**
	 * Returns the value of the '<em><b>Versioning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versioning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versioning</em>' reference.
	 * @see #setVersioning(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getElementDefinitionElement3_Versioning()
	 * @model
	 * @generated
	 */
	Code getVersioning();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3#getVersioning <em>Versioning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioning</em>' reference.
	 * @see #getVersioning()
	 * @generated
	 */
	void setVersioning(Code value);

} // ElementDefinitionElement3
