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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Id;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRule;
import org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleDependent;
import org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource;
import org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Map Group Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleImpl#getRules <em>Rule</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleImpl#getDependents <em>Dependent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.StructureMapGroupRuleImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureMapGroupRuleImpl extends BackboneElementImpl implements StructureMapGroupRule {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Id name;

	/**
	 * The cached value of the '{@link #getSources() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapGroupRuleSource> sources;

	/**
	 * The cached value of the '{@link #getTargets() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapGroupRuleTarget> targets;

	/**
	 * The cached value of the '{@link #getRules() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapGroupRule> rules;

	/**
	 * The cached value of the '{@link #getDependents() <em>Dependent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependents()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapGroupRuleDependent> dependents;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String documentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureMapGroupRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getStructureMapGroupRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (Id)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Id newName) {
		Id oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapGroupRuleSource> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<StructureMapGroupRuleSource>(StructureMapGroupRuleSource.class, this, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__SOURCE);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapGroupRuleTarget> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<StructureMapGroupRuleTarget>(StructureMapGroupRuleTarget.class, this, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__TARGET);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapGroupRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<StructureMapGroupRule>(StructureMapGroupRule.class, this, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__RULE);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapGroupRuleDependent> getDependents() {
		if (dependents == null) {
			dependents = new EObjectContainmentEList<StructureMapGroupRuleDependent>(StructureMapGroupRuleDependent.class, this, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DEPENDENT);
		}
		return dependents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDocumentation() {
		if (documentation != null && documentation.eIsProxy()) {
			InternalEObject oldDocumentation = (InternalEObject)documentation;
			documentation = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDocumentation);
			if (documentation != oldDocumentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DOCUMENTATION, oldDocumentation, documentation));
			}
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDocumentation) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__SOURCE:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__TARGET:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__RULE:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DEPENDENT:
				return ((InternalEList<?>)getDependents()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__SOURCE:
				return getSources();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__TARGET:
				return getTargets();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__RULE:
				return getRules();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DEPENDENT:
				return getDependents();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DOCUMENTATION:
				if (resolve) return getDocumentation();
				return basicGetDocumentation();
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__NAME:
				setName((Id)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__SOURCE:
				getSources().clear();
				getSources().addAll((Collection<? extends StructureMapGroupRuleSource>)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__TARGET:
				getTargets().clear();
				getTargets().addAll((Collection<? extends StructureMapGroupRuleTarget>)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__RULE:
				getRules().clear();
				getRules().addAll((Collection<? extends StructureMapGroupRule>)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DEPENDENT:
				getDependents().clear();
				getDependents().addAll((Collection<? extends StructureMapGroupRuleDependent>)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__NAME:
				setName((Id)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__SOURCE:
				getSources().clear();
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__TARGET:
				getTargets().clear();
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__RULE:
				getRules().clear();
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DEPENDENT:
				getDependents().clear();
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DOCUMENTATION:
				setDocumentation((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__NAME:
				return name != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__SOURCE:
				return sources != null && !sources.isEmpty();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__TARGET:
				return targets != null && !targets.isEmpty();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__RULE:
				return rules != null && !rules.isEmpty();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DEPENDENT:
				return dependents != null && !dependents.isEmpty();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DOCUMENTATION:
				return documentation != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureMapGroupRuleImpl
