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
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.Observation;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.SequenceVariant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceVariantImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceVariantImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceVariantImpl#getObservedAllele <em>Observed Allele</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceVariantImpl#getReferenceAllele <em>Reference Allele</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceVariantImpl#getCigar <em>Cigar</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceVariantImpl#getVariantPointer <em>Variant Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceVariantImpl extends BackboneElementImpl implements SequenceVariant {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer end;

	/**
	 * The cached value of the '{@link #getObservedAllele() <em>Observed Allele</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedAllele()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String observedAllele;

	/**
	 * The cached value of the '{@link #getReferenceAllele() <em>Reference Allele</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceAllele()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String referenceAllele;

	/**
	 * The cached value of the '{@link #getCigar() <em>Cigar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCigar()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String cigar;

	/**
	 * The cached value of the '{@link #getVariantPointer() <em>Variant Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantPointer()
	 * @generated
	 * @ordered
	 */
	protected Observation variantPointer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSequenceVariant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_VARIANT__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newStart) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_VARIANT__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_VARIANT__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newEnd) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_VARIANT__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getObservedAllele() {
		if (observedAllele != null && observedAllele.eIsProxy()) {
			InternalEObject oldObservedAllele = (InternalEObject)observedAllele;
			observedAllele = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldObservedAllele);
			if (observedAllele != oldObservedAllele) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_VARIANT__OBSERVED_ALLELE, oldObservedAllele, observedAllele));
			}
		}
		return observedAllele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetObservedAllele() {
		return observedAllele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservedAllele(org.eclipse.mdht.uml.fhir.core.dataTypes.String newObservedAllele) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldObservedAllele = observedAllele;
		observedAllele = newObservedAllele;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_VARIANT__OBSERVED_ALLELE, oldObservedAllele, observedAllele));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getReferenceAllele() {
		if (referenceAllele != null && referenceAllele.eIsProxy()) {
			InternalEObject oldReferenceAllele = (InternalEObject)referenceAllele;
			referenceAllele = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldReferenceAllele);
			if (referenceAllele != oldReferenceAllele) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_VARIANT__REFERENCE_ALLELE, oldReferenceAllele, referenceAllele));
			}
		}
		return referenceAllele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetReferenceAllele() {
		return referenceAllele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceAllele(org.eclipse.mdht.uml.fhir.core.dataTypes.String newReferenceAllele) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldReferenceAllele = referenceAllele;
		referenceAllele = newReferenceAllele;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_VARIANT__REFERENCE_ALLELE, oldReferenceAllele, referenceAllele));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getCigar() {
		if (cigar != null && cigar.eIsProxy()) {
			InternalEObject oldCigar = (InternalEObject)cigar;
			cigar = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldCigar);
			if (cigar != oldCigar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_VARIANT__CIGAR, oldCigar, cigar));
			}
		}
		return cigar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetCigar() {
		return cigar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCigar(org.eclipse.mdht.uml.fhir.core.dataTypes.String newCigar) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldCigar = cigar;
		cigar = newCigar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_VARIANT__CIGAR, oldCigar, cigar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation getVariantPointer() {
		if (variantPointer != null && variantPointer.eIsProxy()) {
			InternalEObject oldVariantPointer = (InternalEObject)variantPointer;
			variantPointer = (Observation)eResolveProxy(oldVariantPointer);
			if (variantPointer != oldVariantPointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_VARIANT__VARIANT_POINTER, oldVariantPointer, variantPointer));
			}
		}
		return variantPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation basicGetVariantPointer() {
		return variantPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariantPointer(Observation newVariantPointer) {
		Observation oldVariantPointer = variantPointer;
		variantPointer = newVariantPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_VARIANT__VARIANT_POINTER, oldVariantPointer, variantPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.SEQUENCE_VARIANT__START:
				if (resolve) return getStart();
				return basicGetStart();
			case ResourcesPackage.SEQUENCE_VARIANT__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case ResourcesPackage.SEQUENCE_VARIANT__OBSERVED_ALLELE:
				if (resolve) return getObservedAllele();
				return basicGetObservedAllele();
			case ResourcesPackage.SEQUENCE_VARIANT__REFERENCE_ALLELE:
				if (resolve) return getReferenceAllele();
				return basicGetReferenceAllele();
			case ResourcesPackage.SEQUENCE_VARIANT__CIGAR:
				if (resolve) return getCigar();
				return basicGetCigar();
			case ResourcesPackage.SEQUENCE_VARIANT__VARIANT_POINTER:
				if (resolve) return getVariantPointer();
				return basicGetVariantPointer();
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
			case ResourcesPackage.SEQUENCE_VARIANT__START:
				setStart((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SEQUENCE_VARIANT__END:
				setEnd((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SEQUENCE_VARIANT__OBSERVED_ALLELE:
				setObservedAllele((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEQUENCE_VARIANT__REFERENCE_ALLELE:
				setReferenceAllele((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEQUENCE_VARIANT__CIGAR:
				setCigar((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEQUENCE_VARIANT__VARIANT_POINTER:
				setVariantPointer((Observation)newValue);
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
			case ResourcesPackage.SEQUENCE_VARIANT__START:
				setStart((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SEQUENCE_VARIANT__END:
				setEnd((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SEQUENCE_VARIANT__OBSERVED_ALLELE:
				setObservedAllele((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SEQUENCE_VARIANT__REFERENCE_ALLELE:
				setReferenceAllele((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SEQUENCE_VARIANT__CIGAR:
				setCigar((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SEQUENCE_VARIANT__VARIANT_POINTER:
				setVariantPointer((Observation)null);
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
			case ResourcesPackage.SEQUENCE_VARIANT__START:
				return start != null;
			case ResourcesPackage.SEQUENCE_VARIANT__END:
				return end != null;
			case ResourcesPackage.SEQUENCE_VARIANT__OBSERVED_ALLELE:
				return observedAllele != null;
			case ResourcesPackage.SEQUENCE_VARIANT__REFERENCE_ALLELE:
				return referenceAllele != null;
			case ResourcesPackage.SEQUENCE_VARIANT__CIGAR:
				return cigar != null;
			case ResourcesPackage.SEQUENCE_VARIANT__VARIANT_POINTER:
				return variantPointer != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceVariantImpl
