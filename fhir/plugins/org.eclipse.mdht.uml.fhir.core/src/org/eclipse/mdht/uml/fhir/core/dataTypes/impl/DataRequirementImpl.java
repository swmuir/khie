/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement2;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementImpl#getProfiles <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementImpl#getMustSupports <em>Must Support</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementImpl#getCodeFilters <em>Code Filter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementImpl#getDateFilters <em>Date Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataRequirementImpl extends DataTypeImpl implements DataRequirement {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getProfiles() <em>Profile</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> profiles;

	/**
	 * The cached value of the '{@link #getMustSupports() <em>Must Support</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustSupports()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> mustSupports;

	/**
	 * The cached value of the '{@link #getCodeFilters() <em>Code Filter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirementElement1> codeFilters;

	/**
	 * The cached value of the '{@link #getDateFilters() <em>Date Filter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirementElement2> dateFilters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.DATA_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Code)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.DATA_REQUIREMENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getProfiles() {
		if (profiles == null) {
			profiles = new EObjectResolvingEList<Uri>(Uri.class, this, DataTypesPackage.DATA_REQUIREMENT__PROFILE);
		}
		return profiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> getMustSupports() {
		if (mustSupports == null) {
			mustSupports = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.dataTypes.String>(org.eclipse.mdht.uml.fhir.core.dataTypes.String.class, this, DataTypesPackage.DATA_REQUIREMENT__MUST_SUPPORT);
		}
		return mustSupports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRequirementElement1> getCodeFilters() {
		if (codeFilters == null) {
			codeFilters = new EObjectResolvingEList<DataRequirementElement1>(DataRequirementElement1.class, this, DataTypesPackage.DATA_REQUIREMENT__CODE_FILTER);
		}
		return codeFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRequirementElement2> getDateFilters() {
		if (dateFilters == null) {
			dateFilters = new EObjectResolvingEList<DataRequirementElement2>(DataRequirementElement2.class, this, DataTypesPackage.DATA_REQUIREMENT__DATE_FILTER);
		}
		return dateFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.DATA_REQUIREMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case DataTypesPackage.DATA_REQUIREMENT__PROFILE:
				return getProfiles();
			case DataTypesPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				return getMustSupports();
			case DataTypesPackage.DATA_REQUIREMENT__CODE_FILTER:
				return getCodeFilters();
			case DataTypesPackage.DATA_REQUIREMENT__DATE_FILTER:
				return getDateFilters();
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
			case DataTypesPackage.DATA_REQUIREMENT__TYPE:
				setType((Code)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT__PROFILE:
				getProfiles().clear();
				getProfiles().addAll((Collection<? extends Uri>)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				getMustSupports().clear();
				getMustSupports().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.dataTypes.String>)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT__CODE_FILTER:
				getCodeFilters().clear();
				getCodeFilters().addAll((Collection<? extends DataRequirementElement1>)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT__DATE_FILTER:
				getDateFilters().clear();
				getDateFilters().addAll((Collection<? extends DataRequirementElement2>)newValue);
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
			case DataTypesPackage.DATA_REQUIREMENT__TYPE:
				setType((Code)null);
				return;
			case DataTypesPackage.DATA_REQUIREMENT__PROFILE:
				getProfiles().clear();
				return;
			case DataTypesPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				getMustSupports().clear();
				return;
			case DataTypesPackage.DATA_REQUIREMENT__CODE_FILTER:
				getCodeFilters().clear();
				return;
			case DataTypesPackage.DATA_REQUIREMENT__DATE_FILTER:
				getDateFilters().clear();
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
			case DataTypesPackage.DATA_REQUIREMENT__TYPE:
				return type != null;
			case DataTypesPackage.DATA_REQUIREMENT__PROFILE:
				return profiles != null && !profiles.isEmpty();
			case DataTypesPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				return mustSupports != null && !mustSupports.isEmpty();
			case DataTypesPackage.DATA_REQUIREMENT__CODE_FILTER:
				return codeFilters != null && !codeFilters.isEmpty();
			case DataTypesPackage.DATA_REQUIREMENT__DATE_FILTER:
				return dateFilters != null && !dateFilters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataRequirementImpl
