/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Structure Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceStructureVariant#getPrecisionOfBoundaries <em>Precision Of Boundaries</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceStructureVariant#getReportedaCghRatio <em>Reporteda Cgh Ratio</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceStructureVariant#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceStructureVariant#getOuter <em>Outer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceStructureVariant#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getSequenceStructureVariant()
 * @model
 * @generated
 */
public interface SequenceStructureVariant extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Precision Of Boundaries</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Of Boundaries</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Of Boundaries</em>' reference.
	 * @see #setPrecisionOfBoundaries(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getSequenceStructureVariant_PrecisionOfBoundaries()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getPrecisionOfBoundaries();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceStructureVariant#getPrecisionOfBoundaries <em>Precision Of Boundaries</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Of Boundaries</em>' reference.
	 * @see #getPrecisionOfBoundaries()
	 * @generated
	 */
	void setPrecisionOfBoundaries(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Reporteda Cgh Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporteda Cgh Ratio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporteda Cgh Ratio</em>' reference.
	 * @see #setReportedaCghRatio(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getSequenceStructureVariant_ReportedaCghRatio()
	 * @model
	 * @generated
	 */
	Decimal getReportedaCghRatio();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceStructureVariant#getReportedaCghRatio <em>Reporteda Cgh Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporteda Cgh Ratio</em>' reference.
	 * @see #getReportedaCghRatio()
	 * @generated
	 */
	void setReportedaCghRatio(Decimal value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' reference.
	 * @see #setLength(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getSequenceStructureVariant_Length()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getLength();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceStructureVariant#getLength <em>Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Outer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer</em>' containment reference.
	 * @see #setOuter(SequenceStructureVariantOuter)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getSequenceStructureVariant_Outer()
	 * @model containment="true"
	 * @generated
	 */
	SequenceStructureVariantOuter getOuter();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceStructureVariant#getOuter <em>Outer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer</em>' containment reference.
	 * @see #getOuter()
	 * @generated
	 */
	void setOuter(SequenceStructureVariantOuter value);

	/**
	 * Returns the value of the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner</em>' containment reference.
	 * @see #setInner(SequenceStructureVariantInner)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getSequenceStructureVariant_Inner()
	 * @model containment="true"
	 * @generated
	 */
	SequenceStructureVariantInner getInner();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceStructureVariant#getInner <em>Inner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner</em>' containment reference.
	 * @see #getInner()
	 * @generated
	 */
	void setInner(SequenceStructureVariantInner value);

} // SequenceStructureVariant
