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
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage;
import org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement3;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Element3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement3Impl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement3Impl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement3Impl#getTargetProfile <em>Target Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement3Impl#getAggregations <em>Aggregation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement3Impl#getVersioning <em>Versioning</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementDefinitionElement3Impl extends ElementImpl implements ElementDefinitionElement3 {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Uri code;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected Uri profile;

	/**
	 * The cached value of the '{@link #getTargetProfile() <em>Target Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProfile()
	 * @generated
	 * @ordered
	 */
	protected Uri targetProfile;

	/**
	 * The cached value of the '{@link #getAggregations() <em>Aggregation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> aggregations;

	/**
	 * The cached value of the '{@link #getVersioning() <em>Versioning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioning()
	 * @generated
	 * @ordered
	 */
	protected Code versioning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionElement3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.ELEMENT_DEFINITION_ELEMENT3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (Uri)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Uri newCode) {
		Uri oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getProfile() {
		if (profile != null && profile.eIsProxy()) {
			InternalEObject oldProfile = (InternalEObject)profile;
			profile = (Uri)eResolveProxy(oldProfile);
			if (profile != oldProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__PROFILE, oldProfile, profile));
			}
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(Uri newProfile) {
		Uri oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getTargetProfile() {
		if (targetProfile != null && targetProfile.eIsProxy()) {
			InternalEObject oldTargetProfile = (InternalEObject)targetProfile;
			targetProfile = (Uri)eResolveProxy(oldTargetProfile);
			if (targetProfile != oldTargetProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE, oldTargetProfile, targetProfile));
			}
		}
		return targetProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetTargetProfile() {
		return targetProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetProfile(Uri newTargetProfile) {
		Uri oldTargetProfile = targetProfile;
		targetProfile = newTargetProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE, oldTargetProfile, targetProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getAggregations() {
		if (aggregations == null) {
			aggregations = new EObjectResolvingEList<Code>(Code.class, this, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__AGGREGATION);
		}
		return aggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getVersioning() {
		if (versioning != null && versioning.eIsProxy()) {
			InternalEObject oldVersioning = (InternalEObject)versioning;
			versioning = (Code)eResolveProxy(oldVersioning);
			if (versioning != oldVersioning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING, oldVersioning, versioning));
			}
		}
		return versioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetVersioning() {
		return versioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersioning(Code newVersioning) {
		Code oldVersioning = versioning;
		versioning = newVersioning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING, oldVersioning, versioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__PROFILE:
				if (resolve) return getProfile();
				return basicGetProfile();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE:
				if (resolve) return getTargetProfile();
				return basicGetTargetProfile();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__AGGREGATION:
				return getAggregations();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING:
				if (resolve) return getVersioning();
				return basicGetVersioning();
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE:
				setCode((Uri)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__PROFILE:
				setProfile((Uri)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE:
				setTargetProfile((Uri)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__AGGREGATION:
				getAggregations().clear();
				getAggregations().addAll((Collection<? extends Code>)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING:
				setVersioning((Code)newValue);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE:
				setCode((Uri)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__PROFILE:
				setProfile((Uri)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE:
				setTargetProfile((Uri)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__AGGREGATION:
				getAggregations().clear();
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING:
				setVersioning((Code)null);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE:
				return code != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__PROFILE:
				return profile != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE:
				return targetProfile != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__AGGREGATION:
				return aggregations != null && !aggregations.isEmpty();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING:
				return versioning != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionElement3Impl
