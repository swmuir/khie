/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report Group Stratifier Stratifier Group Stratifier Group Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation#getPatients <em>Patients</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation()
 * @model
 * @generated
 */
public interface MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation_Type()
	 * @model required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' reference.
	 * @see #setCount(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation_Count()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getCount();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation#getCount <em>Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Patients</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patients</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patients</em>' reference.
	 * @see #setPatients(List)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation_Patients()
	 * @model
	 * @generated
	 */
	List getPatients();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation#getPatients <em>Patients</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patients</em>' reference.
	 * @see #getPatients()
	 * @generated
	 */
	void setPatients(List value);

} // MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation
