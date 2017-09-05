/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Range;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Reference Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ObservationReferenceRange#getLow <em>Low</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ObservationReferenceRange#getHigh <em>High</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ObservationReferenceRange#getMeanings <em>Meaning</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ObservationReferenceRange#getAge <em>Age</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.ObservationReferenceRange#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getObservationReferenceRange()
 * @model
 * @generated
 */
public interface ObservationReferenceRange extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Low</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low</em>' reference.
	 * @see #setLow(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getObservationReferenceRange_Low()
	 * @model
	 * @generated
	 */
	SimpleQuantity getLow();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ObservationReferenceRange#getLow <em>Low</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' reference.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High</em>' reference.
	 * @see #setHigh(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getObservationReferenceRange_High()
	 * @model
	 * @generated
	 */
	SimpleQuantity getHigh();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ObservationReferenceRange#getHigh <em>High</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' reference.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Meaning</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meaning</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meaning</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getObservationReferenceRange_Meaning()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getMeanings();

	/**
	 * Returns the value of the '<em><b>Age</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' reference.
	 * @see #setAge(Range)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getObservationReferenceRange_Age()
	 * @model
	 * @generated
	 */
	Range getAge();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ObservationReferenceRange#getAge <em>Age</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' reference.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(Range value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getObservationReferenceRange_Text()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.ObservationReferenceRange#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

} // ObservationReferenceRange
