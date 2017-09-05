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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataRequirementElement1;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Requirement Element1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementElement1Impl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementElement1Impl#getValueSetx <em>Value Setx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementElement1Impl#getValueCodes <em>Value Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementElement1Impl#getValueCodings <em>Value Coding</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DataRequirementElement1Impl#getValueCodeableConcepts <em>Value Codeable Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataRequirementElement1Impl extends ElementImpl implements DataRequirementElement1 {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String path;

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
	 * The cached value of the '{@link #getValueCodes() <em>Value Code</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> valueCodes;

	/**
	 * The cached value of the '{@link #getValueCodings() <em>Value Coding</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCodings()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> valueCodings;

	/**
	 * The cached value of the '{@link #getValueCodeableConcepts() <em>Value Codeable Concept</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCodeableConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> valueCodeableConcepts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRequirementElement1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.DATA_REQUIREMENT_ELEMENT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getPath() {
		if (path != null && path.eIsProxy()) {
			InternalEObject oldPath = (InternalEObject)path;
			path = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldPath);
			if (path != oldPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__PATH, oldPath, path));
			}
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(org.eclipse.mdht.uml.fhir.core.dataTypes.String newPath) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__PATH, oldPath, path));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_SETX, oldValueSetx, valueSetx));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_SETX, oldValueSetx, valueSetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getValueCodes() {
		if (valueCodes == null) {
			valueCodes = new EObjectResolvingEList<Code>(Code.class, this, DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_CODE);
		}
		return valueCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getValueCodings() {
		if (valueCodings == null) {
			valueCodings = new EObjectResolvingEList<Coding>(Coding.class, this, DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_CODING);
		}
		return valueCodings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getValueCodeableConcepts() {
		if (valueCodeableConcepts == null) {
			valueCodeableConcepts = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_CODEABLE_CONCEPT);
		}
		return valueCodeableConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__PATH:
				if (resolve) return getPath();
				return basicGetPath();
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_SETX:
				if (resolve) return getValueSetx();
				return basicGetValueSetx();
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_CODE:
				return getValueCodes();
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_CODING:
				return getValueCodings();
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_CODEABLE_CONCEPT:
				return getValueCodeableConcepts();
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
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__PATH:
				setPath((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_SETX:
				setValueSetx((Base)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_CODE:
				getValueCodes().clear();
				getValueCodes().addAll((Collection<? extends Code>)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_CODING:
				getValueCodings().clear();
				getValueCodings().addAll((Collection<? extends Coding>)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_CODEABLE_CONCEPT:
				getValueCodeableConcepts().clear();
				getValueCodeableConcepts().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__PATH:
				setPath((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_SETX:
				setValueSetx((Base)null);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_CODE:
				getValueCodes().clear();
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_CODING:
				getValueCodings().clear();
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_CODEABLE_CONCEPT:
				getValueCodeableConcepts().clear();
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
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__PATH:
				return path != null;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_SETX:
				return valueSetx != null;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_CODE:
				return valueCodes != null && !valueCodes.isEmpty();
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_CODING:
				return valueCodings != null && !valueCodings.isEmpty();
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_CODEABLE_CONCEPT:
				return valueCodeableConcepts != null && !valueCodeableConcepts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataRequirementElement1Impl
