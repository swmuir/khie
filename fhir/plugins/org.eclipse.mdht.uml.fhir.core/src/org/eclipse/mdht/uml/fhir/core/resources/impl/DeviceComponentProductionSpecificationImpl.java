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
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.DeviceComponentProductionSpecification;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Component Production Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceComponentProductionSpecificationImpl#getSpecType <em>Spec Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceComponentProductionSpecificationImpl#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.DeviceComponentProductionSpecificationImpl#getProductionSpec <em>Production Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceComponentProductionSpecificationImpl extends BackboneElementImpl implements DeviceComponentProductionSpecification {
	/**
	 * The cached value of the '{@link #getSpecType() <em>Spec Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept specType;

	/**
	 * The cached value of the '{@link #getComponentId() <em>Component Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected Identifier componentId;

	/**
	 * The cached value of the '{@link #getProductionSpec() <em>Production Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionSpec()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String productionSpec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceComponentProductionSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDeviceComponentProductionSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSpecType() {
		if (specType != null && specType.eIsProxy()) {
			InternalEObject oldSpecType = (InternalEObject)specType;
			specType = (CodeableConcept)eResolveProxy(oldSpecType);
			if (specType != oldSpecType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__SPEC_TYPE, oldSpecType, specType));
			}
		}
		return specType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetSpecType() {
		return specType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecType(CodeableConcept newSpecType) {
		CodeableConcept oldSpecType = specType;
		specType = newSpecType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__SPEC_TYPE, oldSpecType, specType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getComponentId() {
		if (componentId != null && componentId.eIsProxy()) {
			InternalEObject oldComponentId = (InternalEObject)componentId;
			componentId = (Identifier)eResolveProxy(oldComponentId);
			if (componentId != oldComponentId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__COMPONENT_ID, oldComponentId, componentId));
			}
		}
		return componentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetComponentId() {
		return componentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentId(Identifier newComponentId) {
		Identifier oldComponentId = componentId;
		componentId = newComponentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__COMPONENT_ID, oldComponentId, componentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getProductionSpec() {
		if (productionSpec != null && productionSpec.eIsProxy()) {
			InternalEObject oldProductionSpec = (InternalEObject)productionSpec;
			productionSpec = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldProductionSpec);
			if (productionSpec != oldProductionSpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__PRODUCTION_SPEC, oldProductionSpec, productionSpec));
			}
		}
		return productionSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetProductionSpec() {
		return productionSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductionSpec(org.eclipse.mdht.uml.fhir.core.dataTypes.String newProductionSpec) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldProductionSpec = productionSpec;
		productionSpec = newProductionSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__PRODUCTION_SPEC, oldProductionSpec, productionSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__SPEC_TYPE:
				if (resolve) return getSpecType();
				return basicGetSpecType();
			case ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__COMPONENT_ID:
				if (resolve) return getComponentId();
				return basicGetComponentId();
			case ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__PRODUCTION_SPEC:
				if (resolve) return getProductionSpec();
				return basicGetProductionSpec();
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
			case ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__SPEC_TYPE:
				setSpecType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__COMPONENT_ID:
				setComponentId((Identifier)newValue);
				return;
			case ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__PRODUCTION_SPEC:
				setProductionSpec((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__SPEC_TYPE:
				setSpecType((CodeableConcept)null);
				return;
			case ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__COMPONENT_ID:
				setComponentId((Identifier)null);
				return;
			case ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__PRODUCTION_SPEC:
				setProductionSpec((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__SPEC_TYPE:
				return specType != null;
			case ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__COMPONENT_ID:
				return componentId != null;
			case ResourcesPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION__PRODUCTION_SPEC:
				return productionSpec != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceComponentProductionSpecificationImpl
