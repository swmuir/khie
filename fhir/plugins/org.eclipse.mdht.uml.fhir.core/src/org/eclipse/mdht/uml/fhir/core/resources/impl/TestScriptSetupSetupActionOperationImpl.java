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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Coding;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Id;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionOperation;
import org.eclipse.mdht.uml.fhir.core.resources.TestScriptSetupSetupActionOperationRequestHeader;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Setup Setup Action Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getAccept <em>Accept</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getEncodeRequestUrl <em>Encode Request Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getRequestHeaders <em>Request Header</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getResponseId <em>Response Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.TestScriptSetupSetupActionOperationImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestScriptSetupSetupActionOperationImpl extends BackboneElementImpl implements TestScriptSetupSetupActionOperation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

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
	 * The cached value of the '{@link #getAccept() <em>Accept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccept()
	 * @generated
	 * @ordered
	 */
	protected Code accept;

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
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer destination;

	/**
	 * The cached value of the '{@link #getEncodeRequestUrl() <em>Encode Request Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodeRequestUrl()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean encodeRequestUrl;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer origin;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String params;

	/**
	 * The cached value of the '{@link #getRequestHeaders() <em>Request Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptSetupSetupActionOperationRequestHeader> requestHeaders;

	/**
	 * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected Id requestId;

	/**
	 * The cached value of the '{@link #getResponseId() <em>Response Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseId()
	 * @generated
	 * @ordered
	 */
	protected Id responseId;

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
	 * The cached value of the '{@link #getTargetId() <em>Target Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected Id targetId;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String url;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptSetupSetupActionOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTestScriptSetupSetupActionOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Coding)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESOURCE, oldResource, resource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESOURCE, oldResource, resource));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__LABEL, oldLabel, label));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getAccept() {
		if (accept != null && accept.eIsProxy()) {
			InternalEObject oldAccept = (InternalEObject)accept;
			accept = (Code)eResolveProxy(oldAccept);
			if (accept != oldAccept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ACCEPT, oldAccept, accept));
			}
		}
		return accept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetAccept() {
		return accept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccept(Code newAccept) {
		Code oldAccept = accept;
		accept = newAccept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ACCEPT, oldAccept, accept));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__CONTENT_TYPE, oldContentType, contentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newDestination) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getEncodeRequestUrl() {
		if (encodeRequestUrl != null && encodeRequestUrl.eIsProxy()) {
			InternalEObject oldEncodeRequestUrl = (InternalEObject)encodeRequestUrl;
			encodeRequestUrl = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldEncodeRequestUrl);
			if (encodeRequestUrl != oldEncodeRequestUrl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL, oldEncodeRequestUrl, encodeRequestUrl));
			}
		}
		return encodeRequestUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetEncodeRequestUrl() {
		return encodeRequestUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncodeRequestUrl(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newEncodeRequestUrl) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldEncodeRequestUrl = encodeRequestUrl;
		encodeRequestUrl = newEncodeRequestUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL, oldEncodeRequestUrl, encodeRequestUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject)origin;
			origin = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ORIGIN, oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newOrigin) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getParams() {
		if (params != null && params.eIsProxy()) {
			InternalEObject oldParams = (InternalEObject)params;
			params = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldParams);
			if (params != oldParams) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__PARAMS, oldParams, params));
			}
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetParams() {
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams(org.eclipse.mdht.uml.fhir.core.dataTypes.String newParams) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldParams = params;
		params = newParams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__PARAMS, oldParams, params));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptSetupSetupActionOperationRequestHeader> getRequestHeaders() {
		if (requestHeaders == null) {
			requestHeaders = new EObjectContainmentEList<TestScriptSetupSetupActionOperationRequestHeader>(TestScriptSetupSetupActionOperationRequestHeader.class, this, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_HEADER);
		}
		return requestHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getRequestId() {
		if (requestId != null && requestId.eIsProxy()) {
			InternalEObject oldRequestId = (InternalEObject)requestId;
			requestId = (Id)eResolveProxy(oldRequestId);
			if (requestId != oldRequestId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_ID, oldRequestId, requestId));
			}
		}
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetRequestId() {
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestId(Id newRequestId) {
		Id oldRequestId = requestId;
		requestId = newRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_ID, oldRequestId, requestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getResponseId() {
		if (responseId != null && responseId.eIsProxy()) {
			InternalEObject oldResponseId = (InternalEObject)responseId;
			responseId = (Id)eResolveProxy(oldResponseId);
			if (responseId != oldResponseId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESPONSE_ID, oldResponseId, responseId));
			}
		}
		return responseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetResponseId() {
		return responseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseId(Id newResponseId) {
		Id oldResponseId = responseId;
		responseId = newResponseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESPONSE_ID, oldResponseId, responseId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__SOURCE_ID, oldSourceId, sourceId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__SOURCE_ID, oldSourceId, sourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getTargetId() {
		if (targetId != null && targetId.eIsProxy()) {
			InternalEObject oldTargetId = (InternalEObject)targetId;
			targetId = (Id)eResolveProxy(oldTargetId);
			if (targetId != oldTargetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TARGET_ID, oldTargetId, targetId));
			}
		}
		return targetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetTargetId() {
		return targetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetId(Id newTargetId) {
		Id oldTargetId = targetId;
		targetId = newTargetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TARGET_ID, oldTargetId, targetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getUrl() {
		if (url != null && url.eIsProxy()) {
			InternalEObject oldUrl = (InternalEObject)url;
			url = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldUrl);
			if (url != oldUrl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__URL, oldUrl, url));
			}
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(org.eclipse.mdht.uml.fhir.core.dataTypes.String newUrl) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_HEADER:
				return ((InternalEList<?>)getRequestHeaders()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__LABEL:
				if (resolve) return getLabel();
				return basicGetLabel();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ACCEPT:
				if (resolve) return getAccept();
				return basicGetAccept();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__CONTENT_TYPE:
				if (resolve) return getContentType();
				return basicGetContentType();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL:
				if (resolve) return getEncodeRequestUrl();
				return basicGetEncodeRequestUrl();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__PARAMS:
				if (resolve) return getParams();
				return basicGetParams();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_HEADER:
				return getRequestHeaders();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_ID:
				if (resolve) return getRequestId();
				return basicGetRequestId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESPONSE_ID:
				if (resolve) return getResponseId();
				return basicGetResponseId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__SOURCE_ID:
				if (resolve) return getSourceId();
				return basicGetSourceId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TARGET_ID:
				if (resolve) return getTargetId();
				return basicGetTargetId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TYPE:
				setType((Coding)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESOURCE:
				setResource((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__LABEL:
				setLabel((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ACCEPT:
				setAccept((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__CONTENT_TYPE:
				setContentType((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESTINATION:
				setDestination((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL:
				setEncodeRequestUrl((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ORIGIN:
				setOrigin((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__PARAMS:
				setParams((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_HEADER:
				getRequestHeaders().clear();
				getRequestHeaders().addAll((Collection<? extends TestScriptSetupSetupActionOperationRequestHeader>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_ID:
				setRequestId((Id)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESPONSE_ID:
				setResponseId((Id)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__SOURCE_ID:
				setSourceId((Id)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TARGET_ID:
				setTargetId((Id)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__URL:
				setUrl((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TYPE:
				setType((Coding)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESOURCE:
				setResource((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__LABEL:
				setLabel((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ACCEPT:
				setAccept((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__CONTENT_TYPE:
				setContentType((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESTINATION:
				setDestination((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL:
				setEncodeRequestUrl((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ORIGIN:
				setOrigin((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__PARAMS:
				setParams((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_HEADER:
				getRequestHeaders().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_ID:
				setRequestId((Id)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESPONSE_ID:
				setResponseId((Id)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__SOURCE_ID:
				setSourceId((Id)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TARGET_ID:
				setTargetId((Id)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__URL:
				setUrl((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TYPE:
				return type != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESOURCE:
				return resource != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__LABEL:
				return label != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESCRIPTION:
				return description != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ACCEPT:
				return accept != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__CONTENT_TYPE:
				return contentType != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESTINATION:
				return destination != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL:
				return encodeRequestUrl != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ORIGIN:
				return origin != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__PARAMS:
				return params != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_HEADER:
				return requestHeaders != null && !requestHeaders.isEmpty();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_ID:
				return requestId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESPONSE_ID:
				return responseId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__SOURCE_ID:
				return sourceId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TARGET_ID:
				return targetId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__URL:
				return url != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptSetupSetupActionOperationImpl
