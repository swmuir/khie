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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.OperationOutcomeIssue;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Outcome Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.OperationOutcomeIssueImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.OperationOutcomeIssueImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.OperationOutcomeIssueImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.OperationOutcomeIssueImpl#getDiagnostics <em>Diagnostics</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.OperationOutcomeIssueImpl#getLocations <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.OperationOutcomeIssueImpl#getExpressions <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationOutcomeIssueImpl extends BackboneElementImpl implements OperationOutcomeIssue {
	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Code severity;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept details;

	/**
	 * The cached value of the '{@link #getDiagnostics() <em>Diagnostics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnostics()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String diagnostics;

	/**
	 * The cached value of the '{@link #getLocations() <em>Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> locations;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> expressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationOutcomeIssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getOperationOutcomeIssue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getSeverity() {
		if (severity != null && severity.eIsProxy()) {
			InternalEObject oldSeverity = (InternalEObject)severity;
			severity = (Code)eResolveProxy(oldSeverity);
			if (severity != oldSeverity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.OPERATION_OUTCOME_ISSUE__SEVERITY, oldSeverity, severity));
			}
		}
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(Code newSeverity) {
		Code oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_OUTCOME_ISSUE__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (Code)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.OPERATION_OUTCOME_ISSUE__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_OUTCOME_ISSUE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDetails() {
		if (details != null && details.eIsProxy()) {
			InternalEObject oldDetails = (InternalEObject)details;
			details = (CodeableConcept)eResolveProxy(oldDetails);
			if (details != oldDetails) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.OPERATION_OUTCOME_ISSUE__DETAILS, oldDetails, details));
			}
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetDetails() {
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetails(CodeableConcept newDetails) {
		CodeableConcept oldDetails = details;
		details = newDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_OUTCOME_ISSUE__DETAILS, oldDetails, details));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDiagnostics() {
		if (diagnostics != null && diagnostics.eIsProxy()) {
			InternalEObject oldDiagnostics = (InternalEObject)diagnostics;
			diagnostics = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDiagnostics);
			if (diagnostics != oldDiagnostics) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS, oldDiagnostics, diagnostics));
			}
		}
		return diagnostics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDiagnostics() {
		return diagnostics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnostics(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDiagnostics) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDiagnostics = diagnostics;
		diagnostics = newDiagnostics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS, oldDiagnostics, diagnostics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> getLocations() {
		if (locations == null) {
			locations = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.dataTypes.String>(org.eclipse.mdht.uml.fhir.core.dataTypes.String.class, this, ResourcesPackage.OPERATION_OUTCOME_ISSUE__LOCATION);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.dataTypes.String>(org.eclipse.mdht.uml.fhir.core.dataTypes.String.class, this, ResourcesPackage.OPERATION_OUTCOME_ISSUE__EXPRESSION);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				if (resolve) return getSeverity();
				return basicGetSeverity();
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				if (resolve) return getDetails();
				return basicGetDetails();
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS:
				if (resolve) return getDiagnostics();
				return basicGetDiagnostics();
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				return getLocations();
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__EXPRESSION:
				return getExpressions();
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
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				setSeverity((Code)newValue);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__CODE:
				setCode((Code)newValue);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				setDetails((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS:
				setDiagnostics((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				getLocations().clear();
				getLocations().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__EXPRESSION:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.dataTypes.String>)newValue);
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
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				setSeverity((Code)null);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__CODE:
				setCode((Code)null);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				setDetails((CodeableConcept)null);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS:
				setDiagnostics((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				getLocations().clear();
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__EXPRESSION:
				getExpressions().clear();
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
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				return severity != null;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__CODE:
				return code != null;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				return details != null;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS:
				return diagnostics != null;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				return locations != null && !locations.isEmpty();
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__EXPRESSION:
				return expressions != null && !expressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationOutcomeIssueImpl
