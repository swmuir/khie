/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Id;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssert;
import org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssertActionAssertRule;
import org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionAssertActionAssertRuleset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Setup Setup Action Assert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getCompareToSourceId <em>Compare To Source Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getCompareToSourceExpression <em>Compare To Source Expression</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getCompareToSourcePath <em>Compare To Source Path</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getHeaderField <em>Header Field</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getMinimumId <em>Minimum Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getNavigationLinks <em>Navigation Links</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getRequestUrl <em>Request Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getValidateProfileId <em>Validate Profile Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionAssertImpl#getWarningOnly <em>Warning Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestScriptSetupSetupActionAssertImpl extends BackboneElementImpl implements TestScriptSetupSetupActionAssert {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String label;

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
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Code direction;

	/**
	 * The cached value of the '{@link #getCompareToSourceId() <em>Compare To Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareToSourceId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String compareToSourceId;

	/**
	 * The cached value of the '{@link #getCompareToSourceExpression() <em>Compare To Source Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareToSourceExpression()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String compareToSourceExpression;

	/**
	 * The cached value of the '{@link #getCompareToSourcePath() <em>Compare To Source Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareToSourcePath()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String compareToSourcePath;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected Code contentType;

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
	 * The cached value of the '{@link #getHeaderField() <em>Header Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderField()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String headerField;

	/**
	 * The cached value of the '{@link #getMinimumId() <em>Minimum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String minimumId;

	/**
	 * The cached value of the '{@link #getNavigationLinks() <em>Navigation Links</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationLinks()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean navigationLinks;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Code operator;

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
	 * The cached value of the '{@link #getRequestUrl() <em>Request Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestUrl()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String requestUrl;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Code resource;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Code response;

	/**
	 * The cached value of the '{@link #getResponseCode() <em>Response Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCode()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String responseCode;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected TestScriptSetupSetupActionAssertActionAssertRule rule;

	/**
	 * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleset()
	 * @generated
	 * @ordered
	 */
	protected TestScriptSetupSetupActionAssertActionAssertRuleset ruleset;

	/**
	 * The cached value of the '{@link #getSourceId() <em>Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceId()
	 * @generated
	 * @ordered
	 */
	protected Id sourceId;

	/**
	 * The cached value of the '{@link #getValidateProfileId() <em>Validate Profile Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateProfileId()
	 * @generated
	 * @ordered
	 */
	protected Id validateProfileId;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String value;

	/**
	 * The cached value of the '{@link #getWarningOnly() <em>Warning Only</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningOnly()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean warningOnly;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptSetupSetupActionAssertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTestScriptSetupSetupActionAssert();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getLabel() {
		if (label != null && label.eIsProxy()) {
			InternalEObject oldLabel = (InternalEObject)label;
			label = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldLabel);
			if (label != oldLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL, oldLabel, label));
			}
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(org.eclipse.mdht.uml.fhir.core.dataTypes.String newLabel) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL, oldLabel, label));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getDirection() {
		if (direction != null && direction.eIsProxy()) {
			InternalEObject oldDirection = (InternalEObject)direction;
			direction = (Code)eResolveProxy(oldDirection);
			if (direction != oldDirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION, oldDirection, direction));
			}
		}
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Code newDirection) {
		Code oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getCompareToSourceId() {
		if (compareToSourceId != null && compareToSourceId.eIsProxy()) {
			InternalEObject oldCompareToSourceId = (InternalEObject)compareToSourceId;
			compareToSourceId = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldCompareToSourceId);
			if (compareToSourceId != oldCompareToSourceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID, oldCompareToSourceId, compareToSourceId));
			}
		}
		return compareToSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetCompareToSourceId() {
		return compareToSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompareToSourceId(org.eclipse.mdht.uml.fhir.core.dataTypes.String newCompareToSourceId) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldCompareToSourceId = compareToSourceId;
		compareToSourceId = newCompareToSourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID, oldCompareToSourceId, compareToSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getCompareToSourceExpression() {
		if (compareToSourceExpression != null && compareToSourceExpression.eIsProxy()) {
			InternalEObject oldCompareToSourceExpression = (InternalEObject)compareToSourceExpression;
			compareToSourceExpression = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldCompareToSourceExpression);
			if (compareToSourceExpression != oldCompareToSourceExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_EXPRESSION, oldCompareToSourceExpression, compareToSourceExpression));
			}
		}
		return compareToSourceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetCompareToSourceExpression() {
		return compareToSourceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompareToSourceExpression(org.eclipse.mdht.uml.fhir.core.dataTypes.String newCompareToSourceExpression) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldCompareToSourceExpression = compareToSourceExpression;
		compareToSourceExpression = newCompareToSourceExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_EXPRESSION, oldCompareToSourceExpression, compareToSourceExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getCompareToSourcePath() {
		if (compareToSourcePath != null && compareToSourcePath.eIsProxy()) {
			InternalEObject oldCompareToSourcePath = (InternalEObject)compareToSourcePath;
			compareToSourcePath = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldCompareToSourcePath);
			if (compareToSourcePath != oldCompareToSourcePath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH, oldCompareToSourcePath, compareToSourcePath));
			}
		}
		return compareToSourcePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetCompareToSourcePath() {
		return compareToSourcePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompareToSourcePath(org.eclipse.mdht.uml.fhir.core.dataTypes.String newCompareToSourcePath) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldCompareToSourcePath = compareToSourcePath;
		compareToSourcePath = newCompareToSourcePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH, oldCompareToSourcePath, compareToSourcePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getContentType() {
		if (contentType != null && contentType.eIsProxy()) {
			InternalEObject oldContentType = (InternalEObject)contentType;
			contentType = (Code)eResolveProxy(oldContentType);
			if (contentType != oldContentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE, oldContentType, contentType));
			}
		}
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(Code newContentType) {
		Code oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE, oldContentType, contentType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__EXPRESSION, oldExpression, expression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getHeaderField() {
		if (headerField != null && headerField.eIsProxy()) {
			InternalEObject oldHeaderField = (InternalEObject)headerField;
			headerField = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldHeaderField);
			if (headerField != oldHeaderField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD, oldHeaderField, headerField));
			}
		}
		return headerField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetHeaderField() {
		return headerField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderField(org.eclipse.mdht.uml.fhir.core.dataTypes.String newHeaderField) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldHeaderField = headerField;
		headerField = newHeaderField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD, oldHeaderField, headerField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getMinimumId() {
		if (minimumId != null && minimumId.eIsProxy()) {
			InternalEObject oldMinimumId = (InternalEObject)minimumId;
			minimumId = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldMinimumId);
			if (minimumId != oldMinimumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID, oldMinimumId, minimumId));
			}
		}
		return minimumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetMinimumId() {
		return minimumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumId(org.eclipse.mdht.uml.fhir.core.dataTypes.String newMinimumId) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldMinimumId = minimumId;
		minimumId = newMinimumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID, oldMinimumId, minimumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getNavigationLinks() {
		if (navigationLinks != null && navigationLinks.eIsProxy()) {
			InternalEObject oldNavigationLinks = (InternalEObject)navigationLinks;
			navigationLinks = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldNavigationLinks);
			if (navigationLinks != oldNavigationLinks) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS, oldNavigationLinks, navigationLinks));
			}
		}
		return navigationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetNavigationLinks() {
		return navigationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationLinks(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newNavigationLinks) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldNavigationLinks = navigationLinks;
		navigationLinks = newNavigationLinks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS, oldNavigationLinks, navigationLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getOperator() {
		if (operator != null && operator.eIsProxy()) {
			InternalEObject oldOperator = (InternalEObject)operator;
			operator = (Code)eResolveProxy(oldOperator);
			if (operator != oldOperator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR, oldOperator, operator));
			}
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Code newOperator) {
		Code oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR, oldOperator, operator));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getRequestUrl() {
		if (requestUrl != null && requestUrl.eIsProxy()) {
			InternalEObject oldRequestUrl = (InternalEObject)requestUrl;
			requestUrl = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldRequestUrl);
			if (requestUrl != oldRequestUrl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_URL, oldRequestUrl, requestUrl));
			}
		}
		return requestUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetRequestUrl() {
		return requestUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestUrl(org.eclipse.mdht.uml.fhir.core.dataTypes.String newRequestUrl) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldRequestUrl = requestUrl;
		requestUrl = newRequestUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_URL, oldRequestUrl, requestUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Code)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Code newResource) {
		Code oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getResponse() {
		if (response != null && response.eIsProxy()) {
			InternalEObject oldResponse = (InternalEObject)response;
			response = (Code)eResolveProxy(oldResponse);
			if (response != oldResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE, oldResponse, response));
			}
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(Code newResponse) {
		Code oldResponse = response;
		response = newResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getResponseCode() {
		if (responseCode != null && responseCode.eIsProxy()) {
			InternalEObject oldResponseCode = (InternalEObject)responseCode;
			responseCode = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldResponseCode);
			if (responseCode != oldResponseCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE, oldResponseCode, responseCode));
			}
		}
		return responseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetResponseCode() {
		return responseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseCode(org.eclipse.mdht.uml.fhir.core.dataTypes.String newResponseCode) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldResponseCode = responseCode;
		responseCode = newResponseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE, oldResponseCode, responseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupActionAssertActionAssertRule getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(TestScriptSetupSetupActionAssertActionAssertRule newRule, NotificationChain msgs) {
		TestScriptSetupSetupActionAssertActionAssertRule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULE, oldRule, newRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(TestScriptSetupSetupActionAssertActionAssertRule newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetupSetupActionAssertActionAssertRuleset getRuleset() {
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleset(TestScriptSetupSetupActionAssertActionAssertRuleset newRuleset, NotificationChain msgs) {
		TestScriptSetupSetupActionAssertActionAssertRuleset oldRuleset = ruleset;
		ruleset = newRuleset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULESET, oldRuleset, newRuleset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleset(TestScriptSetupSetupActionAssertActionAssertRuleset newRuleset) {
		if (newRuleset != ruleset) {
			NotificationChain msgs = null;
			if (ruleset != null)
				msgs = ((InternalEObject)ruleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULESET, null, msgs);
			if (newRuleset != null)
				msgs = ((InternalEObject)newRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULESET, null, msgs);
			msgs = basicSetRuleset(newRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULESET, newRuleset, newRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getSourceId() {
		if (sourceId != null && sourceId.eIsProxy()) {
			InternalEObject oldSourceId = (InternalEObject)sourceId;
			sourceId = (Id)eResolveProxy(oldSourceId);
			if (sourceId != oldSourceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID, oldSourceId, sourceId));
			}
		}
		return sourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetSourceId() {
		return sourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceId(Id newSourceId) {
		Id oldSourceId = sourceId;
		sourceId = newSourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID, oldSourceId, sourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getValidateProfileId() {
		if (validateProfileId != null && validateProfileId.eIsProxy()) {
			InternalEObject oldValidateProfileId = (InternalEObject)validateProfileId;
			validateProfileId = (Id)eResolveProxy(oldValidateProfileId);
			if (validateProfileId != oldValidateProfileId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID, oldValidateProfileId, validateProfileId));
			}
		}
		return validateProfileId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetValidateProfileId() {
		return validateProfileId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidateProfileId(Id newValidateProfileId) {
		Id oldValidateProfileId = validateProfileId;
		validateProfileId = newValidateProfileId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID, oldValidateProfileId, validateProfileId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(org.eclipse.mdht.uml.fhir.core.dataTypes.String newValue) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getWarningOnly() {
		if (warningOnly != null && warningOnly.eIsProxy()) {
			InternalEObject oldWarningOnly = (InternalEObject)warningOnly;
			warningOnly = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldWarningOnly);
			if (warningOnly != oldWarningOnly) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY, oldWarningOnly, warningOnly));
			}
		}
		return warningOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetWarningOnly() {
		return warningOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarningOnly(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newWarningOnly) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldWarningOnly = warningOnly;
		warningOnly = newWarningOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY, oldWarningOnly, warningOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULE:
				return basicSetRule(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULESET:
				return basicSetRuleset(null, msgs);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL:
				if (resolve) return getLabel();
				return basicGetLabel();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION:
				if (resolve) return getDirection();
				return basicGetDirection();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID:
				if (resolve) return getCompareToSourceId();
				return basicGetCompareToSourceId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_EXPRESSION:
				if (resolve) return getCompareToSourceExpression();
				return basicGetCompareToSourceExpression();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH:
				if (resolve) return getCompareToSourcePath();
				return basicGetCompareToSourcePath();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE:
				if (resolve) return getContentType();
				return basicGetContentType();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__EXPRESSION:
				if (resolve) return getExpression();
				return basicGetExpression();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD:
				if (resolve) return getHeaderField();
				return basicGetHeaderField();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID:
				if (resolve) return getMinimumId();
				return basicGetMinimumId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS:
				if (resolve) return getNavigationLinks();
				return basicGetNavigationLinks();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR:
				if (resolve) return getOperator();
				return basicGetOperator();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH:
				if (resolve) return getPath();
				return basicGetPath();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_URL:
				if (resolve) return getRequestUrl();
				return basicGetRequestUrl();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE:
				if (resolve) return getResponse();
				return basicGetResponse();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE:
				if (resolve) return getResponseCode();
				return basicGetResponseCode();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULE:
				return getRule();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULESET:
				return getRuleset();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID:
				if (resolve) return getSourceId();
				return basicGetSourceId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID:
				if (resolve) return getValidateProfileId();
				return basicGetValidateProfileId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY:
				if (resolve) return getWarningOnly();
				return basicGetWarningOnly();
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL:
				setLabel((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION:
				setDirection((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID:
				setCompareToSourceId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_EXPRESSION:
				setCompareToSourceExpression((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH:
				setCompareToSourcePath((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE:
				setContentType((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__EXPRESSION:
				setExpression((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD:
				setHeaderField((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID:
				setMinimumId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS:
				setNavigationLinks((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR:
				setOperator((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH:
				setPath((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_URL:
				setRequestUrl((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE:
				setResource((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE:
				setResponse((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE:
				setResponseCode((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULE:
				setRule((TestScriptSetupSetupActionAssertActionAssertRule)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULESET:
				setRuleset((TestScriptSetupSetupActionAssertActionAssertRuleset)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID:
				setSourceId((Id)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID:
				setValidateProfileId((Id)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE:
				setValue((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY:
				setWarningOnly((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL:
				setLabel((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION:
				setDirection((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID:
				setCompareToSourceId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_EXPRESSION:
				setCompareToSourceExpression((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH:
				setCompareToSourcePath((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE:
				setContentType((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__EXPRESSION:
				setExpression((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD:
				setHeaderField((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID:
				setMinimumId((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS:
				setNavigationLinks((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR:
				setOperator((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH:
				setPath((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_URL:
				setRequestUrl((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE:
				setResource((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE:
				setResponse((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE:
				setResponseCode((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULE:
				setRule((TestScriptSetupSetupActionAssertActionAssertRule)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULESET:
				setRuleset((TestScriptSetupSetupActionAssertActionAssertRuleset)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID:
				setSourceId((Id)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID:
				setValidateProfileId((Id)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE:
				setValue((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY:
				setWarningOnly((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL:
				return label != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION:
				return description != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION:
				return direction != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID:
				return compareToSourceId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_EXPRESSION:
				return compareToSourceExpression != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH:
				return compareToSourcePath != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE:
				return contentType != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__EXPRESSION:
				return expression != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD:
				return headerField != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID:
				return minimumId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS:
				return navigationLinks != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR:
				return operator != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH:
				return path != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_URL:
				return requestUrl != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE:
				return resource != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE:
				return response != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE:
				return responseCode != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULE:
				return rule != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RULESET:
				return ruleset != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID:
				return sourceId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID:
				return validateProfileId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE:
				return value != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY:
				return warningOnly != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptSetupSetupActionAssertImpl
