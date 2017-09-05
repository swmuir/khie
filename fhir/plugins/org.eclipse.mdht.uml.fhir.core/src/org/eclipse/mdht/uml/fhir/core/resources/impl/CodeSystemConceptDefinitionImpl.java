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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.CodeSystemConceptDefinition;
import org.eclipse.mdht.uml.fhir.core.resources.CodeSystemConceptDefinitionConceptProperty;
import org.eclipse.mdht.uml.fhir.core.resources.CodeSystemConceptDefinitionDesignation;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System Concept Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemConceptDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemConceptDefinitionImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemConceptDefinitionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemConceptDefinitionImpl#getDesignations <em>Designation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemConceptDefinitionImpl#getProperties <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemConceptDefinitionImpl#getConcepts <em>Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeSystemConceptDefinitionImpl extends BackboneElementImpl implements CodeSystemConceptDefinition {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String display;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String definition;

	/**
	 * The cached value of the '{@link #getDesignations() <em>Designation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignations()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemConceptDefinitionDesignation> designations;

	/**
	 * The cached value of the '{@link #getProperties() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemConceptDefinitionConceptProperty> properties;

	/**
	 * The cached value of the '{@link #getConcepts() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemConceptDefinition> concepts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSystemConceptDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCodeSystemConceptDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (Code)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDisplay() {
		if (display != null && display.eIsProxy()) {
			InternalEObject oldDisplay = (InternalEObject)display;
			display = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDisplay);
			if (display != oldDisplay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY, oldDisplay, display));
			}
		}
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDisplay) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY, oldDisplay, display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(org.eclipse.mdht.uml.fhir.core.dataTypes.String newDefinition) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemConceptDefinitionDesignation> getDesignations() {
		if (designations == null) {
			designations = new EObjectContainmentEList<CodeSystemConceptDefinitionDesignation>(CodeSystemConceptDefinitionDesignation.class, this, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION);
		}
		return designations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemConceptDefinitionConceptProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<CodeSystemConceptDefinitionConceptProperty>(CodeSystemConceptDefinitionConceptProperty.class, this, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__PROPERTY);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemConceptDefinition> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectContainmentEList<CodeSystemConceptDefinition>(CodeSystemConceptDefinition.class, this, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT);
		}
		return concepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION:
				return ((InternalEList<?>)getDesignations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__PROPERTY:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT:
				return ((InternalEList<?>)getConcepts()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY:
				if (resolve) return getDisplay();
				return basicGetDisplay();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION:
				return getDesignations();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__PROPERTY:
				return getProperties();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT:
				return getConcepts();
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
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE:
				setCode((Code)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY:
				setDisplay((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION:
				setDefinition((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION:
				getDesignations().clear();
				getDesignations().addAll((Collection<? extends CodeSystemConceptDefinitionDesignation>)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__PROPERTY:
				getProperties().clear();
				getProperties().addAll((Collection<? extends CodeSystemConceptDefinitionConceptProperty>)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends CodeSystemConceptDefinition>)newValue);
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
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE:
				setCode((Code)null);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY:
				setDisplay((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION:
				setDefinition((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION:
				getDesignations().clear();
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__PROPERTY:
				getProperties().clear();
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT:
				getConcepts().clear();
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
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE:
				return code != null;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY:
				return display != null;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION:
				return definition != null;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION:
				return designations != null && !designations.isEmpty();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__PROPERTY:
				return properties != null && !properties.isEmpty();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT:
				return concepts != null && !concepts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodeSystemConceptDefinitionImpl
