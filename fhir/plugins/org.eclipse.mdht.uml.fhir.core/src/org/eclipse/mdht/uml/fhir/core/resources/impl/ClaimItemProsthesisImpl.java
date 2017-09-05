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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Date;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ClaimItemProsthesis;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Item Prosthesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimItemProsthesisImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimItemProsthesisImpl#getPriorDate <em>Prior Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ClaimItemProsthesisImpl#getPriorMaterial <em>Prior Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimItemProsthesisImpl extends BackboneElementImpl implements ClaimItemProsthesis {
	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean initial;

	/**
	 * The cached value of the '{@link #getPriorDate() <em>Prior Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorDate()
	 * @generated
	 * @ordered
	 */
	protected Date priorDate;

	/**
	 * The cached value of the '{@link #getPriorMaterial() <em>Prior Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorMaterial()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priorMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimItemProsthesisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClaimItemProsthesis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getInitial() {
		if (initial != null && initial.eIsProxy()) {
			InternalEObject oldInitial = (InternalEObject)initial;
			initial = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldInitial);
			if (initial != oldInitial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_ITEM_PROSTHESIS__INITIAL, oldInitial, initial));
			}
		}
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newInitial) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_ITEM_PROSTHESIS__INITIAL, oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPriorDate() {
		if (priorDate != null && priorDate.eIsProxy()) {
			InternalEObject oldPriorDate = (InternalEObject)priorDate;
			priorDate = (Date)eResolveProxy(oldPriorDate);
			if (priorDate != oldPriorDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_ITEM_PROSTHESIS__PRIOR_DATE, oldPriorDate, priorDate));
			}
		}
		return priorDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetPriorDate() {
		return priorDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorDate(Date newPriorDate) {
		Date oldPriorDate = priorDate;
		priorDate = newPriorDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_ITEM_PROSTHESIS__PRIOR_DATE, oldPriorDate, priorDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPriorMaterial() {
		if (priorMaterial != null && priorMaterial.eIsProxy()) {
			InternalEObject oldPriorMaterial = (InternalEObject)priorMaterial;
			priorMaterial = (CodeableConcept)eResolveProxy(oldPriorMaterial);
			if (priorMaterial != oldPriorMaterial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CLAIM_ITEM_PROSTHESIS__PRIOR_MATERIAL, oldPriorMaterial, priorMaterial));
			}
		}
		return priorMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetPriorMaterial() {
		return priorMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorMaterial(CodeableConcept newPriorMaterial) {
		CodeableConcept oldPriorMaterial = priorMaterial;
		priorMaterial = newPriorMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_ITEM_PROSTHESIS__PRIOR_MATERIAL, oldPriorMaterial, priorMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.CLAIM_ITEM_PROSTHESIS__INITIAL:
				if (resolve) return getInitial();
				return basicGetInitial();
			case ResourcesPackage.CLAIM_ITEM_PROSTHESIS__PRIOR_DATE:
				if (resolve) return getPriorDate();
				return basicGetPriorDate();
			case ResourcesPackage.CLAIM_ITEM_PROSTHESIS__PRIOR_MATERIAL:
				if (resolve) return getPriorMaterial();
				return basicGetPriorMaterial();
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
			case ResourcesPackage.CLAIM_ITEM_PROSTHESIS__INITIAL:
				setInitial((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CLAIM_ITEM_PROSTHESIS__PRIOR_DATE:
				setPriorDate((Date)newValue);
				return;
			case ResourcesPackage.CLAIM_ITEM_PROSTHESIS__PRIOR_MATERIAL:
				setPriorMaterial((CodeableConcept)newValue);
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
			case ResourcesPackage.CLAIM_ITEM_PROSTHESIS__INITIAL:
				setInitial((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CLAIM_ITEM_PROSTHESIS__PRIOR_DATE:
				setPriorDate((Date)null);
				return;
			case ResourcesPackage.CLAIM_ITEM_PROSTHESIS__PRIOR_MATERIAL:
				setPriorMaterial((CodeableConcept)null);
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
			case ResourcesPackage.CLAIM_ITEM_PROSTHESIS__INITIAL:
				return initial != null;
			case ResourcesPackage.CLAIM_ITEM_PROSTHESIS__PRIOR_DATE:
				return priorDate != null;
			case ResourcesPackage.CLAIM_ITEM_PROSTHESIS__PRIOR_MATERIAL:
				return priorMaterial != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimItemProsthesisImpl
