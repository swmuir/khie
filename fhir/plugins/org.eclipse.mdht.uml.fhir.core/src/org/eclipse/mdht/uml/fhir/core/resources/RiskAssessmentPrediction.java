/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Assessment Prediction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.RiskAssessmentPrediction#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.RiskAssessmentPrediction#getProbabilityx <em>Probabilityx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.RiskAssessmentPrediction#getRelativeRisk <em>Relative Risk</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.RiskAssessmentPrediction#getWhenx <em>Whenx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.RiskAssessmentPrediction#getRationale <em>Rationale</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getRiskAssessmentPrediction()
 * @model
 * @generated
 */
public interface RiskAssessmentPrediction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' reference.
	 * @see #setOutcome(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getRiskAssessmentPrediction_Outcome()
	 * @model required="true"
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.RiskAssessmentPrediction#getOutcome <em>Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Probabilityx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probabilityx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probabilityx</em>' reference.
	 * @see #setProbabilityx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getRiskAssessmentPrediction_Probabilityx()
	 * @model
	 * @generated
	 */
	DataType getProbabilityx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.RiskAssessmentPrediction#getProbabilityx <em>Probabilityx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probabilityx</em>' reference.
	 * @see #getProbabilityx()
	 * @generated
	 */
	void setProbabilityx(DataType value);

	/**
	 * Returns the value of the '<em><b>Relative Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Risk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Risk</em>' reference.
	 * @see #setRelativeRisk(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getRiskAssessmentPrediction_RelativeRisk()
	 * @model
	 * @generated
	 */
	Decimal getRelativeRisk();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.RiskAssessmentPrediction#getRelativeRisk <em>Relative Risk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Risk</em>' reference.
	 * @see #getRelativeRisk()
	 * @generated
	 */
	void setRelativeRisk(Decimal value);

	/**
	 * Returns the value of the '<em><b>Whenx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whenx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whenx</em>' reference.
	 * @see #setWhenx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getRiskAssessmentPrediction_Whenx()
	 * @model
	 * @generated
	 */
	DataType getWhenx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.RiskAssessmentPrediction#getWhenx <em>Whenx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whenx</em>' reference.
	 * @see #getWhenx()
	 * @generated
	 */
	void setWhenx(DataType value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' reference.
	 * @see #setRationale(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getRiskAssessmentPrediction_Rationale()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getRationale();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.RiskAssessmentPrediction#getRationale <em>Rationale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' reference.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

} // RiskAssessmentPrediction
