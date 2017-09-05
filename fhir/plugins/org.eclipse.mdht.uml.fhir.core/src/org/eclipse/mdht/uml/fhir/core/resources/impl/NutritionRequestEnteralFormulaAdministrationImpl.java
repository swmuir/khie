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
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Timing;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;
import org.eclipse.mdht.uml.fhir.core.resources.NutritionRequestEnteralFormulaAdministration;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Request Enteral Formula Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestEnteralFormulaAdministrationImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestEnteralFormulaAdministrationImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.NutritionRequestEnteralFormulaAdministrationImpl#getRatex <em>Ratex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NutritionRequestEnteralFormulaAdministrationImpl extends BackboneElementImpl implements NutritionRequestEnteralFormulaAdministration {
	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected Timing schedule;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

	/**
	 * The cached value of the '{@link #getRatex() <em>Ratex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatex()
	 * @generated
	 * @ordered
	 */
	protected DataType ratex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionRequestEnteralFormulaAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getNutritionRequestEnteralFormulaAdministration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getSchedule() {
		if (schedule != null && schedule.eIsProxy()) {
			InternalEObject oldSchedule = (InternalEObject)schedule;
			schedule = (Timing)eResolveProxy(oldSchedule);
			if (schedule != oldSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__SCHEDULE, oldSchedule, schedule));
			}
		}
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing basicGetSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Timing newSchedule) {
		Timing oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__SCHEDULE, oldSchedule, schedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getQuantity() {
		if (quantity != null && quantity.eIsProxy()) {
			InternalEObject oldQuantity = (InternalEObject)quantity;
			quantity = (SimpleQuantity)eResolveProxy(oldQuantity);
			if (quantity != oldQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__QUANTITY, oldQuantity, quantity));
			}
		}
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(SimpleQuantity newQuantity) {
		SimpleQuantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getRatex() {
		if (ratex != null && ratex.eIsProxy()) {
			InternalEObject oldRatex = (InternalEObject)ratex;
			ratex = (DataType)eResolveProxy(oldRatex);
			if (ratex != oldRatex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__RATEX, oldRatex, ratex));
			}
		}
		return ratex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetRatex() {
		return ratex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatex(DataType newRatex) {
		DataType oldRatex = ratex;
		ratex = newRatex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__RATEX, oldRatex, ratex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__SCHEDULE:
				if (resolve) return getSchedule();
				return basicGetSchedule();
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__RATEX:
				if (resolve) return getRatex();
				return basicGetRatex();
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
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__SCHEDULE:
				setSchedule((Timing)newValue);
				return;
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__RATEX:
				setRatex((DataType)newValue);
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
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__SCHEDULE:
				setSchedule((Timing)null);
				return;
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__RATEX:
				setRatex((DataType)null);
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
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__SCHEDULE:
				return schedule != null;
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__QUANTITY:
				return quantity != null;
			case ResourcesPackage.NUTRITION_REQUEST_ENTERAL_FORMULA_ADMINISTRATION__RATEX:
				return ratex != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionRequestEnteralFormulaAdministrationImpl
