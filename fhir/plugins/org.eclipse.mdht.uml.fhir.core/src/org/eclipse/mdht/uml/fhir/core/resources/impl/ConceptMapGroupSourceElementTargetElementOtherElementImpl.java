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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ConceptMapGroupSourceElementTargetElementOtherElement;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map Group Source Element Target Element Other Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConceptMapGroupSourceElementTargetElementOtherElementImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConceptMapGroupSourceElementTargetElementOtherElementImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConceptMapGroupSourceElementTargetElementOtherElementImpl#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptMapGroupSourceElementTargetElementOtherElementImpl extends BackboneElementImpl implements ConceptMapGroupSourceElementTargetElementOtherElement {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Uri property;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Uri system;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String code;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapGroupSourceElementTargetElementOtherElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getConceptMapGroupSourceElementTargetElementOtherElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (Uri)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(Uri newProperty) {
		Uri oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject)system;
			system = (Uri)eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(Uri newSystem) {
		Uri oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(org.eclipse.mdht.uml.fhir.core.dataTypes.String newCode) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE:
				if (resolve) return getCode();
				return basicGetCode();
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
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__PROPERTY:
				setProperty((Uri)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__SYSTEM:
				setSystem((Uri)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE:
				setCode((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__PROPERTY:
				setProperty((Uri)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__SYSTEM:
				setSystem((Uri)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE:
				setCode((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__PROPERTY:
				return property != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__SYSTEM:
				return system != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT__CODE:
				return code != null;
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapGroupSourceElementTargetElementOtherElementImpl
