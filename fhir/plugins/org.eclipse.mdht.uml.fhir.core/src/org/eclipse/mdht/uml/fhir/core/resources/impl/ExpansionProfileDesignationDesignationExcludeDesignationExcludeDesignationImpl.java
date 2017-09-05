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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Profile Designation Designation Exclude Designation Exclude Designation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignationImpl#getUse <em>Use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignationImpl extends BackboneElementImpl implements ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation {
	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Code language;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Coding use;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getLanguage() {
		if (language != null && language.eIsProxy()) {
			InternalEObject oldLanguage = (InternalEObject)language;
			language = (Code)eResolveProxy(oldLanguage);
			if (language != oldLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__LANGUAGE, oldLanguage, language));
			}
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Code newLanguage) {
		Code oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getUse() {
		if (use != null && use.eIsProxy()) {
			InternalEObject oldUse = (InternalEObject)use;
			use = (Coding)eResolveProxy(oldUse);
			if (use != oldUse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__USE, oldUse, use));
			}
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Coding newUse) {
		Coding oldUse = use;
		use = newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__USE, oldUse, use));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__LANGUAGE:
				if (resolve) return getLanguage();
				return basicGetLanguage();
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__USE:
				if (resolve) return getUse();
				return basicGetUse();
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
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__LANGUAGE:
				setLanguage((Code)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__USE:
				setUse((Coding)newValue);
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
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__LANGUAGE:
				setLanguage((Code)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__USE:
				setUse((Coding)null);
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
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__LANGUAGE:
				return language != null;
			case ResourcesPackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION__USE:
				return use != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignationImpl
