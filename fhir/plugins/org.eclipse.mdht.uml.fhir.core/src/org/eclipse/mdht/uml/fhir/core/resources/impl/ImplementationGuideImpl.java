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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Id;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Markdown;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.UsageContext;
import org.eclipse.mdht.uml.fhir.core.resources.ImplementationGuide;
import org.eclipse.mdht.uml.fhir.core.resources.ImplementationGuideDependency;
import org.eclipse.mdht.uml.fhir.core.resources.ImplementationGuideGlobal;
import org.eclipse.mdht.uml.fhir.core.resources.ImplementationGuidePackage;
import org.eclipse.mdht.uml.fhir.core.resources.ImplementationGuidePage;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getDependencies <em>Dependency</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getPackages <em>Package</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getGlobals <em>Global</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getBinaries <em>Binary</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ImplementationGuideImpl#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationGuideImpl extends DomainResourceImpl implements ImplementationGuide {
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
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected Markdown copyright;

	/**
	 * The cached value of the '{@link #getFhirVersion() <em>Fhir Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirVersion()
	 * @generated
	 * @ordered
	 */
	protected Id fhirVersion;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideDependency> dependencies;

	/**
	 * The cached value of the '{@link #getPackages() <em>Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuidePackage> packages;

	/**
	 * The cached value of the '{@link #getGlobals() <em>Global</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobals()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideGlobal> globals;

	/**
	 * The cached value of the '{@link #getBinaries() <em>Binary</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaries()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> binaries;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected ImplementationGuidePage page;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImplementationGuide();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE__URL, oldUrl, url));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE__VERSION, oldVersion, version));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE__EXPERIMENTAL, oldExperimental, experimental));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE__EXPERIMENTAL, oldExperimental, experimental));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE__PUBLISHER, oldPublisher, publisher));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectResolvingEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE__CONTACT);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE__DATE, oldDate, date));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectResolvingEList<UsageContext>(UsageContext.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE__USE_CONTEXT);
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
			jurisdictions = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE__JURISDICTION);
		}
		return jurisdictions;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE__COPYRIGHT, oldCopyright, copyright));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getFhirVersion() {
		if (fhirVersion != null && fhirVersion.eIsProxy()) {
			InternalEObject oldFhirVersion = (InternalEObject)fhirVersion;
			fhirVersion = (Id)eResolveProxy(oldFhirVersion);
			if (fhirVersion != oldFhirVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.IMPLEMENTATION_GUIDE__FHIR_VERSION, oldFhirVersion, fhirVersion));
			}
		}
		return fhirVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetFhirVersion() {
		return fhirVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFhirVersion(Id newFhirVersion) {
		Id oldFhirVersion = fhirVersion;
		fhirVersion = newFhirVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE__FHIR_VERSION, oldFhirVersion, fhirVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideDependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<ImplementationGuideDependency>(ImplementationGuideDependency.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE__DEPENDENCY);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuidePackage> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<ImplementationGuidePackage>(ImplementationGuidePackage.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE__PACKAGE);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideGlobal> getGlobals() {
		if (globals == null) {
			globals = new EObjectContainmentEList<ImplementationGuideGlobal>(ImplementationGuideGlobal.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE__GLOBAL);
		}
		return globals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getBinaries() {
		if (binaries == null) {
			binaries = new EObjectResolvingEList<Uri>(Uri.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE__BINARY);
		}
		return binaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuidePage getPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(ImplementationGuidePage newPage, NotificationChain msgs) {
		ImplementationGuidePage oldPage = page;
		page = newPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE__PAGE, oldPage, newPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(ImplementationGuidePage newPage) {
		if (newPage != page) {
			NotificationChain msgs = null;
			if (page != null)
				msgs = ((InternalEObject)page).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE__PAGE, null, msgs);
			if (newPage != null)
				msgs = ((InternalEObject)newPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE__PAGE, null, msgs);
			msgs = basicSetPage(newPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE__PAGE, newPage, newPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMPLEMENTATION_GUIDE__DEPENDENCY:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE__PACKAGE:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE__GLOBAL:
				return ((InternalEList<?>)getGlobals()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE__PAGE:
				return basicSetPage(null, msgs);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__EXPERIMENTAL:
				if (resolve) return getExperimental();
				return basicGetExperimental();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__CONTACT:
				return getContacts();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__COPYRIGHT:
				if (resolve) return getCopyright();
				return basicGetCopyright();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__FHIR_VERSION:
				if (resolve) return getFhirVersion();
				return basicGetFhirVersion();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__DEPENDENCY:
				return getDependencies();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__PACKAGE:
				return getPackages();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__GLOBAL:
				return getGlobals();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__BINARY:
				return getBinaries();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__PAGE:
				return getPage();
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__FHIR_VERSION:
				setFhirVersion((Id)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__DEPENDENCY:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends ImplementationGuideDependency>)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__PACKAGE:
				getPackages().clear();
				getPackages().addAll((Collection<? extends ImplementationGuidePackage>)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__GLOBAL:
				getGlobals().clear();
				getGlobals().addAll((Collection<? extends ImplementationGuideGlobal>)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__BINARY:
				getBinaries().clear();
				getBinaries().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__PAGE:
				setPage((ImplementationGuidePage)newValue);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__FHIR_VERSION:
				setFhirVersion((Id)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__DEPENDENCY:
				getDependencies().clear();
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__PACKAGE:
				getPackages().clear();
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__GLOBAL:
				getGlobals().clear();
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__BINARY:
				getBinaries().clear();
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__PAGE:
				setPage((ImplementationGuidePage)null);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE__URL:
				return url != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__VERSION:
				return version != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__NAME:
				return name != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__STATUS:
				return status != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__EXPERIMENTAL:
				return experimental != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__DATE:
				return date != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__DESCRIPTION:
				return description != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__COPYRIGHT:
				return copyright != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__FHIR_VERSION:
				return fhirVersion != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE__DEPENDENCY:
				return dependencies != null && !dependencies.isEmpty();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__PACKAGE:
				return packages != null && !packages.isEmpty();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__GLOBAL:
				return globals != null && !globals.isEmpty();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__BINARY:
				return binaries != null && !binaries.isEmpty();
			case ResourcesPackage.IMPLEMENTATION_GUIDE__PAGE:
				return page != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideImpl
