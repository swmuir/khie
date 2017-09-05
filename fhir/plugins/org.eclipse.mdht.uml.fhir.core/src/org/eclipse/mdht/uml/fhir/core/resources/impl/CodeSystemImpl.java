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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Markdown;
import org.eclipse.mdht.uml.fhir.core.dataTypes.UnsignedInt;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.UsageContext;
import org.eclipse.mdht.uml.fhir.core.resources.CodeSystem;
import org.eclipse.mdht.uml.fhir.core.resources.CodeSystemConceptDefinition;
import org.eclipse.mdht.uml.fhir.core.resources.CodeSystemFilter;
import org.eclipse.mdht.uml.fhir.core.resources.CodeSystemProperty;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getHierarchyMeaning <em>Hierarchy Meaning</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getCompositional <em>Compositional</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getVersionNeeded <em>Version Needed</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getFilters <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getProperties <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.CodeSystemImpl#getConcepts <em>Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeSystemImpl extends DomainResourceImpl implements CodeSystem {
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
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String title;

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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

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
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected Markdown copyright;

	/**
	 * The cached value of the '{@link #getCaseSensitive() <em>Case Sensitive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean caseSensitive;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected Uri valueSet;

	/**
	 * The cached value of the '{@link #getHierarchyMeaning() <em>Hierarchy Meaning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchyMeaning()
	 * @generated
	 * @ordered
	 */
	protected Code hierarchyMeaning;

	/**
	 * The cached value of the '{@link #getCompositional() <em>Compositional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositional()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean compositional;

	/**
	 * The cached value of the '{@link #getVersionNeeded() <em>Version Needed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionNeeded()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean versionNeeded;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected Code content;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt count;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemFilter> filters;

	/**
	 * The cached value of the '{@link #getProperties() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemProperty> properties;

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
	protected CodeSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCodeSystem();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__URL, oldUrl, url));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__IDENTIFIER, oldIdentifier, identifier));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__VERSION, oldVersion, version));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.eclipse.mdht.uml.fhir.core.dataTypes.String newTitle) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__TITLE, oldTitle, title));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL, oldExperimental, experimental));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL, oldExperimental, experimental));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__PUBLISHER, oldPublisher, publisher));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectResolvingEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.CODE_SYSTEM__CONTACT);
		}
		return contacts;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__DATE, oldDate, date));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectResolvingEList<UsageContext>(UsageContext.class, this, ResourcesPackage.CODE_SYSTEM__USE_CONTEXT);
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
			jurisdictions = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CODE_SYSTEM__JURISDICTION);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__PURPOSE, oldPurpose, purpose));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getCopyright() {
		if (copyright != null && copyright.eIsProxy()) {
			InternalEObject oldCopyright = (InternalEObject)copyright;
			copyright = (Markdown)eResolveProxy(oldCopyright);
			if (copyright != oldCopyright) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__COPYRIGHT, oldCopyright, copyright));
			}
		}
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown basicGetCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(Markdown newCopyright) {
		Markdown oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getCaseSensitive() {
		if (caseSensitive != null && caseSensitive.eIsProxy()) {
			InternalEObject oldCaseSensitive = (InternalEObject)caseSensitive;
			caseSensitive = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldCaseSensitive);
			if (caseSensitive != oldCaseSensitive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE, oldCaseSensitive, caseSensitive));
			}
		}
		return caseSensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetCaseSensitive() {
		return caseSensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseSensitive(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newCaseSensitive) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldCaseSensitive = caseSensitive;
		caseSensitive = newCaseSensitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE, oldCaseSensitive, caseSensitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getValueSet() {
		if (valueSet != null && valueSet.eIsProxy()) {
			InternalEObject oldValueSet = (InternalEObject)valueSet;
			valueSet = (Uri)eResolveProxy(oldValueSet);
			if (valueSet != oldValueSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__VALUE_SET, oldValueSet, valueSet));
			}
		}
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSet(Uri newValueSet) {
		Uri oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__VALUE_SET, oldValueSet, valueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getHierarchyMeaning() {
		if (hierarchyMeaning != null && hierarchyMeaning.eIsProxy()) {
			InternalEObject oldHierarchyMeaning = (InternalEObject)hierarchyMeaning;
			hierarchyMeaning = (Code)eResolveProxy(oldHierarchyMeaning);
			if (hierarchyMeaning != oldHierarchyMeaning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING, oldHierarchyMeaning, hierarchyMeaning));
			}
		}
		return hierarchyMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetHierarchyMeaning() {
		return hierarchyMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchyMeaning(Code newHierarchyMeaning) {
		Code oldHierarchyMeaning = hierarchyMeaning;
		hierarchyMeaning = newHierarchyMeaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING, oldHierarchyMeaning, hierarchyMeaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getCompositional() {
		if (compositional != null && compositional.eIsProxy()) {
			InternalEObject oldCompositional = (InternalEObject)compositional;
			compositional = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldCompositional);
			if (compositional != oldCompositional) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL, oldCompositional, compositional));
			}
		}
		return compositional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetCompositional() {
		return compositional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositional(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newCompositional) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldCompositional = compositional;
		compositional = newCompositional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL, oldCompositional, compositional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getVersionNeeded() {
		if (versionNeeded != null && versionNeeded.eIsProxy()) {
			InternalEObject oldVersionNeeded = (InternalEObject)versionNeeded;
			versionNeeded = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldVersionNeeded);
			if (versionNeeded != oldVersionNeeded) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED, oldVersionNeeded, versionNeeded));
			}
		}
		return versionNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetVersionNeeded() {
		return versionNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionNeeded(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newVersionNeeded) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldVersionNeeded = versionNeeded;
		versionNeeded = newVersionNeeded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED, oldVersionNeeded, versionNeeded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getContent() {
		if (content != null && content.eIsProxy()) {
			InternalEObject oldContent = (InternalEObject)content;
			content = (Code)eResolveProxy(oldContent);
			if (content != oldContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__CONTENT, oldContent, content));
			}
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(Code newContent) {
		Code oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getCount() {
		if (count != null && count.eIsProxy()) {
			InternalEObject oldCount = (InternalEObject)count;
			count = (UnsignedInt)eResolveProxy(oldCount);
			if (count != oldCount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.CODE_SYSTEM__COUNT, oldCount, count));
			}
		}
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt basicGetCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(UnsignedInt newCount) {
		UnsignedInt oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemFilter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<CodeSystemFilter>(CodeSystemFilter.class, this, ResourcesPackage.CODE_SYSTEM__FILTER);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<CodeSystemProperty>(CodeSystemProperty.class, this, ResourcesPackage.CODE_SYSTEM__PROPERTY);
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
			concepts = new EObjectContainmentEList<CodeSystemConceptDefinition>(CodeSystemConceptDefinition.class, this, ResourcesPackage.CODE_SYSTEM__CONCEPT);
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
			case ResourcesPackage.CODE_SYSTEM__FILTER:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CODE_SYSTEM__PROPERTY:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CODE_SYSTEM__CONCEPT:
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
			case ResourcesPackage.CODE_SYSTEM__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case ResourcesPackage.CODE_SYSTEM__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case ResourcesPackage.CODE_SYSTEM__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case ResourcesPackage.CODE_SYSTEM__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ResourcesPackage.CODE_SYSTEM__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case ResourcesPackage.CODE_SYSTEM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL:
				if (resolve) return getExperimental();
				return basicGetExperimental();
			case ResourcesPackage.CODE_SYSTEM__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case ResourcesPackage.CODE_SYSTEM__CONTACT:
				return getContacts();
			case ResourcesPackage.CODE_SYSTEM__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case ResourcesPackage.CODE_SYSTEM__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.CODE_SYSTEM__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.CODE_SYSTEM__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.CODE_SYSTEM__PURPOSE:
				if (resolve) return getPurpose();
				return basicGetPurpose();
			case ResourcesPackage.CODE_SYSTEM__COPYRIGHT:
				if (resolve) return getCopyright();
				return basicGetCopyright();
			case ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE:
				if (resolve) return getCaseSensitive();
				return basicGetCaseSensitive();
			case ResourcesPackage.CODE_SYSTEM__VALUE_SET:
				if (resolve) return getValueSet();
				return basicGetValueSet();
			case ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING:
				if (resolve) return getHierarchyMeaning();
				return basicGetHierarchyMeaning();
			case ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL:
				if (resolve) return getCompositional();
				return basicGetCompositional();
			case ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED:
				if (resolve) return getVersionNeeded();
				return basicGetVersionNeeded();
			case ResourcesPackage.CODE_SYSTEM__CONTENT:
				if (resolve) return getContent();
				return basicGetContent();
			case ResourcesPackage.CODE_SYSTEM__COUNT:
				if (resolve) return getCount();
				return basicGetCount();
			case ResourcesPackage.CODE_SYSTEM__FILTER:
				return getFilters();
			case ResourcesPackage.CODE_SYSTEM__PROPERTY:
				return getProperties();
			case ResourcesPackage.CODE_SYSTEM__CONCEPT:
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
			case ResourcesPackage.CODE_SYSTEM__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE:
				setCaseSensitive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__VALUE_SET:
				setValueSet((Uri)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING:
				setHierarchyMeaning((Code)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL:
				setCompositional((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED:
				setVersionNeeded((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__CONTENT:
				setContent((Code)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__COUNT:
				setCount((UnsignedInt)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__FILTER:
				getFilters().clear();
				getFilters().addAll((Collection<? extends CodeSystemFilter>)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__PROPERTY:
				getProperties().clear();
				getProperties().addAll((Collection<? extends CodeSystemProperty>)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM__CONCEPT:
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
			case ResourcesPackage.CODE_SYSTEM__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.CODE_SYSTEM__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.CODE_SYSTEM__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.CODE_SYSTEM__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE:
				setCaseSensitive((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__VALUE_SET:
				setValueSet((Uri)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING:
				setHierarchyMeaning((Code)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL:
				setCompositional((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED:
				setVersionNeeded((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__CONTENT:
				setContent((Code)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__COUNT:
				setCount((UnsignedInt)null);
				return;
			case ResourcesPackage.CODE_SYSTEM__FILTER:
				getFilters().clear();
				return;
			case ResourcesPackage.CODE_SYSTEM__PROPERTY:
				getProperties().clear();
				return;
			case ResourcesPackage.CODE_SYSTEM__CONCEPT:
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
			case ResourcesPackage.CODE_SYSTEM__URL:
				return url != null;
			case ResourcesPackage.CODE_SYSTEM__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.CODE_SYSTEM__VERSION:
				return version != null;
			case ResourcesPackage.CODE_SYSTEM__NAME:
				return name != null;
			case ResourcesPackage.CODE_SYSTEM__TITLE:
				return title != null;
			case ResourcesPackage.CODE_SYSTEM__STATUS:
				return status != null;
			case ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL:
				return experimental != null;
			case ResourcesPackage.CODE_SYSTEM__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.CODE_SYSTEM__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.CODE_SYSTEM__DATE:
				return date != null;
			case ResourcesPackage.CODE_SYSTEM__DESCRIPTION:
				return description != null;
			case ResourcesPackage.CODE_SYSTEM__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.CODE_SYSTEM__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.CODE_SYSTEM__PURPOSE:
				return purpose != null;
			case ResourcesPackage.CODE_SYSTEM__COPYRIGHT:
				return copyright != null;
			case ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE:
				return caseSensitive != null;
			case ResourcesPackage.CODE_SYSTEM__VALUE_SET:
				return valueSet != null;
			case ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING:
				return hierarchyMeaning != null;
			case ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL:
				return compositional != null;
			case ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED:
				return versionNeeded != null;
			case ResourcesPackage.CODE_SYSTEM__CONTENT:
				return content != null;
			case ResourcesPackage.CODE_SYSTEM__COUNT:
				return count != null;
			case ResourcesPackage.CODE_SYSTEM__FILTER:
				return filters != null && !filters.isEmpty();
			case ResourcesPackage.CODE_SYSTEM__PROPERTY:
				return properties != null && !properties.isEmpty();
			case ResourcesPackage.CODE_SYSTEM__CONCEPT:
				return concepts != null && !concepts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodeSystemImpl
