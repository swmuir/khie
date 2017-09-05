/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.SequenceStructureVariant;
import org.eclipse.mdht.uml.fhir.core.resources.SequenceStructureVariantInner;
import org.eclipse.mdht.uml.fhir.core.resources.SequenceStructureVariantOuter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Structure Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceStructureVariantImpl#getPrecisionOfBoundaries <em>Precision Of Boundaries</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceStructureVariantImpl#getReportedaCghRatio <em>Reporteda Cgh Ratio</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceStructureVariantImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceStructureVariantImpl#getOuter <em>Outer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SequenceStructureVariantImpl#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceStructureVariantImpl extends BackboneElementImpl implements SequenceStructureVariant {
	/**
	 * The cached value of the '{@link #getPrecisionOfBoundaries() <em>Precision Of Boundaries</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionOfBoundaries()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String precisionOfBoundaries;

	/**
	 * The cached value of the '{@link #getReportedaCghRatio() <em>Reporteda Cgh Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportedaCghRatio()
	 * @generated
	 * @ordered
	 */
	protected Decimal reportedaCghRatio;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer length;

	/**
	 * The cached value of the '{@link #getOuter() <em>Outer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuter()
	 * @generated
	 * @ordered
	 */
	protected SequenceStructureVariantOuter outer;

	/**
	 * The cached value of the '{@link #getInner() <em>Inner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInner()
	 * @generated
	 * @ordered
	 */
	protected SequenceStructureVariantInner inner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceStructureVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSequenceStructureVariant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getPrecisionOfBoundaries() {
		if (precisionOfBoundaries != null && precisionOfBoundaries.eIsProxy()) {
			InternalEObject oldPrecisionOfBoundaries = (InternalEObject)precisionOfBoundaries;
			precisionOfBoundaries = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldPrecisionOfBoundaries);
			if (precisionOfBoundaries != oldPrecisionOfBoundaries) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION_OF_BOUNDARIES, oldPrecisionOfBoundaries, precisionOfBoundaries));
			}
		}
		return precisionOfBoundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetPrecisionOfBoundaries() {
		return precisionOfBoundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionOfBoundaries(org.eclipse.mdht.uml.fhir.core.dataTypes.String newPrecisionOfBoundaries) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldPrecisionOfBoundaries = precisionOfBoundaries;
		precisionOfBoundaries = newPrecisionOfBoundaries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION_OF_BOUNDARIES, oldPrecisionOfBoundaries, precisionOfBoundaries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getReportedaCghRatio() {
		if (reportedaCghRatio != null && reportedaCghRatio.eIsProxy()) {
			InternalEObject oldReportedaCghRatio = (InternalEObject)reportedaCghRatio;
			reportedaCghRatio = (Decimal)eResolveProxy(oldReportedaCghRatio);
			if (reportedaCghRatio != oldReportedaCghRatio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO, oldReportedaCghRatio, reportedaCghRatio));
			}
		}
		return reportedaCghRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetReportedaCghRatio() {
		return reportedaCghRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportedaCghRatio(Decimal newReportedaCghRatio) {
		Decimal oldReportedaCghRatio = reportedaCghRatio;
		reportedaCghRatio = newReportedaCghRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO, oldReportedaCghRatio, reportedaCghRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getLength() {
		if (length != null && length.eIsProxy()) {
			InternalEObject oldLength = (InternalEObject)length;
			length = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldLength);
			if (length != oldLength) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH, oldLength, length));
			}
		}
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newLength) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceStructureVariantOuter getOuter() {
		return outer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuter(SequenceStructureVariantOuter newOuter, NotificationChain msgs) {
		SequenceStructureVariantOuter oldOuter = outer;
		outer = newOuter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER, oldOuter, newOuter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuter(SequenceStructureVariantOuter newOuter) {
		if (newOuter != outer) {
			NotificationChain msgs = null;
			if (outer != null)
				msgs = ((InternalEObject)outer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER, null, msgs);
			if (newOuter != null)
				msgs = ((InternalEObject)newOuter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER, null, msgs);
			msgs = basicSetOuter(newOuter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER, newOuter, newOuter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceStructureVariantInner getInner() {
		return inner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInner(SequenceStructureVariantInner newInner, NotificationChain msgs) {
		SequenceStructureVariantInner oldInner = inner;
		inner = newInner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__INNER, oldInner, newInner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInner(SequenceStructureVariantInner newInner) {
		if (newInner != inner) {
			NotificationChain msgs = null;
			if (inner != null)
				msgs = ((InternalEObject)inner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__INNER, null, msgs);
			if (newInner != null)
				msgs = ((InternalEObject)newInner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__INNER, null, msgs);
			msgs = basicSetInner(newInner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__INNER, newInner, newInner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER:
				return basicSetOuter(null, msgs);
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__INNER:
				return basicSetInner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION_OF_BOUNDARIES:
				if (resolve) return getPrecisionOfBoundaries();
				return basicGetPrecisionOfBoundaries();
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO:
				if (resolve) return getReportedaCghRatio();
				return basicGetReportedaCghRatio();
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				if (resolve) return getLength();
				return basicGetLength();
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER:
				return getOuter();
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__INNER:
				return getInner();
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
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION_OF_BOUNDARIES:
				setPrecisionOfBoundaries((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO:
				setReportedaCghRatio((Decimal)newValue);
				return;
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				setLength((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER:
				setOuter((SequenceStructureVariantOuter)newValue);
				return;
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__INNER:
				setInner((SequenceStructureVariantInner)newValue);
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
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION_OF_BOUNDARIES:
				setPrecisionOfBoundaries((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO:
				setReportedaCghRatio((Decimal)null);
				return;
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				setLength((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER:
				setOuter((SequenceStructureVariantOuter)null);
				return;
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__INNER:
				setInner((SequenceStructureVariantInner)null);
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
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__PRECISION_OF_BOUNDARIES:
				return precisionOfBoundaries != null;
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__REPORTEDA_CGH_RATIO:
				return reportedaCghRatio != null;
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__LENGTH:
				return length != null;
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__OUTER:
				return outer != null;
			case ResourcesPackage.SEQUENCE_STRUCTURE_VARIANT__INNER:
				return inner != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceStructureVariantImpl
