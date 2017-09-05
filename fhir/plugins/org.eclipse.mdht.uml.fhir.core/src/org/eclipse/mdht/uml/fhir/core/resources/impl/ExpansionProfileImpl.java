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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.UsageContext;
import org.eclipse.mdht.uml.fhir.core.resources.ExpansionProfile;
import org.eclipse.mdht.uml.fhir.core.resources.ExpansionProfileDesignation;
import org.eclipse.mdht.uml.fhir.core.resources.ExpansionProfileExcludedSystem;
import org.eclipse.mdht.uml.fhir.core.resources.ExpansionProfileFixedVersion;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getFixedVersions <em>Fixed Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getExcludedSystem <em>Excluded System</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getIncludeDesignations <em>Include Designations</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getDesignation <em>Designation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getIncludeDefinition <em>Include Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getActiveOnly <em>Active Only</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getExcludeNested <em>Exclude Nested</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getExcludeNotForUi <em>Exclude Not For Ui</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getExcludePostCoordinated <em>Exclude Post Coordinated</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getDisplayLanguage <em>Display Language</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ExpansionProfileImpl#getLimitedExpansion <em>Limited Expansion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionProfileImpl extends DomainResourceImpl implements ExpansionProfile {
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
	 * The cached value of the '{@link #getFixedVersions() <em>Fixed Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpansionProfileFixedVersion> fixedVersions;

	/**
	 * The cached value of the '{@link #getExcludedSystem() <em>Excluded System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludedSystem()
	 * @generated
	 * @ordered
	 */
	protected ExpansionProfileExcludedSystem excludedSystem;

	/**
	 * The cached value of the '{@link #getIncludeDesignations() <em>Include Designations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeDesignations()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean includeDesignations;

	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected ExpansionProfileDesignation designation;

	/**
	 * The cached value of the '{@link #getIncludeDefinition() <em>Include Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeDefinition()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean includeDefinition;

	/**
	 * The cached value of the '{@link #getActiveOnly() <em>Active Only</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveOnly()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean activeOnly;

	/**
	 * The cached value of the '{@link #getExcludeNested() <em>Exclude Nested</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeNested()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean excludeNested;

	/**
	 * The cached value of the '{@link #getExcludeNotForUi() <em>Exclude Not For Ui</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeNotForUi()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean excludeNotForUi;

	/**
	 * The cached value of the '{@link #getExcludePostCoordinated() <em>Exclude Post Coordinated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludePostCoordinated()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean excludePostCoordinated;

	/**
	 * The cached value of the '{@link #getDisplayLanguage() <em>Display Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLanguage()
	 * @generated
	 * @ordered
	 */
	protected Code displayLanguage;

	/**
	 * The cached value of the '{@link #getLimitedExpansion() <em>Limited Expansion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitedExpansion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean limitedExpansion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getExpansionProfile();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__URL, oldUrl, url));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__IDENTIFIER, oldIdentifier, identifier));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__VERSION, oldVersion, version));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__EXPERIMENTAL, oldExperimental, experimental));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__EXPERIMENTAL, oldExperimental, experimental));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__PUBLISHER, oldPublisher, publisher));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectResolvingEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.EXPANSION_PROFILE__CONTACT);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__DATE, oldDate, date));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectResolvingEList<UsageContext>(UsageContext.class, this, ResourcesPackage.EXPANSION_PROFILE__USE_CONTEXT);
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
			jurisdictions = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EXPANSION_PROFILE__JURISDICTION);
		}
		return jurisdictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionProfileFixedVersion> getFixedVersions() {
		if (fixedVersions == null) {
			fixedVersions = new EObjectContainmentEList<ExpansionProfileFixedVersion>(ExpansionProfileFixedVersion.class, this, ResourcesPackage.EXPANSION_PROFILE__FIXED_VERSION);
		}
		return fixedVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileExcludedSystem getExcludedSystem() {
		return excludedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludedSystem(ExpansionProfileExcludedSystem newExcludedSystem, NotificationChain msgs) {
		ExpansionProfileExcludedSystem oldExcludedSystem = excludedSystem;
		excludedSystem = newExcludedSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__EXCLUDED_SYSTEM, oldExcludedSystem, newExcludedSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludedSystem(ExpansionProfileExcludedSystem newExcludedSystem) {
		if (newExcludedSystem != excludedSystem) {
			NotificationChain msgs = null;
			if (excludedSystem != null)
				msgs = ((InternalEObject)excludedSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPANSION_PROFILE__EXCLUDED_SYSTEM, null, msgs);
			if (newExcludedSystem != null)
				msgs = ((InternalEObject)newExcludedSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPANSION_PROFILE__EXCLUDED_SYSTEM, null, msgs);
			msgs = basicSetExcludedSystem(newExcludedSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__EXCLUDED_SYSTEM, newExcludedSystem, newExcludedSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getIncludeDesignations() {
		if (includeDesignations != null && includeDesignations.eIsProxy()) {
			InternalEObject oldIncludeDesignations = (InternalEObject)includeDesignations;
			includeDesignations = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldIncludeDesignations);
			if (includeDesignations != oldIncludeDesignations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS, oldIncludeDesignations, includeDesignations));
			}
		}
		return includeDesignations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetIncludeDesignations() {
		return includeDesignations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeDesignations(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newIncludeDesignations) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldIncludeDesignations = includeDesignations;
		includeDesignations = newIncludeDesignations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS, oldIncludeDesignations, includeDesignations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignation getDesignation() {
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignation(ExpansionProfileDesignation newDesignation, NotificationChain msgs) {
		ExpansionProfileDesignation oldDesignation = designation;
		designation = newDesignation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__DESIGNATION, oldDesignation, newDesignation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignation(ExpansionProfileDesignation newDesignation) {
		if (newDesignation != designation) {
			NotificationChain msgs = null;
			if (designation != null)
				msgs = ((InternalEObject)designation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPANSION_PROFILE__DESIGNATION, null, msgs);
			if (newDesignation != null)
				msgs = ((InternalEObject)newDesignation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPANSION_PROFILE__DESIGNATION, null, msgs);
			msgs = basicSetDesignation(newDesignation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__DESIGNATION, newDesignation, newDesignation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getIncludeDefinition() {
		if (includeDefinition != null && includeDefinition.eIsProxy()) {
			InternalEObject oldIncludeDefinition = (InternalEObject)includeDefinition;
			includeDefinition = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldIncludeDefinition);
			if (includeDefinition != oldIncludeDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__INCLUDE_DEFINITION, oldIncludeDefinition, includeDefinition));
			}
		}
		return includeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetIncludeDefinition() {
		return includeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeDefinition(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newIncludeDefinition) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldIncludeDefinition = includeDefinition;
		includeDefinition = newIncludeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__INCLUDE_DEFINITION, oldIncludeDefinition, includeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getActiveOnly() {
		if (activeOnly != null && activeOnly.eIsProxy()) {
			InternalEObject oldActiveOnly = (InternalEObject)activeOnly;
			activeOnly = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldActiveOnly);
			if (activeOnly != oldActiveOnly) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__ACTIVE_ONLY, oldActiveOnly, activeOnly));
			}
		}
		return activeOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetActiveOnly() {
		return activeOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveOnly(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newActiveOnly) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldActiveOnly = activeOnly;
		activeOnly = newActiveOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__ACTIVE_ONLY, oldActiveOnly, activeOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getExcludeNested() {
		if (excludeNested != null && excludeNested.eIsProxy()) {
			InternalEObject oldExcludeNested = (InternalEObject)excludeNested;
			excludeNested = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldExcludeNested);
			if (excludeNested != oldExcludeNested) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_NESTED, oldExcludeNested, excludeNested));
			}
		}
		return excludeNested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetExcludeNested() {
		return excludeNested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeNested(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newExcludeNested) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldExcludeNested = excludeNested;
		excludeNested = newExcludeNested;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_NESTED, oldExcludeNested, excludeNested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getExcludeNotForUi() {
		if (excludeNotForUi != null && excludeNotForUi.eIsProxy()) {
			InternalEObject oldExcludeNotForUi = (InternalEObject)excludeNotForUi;
			excludeNotForUi = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldExcludeNotForUi);
			if (excludeNotForUi != oldExcludeNotForUi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI, oldExcludeNotForUi, excludeNotForUi));
			}
		}
		return excludeNotForUi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetExcludeNotForUi() {
		return excludeNotForUi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeNotForUi(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newExcludeNotForUi) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldExcludeNotForUi = excludeNotForUi;
		excludeNotForUi = newExcludeNotForUi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI, oldExcludeNotForUi, excludeNotForUi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getExcludePostCoordinated() {
		if (excludePostCoordinated != null && excludePostCoordinated.eIsProxy()) {
			InternalEObject oldExcludePostCoordinated = (InternalEObject)excludePostCoordinated;
			excludePostCoordinated = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldExcludePostCoordinated);
			if (excludePostCoordinated != oldExcludePostCoordinated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED, oldExcludePostCoordinated, excludePostCoordinated));
			}
		}
		return excludePostCoordinated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetExcludePostCoordinated() {
		return excludePostCoordinated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludePostCoordinated(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newExcludePostCoordinated) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldExcludePostCoordinated = excludePostCoordinated;
		excludePostCoordinated = newExcludePostCoordinated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED, oldExcludePostCoordinated, excludePostCoordinated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getDisplayLanguage() {
		if (displayLanguage != null && displayLanguage.eIsProxy()) {
			InternalEObject oldDisplayLanguage = (InternalEObject)displayLanguage;
			displayLanguage = (Code)eResolveProxy(oldDisplayLanguage);
			if (displayLanguage != oldDisplayLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE, oldDisplayLanguage, displayLanguage));
			}
		}
		return displayLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetDisplayLanguage() {
		return displayLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayLanguage(Code newDisplayLanguage) {
		Code oldDisplayLanguage = displayLanguage;
		displayLanguage = newDisplayLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE, oldDisplayLanguage, displayLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getLimitedExpansion() {
		if (limitedExpansion != null && limitedExpansion.eIsProxy()) {
			InternalEObject oldLimitedExpansion = (InternalEObject)limitedExpansion;
			limitedExpansion = (org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)eResolveProxy(oldLimitedExpansion);
			if (limitedExpansion != oldLimitedExpansion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.EXPANSION_PROFILE__LIMITED_EXPANSION, oldLimitedExpansion, limitedExpansion));
			}
		}
		return limitedExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean basicGetLimitedExpansion() {
		return limitedExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitedExpansion(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean newLimitedExpansion) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean oldLimitedExpansion = limitedExpansion;
		limitedExpansion = newLimitedExpansion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPANSION_PROFILE__LIMITED_EXPANSION, oldLimitedExpansion, limitedExpansion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EXPANSION_PROFILE__FIXED_VERSION:
				return ((InternalEList<?>)getFixedVersions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDED_SYSTEM:
				return basicSetExcludedSystem(null, msgs);
			case ResourcesPackage.EXPANSION_PROFILE__DESIGNATION:
				return basicSetDesignation(null, msgs);
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
			case ResourcesPackage.EXPANSION_PROFILE__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case ResourcesPackage.EXPANSION_PROFILE__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case ResourcesPackage.EXPANSION_PROFILE__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case ResourcesPackage.EXPANSION_PROFILE__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ResourcesPackage.EXPANSION_PROFILE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.EXPANSION_PROFILE__EXPERIMENTAL:
				if (resolve) return getExperimental();
				return basicGetExperimental();
			case ResourcesPackage.EXPANSION_PROFILE__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case ResourcesPackage.EXPANSION_PROFILE__CONTACT:
				return getContacts();
			case ResourcesPackage.EXPANSION_PROFILE__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case ResourcesPackage.EXPANSION_PROFILE__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.EXPANSION_PROFILE__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.EXPANSION_PROFILE__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.EXPANSION_PROFILE__FIXED_VERSION:
				return getFixedVersions();
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDED_SYSTEM:
				return getExcludedSystem();
			case ResourcesPackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS:
				if (resolve) return getIncludeDesignations();
				return basicGetIncludeDesignations();
			case ResourcesPackage.EXPANSION_PROFILE__DESIGNATION:
				return getDesignation();
			case ResourcesPackage.EXPANSION_PROFILE__INCLUDE_DEFINITION:
				if (resolve) return getIncludeDefinition();
				return basicGetIncludeDefinition();
			case ResourcesPackage.EXPANSION_PROFILE__ACTIVE_ONLY:
				if (resolve) return getActiveOnly();
				return basicGetActiveOnly();
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_NESTED:
				if (resolve) return getExcludeNested();
				return basicGetExcludeNested();
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI:
				if (resolve) return getExcludeNotForUi();
				return basicGetExcludeNotForUi();
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED:
				if (resolve) return getExcludePostCoordinated();
				return basicGetExcludePostCoordinated();
			case ResourcesPackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE:
				if (resolve) return getDisplayLanguage();
				return basicGetDisplayLanguage();
			case ResourcesPackage.EXPANSION_PROFILE__LIMITED_EXPANSION:
				if (resolve) return getLimitedExpansion();
				return basicGetLimitedExpansion();
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
			case ResourcesPackage.EXPANSION_PROFILE__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__FIXED_VERSION:
				getFixedVersions().clear();
				getFixedVersions().addAll((Collection<? extends ExpansionProfileFixedVersion>)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDED_SYSTEM:
				setExcludedSystem((ExpansionProfileExcludedSystem)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS:
				setIncludeDesignations((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__DESIGNATION:
				setDesignation((ExpansionProfileDesignation)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__INCLUDE_DEFINITION:
				setIncludeDefinition((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__ACTIVE_ONLY:
				setActiveOnly((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_NESTED:
				setExcludeNested((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI:
				setExcludeNotForUi((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED:
				setExcludePostCoordinated((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE:
				setDisplayLanguage((Code)newValue);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__LIMITED_EXPANSION:
				setLimitedExpansion((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
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
			case ResourcesPackage.EXPANSION_PROFILE__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.EXPANSION_PROFILE__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.EXPANSION_PROFILE__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.EXPANSION_PROFILE__FIXED_VERSION:
				getFixedVersions().clear();
				return;
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDED_SYSTEM:
				setExcludedSystem((ExpansionProfileExcludedSystem)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS:
				setIncludeDesignations((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__DESIGNATION:
				setDesignation((ExpansionProfileDesignation)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__INCLUDE_DEFINITION:
				setIncludeDefinition((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__ACTIVE_ONLY:
				setActiveOnly((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_NESTED:
				setExcludeNested((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI:
				setExcludeNotForUi((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED:
				setExcludePostCoordinated((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE:
				setDisplayLanguage((Code)null);
				return;
			case ResourcesPackage.EXPANSION_PROFILE__LIMITED_EXPANSION:
				setLimitedExpansion((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
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
			case ResourcesPackage.EXPANSION_PROFILE__URL:
				return url != null;
			case ResourcesPackage.EXPANSION_PROFILE__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.EXPANSION_PROFILE__VERSION:
				return version != null;
			case ResourcesPackage.EXPANSION_PROFILE__NAME:
				return name != null;
			case ResourcesPackage.EXPANSION_PROFILE__STATUS:
				return status != null;
			case ResourcesPackage.EXPANSION_PROFILE__EXPERIMENTAL:
				return experimental != null;
			case ResourcesPackage.EXPANSION_PROFILE__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.EXPANSION_PROFILE__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.EXPANSION_PROFILE__DATE:
				return date != null;
			case ResourcesPackage.EXPANSION_PROFILE__DESCRIPTION:
				return description != null;
			case ResourcesPackage.EXPANSION_PROFILE__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.EXPANSION_PROFILE__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.EXPANSION_PROFILE__FIXED_VERSION:
				return fixedVersions != null && !fixedVersions.isEmpty();
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDED_SYSTEM:
				return excludedSystem != null;
			case ResourcesPackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS:
				return includeDesignations != null;
			case ResourcesPackage.EXPANSION_PROFILE__DESIGNATION:
				return designation != null;
			case ResourcesPackage.EXPANSION_PROFILE__INCLUDE_DEFINITION:
				return includeDefinition != null;
			case ResourcesPackage.EXPANSION_PROFILE__ACTIVE_ONLY:
				return activeOnly != null;
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_NESTED:
				return excludeNested != null;
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI:
				return excludeNotForUi != null;
			case ResourcesPackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED:
				return excludePostCoordinated != null;
			case ResourcesPackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE:
				return displayLanguage != null;
			case ResourcesPackage.EXPANSION_PROFILE__LIMITED_EXPANSION:
				return limitedExpansion != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpansionProfileImpl
