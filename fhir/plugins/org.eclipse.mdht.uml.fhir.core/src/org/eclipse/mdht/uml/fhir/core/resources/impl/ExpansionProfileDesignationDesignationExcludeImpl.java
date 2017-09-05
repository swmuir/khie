/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ExpansionProfileDesignationDesignationExclude;
import org.eclipse.mdht.uml.fhir.core.resources.ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Profile Designation Designation Exclude</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileDesignationDesignationExcludeImpl#getDesignations <em>Designation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionProfileDesignationDesignationExcludeImpl extends BackboneElementImpl implements ExpansionProfileDesignationDesignationExclude {
	/**
	 * The cached value of the '{@link #getDesignations() <em>Designation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignations()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation> designations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionProfileDesignationDesignationExcludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getExpansionProfileDesignationDesignationExclude();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation> getDesignations() {
		if (designations == null) {
			designations = new EObjectContainmentEList<ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation>(ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation.class, this, ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE__DESIGNATION);
		}
		return designations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE__DESIGNATION:
				return ((InternalEList<?>)getDesignations()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE__DESIGNATION:
				return getDesignations();
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
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE__DESIGNATION:
				getDesignations().clear();
				getDesignations().addAll((Collection<? extends ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation>)newValue);
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
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE__DESIGNATION:
				getDesignations().clear();
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
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE__DESIGNATION:
				return designations != null && !designations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExpansionProfileDesignationDesignationExcludeImpl
