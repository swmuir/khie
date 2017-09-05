/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getDerivedFroms <em>Derived From</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getDateAsserted <em>Date Asserted</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getNotTaken <em>Not Taken</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getReasonNotTakens <em>Reason Not Taken</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getReasonForUseCodeableConcepts <em>Reason For Use Codeable Concept</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getReasonForUseReferences <em>Reason For Use Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getDosages <em>Dosage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement()
 * @model
 * @generated
 */
public interface MedicationStatement extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement_Status()
	 * @model required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Medicationx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicationx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicationx</em>' reference.
	 * @see #setMedicationx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement_Medicationx()
	 * @model required="true"
	 * @generated
	 */
	Base getMedicationx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getMedicationx <em>Medicationx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicationx</em>' reference.
	 * @see #getMedicationx()
	 * @generated
	 */
	void setMedicationx(Base value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement_Subject()
	 * @model required="true"
	 * @generated
	 */
	Resource getSubject();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Resource value);

	/**
	 * Returns the value of the '<em><b>Effectivex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effectivex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effectivex</em>' reference.
	 * @see #setEffectivex(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement_Effectivex()
	 * @model
	 * @generated
	 */
	DataType getEffectivex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getEffectivex <em>Effectivex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effectivex</em>' reference.
	 * @see #getEffectivex()
	 * @generated
	 */
	void setEffectivex(DataType value);

	/**
	 * Returns the value of the '<em><b>Information Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Source</em>' reference.
	 * @see #setInformationSource(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement_InformationSource()
	 * @model
	 * @generated
	 */
	Resource getInformationSource();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getInformationSource <em>Information Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Source</em>' reference.
	 * @see #getInformationSource()
	 * @generated
	 */
	void setInformationSource(Resource value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement_DerivedFrom()
	 * @model
	 * @generated
	 */
	EList<Resource> getDerivedFroms();

	/**
	 * Returns the value of the '<em><b>Date Asserted</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Asserted</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Asserted</em>' reference.
	 * @see #setDateAsserted(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement_DateAsserted()
	 * @model
	 * @generated
	 */
	DateTime getDateAsserted();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getDateAsserted <em>Date Asserted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Asserted</em>' reference.
	 * @see #getDateAsserted()
	 * @generated
	 */
	void setDateAsserted(DateTime value);

	/**
	 * Returns the value of the '<em><b>Not Taken</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Taken</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Taken</em>' reference.
	 * @see #setNotTaken(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement_NotTaken()
	 * @model
	 * @generated
	 */
	Code getNotTaken();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getNotTaken <em>Not Taken</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Taken</em>' reference.
	 * @see #getNotTaken()
	 * @generated
	 */
	void setNotTaken(Code value);

	/**
	 * Returns the value of the '<em><b>Reason Not Taken</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Not Taken</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Not Taken</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement_ReasonNotTaken()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getReasonNotTakens();

	/**
	 * Returns the value of the '<em><b>Reason For Use Codeable Concept</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason For Use Codeable Concept</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason For Use Codeable Concept</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement_ReasonForUseCodeableConcept()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getReasonForUseCodeableConcepts();

	/**
	 * Returns the value of the '<em><b>Reason For Use Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason For Use Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason For Use Reference</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement_ReasonForUseReference()
	 * @model
	 * @generated
	 */
	EList<Resource> getReasonForUseReferences();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement_Note()
	 * @model
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement_Category()
	 * @model
	 * @generated
	 */
	Code getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Code value);

	/**
	 * Returns the value of the '<em><b>Dosage</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dosage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dosage</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getMedicationStatement_Dosage()
	 * @model
	 * @generated
	 */
	EList<DosageInstruction> getDosages();

} // MedicationStatement
