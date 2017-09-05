/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupStratifierStratifierGroup;
import org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report Group Stratifier Stratifier Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureReportGroupStratifierStratifierGroupImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureReportGroupStratifierStratifierGroupImpl#getPopulations <em>Population</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureReportGroupStratifierStratifierGroupImpl#getMeasureScore <em>Measure Score</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureReportGroupStratifierStratifierGroupImpl extends BackboneElementImpl implements MeasureReportGroupStratifierStratifierGroup {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String value;

	/**
	 * The cached value of the '{@link #getPopulations() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulations()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation> populations;

	/**
	 * The cached value of the '{@link #getMeasureScore() <em>Measure Score</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScore()
	 * @generated
	 * @ordered
	 */
	protected Decimal measureScore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportGroupStratifierStratifierGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMeasureReportGroupStratifierStratifierGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(org.eclipse.mdht.uml.fhir.core.dataTypes.String newValue) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation> getPopulations() {
		if (populations == null) {
			populations = new EObjectContainmentEList<MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation>(MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation.class, this, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__POPULATION);
		}
		return populations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getMeasureScore() {
		if (measureScore != null && measureScore.eIsProxy()) {
			InternalEObject oldMeasureScore = (InternalEObject)measureScore;
			measureScore = (Decimal)eResolveProxy(oldMeasureScore);
			if (measureScore != oldMeasureScore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__MEASURE_SCORE, oldMeasureScore, measureScore));
			}
		}
		return measureScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetMeasureScore() {
		return measureScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureScore(Decimal newMeasureScore) {
		Decimal oldMeasureScore = measureScore;
		measureScore = newMeasureScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__MEASURE_SCORE, oldMeasureScore, measureScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__POPULATION:
				return ((InternalEList<?>)getPopulations()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__POPULATION:
				return getPopulations();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__MEASURE_SCORE:
				if (resolve) return getMeasureScore();
				return basicGetMeasureScore();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__VALUE:
				setValue((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__POPULATION:
				getPopulations().clear();
				getPopulations().addAll((Collection<? extends MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation>)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__MEASURE_SCORE:
				setMeasureScore((Decimal)newValue);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__VALUE:
				setValue((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__POPULATION:
				getPopulations().clear();
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__MEASURE_SCORE:
				setMeasureScore((Decimal)null);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__VALUE:
				return value != null;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__POPULATION:
				return populations != null && !populations.isEmpty();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__MEASURE_SCORE:
				return measureScore != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportGroupStratifierStratifierGroupImpl
