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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.ValueSetComposeConceptSet;
import org.eclipse.mdht.uml.fhir.core.resources.ValueSetComposeConceptSetConceptReference;
import org.eclipse.mdht.uml.fhir.core.resources.ValueSetComposeConceptSetFilter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Compose Concept Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ValueSetComposeConceptSetImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ValueSetComposeConceptSetImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ValueSetComposeConceptSetImpl#getConcepts <em>Concept</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ValueSetComposeConceptSetImpl#getFilters <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ValueSetComposeConceptSetImpl#getValueSets <em>Value Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueSetComposeConceptSetImpl extends BackboneElementImpl implements ValueSetComposeConceptSet {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Uri system;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String version;

	/**
	 * The cached value of the '{@link #getConcepts() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetComposeConceptSetConceptReference> concepts;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetComposeConceptSetFilter> filters;

	/**
	 * The cached value of the '{@link #getValueSets() <em>Value Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSets()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> valueSets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetComposeConceptSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getValueSetComposeConceptSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject)system;
			system = (Uri)eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(Uri newSystem) {
		Uri oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getVersion() {
		if (version != null && version.eIsProxy()) {
			InternalEObject oldVersion = (InternalEObject)version;
			version = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldVersion);
			if (version != oldVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VERSION, oldVersion, version));
			}
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.eclipse.mdht.uml.fhir.core.dataTypes.String newVersion) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetComposeConceptSetConceptReference> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectContainmentEList<ValueSetComposeConceptSetConceptReference>(ValueSetComposeConceptSetConceptReference.class, this, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__CONCEPT);
		}
		return concepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetComposeConceptSetFilter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<ValueSetComposeConceptSetFilter>(ValueSetComposeConceptSetFilter.class, this, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__FILTER);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getValueSets() {
		if (valueSets == null) {
			valueSets = new EObjectResolvingEList<Uri>(Uri.class, this, ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VALUE_SET);
		}
		return valueSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__CONCEPT:
				return ((InternalEList<?>)getConcepts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__FILTER:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__CONCEPT:
				return getConcepts();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__FILTER:
				return getFilters();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VALUE_SET:
				return getValueSets();
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
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__SYSTEM:
				setSystem((Uri)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__CONCEPT:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends ValueSetComposeConceptSetConceptReference>)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__FILTER:
				getFilters().clear();
				getFilters().addAll((Collection<? extends ValueSetComposeConceptSetFilter>)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VALUE_SET:
				getValueSets().clear();
				getValueSets().addAll((Collection<? extends Uri>)newValue);
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
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__SYSTEM:
				setSystem((Uri)null);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__CONCEPT:
				getConcepts().clear();
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__FILTER:
				getFilters().clear();
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VALUE_SET:
				getValueSets().clear();
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
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__SYSTEM:
				return system != null;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VERSION:
				return version != null;
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__CONCEPT:
				return concepts != null && !concepts.isEmpty();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__FILTER:
				return filters != null && !filters.isEmpty();
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET__VALUE_SET:
				return valueSets != null && !valueSets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetComposeConceptSetImpl
