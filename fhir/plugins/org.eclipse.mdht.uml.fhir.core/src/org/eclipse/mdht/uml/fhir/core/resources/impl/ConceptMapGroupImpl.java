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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ConceptMapGroup;
import org.eclipse.mdht.uml.fhir.core.resources.ConceptMapGroupSourceElement;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConceptMapGroupImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConceptMapGroupImpl#getSourceVersion <em>Source Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConceptMapGroupImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConceptMapGroupImpl#getTargetVersion <em>Target Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ConceptMapGroupImpl#getElements <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptMapGroupImpl extends BackboneElementImpl implements ConceptMapGroup {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Uri source;

	/**
	 * The cached value of the '{@link #getSourceVersion() <em>Source Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVersion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String sourceVersion;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Uri target;

	/**
	 * The cached value of the '{@link #getTargetVersion() <em>Target Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVersion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String targetVersion;

	/**
	 * The cached value of the '{@link #getElements() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapGroupSourceElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getConceptMapGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Uri)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Uri newSource) {
		Uri oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getSourceVersion() {
		if (sourceVersion != null && sourceVersion.eIsProxy()) {
			InternalEObject oldSourceVersion = (InternalEObject)sourceVersion;
			sourceVersion = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldSourceVersion);
			if (sourceVersion != oldSourceVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION, oldSourceVersion, sourceVersion));
			}
		}
		return sourceVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetSourceVersion() {
		return sourceVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceVersion(org.eclipse.mdht.uml.fhir.core.dataTypes.String newSourceVersion) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldSourceVersion = sourceVersion;
		sourceVersion = newSourceVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION, oldSourceVersion, sourceVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Uri)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONCEPT_MAP_GROUP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Uri newTarget) {
		Uri oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getTargetVersion() {
		if (targetVersion != null && targetVersion.eIsProxy()) {
			InternalEObject oldTargetVersion = (InternalEObject)targetVersion;
			targetVersion = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldTargetVersion);
			if (targetVersion != oldTargetVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CONCEPT_MAP_GROUP__TARGET_VERSION, oldTargetVersion, targetVersion));
			}
		}
		return targetVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetTargetVersion() {
		return targetVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVersion(org.eclipse.mdht.uml.fhir.core.dataTypes.String newTargetVersion) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldTargetVersion = targetVersion;
		targetVersion = newTargetVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP__TARGET_VERSION, oldTargetVersion, targetVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptMapGroupSourceElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ConceptMapGroupSourceElement>(ConceptMapGroupSourceElement.class, this, ResourcesPackage.CONCEPT_MAP_GROUP__ELEMENT);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONCEPT_MAP_GROUP__ELEMENT:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION:
				if (resolve) return getSourceVersion();
				return basicGetSourceVersion();
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET_VERSION:
				if (resolve) return getTargetVersion();
				return basicGetTargetVersion();
			case ResourcesPackage.CONCEPT_MAP_GROUP__ELEMENT:
				return getElements();
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
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE:
				setSource((Uri)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION:
				setSourceVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET:
				setTarget((Uri)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET_VERSION:
				setTargetVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__ELEMENT:
				getElements().clear();
				getElements().addAll((Collection<? extends ConceptMapGroupSourceElement>)newValue);
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
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE:
				setSource((Uri)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION:
				setSourceVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET:
				setTarget((Uri)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET_VERSION:
				setTargetVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__ELEMENT:
				getElements().clear();
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
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE:
				return source != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION:
				return sourceVersion != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET:
				return target != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET_VERSION:
				return targetVersion != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP__ELEMENT:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapGroupImpl
