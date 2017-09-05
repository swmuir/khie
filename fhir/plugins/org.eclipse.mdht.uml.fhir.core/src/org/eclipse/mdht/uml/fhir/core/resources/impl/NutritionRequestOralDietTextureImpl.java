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
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.NutritionRequestOralDietTexture;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Request Oral Diet Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestOralDietTextureImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestOralDietTextureImpl#getFoodType <em>Food Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NutritionRequestOralDietTextureImpl extends BackboneElementImpl implements NutritionRequestOralDietTexture {
	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept modifier;

	/**
	 * The cached value of the '{@link #getFoodType() <em>Food Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept foodType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionRequestOralDietTextureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getNutritionRequestOralDietTexture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getModifier() {
		if (modifier != null && modifier.eIsProxy()) {
			InternalEObject oldModifier = (InternalEObject)modifier;
			modifier = (CodeableConcept)eResolveProxy(oldModifier);
			if (modifier != oldModifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_TEXTURE__MODIFIER, oldModifier, modifier));
			}
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(CodeableConcept newModifier) {
		CodeableConcept oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_TEXTURE__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFoodType() {
		if (foodType != null && foodType.eIsProxy()) {
			InternalEObject oldFoodType = (InternalEObject)foodType;
			foodType = (CodeableConcept)eResolveProxy(oldFoodType);
			if (foodType != oldFoodType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_TEXTURE__FOOD_TYPE, oldFoodType, foodType));
			}
		}
		return foodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetFoodType() {
		return foodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoodType(CodeableConcept newFoodType) {
		CodeableConcept oldFoodType = foodType;
		foodType = newFoodType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_TEXTURE__FOOD_TYPE, oldFoodType, foodType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_TEXTURE__MODIFIER:
				if (resolve) return getModifier();
				return basicGetModifier();
			case ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_TEXTURE__FOOD_TYPE:
				if (resolve) return getFoodType();
				return basicGetFoodType();
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
			case ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_TEXTURE__MODIFIER:
				setModifier((CodeableConcept)newValue);
				return;
			case ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_TEXTURE__FOOD_TYPE:
				setFoodType((CodeableConcept)newValue);
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
			case ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_TEXTURE__MODIFIER:
				setModifier((CodeableConcept)null);
				return;
			case ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_TEXTURE__FOOD_TYPE:
				setFoodType((CodeableConcept)null);
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
			case ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_TEXTURE__MODIFIER:
				return modifier != null;
			case ResourcesPackage.NUTRITION_REQUEST_ORAL_DIET_TEXTURE__FOOD_TYPE:
				return foodType != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionRequestOralDietTextureImpl
