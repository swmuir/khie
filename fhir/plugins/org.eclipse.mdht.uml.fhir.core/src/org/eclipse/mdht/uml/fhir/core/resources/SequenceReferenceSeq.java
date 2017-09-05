/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Reference Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getChromosome <em>Chromosome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getGenomeBuild <em>Genome Build</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getReferenceSeqId <em>Reference Seq Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getReferenceSeqPointer <em>Reference Seq Pointer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getReferenceSeqString <em>Reference Seq String</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getStrand <em>Strand</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getWindowStart <em>Window Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getWindowEnd <em>Window End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getSequenceReferenceSeq()
 * @model
 * @generated
 */
public interface SequenceReferenceSeq extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Chromosome</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chromosome</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chromosome</em>' reference.
	 * @see #setChromosome(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getSequenceReferenceSeq_Chromosome()
	 * @model
	 * @generated
	 */
	CodeableConcept getChromosome();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getChromosome <em>Chromosome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chromosome</em>' reference.
	 * @see #getChromosome()
	 * @generated
	 */
	void setChromosome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Genome Build</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genome Build</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genome Build</em>' reference.
	 * @see #setGenomeBuild(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getSequenceReferenceSeq_GenomeBuild()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getGenomeBuild();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getGenomeBuild <em>Genome Build</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genome Build</em>' reference.
	 * @see #getGenomeBuild()
	 * @generated
	 */
	void setGenomeBuild(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Reference Seq Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Seq Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Seq Id</em>' reference.
	 * @see #setReferenceSeqId(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getSequenceReferenceSeq_ReferenceSeqId()
	 * @model
	 * @generated
	 */
	CodeableConcept getReferenceSeqId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getReferenceSeqId <em>Reference Seq Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq Id</em>' reference.
	 * @see #getReferenceSeqId()
	 * @generated
	 */
	void setReferenceSeqId(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reference Seq Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Seq Pointer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Seq Pointer</em>' reference.
	 * @see #setReferenceSeqPointer(Sequence)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getSequenceReferenceSeq_ReferenceSeqPointer()
	 * @model
	 * @generated
	 */
	Sequence getReferenceSeqPointer();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getReferenceSeqPointer <em>Reference Seq Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq Pointer</em>' reference.
	 * @see #getReferenceSeqPointer()
	 * @generated
	 */
	void setReferenceSeqPointer(Sequence value);

	/**
	 * Returns the value of the '<em><b>Reference Seq String</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Seq String</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Seq String</em>' reference.
	 * @see #setReferenceSeqString(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getSequenceReferenceSeq_ReferenceSeqString()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getReferenceSeqString();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getReferenceSeqString <em>Reference Seq String</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq String</em>' reference.
	 * @see #getReferenceSeqString()
	 * @generated
	 */
	void setReferenceSeqString(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Strand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strand</em>' reference.
	 * @see #setStrand(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getSequenceReferenceSeq_Strand()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getStrand();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getStrand <em>Strand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strand</em>' reference.
	 * @see #getStrand()
	 * @generated
	 */
	void setStrand(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Window Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window Start</em>' reference.
	 * @see #setWindowStart(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getSequenceReferenceSeq_WindowStart()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getWindowStart();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getWindowStart <em>Window Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window Start</em>' reference.
	 * @see #getWindowStart()
	 * @generated
	 */
	void setWindowStart(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Window End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window End</em>' reference.
	 * @see #setWindowEnd(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getSequenceReferenceSeq_WindowEnd()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getWindowEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq#getWindowEnd <em>Window End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window End</em>' reference.
	 * @see #getWindowEnd()
	 * @generated
	 */
	void setWindowEnd(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer value);

} // SequenceReferenceSeq
