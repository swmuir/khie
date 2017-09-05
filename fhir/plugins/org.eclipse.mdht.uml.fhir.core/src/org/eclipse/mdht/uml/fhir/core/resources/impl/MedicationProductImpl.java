/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.MedicationProduct;
import org.eclipse.mdht.uml.fhir.core.resources.MedicationProductBatch;
import org.eclipse.mdht.uml.fhir.core.resources.MedicationProductIngredient;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationProductImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationProductImpl#getIngredients <em>Ingredient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationProductImpl#getBatchs <em>Batch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationProductImpl extends BackboneElementImpl implements MedicationProduct {
	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept form;

	/**
	 * The cached value of the '{@link #getIngredients() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredients()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationProductIngredient> ingredients;

	/**
	 * The cached value of the '{@link #getBatchs() <em>Batch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchs()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationProductBatch> batchs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getForm() {
		if (form != null && form.eIsProxy()) {
			InternalEObject oldForm = (InternalEObject)form;
			form = (CodeableConcept)eResolveProxy(oldForm);
			if (form != oldForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_PRODUCT__FORM, oldForm, form));
			}
		}
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(CodeableConcept newForm) {
		CodeableConcept oldForm = form;
		form = newForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_PRODUCT__FORM, oldForm, form));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationProductIngredient> getIngredients() {
		if (ingredients == null) {
			ingredients = new EObjectContainmentEList<MedicationProductIngredient>(MedicationProductIngredient.class, this, ResourcesPackage.MEDICATION_PRODUCT__INGREDIENT);
		}
		return ingredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationProductBatch> getBatchs() {
		if (batchs == null) {
			batchs = new EObjectContainmentEList<MedicationProductBatch>(MedicationProductBatch.class, this, ResourcesPackage.MEDICATION_PRODUCT__BATCH);
		}
		return batchs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_PRODUCT__INGREDIENT:
				return ((InternalEList<?>)getIngredients()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_PRODUCT__BATCH:
				return ((InternalEList<?>)getBatchs()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICATION_PRODUCT__FORM:
				if (resolve) return getForm();
				return basicGetForm();
			case ResourcesPackage.MEDICATION_PRODUCT__INGREDIENT:
				return getIngredients();
			case ResourcesPackage.MEDICATION_PRODUCT__BATCH:
				return getBatchs();
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
			case ResourcesPackage.MEDICATION_PRODUCT__FORM:
				setForm((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_PRODUCT__INGREDIENT:
				getIngredients().clear();
				getIngredients().addAll((Collection<? extends MedicationProductIngredient>)newValue);
				return;
			case ResourcesPackage.MEDICATION_PRODUCT__BATCH:
				getBatchs().clear();
				getBatchs().addAll((Collection<? extends MedicationProductBatch>)newValue);
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
			case ResourcesPackage.MEDICATION_PRODUCT__FORM:
				setForm((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_PRODUCT__INGREDIENT:
				getIngredients().clear();
				return;
			case ResourcesPackage.MEDICATION_PRODUCT__BATCH:
				getBatchs().clear();
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
			case ResourcesPackage.MEDICATION_PRODUCT__FORM:
				return form != null;
			case ResourcesPackage.MEDICATION_PRODUCT__INGREDIENT:
				return ingredients != null && !ingredients.isEmpty();
			case ResourcesPackage.MEDICATION_PRODUCT__BATCH:
				return batchs != null && !batchs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationProductImpl
