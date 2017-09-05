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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.ContactDetail;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Markdown;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.UsageContext;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.SearchParameter;
import org.eclipse.mdht.uml.fhir.core.resources.SearchParameterComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getBases <em>Base</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getXpathUsage <em>Xpath Usage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getComparators <em>Comparator</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getChains <em>Chain</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.SearchParameterImpl#getComponents <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SearchParameterImpl extends DomainResourceImpl implements SearchParameter {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getExperimental() <em>Experimental</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimental()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean experimental;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String publisher;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> contacts;

	/**
	 * The cached value of the '{@link #getUseContexts() <em>Use Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<UsageContext> useContexts;

	/**
	 * The cached value of the '{@link #getJurisdictions() <em>Jurisdiction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdictions()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> jurisdictions;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected Markdown purpose;

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
	 * The cached value of the '{@link #getBases() <em>Base</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBases()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> bases;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected Uri derivedFrom;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

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
	 * The cached value of the '{@link #getXpathUsage() <em>Xpath Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpathUsage()
	 * @generated
	 * @ordered
	 */
	protected Code xpathUsage;

	/**
	 * The cached value of the '{@link #getTargets() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> targets;

	/**
	 * The cached value of the '{@link #getComparators() <em>Comparator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparators()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> comparators;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> modifiers;

	/**
	 * The cached value of the '{@link #getChains() <em>Chain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChains()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> chains;

	/**
	 * The cached value of the '{@link #getComponents() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchParameterComponent> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSearchParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		if (url != null && url.eIsProxy()) {
			InternalEObject oldUrl = (InternalEObject)url;
			url = (Uri)eResolveProxy(oldUrl);
			if (url != oldUrl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEARCH_PARAMETER__URL, oldUrl, url));
			}
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__URL, oldUrl, url));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEARCH_PARAMETER__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__VERSION, oldVersion, version));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEARCH_PARAMETER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Code)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEARCH_PARAMETER__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getExperimental() {
		if (experimental != null && experimental.eIsProxy()) {
			InternalEObject oldExperimental = (InternalEObject)experimental;
			experimental = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldExperimental);
			if (experimental != oldExperimental) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEARCH_PARAMETER__EXPERIMENTAL, oldExperimental, experimental));
			}
		}
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperimental(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newExperimental) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__EXPERIMENTAL, oldExperimental, experimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		if (date != null && date.eIsProxy()) {
			InternalEObject oldDate = (InternalEObject)date;
			date = (DateTime)eResolveProxy(oldDate);
			if (date != oldDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEARCH_PARAMETER__DATE, oldDate, date));
			}
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getPublisher() {
		if (publisher != null && publisher.eIsProxy()) {
			InternalEObject oldPublisher = (InternalEObject)publisher;
			publisher = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldPublisher);
			if (publisher != oldPublisher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEARCH_PARAMETER__PUBLISHER, oldPublisher, publisher));
			}
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(org.eclipse.mdht.uml.fhir.core.dataTypes.String newPublisher) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectResolvingEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.SEARCH_PARAMETER__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectResolvingEList<UsageContext>(UsageContext.class, this, ResourcesPackage.SEARCH_PARAMETER__USE_CONTEXT);
		}
		return useContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getJurisdictions() {
		if (jurisdictions == null) {
			jurisdictions = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SEARCH_PARAMETER__JURISDICTION);
		}
		return jurisdictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getPurpose() {
		if (purpose != null && purpose.eIsProxy()) {
			InternalEObject oldPurpose = (InternalEObject)purpose;
			purpose = (Markdown)eResolveProxy(oldPurpose);
			if (purpose != oldPurpose) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEARCH_PARAMETER__PURPOSE, oldPurpose, purpose));
			}
		}
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown basicGetPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(Markdown newPurpose) {
		Markdown oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__PURPOSE, oldPurpose, purpose));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEARCH_PARAMETER__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getBases() {
		if (bases == null) {
			bases = new EObjectResolvingEList<Code>(Code.class, this, ResourcesPackage.SEARCH_PARAMETER__BASE);
		}
		return bases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Code)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEARCH_PARAMETER__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getDerivedFrom() {
		if (derivedFrom != null && derivedFrom.eIsProxy()) {
			InternalEObject oldDerivedFrom = (InternalEObject)derivedFrom;
			derivedFrom = (Uri)eResolveProxy(oldDerivedFrom);
			if (derivedFrom != oldDerivedFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEARCH_PARAMETER__DERIVED_FROM, oldDerivedFrom, derivedFrom));
			}
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetDerivedFrom() {
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedFrom(Uri newDerivedFrom) {
		Uri oldDerivedFrom = derivedFrom;
		derivedFrom = newDerivedFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__DERIVED_FROM, oldDerivedFrom, derivedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (Markdown)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEARCH_PARAMETER__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Markdown newDescription) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEARCH_PARAMETER__EXPRESSION, oldExpression, expression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__EXPRESSION, oldExpression, expression));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEARCH_PARAMETER__XPATH, oldXpath, xpath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__XPATH, oldXpath, xpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getXpathUsage() {
		if (xpathUsage != null && xpathUsage.eIsProxy()) {
			InternalEObject oldXpathUsage = (InternalEObject)xpathUsage;
			xpathUsage = (Code)eResolveProxy(oldXpathUsage);
			if (xpathUsage != oldXpathUsage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.SEARCH_PARAMETER__XPATH_USAGE, oldXpathUsage, xpathUsage));
			}
		}
		return xpathUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetXpathUsage() {
		return xpathUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpathUsage(Code newXpathUsage) {
		Code oldXpathUsage = xpathUsage;
		xpathUsage = newXpathUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SEARCH_PARAMETER__XPATH_USAGE, oldXpathUsage, xpathUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<Code>(Code.class, this, ResourcesPackage.SEARCH_PARAMETER__TARGET);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getComparators() {
		if (comparators == null) {
			comparators = new EObjectResolvingEList<Code>(Code.class, this, ResourcesPackage.SEARCH_PARAMETER__COMPARATOR);
		}
		return comparators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectResolvingEList<Code>(Code.class, this, ResourcesPackage.SEARCH_PARAMETER__MODIFIER);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.dataTypes.String> getChains() {
		if (chains == null) {
			chains = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.dataTypes.String>(org.eclipse.mdht.uml.fhir.core.dataTypes.String.class, this, ResourcesPackage.SEARCH_PARAMETER__CHAIN);
		}
		return chains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SearchParameterComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<SearchParameterComponent>(SearchParameterComponent.class, this, ResourcesPackage.SEARCH_PARAMETER__COMPONENT);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SEARCH_PARAMETER__COMPONENT:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SEARCH_PARAMETER__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case ResourcesPackage.SEARCH_PARAMETER__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case ResourcesPackage.SEARCH_PARAMETER__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ResourcesPackage.SEARCH_PARAMETER__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				if (resolve) return getExperimental();
				return basicGetExperimental();
			case ResourcesPackage.SEARCH_PARAMETER__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case ResourcesPackage.SEARCH_PARAMETER__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case ResourcesPackage.SEARCH_PARAMETER__CONTACT:
				return getContacts();
			case ResourcesPackage.SEARCH_PARAMETER__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.SEARCH_PARAMETER__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.SEARCH_PARAMETER__PURPOSE:
				if (resolve) return getPurpose();
				return basicGetPurpose();
			case ResourcesPackage.SEARCH_PARAMETER__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case ResourcesPackage.SEARCH_PARAMETER__BASE:
				return getBases();
			case ResourcesPackage.SEARCH_PARAMETER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ResourcesPackage.SEARCH_PARAMETER__DERIVED_FROM:
				if (resolve) return getDerivedFrom();
				return basicGetDerivedFrom();
			case ResourcesPackage.SEARCH_PARAMETER__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.SEARCH_PARAMETER__EXPRESSION:
				if (resolve) return getExpression();
				return basicGetExpression();
			case ResourcesPackage.SEARCH_PARAMETER__XPATH:
				if (resolve) return getXpath();
				return basicGetXpath();
			case ResourcesPackage.SEARCH_PARAMETER__XPATH_USAGE:
				if (resolve) return getXpathUsage();
				return basicGetXpathUsage();
			case ResourcesPackage.SEARCH_PARAMETER__TARGET:
				return getTargets();
			case ResourcesPackage.SEARCH_PARAMETER__COMPARATOR:
				return getComparators();
			case ResourcesPackage.SEARCH_PARAMETER__MODIFIER:
				return getModifiers();
			case ResourcesPackage.SEARCH_PARAMETER__CHAIN:
				return getChains();
			case ResourcesPackage.SEARCH_PARAMETER__COMPONENT:
				return getComponents();
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
			case ResourcesPackage.SEARCH_PARAMETER__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__CODE:
				setCode((Code)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__BASE:
				getBases().clear();
				getBases().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__DERIVED_FROM:
				setDerivedFrom((Uri)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__EXPRESSION:
				setExpression((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__XPATH:
				setXpath((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__XPATH_USAGE:
				setXpathUsage((Code)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__TARGET:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__COMPARATOR:
				getComparators().clear();
				getComparators().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__MODIFIER:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__CHAIN:
				getChains().clear();
				getChains().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__COMPONENT:
				getComponents().clear();
				getComponents().addAll((Collection<? extends SearchParameterComponent>)newValue);
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
			case ResourcesPackage.SEARCH_PARAMETER__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__CODE:
				setCode((Code)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__BASE:
				getBases().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__DERIVED_FROM:
				setDerivedFrom((Uri)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__EXPRESSION:
				setExpression((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__XPATH:
				setXpath((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__XPATH_USAGE:
				setXpathUsage((Code)null);
				return;
			case ResourcesPackage.SEARCH_PARAMETER__TARGET:
				getTargets().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__COMPARATOR:
				getComparators().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__MODIFIER:
				getModifiers().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__CHAIN:
				getChains().clear();
				return;
			case ResourcesPackage.SEARCH_PARAMETER__COMPONENT:
				getComponents().clear();
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
			case ResourcesPackage.SEARCH_PARAMETER__URL:
				return url != null;
			case ResourcesPackage.SEARCH_PARAMETER__VERSION:
				return version != null;
			case ResourcesPackage.SEARCH_PARAMETER__NAME:
				return name != null;
			case ResourcesPackage.SEARCH_PARAMETER__STATUS:
				return status != null;
			case ResourcesPackage.SEARCH_PARAMETER__EXPERIMENTAL:
				return experimental != null;
			case ResourcesPackage.SEARCH_PARAMETER__DATE:
				return date != null;
			case ResourcesPackage.SEARCH_PARAMETER__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.SEARCH_PARAMETER__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__PURPOSE:
				return purpose != null;
			case ResourcesPackage.SEARCH_PARAMETER__CODE:
				return code != null;
			case ResourcesPackage.SEARCH_PARAMETER__BASE:
				return bases != null && !bases.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__TYPE:
				return type != null;
			case ResourcesPackage.SEARCH_PARAMETER__DERIVED_FROM:
				return derivedFrom != null;
			case ResourcesPackage.SEARCH_PARAMETER__DESCRIPTION:
				return description != null;
			case ResourcesPackage.SEARCH_PARAMETER__EXPRESSION:
				return expression != null;
			case ResourcesPackage.SEARCH_PARAMETER__XPATH:
				return xpath != null;
			case ResourcesPackage.SEARCH_PARAMETER__XPATH_USAGE:
				return xpathUsage != null;
			case ResourcesPackage.SEARCH_PARAMETER__TARGET:
				return targets != null && !targets.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__COMPARATOR:
				return comparators != null && !comparators.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__MODIFIER:
				return modifiers != null && !modifiers.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__CHAIN:
				return chains != null && !chains.isEmpty();
			case ResourcesPackage.SEARCH_PARAMETER__COMPONENT:
				return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SearchParameterImpl
