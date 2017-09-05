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
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ConditionStage;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionStageImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConditionStageImpl#getAssessments <em>Assessment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionStageImpl extends BackboneElementImpl implements ConditionStage {
	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept summary;

	/**
	 * The cached value of the '{@link #getAssessments() <em>Assessment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessments()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> assessments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionStageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getConditionStage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSummary() {
		if (summary != null && summary.eIsProxy()) {
			InternalEObject oldSummary = (InternalEObject)summary;
			summary = (CodeableConcept)eResolveProxy(oldSummary);
			if (summary != oldSummary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONDITION_STAGE__SUMMARY, oldSummary, summary));
			}
		}
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(CodeableConcept newSummary) {
		CodeableConcept oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONDITION_STAGE__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getAssessments() {
		if (assessments == null) {
			assessments = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.CONDITION_STAGE__ASSESSMENT);
		}
		return assessments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.CONDITION_STAGE__SUMMARY:
				if (resolve) return getSummary();
				return basicGetSummary();
			case ResourcesPackage.CONDITION_STAGE__ASSESSMENT:
				return getAssessments();
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
			case ResourcesPackage.CONDITION_STAGE__SUMMARY:
				setSummary((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CONDITION_STAGE__ASSESSMENT:
				getAssessments().clear();
				getAssessments().addAll((Collection<? extends Resource>)newValue);
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
			case ResourcesPackage.CONDITION_STAGE__SUMMARY:
				setSummary((CodeableConcept)null);
				return;
			case ResourcesPackage.CONDITION_STAGE__ASSESSMENT:
				getAssessments().clear();
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
			case ResourcesPackage.CONDITION_STAGE__SUMMARY:
				return summary != null;
			case ResourcesPackage.CONDITION_STAGE__ASSESSMENT:
				return assessments != null && !assessments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionStageImpl
