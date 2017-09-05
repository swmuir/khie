/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage;
import org.eclipse.mdht.uml.fhir.core.dataTypes.ElementDefinitionElement5;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Id;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Element5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement5Impl#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement5Impl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement5Impl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement5Impl#getHuman <em>Human</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement5Impl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement5Impl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.ElementDefinitionElement5Impl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementDefinitionElement5Impl extends ElementImpl implements ElementDefinitionElement5 {
	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Id key;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String requirements;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Code severity;

	/**
	 * The cached value of the '{@link #getHuman() <em>Human</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHuman()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String human;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String expression;

	/**
	 * The cached value of the '{@link #getXpath() <em>Xpath</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpath()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String xpath;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionElement5Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.ELEMENT_DEFINITION_ELEMENT5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getKey() {
		if (key != null && key.eIsProxy()) {
			InternalEObject oldKey = (InternalEObject)key;
			key = (Id)eResolveProxy(oldKey);
			if (key != oldKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__KEY, oldKey, key));
			}
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Id newKey) {
		Id oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getRequirements() {
		if (requirements != null && requirements.eIsProxy()) {
			InternalEObject oldRequirements = (InternalEObject)requirements;
			requirements = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldRequirements);
			if (requirements != oldRequirements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS, oldRequirements, requirements));
			}
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(org.eclipse.mdht.uml.fhir.core.dataTypes.String newRequirements) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS, oldRequirements, requirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getSeverity() {
		if (severity != null && severity.eIsProxy()) {
			InternalEObject oldSeverity = (InternalEObject)severity;
			severity = (Code)eResolveProxy(oldSeverity);
			if (severity != oldSeverity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SEVERITY, oldSeverity, severity));
			}
		}
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(Code newSeverity) {
		Code oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getHuman() {
		if (human != null && human.eIsProxy()) {
			InternalEObject oldHuman = (InternalEObject)human;
			human = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldHuman);
			if (human != oldHuman) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__HUMAN, oldHuman, human));
			}
		}
		return human;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetHuman() {
		return human;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHuman(org.eclipse.mdht.uml.fhir.core.dataTypes.String newHuman) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldHuman = human;
		human = newHuman;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__HUMAN, oldHuman, human));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getExpression() {
		if (expression != null && expression.eIsProxy()) {
			InternalEObject oldExpression = (InternalEObject)expression;
			expression = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldExpression);
			if (expression != oldExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__EXPRESSION, oldExpression, expression));
			}
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(org.eclipse.mdht.uml.fhir.core.dataTypes.String newExpression) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getXpath() {
		if (xpath != null && xpath.eIsProxy()) {
			InternalEObject oldXpath = (InternalEObject)xpath;
			xpath = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldXpath);
			if (xpath != oldXpath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__XPATH, oldXpath, xpath));
			}
		}
		return xpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetXpath() {
		return xpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpath(org.eclipse.mdht.uml.fhir.core.dataTypes.String newXpath) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldXpath = xpath;
		xpath = newXpath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__XPATH, oldXpath, xpath));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__KEY:
				if (resolve) return getKey();
				return basicGetKey();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS:
				if (resolve) return getRequirements();
				return basicGetRequirements();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SEVERITY:
				if (resolve) return getSeverity();
				return basicGetSeverity();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__HUMAN:
				if (resolve) return getHuman();
				return basicGetHuman();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__EXPRESSION:
				if (resolve) return getExpression();
				return basicGetExpression();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__XPATH:
				if (resolve) return getXpath();
				return basicGetXpath();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__KEY:
				setKey((Id)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS:
				setRequirements((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SEVERITY:
				setSeverity((Code)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__HUMAN:
				setHuman((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__EXPRESSION:
				setExpression((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__XPATH:
				setXpath((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SOURCE:
				setSource((Uri)newValue);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__KEY:
				setKey((Id)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS:
				setRequirements((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SEVERITY:
				setSeverity((Code)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__HUMAN:
				setHuman((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__EXPRESSION:
				setExpression((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__XPATH:
				setXpath((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SOURCE:
				setSource((Uri)null);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__KEY:
				return key != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS:
				return requirements != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SEVERITY:
				return severity != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__HUMAN:
				return human != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__EXPRESSION:
				return expression != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__XPATH:
				return xpath != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SOURCE:
				return source != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionElement5Impl
