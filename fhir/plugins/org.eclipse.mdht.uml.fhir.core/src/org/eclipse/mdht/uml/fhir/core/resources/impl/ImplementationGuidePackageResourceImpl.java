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
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ImplementationGuidePackageResource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.StructureDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Package Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuidePackageResourceImpl#getExample <em>Example</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuidePackageResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuidePackageResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuidePackageResourceImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuidePackageResourceImpl#getSourcex <em>Sourcex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuidePackageResourceImpl#getExampleFor <em>Example For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationGuidePackageResourceImpl extends BackboneElementImpl implements ImplementationGuidePackageResource {
	/**
	 * The cached value of the '{@link #getExample() <em>Example</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean example;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String name;

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
	 * The cached value of the '{@link #getAcronym() <em>Acronym</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcronym()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String acronym;

	/**
	 * The cached value of the '{@link #getSourcex() <em>Sourcex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcex()
	 * @generated
	 * @ordered
	 */
	protected Base sourcex;

	/**
	 * The cached value of the '{@link #getExampleFor() <em>Example For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleFor()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinition exampleFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuidePackageResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImplementationGuidePackageResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getExample() {
		if (example != null && example.eIsProxy()) {
			InternalEObject oldExample = (InternalEObject)example;
			example = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldExample);
			if (example != oldExample) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE, oldExample, example));
			}
		}
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetExample() {
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExample(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newExample) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldExample = example;
		example = newExample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE, oldExample, example));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.eclipse.mdht.uml.fhir.core.dataTypes.String newName) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getAcronym() {
		if (acronym != null && acronym.eIsProxy()) {
			InternalEObject oldAcronym = (InternalEObject)acronym;
			acronym = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldAcronym);
			if (acronym != oldAcronym) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__ACRONYM, oldAcronym, acronym));
			}
		}
		return acronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetAcronym() {
		return acronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcronym(org.eclipse.mdht.uml.fhir.core.dataTypes.String newAcronym) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldAcronym = acronym;
		acronym = newAcronym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__ACRONYM, oldAcronym, acronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getSourcex() {
		if (sourcex != null && sourcex.eIsProxy()) {
			InternalEObject oldSourcex = (InternalEObject)sourcex;
			sourcex = (Base)eResolveProxy(oldSourcex);
			if (sourcex != oldSourcex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__SOURCEX, oldSourcex, sourcex));
			}
		}
		return sourcex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetSourcex() {
		return sourcex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcex(Base newSourcex) {
		Base oldSourcex = sourcex;
		sourcex = newSourcex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__SOURCEX, oldSourcex, sourcex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getExampleFor() {
		if (exampleFor != null && exampleFor.eIsProxy()) {
			InternalEObject oldExampleFor = (InternalEObject)exampleFor;
			exampleFor = (StructureDefinition)eResolveProxy(oldExampleFor);
			if (exampleFor != oldExampleFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE_FOR, oldExampleFor, exampleFor));
			}
		}
		return exampleFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition basicGetExampleFor() {
		return exampleFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleFor(StructureDefinition newExampleFor) {
		StructureDefinition oldExampleFor = exampleFor;
		exampleFor = newExampleFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE_FOR, oldExampleFor, exampleFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE:
				if (resolve) return getExample();
				return basicGetExample();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__ACRONYM:
				if (resolve) return getAcronym();
				return basicGetAcronym();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__SOURCEX:
				if (resolve) return getSourcex();
				return basicGetSourcex();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE_FOR:
				if (resolve) return getExampleFor();
				return basicGetExampleFor();
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE:
				setExample((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__ACRONYM:
				setAcronym((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__SOURCEX:
				setSourcex((Base)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE_FOR:
				setExampleFor((StructureDefinition)newValue);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE:
				setExample((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__ACRONYM:
				setAcronym((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__SOURCEX:
				setSourcex((Base)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE_FOR:
				setExampleFor((StructureDefinition)null);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE:
				return example != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__NAME:
				return name != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__DESCRIPTION:
				return description != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__ACRONYM:
				return acronym != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__SOURCEX:
				return sourcex != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE__EXAMPLE_FOR:
				return exampleFor != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuidePackageResourceImpl
