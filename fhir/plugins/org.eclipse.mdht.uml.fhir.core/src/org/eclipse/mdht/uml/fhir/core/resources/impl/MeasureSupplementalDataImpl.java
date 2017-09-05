/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.MeasureSupplementalData;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Supplemental Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureSupplementalDataImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureSupplementalDataImpl#getUsages <em>Usage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureSupplementalDataImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureSupplementalDataImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureSupplementalDataImpl extends BackboneElementImpl implements MeasureSupplementalData {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getUsages() <em>Usage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> usages;

	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String criteria;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureSupplementalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMeasureSupplementalData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (Identifier)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getUsages() {
		if (usages == null) {
			usages = new EObjectResolvingEList<Code>(Code.class, this, ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__USAGE);
		}
		return usages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getCriteria() {
		if (criteria != null && criteria.eIsProxy()) {
			InternalEObject oldCriteria = (InternalEObject)criteria;
			criteria = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldCriteria);
			if (criteria != oldCriteria) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__CRITERIA, oldCriteria, criteria));
			}
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetCriteria() {
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteria(org.eclipse.mdht.uml.fhir.core.dataTypes.String newCriteria) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldCriteria = criteria;
		criteria = newCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__CRITERIA, oldCriteria, criteria));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__USAGE:
				return getUsages();
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__CRITERIA:
				if (resolve) return getCriteria();
				return basicGetCriteria();
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__PATH:
				if (resolve) return getPath();
				return basicGetPath();
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
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__USAGE:
				getUsages().clear();
				getUsages().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__CRITERIA:
				setCriteria((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__PATH:
				setPath((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__USAGE:
				getUsages().clear();
				return;
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__CRITERIA:
				setCriteria((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__PATH:
				setPath((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__USAGE:
				return usages != null && !usages.isEmpty();
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__CRITERIA:
				return criteria != null;
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA__PATH:
				return path != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureSupplementalDataImpl
