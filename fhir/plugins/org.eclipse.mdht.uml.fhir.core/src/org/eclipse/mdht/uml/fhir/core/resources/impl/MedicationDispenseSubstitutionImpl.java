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
import org.eclipse.mdht.uml.fhir.core.resources.MedicationDispenseSubstitution;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Dispense Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseSubstitutionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseSubstitutionImpl#getReasons <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationDispenseSubstitutionImpl#getResponsibleParties <em>Responsible Party</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationDispenseSubstitutionImpl extends BackboneElementImpl implements MedicationDispenseSubstitution {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getReasons() <em>Reason</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasons;

	/**
	 * The cached value of the '{@link #getResponsibleParties() <em>Responsible Party</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleParties()
	 * @generated
	 * @ordered
	 */
	protected EList<Practitioner> responsibleParties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationDispenseSubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationDispenseSubstitution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CodeableConcept)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasons() {
		if (reasons == null) {
			reasons = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON);
		}
		return reasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Practitioner> getResponsibleParties() {
		if (responsibleParties == null) {
			responsibleParties = new EObjectResolvingEList<Practitioner>(Practitioner.class, this, ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY);
		}
		return responsibleParties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON:
				return getReasons();
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY:
				return getResponsibleParties();
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
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON:
				getReasons().clear();
				getReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY:
				getResponsibleParties().clear();
				getResponsibleParties().addAll((Collection<? extends Practitioner>)newValue);
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
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON:
				getReasons().clear();
				return;
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY:
				getResponsibleParties().clear();
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
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__TYPE:
				return type != null;
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__REASON:
				return reasons != null && !reasons.isEmpty();
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION__RESPONSIBLE_PARTY:
				return responsibleParties != null && !responsibleParties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationDispenseSubstitutionImpl
