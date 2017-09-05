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
import org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Element1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement1Impl#getDiscriminators <em>Discriminator</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement1Impl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement1Impl#getOrdered <em>Ordered</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement1Impl#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementDefinitionElement1Impl extends ElementImpl implements ElementDefinitionElement1 {
	/**
	 * The cached value of the '{@link #getDiscriminators() <em>Discriminator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminators()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> discriminators;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getOrdered() <em>Ordered</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdered()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean ordered;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected Code rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionElement1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.ELEMENT_DEFINITION_ELEMENT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> getDiscriminators() {
		if (discriminators == null) {
			discriminators = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.dataTypes.String>(org.eclipse.mdht.uml.fhir.core.dataTypes.String.class, this, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR);
		}
		return discriminators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getOrdered() {
		if (ordered != null && ordered.eIsProxy()) {
			InternalEObject oldOrdered = (InternalEObject)ordered;
			ordered = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldOrdered);
			if (ordered != oldOrdered) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__ORDERED, oldOrdered, ordered));
			}
		}
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newOrdered) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__ORDERED, oldOrdered, ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getRules() {
		if (rules != null && rules.eIsProxy()) {
			InternalEObject oldRules = (InternalEObject)rules;
			rules = (Code)eResolveProxy(oldRules);
			if (rules != oldRules) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__RULES, oldRules, rules));
			}
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetRules() {
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRules(Code newRules) {
		Code oldRules = rules;
		rules = newRules;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__RULES, oldRules, rules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR:
				return getDiscriminators();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__ORDERED:
				if (resolve) return getOrdered();
				return basicGetOrdered();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__RULES:
				if (resolve) return getRules();
				return basicGetRules();
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR:
				getDiscriminators().clear();
				getDiscriminators().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.dataTypes.String>)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__ORDERED:
				setOrdered((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__RULES:
				setRules((Code)newValue);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR:
				getDiscriminators().clear();
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__ORDERED:
				setOrdered((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__RULES:
				setRules((Code)null);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR:
				return discriminators != null && !discriminators.isEmpty();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION:
				return description != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__ORDERED:
				return ordered != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__RULES:
				return rules != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionElement1Impl
