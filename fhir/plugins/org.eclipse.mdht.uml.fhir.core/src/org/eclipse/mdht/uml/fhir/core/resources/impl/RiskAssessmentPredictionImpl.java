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
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.RiskAssessmentPrediction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Assessment Prediction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RiskAssessmentPredictionImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RiskAssessmentPredictionImpl#getProbabilityx <em>Probabilityx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RiskAssessmentPredictionImpl#getRelativeRisk <em>Relative Risk</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RiskAssessmentPredictionImpl#getWhenx <em>Whenx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.RiskAssessmentPredictionImpl#getRationale <em>Rationale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RiskAssessmentPredictionImpl extends BackboneElementImpl implements RiskAssessmentPrediction {
	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept outcome;

	/**
	 * The cached value of the '{@link #getProbabilityx() <em>Probabilityx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilityx()
	 * @generated
	 * @ordered
	 */
	protected DataType probabilityx;

	/**
	 * The cached value of the '{@link #getRelativeRisk() <em>Relative Risk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeRisk()
	 * @generated
	 * @ordered
	 */
	protected Decimal relativeRisk;

	/**
	 * The cached value of the '{@link #getWhenx() <em>Whenx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenx()
	 * @generated
	 * @ordered
	 */
	protected DataType whenx;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String rationale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskAssessmentPredictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getRiskAssessmentPrediction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOutcome() {
		if (outcome != null && outcome.eIsProxy()) {
			InternalEObject oldOutcome = (InternalEObject)outcome;
			outcome = (CodeableConcept)eResolveProxy(oldOutcome);
			if (outcome != oldOutcome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME, oldOutcome, outcome));
			}
		}
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(CodeableConcept newOutcome) {
		CodeableConcept oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME, oldOutcome, outcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getProbabilityx() {
		if (probabilityx != null && probabilityx.eIsProxy()) {
			InternalEObject oldProbabilityx = (InternalEObject)probabilityx;
			probabilityx = (DataType)eResolveProxy(oldProbabilityx);
			if (probabilityx != oldProbabilityx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITYX, oldProbabilityx, probabilityx));
			}
		}
		return probabilityx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetProbabilityx() {
		return probabilityx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbabilityx(DataType newProbabilityx) {
		DataType oldProbabilityx = probabilityx;
		probabilityx = newProbabilityx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITYX, oldProbabilityx, probabilityx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getRelativeRisk() {
		if (relativeRisk != null && relativeRisk.eIsProxy()) {
			InternalEObject oldRelativeRisk = (InternalEObject)relativeRisk;
			relativeRisk = (Decimal)eResolveProxy(oldRelativeRisk);
			if (relativeRisk != oldRelativeRisk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK, oldRelativeRisk, relativeRisk));
			}
		}
		return relativeRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetRelativeRisk() {
		return relativeRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeRisk(Decimal newRelativeRisk) {
		Decimal oldRelativeRisk = relativeRisk;
		relativeRisk = newRelativeRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK, oldRelativeRisk, relativeRisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getWhenx() {
		if (whenx != null && whenx.eIsProxy()) {
			InternalEObject oldWhenx = (InternalEObject)whenx;
			whenx = (DataType)eResolveProxy(oldWhenx);
			if (whenx != oldWhenx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__WHENX, oldWhenx, whenx));
			}
		}
		return whenx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetWhenx() {
		return whenx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenx(DataType newWhenx) {
		DataType oldWhenx = whenx;
		whenx = newWhenx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__WHENX, oldWhenx, whenx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getRationale() {
		if (rationale != null && rationale.eIsProxy()) {
			InternalEObject oldRationale = (InternalEObject)rationale;
			rationale = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldRationale);
			if (rationale != oldRationale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE, oldRationale, rationale));
			}
		}
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(org.eclipse.mdht.uml.fhir.core.dataTypes.String newRationale) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME:
				if (resolve) return getOutcome();
				return basicGetOutcome();
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITYX:
				if (resolve) return getProbabilityx();
				return basicGetProbabilityx();
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK:
				if (resolve) return getRelativeRisk();
				return basicGetRelativeRisk();
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__WHENX:
				if (resolve) return getWhenx();
				return basicGetWhenx();
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE:
				if (resolve) return getRationale();
				return basicGetRationale();
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
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITYX:
				setProbabilityx((DataType)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK:
				setRelativeRisk((Decimal)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__WHENX:
				setWhenx((DataType)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE:
				setRationale((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITYX:
				setProbabilityx((DataType)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK:
				setRelativeRisk((Decimal)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__WHENX:
				setWhenx((DataType)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE:
				setRationale((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME:
				return outcome != null;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITYX:
				return probabilityx != null;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK:
				return relativeRisk != null;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__WHENX:
				return whenx != null;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE:
				return rationale != null;
		}
		return super.eIsSet(featureID);
	}

} //RiskAssessmentPredictionImpl
