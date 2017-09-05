/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dosage Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getAdditionalInstructions <em>Additional Instructions</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getTiming <em>Timing</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getAsNeededx <em>As Neededx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getSite <em>Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getDosex <em>Dosex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMaxDosePerPeriod <em>Max Dose Per Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMaxDosePerAdministration <em>Max Dose Per Administration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMaxDosePerLifetime <em>Max Dose Per Lifetime</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getRatex <em>Ratex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDosageInstruction()
 * @model
 * @generated
 */
public interface DosageInstruction extends DataType {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' reference.
	 * @see #setSequence(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDosageInstruction_Sequence()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getSequence();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getSequence <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference.
	 * @see #setText(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDosageInstruction_Text()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Additional Instructions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Instructions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Instructions</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDosageInstruction_AdditionalInstructions()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getAdditionalInstructions();

	/**
	 * Returns the value of the '<em><b>Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing</em>' reference.
	 * @see #setTiming(Timing)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDosageInstruction_Timing()
	 * @model
	 * @generated
	 */
	Timing getTiming();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getTiming <em>Timing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing</em>' reference.
	 * @see #getTiming()
	 * @generated
	 */
	void setTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>As Neededx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Neededx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Neededx</em>' reference.
	 * @see #setAsNeededx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDosageInstruction_AsNeededx()
	 * @model
	 * @generated
	 */
	DataType getAsNeededx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getAsNeededx <em>As Neededx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Neededx</em>' reference.
	 * @see #getAsNeededx()
	 * @generated
	 */
	void setAsNeededx(DataType value);

	/**
	 * Returns the value of the '<em><b>Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' reference.
	 * @see #setSite(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDosageInstruction_Site()
	 * @model
	 * @generated
	 */
	CodeableConcept getSite();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getSite <em>Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference.
	 * @see #setRoute(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDosageInstruction_Route()
	 * @model
	 * @generated
	 */
	CodeableConcept getRoute();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getRoute <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDosageInstruction_Method()
	 * @model
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dosex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dosex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dosex</em>' reference.
	 * @see #setDosex(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDosageInstruction_Dosex()
	 * @model
	 * @generated
	 */
	DataType getDosex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getDosex <em>Dosex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dosex</em>' reference.
	 * @see #getDosex()
	 * @generated
	 */
	void setDosex(DataType value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Dose Per Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Dose Per Period</em>' reference.
	 * @see #setMaxDosePerPeriod(Ratio)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDosageInstruction_MaxDosePerPeriod()
	 * @model
	 * @generated
	 */
	Ratio getMaxDosePerPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMaxDosePerPeriod <em>Max Dose Per Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Period</em>' reference.
	 * @see #getMaxDosePerPeriod()
	 * @generated
	 */
	void setMaxDosePerPeriod(Ratio value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Administration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Dose Per Administration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Dose Per Administration</em>' reference.
	 * @see #setMaxDosePerAdministration(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDosageInstruction_MaxDosePerAdministration()
	 * @model
	 * @generated
	 */
	SimpleQuantity getMaxDosePerAdministration();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMaxDosePerAdministration <em>Max Dose Per Administration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Administration</em>' reference.
	 * @see #getMaxDosePerAdministration()
	 * @generated
	 */
	void setMaxDosePerAdministration(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Lifetime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Dose Per Lifetime</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Dose Per Lifetime</em>' reference.
	 * @see #setMaxDosePerLifetime(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDosageInstruction_MaxDosePerLifetime()
	 * @model
	 * @generated
	 */
	SimpleQuantity getMaxDosePerLifetime();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getMaxDosePerLifetime <em>Max Dose Per Lifetime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Lifetime</em>' reference.
	 * @see #getMaxDosePerLifetime()
	 * @generated
	 */
	void setMaxDosePerLifetime(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Ratex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratex</em>' reference.
	 * @see #setRatex(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage#getDosageInstruction_Ratex()
	 * @model
	 * @generated
	 */
	DataType getRatex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction#getRatex <em>Ratex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratex</em>' reference.
	 * @see #getRatex()
	 * @generated
	 */
	void setRatex(DataType value);

} // DosageInstruction
