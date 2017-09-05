/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.Coverage;
import org.eclipse.mdht.uml.fhir.core.resources.ExplanationOfBenefitInsurance;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Insurance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitInsuranceImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExplanationOfBenefitInsuranceImpl#getPreAuthRefs <em>Pre Auth Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExplanationOfBenefitInsuranceImpl extends BackboneElementImpl implements ExplanationOfBenefitInsurance {
	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected Coverage coverage;

	/**
	 * The cached value of the '{@link #getPreAuthRefs() <em>Pre Auth Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> preAuthRefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitInsuranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getExplanationOfBenefitInsurance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage getCoverage() {
		if (coverage != null && coverage.eIsProxy()) {
			InternalEObject oldCoverage = (InternalEObject)coverage;
			coverage = (Coverage)eResolveProxy(oldCoverage);
			if (coverage != oldCoverage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPLANATION_OF_BENEFIT_INSURANCE__COVERAGE, oldCoverage, coverage));
			}
		}
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage basicGetCoverage() {
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverage(Coverage newCoverage) {
		Coverage oldCoverage = coverage;
		coverage = newCoverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_INSURANCE__COVERAGE, oldCoverage, coverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> getPreAuthRefs() {
		if (preAuthRefs == null) {
			preAuthRefs = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.dataTypes.String>(org.eclipse.mdht.uml.fhir.core.dataTypes.String.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_INSURANCE__PRE_AUTH_REF);
		}
		return preAuthRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_INSURANCE__COVERAGE:
				if (resolve) return getCoverage();
				return basicGetCoverage();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_INSURANCE__PRE_AUTH_REF:
				return getPreAuthRefs();
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_INSURANCE__COVERAGE:
				setCoverage((Coverage)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_INSURANCE__PRE_AUTH_REF:
				getPreAuthRefs().clear();
				getPreAuthRefs().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.dataTypes.String>)newValue);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_INSURANCE__COVERAGE:
				setCoverage((Coverage)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_INSURANCE__PRE_AUTH_REF:
				getPreAuthRefs().clear();
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_INSURANCE__COVERAGE:
				return coverage != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_INSURANCE__PRE_AUTH_REF:
				return preAuthRefs != null && !preAuthRefs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitInsuranceImpl
