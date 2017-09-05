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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroup;
import org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupPopulation;
import org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupStratifier;
import org.eclipse.mdht.uml.fhir.core.resources.MeasureReportGroupSupplementalData;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureReportGroupImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureReportGroupImpl#getPopulations <em>Population</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureReportGroupImpl#getMeasureScore <em>Measure Score</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureReportGroupImpl#getStratifiers <em>Stratifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureReportGroupImpl#getSupplementalData <em>Supplemental Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureReportGroupImpl extends BackboneElementImpl implements MeasureReportGroup {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getPopulations() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulations()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportGroupPopulation> populations;

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
	 * The cached value of the '{@link #getStratifiers() <em>Stratifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStratifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportGroupStratifier> stratifiers;

	/**
	 * The cached value of the '{@link #getSupplementalData() <em>Supplemental Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalData()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportGroupSupplementalData> supplementalData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMeasureReportGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (Identifier)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE_REPORT_GROUP__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureReportGroupPopulation> getPopulations() {
		if (populations == null) {
			populations = new EObjectContainmentEList<MeasureReportGroupPopulation>(MeasureReportGroupPopulation.class, this, ResourcesPackage.MEASURE_REPORT_GROUP__POPULATION);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE, oldMeasureScore, measureScore));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE, oldMeasureScore, measureScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureReportGroupStratifier> getStratifiers() {
		if (stratifiers == null) {
			stratifiers = new EObjectContainmentEList<MeasureReportGroupStratifier>(MeasureReportGroupStratifier.class, this, ResourcesPackage.MEASURE_REPORT_GROUP__STRATIFIER);
		}
		return stratifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureReportGroupSupplementalData> getSupplementalData() {
		if (supplementalData == null) {
			supplementalData = new EObjectContainmentEList<MeasureReportGroupSupplementalData>(MeasureReportGroupSupplementalData.class, this, ResourcesPackage.MEASURE_REPORT_GROUP__SUPPLEMENTAL_DATA);
		}
		return supplementalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEASURE_REPORT_GROUP__POPULATION:
				return ((InternalEList<?>)getPopulations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				return ((InternalEList<?>)getStratifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEASURE_REPORT_GROUP__SUPPLEMENTAL_DATA:
				return ((InternalEList<?>)getSupplementalData()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case ResourcesPackage.MEASURE_REPORT_GROUP__POPULATION:
				return getPopulations();
			case ResourcesPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE:
				if (resolve) return getMeasureScore();
				return basicGetMeasureScore();
			case ResourcesPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				return getStratifiers();
			case ResourcesPackage.MEASURE_REPORT_GROUP__SUPPLEMENTAL_DATA:
				return getSupplementalData();
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
			case ResourcesPackage.MEASURE_REPORT_GROUP__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP__POPULATION:
				getPopulations().clear();
				getPopulations().addAll((Collection<? extends MeasureReportGroupPopulation>)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE:
				setMeasureScore((Decimal)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				getStratifiers().clear();
				getStratifiers().addAll((Collection<? extends MeasureReportGroupStratifier>)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP__SUPPLEMENTAL_DATA:
				getSupplementalData().clear();
				getSupplementalData().addAll((Collection<? extends MeasureReportGroupSupplementalData>)newValue);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP__POPULATION:
				getPopulations().clear();
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE:
				setMeasureScore((Decimal)null);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				getStratifiers().clear();
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP__SUPPLEMENTAL_DATA:
				getSupplementalData().clear();
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
			case ResourcesPackage.MEASURE_REPORT_GROUP__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.MEASURE_REPORT_GROUP__POPULATION:
				return populations != null && !populations.isEmpty();
			case ResourcesPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE:
				return measureScore != null;
			case ResourcesPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				return stratifiers != null && !stratifiers.isEmpty();
			case ResourcesPackage.MEASURE_REPORT_GROUP__SUPPLEMENTAL_DATA:
				return supplementalData != null && !supplementalData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportGroupImpl
