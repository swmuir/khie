/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.Sequence;
import org.eclipse.mdht.uml.fhir.core.resources.SequenceReferenceSeq;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Reference Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceReferenceSeqImpl#getChromosome <em>Chromosome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceReferenceSeqImpl#getGenomeBuild <em>Genome Build</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceReferenceSeqImpl#getReferenceSeqId <em>Reference Seq Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceReferenceSeqImpl#getReferenceSeqPointer <em>Reference Seq Pointer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceReferenceSeqImpl#getReferenceSeqString <em>Reference Seq String</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceReferenceSeqImpl#getStrand <em>Strand</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceReferenceSeqImpl#getWindowStart <em>Window Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceReferenceSeqImpl#getWindowEnd <em>Window End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceReferenceSeqImpl extends BackboneElementImpl implements SequenceReferenceSeq {
	/**
	 * The cached value of the '{@link #getChromosome() <em>Chromosome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChromosome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept chromosome;

	/**
	 * The cached value of the '{@link #getGenomeBuild() <em>Genome Build</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenomeBuild()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String genomeBuild;

	/**
	 * The cached value of the '{@link #getReferenceSeqId() <em>Reference Seq Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSeqId()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept referenceSeqId;

	/**
	 * The cached value of the '{@link #getReferenceSeqPointer() <em>Reference Seq Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSeqPointer()
	 * @generated
	 * @ordered
	 */
	protected Sequence referenceSeqPointer;

	/**
	 * The cached value of the '{@link #getReferenceSeqString() <em>Reference Seq String</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSeqString()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String referenceSeqString;

	/**
	 * The cached value of the '{@link #getStrand() <em>Strand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrand()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer strand;

	/**
	 * The cached value of the '{@link #getWindowStart() <em>Window Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowStart()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer windowStart;

	/**
	 * The cached value of the '{@link #getWindowEnd() <em>Window End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowEnd()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer windowEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceReferenceSeqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSequenceReferenceSeq();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getChromosome() {
		if (chromosome != null && chromosome.eIsProxy()) {
			InternalEObject oldChromosome = (InternalEObject)chromosome;
			chromosome = (CodeableConcept)eResolveProxy(oldChromosome);
			if (chromosome != oldChromosome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__CHROMOSOME, oldChromosome, chromosome));
			}
		}
		return chromosome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetChromosome() {
		return chromosome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChromosome(CodeableConcept newChromosome) {
		CodeableConcept oldChromosome = chromosome;
		chromosome = newChromosome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__CHROMOSOME, oldChromosome, chromosome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getGenomeBuild() {
		if (genomeBuild != null && genomeBuild.eIsProxy()) {
			InternalEObject oldGenomeBuild = (InternalEObject)genomeBuild;
			genomeBuild = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldGenomeBuild);
			if (genomeBuild != oldGenomeBuild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__GENOME_BUILD, oldGenomeBuild, genomeBuild));
			}
		}
		return genomeBuild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetGenomeBuild() {
		return genomeBuild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenomeBuild(org.eclipse.mdht.uml.fhir.core.dataTypes.String newGenomeBuild) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldGenomeBuild = genomeBuild;
		genomeBuild = newGenomeBuild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__GENOME_BUILD, oldGenomeBuild, genomeBuild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReferenceSeqId() {
		if (referenceSeqId != null && referenceSeqId.eIsProxy()) {
			InternalEObject oldReferenceSeqId = (InternalEObject)referenceSeqId;
			referenceSeqId = (CodeableConcept)eResolveProxy(oldReferenceSeqId);
			if (referenceSeqId != oldReferenceSeqId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_ID, oldReferenceSeqId, referenceSeqId));
			}
		}
		return referenceSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetReferenceSeqId() {
		return referenceSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceSeqId(CodeableConcept newReferenceSeqId) {
		CodeableConcept oldReferenceSeqId = referenceSeqId;
		referenceSeqId = newReferenceSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_ID, oldReferenceSeqId, referenceSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getReferenceSeqPointer() {
		if (referenceSeqPointer != null && referenceSeqPointer.eIsProxy()) {
			InternalEObject oldReferenceSeqPointer = (InternalEObject)referenceSeqPointer;
			referenceSeqPointer = (Sequence)eResolveProxy(oldReferenceSeqPointer);
			if (referenceSeqPointer != oldReferenceSeqPointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_POINTER, oldReferenceSeqPointer, referenceSeqPointer));
			}
		}
		return referenceSeqPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence basicGetReferenceSeqPointer() {
		return referenceSeqPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceSeqPointer(Sequence newReferenceSeqPointer) {
		Sequence oldReferenceSeqPointer = referenceSeqPointer;
		referenceSeqPointer = newReferenceSeqPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_POINTER, oldReferenceSeqPointer, referenceSeqPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getReferenceSeqString() {
		if (referenceSeqString != null && referenceSeqString.eIsProxy()) {
			InternalEObject oldReferenceSeqString = (InternalEObject)referenceSeqString;
			referenceSeqString = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldReferenceSeqString);
			if (referenceSeqString != oldReferenceSeqString) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_STRING, oldReferenceSeqString, referenceSeqString));
			}
		}
		return referenceSeqString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetReferenceSeqString() {
		return referenceSeqString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceSeqString(org.eclipse.mdht.uml.fhir.core.dataTypes.String newReferenceSeqString) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldReferenceSeqString = referenceSeqString;
		referenceSeqString = newReferenceSeqString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_STRING, oldReferenceSeqString, referenceSeqString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getStrand() {
		if (strand != null && strand.eIsProxy()) {
			InternalEObject oldStrand = (InternalEObject)strand;
			strand = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldStrand);
			if (strand != oldStrand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__STRAND, oldStrand, strand));
			}
		}
		return strand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetStrand() {
		return strand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrand(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newStrand) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldStrand = strand;
		strand = newStrand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__STRAND, oldStrand, strand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getWindowStart() {
		if (windowStart != null && windowStart.eIsProxy()) {
			InternalEObject oldWindowStart = (InternalEObject)windowStart;
			windowStart = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldWindowStart);
			if (windowStart != oldWindowStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__WINDOW_START, oldWindowStart, windowStart));
			}
		}
		return windowStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetWindowStart() {
		return windowStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindowStart(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newWindowStart) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldWindowStart = windowStart;
		windowStart = newWindowStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__WINDOW_START, oldWindowStart, windowStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getWindowEnd() {
		if (windowEnd != null && windowEnd.eIsProxy()) {
			InternalEObject oldWindowEnd = (InternalEObject)windowEnd;
			windowEnd = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldWindowEnd);
			if (windowEnd != oldWindowEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__WINDOW_END, oldWindowEnd, windowEnd));
			}
		}
		return windowEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetWindowEnd() {
		return windowEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindowEnd(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newWindowEnd) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldWindowEnd = windowEnd;
		windowEnd = newWindowEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_REFERENCE_SEQ__WINDOW_END, oldWindowEnd, windowEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__CHROMOSOME:
				if (resolve) return getChromosome();
				return basicGetChromosome();
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__GENOME_BUILD:
				if (resolve) return getGenomeBuild();
				return basicGetGenomeBuild();
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_ID:
				if (resolve) return getReferenceSeqId();
				return basicGetReferenceSeqId();
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_POINTER:
				if (resolve) return getReferenceSeqPointer();
				return basicGetReferenceSeqPointer();
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_STRING:
				if (resolve) return getReferenceSeqString();
				return basicGetReferenceSeqString();
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__STRAND:
				if (resolve) return getStrand();
				return basicGetStrand();
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__WINDOW_START:
				if (resolve) return getWindowStart();
				return basicGetWindowStart();
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__WINDOW_END:
				if (resolve) return getWindowEnd();
				return basicGetWindowEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__CHROMOSOME:
				setChromosome((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__GENOME_BUILD:
				setGenomeBuild((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_ID:
				setReferenceSeqId((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_POINTER:
				setReferenceSeqPointer((Sequence)newValue);
				return;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_STRING:
				setReferenceSeqString((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__STRAND:
				setStrand((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__WINDOW_START:
				setWindowStart((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__WINDOW_END:
				setWindowEnd((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__CHROMOSOME:
				setChromosome((CodeableConcept)null);
				return;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__GENOME_BUILD:
				setGenomeBuild((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_ID:
				setReferenceSeqId((CodeableConcept)null);
				return;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_POINTER:
				setReferenceSeqPointer((Sequence)null);
				return;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_STRING:
				setReferenceSeqString((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__STRAND:
				setStrand((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__WINDOW_START:
				setWindowStart((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__WINDOW_END:
				setWindowEnd((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__CHROMOSOME:
				return chromosome != null;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__GENOME_BUILD:
				return genomeBuild != null;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_ID:
				return referenceSeqId != null;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_POINTER:
				return referenceSeqPointer != null;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_STRING:
				return referenceSeqString != null;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__STRAND:
				return strand != null;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__WINDOW_START:
				return windowStart != null;
			case ResourcesPackage.SEQUENCE_REFERENCE_SEQ__WINDOW_END:
				return windowEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceReferenceSeqImpl
