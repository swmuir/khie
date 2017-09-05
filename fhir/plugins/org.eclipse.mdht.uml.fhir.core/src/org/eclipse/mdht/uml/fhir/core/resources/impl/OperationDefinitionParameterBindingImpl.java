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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.OperationDefinitionParameterBinding;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Definition Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.OperationDefinitionParameterBindingImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.OperationDefinitionParameterBindingImpl#getValueSetx <em>Value Setx</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationDefinitionParameterBindingImpl extends BackboneElementImpl implements OperationDefinitionParameterBinding {
	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected Code strength;

	/**
	 * The cached value of the '{@link #getValueSetx() <em>Value Setx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetx()
	 * @generated
	 * @ordered
	 */
	protected Base valueSetx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationDefinitionParameterBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getOperationDefinitionParameterBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStrength() {
		if (strength != null && strength.eIsProxy()) {
			InternalEObject oldStrength = (InternalEObject)strength;
			strength = (Code)eResolveProxy(oldStrength);
			if (strength != oldStrength) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING__STRENGTH, oldStrength, strength));
			}
		}
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrength(Code newStrength) {
		Code oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING__STRENGTH, oldStrength, strength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getValueSetx() {
		if (valueSetx != null && valueSetx.eIsProxy()) {
			InternalEObject oldValueSetx = (InternalEObject)valueSetx;
			valueSetx = (Base)eResolveProxy(oldValueSetx);
			if (valueSetx != oldValueSetx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING__VALUE_SETX, oldValueSetx, valueSetx));
			}
		}
		return valueSetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetValueSetx() {
		return valueSetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetx(Base newValueSetx) {
		Base oldValueSetx = valueSetx;
		valueSetx = newValueSetx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING__VALUE_SETX, oldValueSetx, valueSetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING__STRENGTH:
				if (resolve) return getStrength();
				return basicGetStrength();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING__VALUE_SETX:
				if (resolve) return getValueSetx();
				return basicGetValueSetx();
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
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING__STRENGTH:
				setStrength((Code)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING__VALUE_SETX:
				setValueSetx((Base)newValue);
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
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING__STRENGTH:
				setStrength((Code)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING__VALUE_SETX:
				setValueSetx((Base)null);
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
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING__STRENGTH:
				return strength != null;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING__VALUE_SETX:
				return valueSetx != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationDefinitionParameterBindingImpl
