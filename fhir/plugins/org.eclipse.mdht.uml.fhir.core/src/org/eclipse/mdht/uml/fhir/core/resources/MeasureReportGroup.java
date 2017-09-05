/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroup#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroup#getPopulations <em>Population</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroup#getMeasureScore <em>Measure Score</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroup#getStratifiers <em>Stratifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroup#getSupplementalData <em>Supplemental Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMeasureReportGroup()
 * @model
 * @generated
 */
public interface MeasureReportGroup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMeasureReportGroup_Identifier()
	 * @model required="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroup#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupPopulation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMeasureReportGroup_Population()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasureReportGroupPopulation> getPopulations();

	/**
	 * Returns the value of the '<em><b>Measure Score</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Score</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Score</em>' reference.
	 * @see #setMeasureScore(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMeasureReportGroup_MeasureScore()
	 * @model
	 * @generated
	 */
	Decimal getMeasureScore();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroup#getMeasureScore <em>Measure Score</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Score</em>' reference.
	 * @see #getMeasureScore()
	 * @generated
	 */
	void setMeasureScore(Decimal value);

	/**
	 * Returns the value of the '<em><b>Stratifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupStratifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stratifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stratifier</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMeasureReportGroup_Stratifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasureReportGroupStratifier> getStratifiers();

	/**
	 * Returns the value of the '<em><b>Supplemental Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupSupplementalData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplemental Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplemental Data</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMeasureReportGroup_SupplementalData()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasureReportGroupSupplementalData> getSupplementalData();

} // MeasureReportGroup
