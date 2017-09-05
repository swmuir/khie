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
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.SpecimenTreatment;
import org.eclipse.mdht.uml.fhir.core.resources.Substance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Treatment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SpecimenTreatmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SpecimenTreatmentImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SpecimenTreatmentImpl#getAdditives <em>Additive</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SpecimenTreatmentImpl#getTimex <em>Timex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecimenTreatmentImpl extends BackboneElementImpl implements SpecimenTreatment {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept procedure;

	/**
	 * The cached value of the '{@link #getAdditives() <em>Additive</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditives()
	 * @generated
	 * @ordered
	 */
	protected EList<Substance> additives;

	/**
	 * The cached value of the '{@link #getTimex() <em>Timex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimex()
	 * @generated
	 * @ordered
	 */
	protected DataType timex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenTreatmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSpecimenTreatment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SPECIMEN_TREATMENT__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_TREATMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getProcedure() {
		if (procedure != null && procedure.eIsProxy()) {
			InternalEObject oldProcedure = (InternalEObject)procedure;
			procedure = (CodeableConcept)eResolveProxy(oldProcedure);
			if (procedure != oldProcedure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SPECIMEN_TREATMENT__PROCEDURE, oldProcedure, procedure));
			}
		}
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetProcedure() {
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedure(CodeableConcept newProcedure) {
		CodeableConcept oldProcedure = procedure;
		procedure = newProcedure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_TREATMENT__PROCEDURE, oldProcedure, procedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Substance> getAdditives() {
		if (additives == null) {
			additives = new EObjectResolvingEList<Substance>(Substance.class, this, ResourcesPackage.SPECIMEN_TREATMENT__ADDITIVE);
		}
		return additives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getTimex() {
		if (timex != null && timex.eIsProxy()) {
			InternalEObject oldTimex = (InternalEObject)timex;
			timex = (DataType)eResolveProxy(oldTimex);
			if (timex != oldTimex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SPECIMEN_TREATMENT__TIMEX, oldTimex, timex));
			}
		}
		return timex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetTimex() {
		return timex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimex(DataType newTimex) {
		DataType oldTimex = timex;
		timex = newTimex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_TREATMENT__TIMEX, oldTimex, timex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.SPECIMEN_TREATMENT__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.SPECIMEN_TREATMENT__PROCEDURE:
				if (resolve) return getProcedure();
				return basicGetProcedure();
			case ResourcesPackage.SPECIMEN_TREATMENT__ADDITIVE:
				return getAdditives();
			case ResourcesPackage.SPECIMEN_TREATMENT__TIMEX:
				if (resolve) return getTimex();
				return basicGetTimex();
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
			case ResourcesPackage.SPECIMEN_TREATMENT__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SPECIMEN_TREATMENT__PROCEDURE:
				setProcedure((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SPECIMEN_TREATMENT__ADDITIVE:
				getAdditives().clear();
				getAdditives().addAll((Collection<? extends Substance>)newValue);
				return;
			case ResourcesPackage.SPECIMEN_TREATMENT__TIMEX:
				setTimex((DataType)newValue);
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
			case ResourcesPackage.SPECIMEN_TREATMENT__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SPECIMEN_TREATMENT__PROCEDURE:
				setProcedure((CodeableConcept)null);
				return;
			case ResourcesPackage.SPECIMEN_TREATMENT__ADDITIVE:
				getAdditives().clear();
				return;
			case ResourcesPackage.SPECIMEN_TREATMENT__TIMEX:
				setTimex((DataType)null);
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
			case ResourcesPackage.SPECIMEN_TREATMENT__DESCRIPTION:
				return description != null;
			case ResourcesPackage.SPECIMEN_TREATMENT__PROCEDURE:
				return procedure != null;
			case ResourcesPackage.SPECIMEN_TREATMENT__ADDITIVE:
				return additives != null && !additives.isEmpty();
			case ResourcesPackage.SPECIMEN_TREATMENT__TIMEX:
				return timex != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenTreatmentImpl
