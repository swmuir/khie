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
 * A representation of the model object '<em><b>Measure Report Group Supplemental Data Supplemental Data Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupSupplementalDataSupplementalDataGroup#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupSupplementalDataSupplementalDataGroup#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupSupplementalDataSupplementalDataGroup#getPatients <em>Patients</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMeasureReportGroupSupplementalDataSupplementalDataGroup()
 * @model
 * @generated
 */
public interface MeasureReportGroupSupplementalDataSupplementalDataGroup extends BackboneElement {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMeasureReportGroupSupplementalDataSupplementalDataGroup_Value()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupSupplementalDataSupplementalDataGroup#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMeasureReportGroupSupplementalDataSupplementalDataGroup_Count()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getCount();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupSupplementalDataSupplementalDataGroup#getCount <em>Count</em>}' reference.
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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMeasureReportGroupSupplementalDataSupplementalDataGroup_Patients()
	 * @model
	 * @generated
	 */
	List getPatients();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupSupplementalDataSupplementalDataGroup#getPatients <em>Patients</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patients</em>' reference.
	 * @see #getPatients()
	 * @generated
	 */
	void setPatients(List value);

} // MeasureReportGroupSupplementalDataSupplementalDataGroup
