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
 * A representation of the model object '<em><b>Data Requirement Element1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getValueSetx <em>Value Setx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getValueCodes <em>Value Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getValueCodings <em>Value Coding</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getValueCodeableConcepts <em>Value Codeable Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDataRequirementElement1()
 * @model
 * @generated
 */
public interface DataRequirementElement1 extends Element {
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
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDataRequirementElement1_Path()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getPath();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getPath <em>Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Value Setx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Setx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Setx</em>' reference.
	 * @see #setValueSetx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDataRequirementElement1_ValueSetx()
	 * @model
	 * @generated
	 */
	Base getValueSetx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1#getValueSetx <em>Value Setx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Setx</em>' reference.
	 * @see #getValueSetx()
	 * @generated
	 */
	void setValueSetx(Base value);

	/**
	 * Returns the value of the '<em><b>Value Code</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Code</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Code</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDataRequirementElement1_ValueCode()
	 * @model
	 * @generated
	 */
	EList<Code> getValueCodes();

	/**
	 * Returns the value of the '<em><b>Value Coding</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Coding</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Coding</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDataRequirementElement1_ValueCoding()
	 * @model
	 * @generated
	 */
	EList<Coding> getValueCodings();

	/**
	 * Returns the value of the '<em><b>Value Codeable Concept</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Codeable Concept</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Codeable Concept</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDataRequirementElement1_ValueCodeableConcept()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getValueCodeableConcepts();

} // DataRequirementElement1
