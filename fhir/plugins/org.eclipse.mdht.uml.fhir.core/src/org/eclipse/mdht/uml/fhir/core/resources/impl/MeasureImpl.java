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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Contributor;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Date;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Markdown;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Uri;
import org.eclipse.mdht.uml.fhir.core.dataTypes.UsageContext;
import org.eclipse.mdht.uml.fhir.core.resources.Library;
import org.eclipse.mdht.uml.fhir.core.resources.Measure;
import org.eclipse.mdht.uml.fhir.core.resources.MeasureGroup;
import org.eclipse.mdht.uml.fhir.core.resources.MeasureSupplementalData;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getApprovalDate <em>Approval Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getLastReviewDate <em>Last Review Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getTopics <em>Topic</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getContributors <em>Contributor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getRelatedArtifacts <em>Related Artifact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getLibraries <em>Library</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getDisclaimer <em>Disclaimer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getScoring <em>Scoring</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getCompositeScoring <em>Composite Scoring</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getRiskAdjustment <em>Risk Adjustment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getRateAggregation <em>Rate Aggregation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getClinicalRecommendationStatement <em>Clinical Recommendation Statement</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getImprovementNotation <em>Improvement Notation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getGroups <em>Group</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MeasureImpl#getSupplementalData <em>Supplemental Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureImpl extends DomainResourceImpl implements Measure {
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
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

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
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected Markdown purpose;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String usage;

	/**
	 * The cached value of the '{@link #getApprovalDate() <em>Approval Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalDate()
	 * @generated
	 * @ordered
	 */
	protected Date approvalDate;

	/**
	 * The cached value of the '{@link #getLastReviewDate() <em>Last Review Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastReviewDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastReviewDate;

	/**
	 * The cached value of the '{@link #getEffectivePeriod() <em>Effective Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectivePeriod;

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
	 * The cached value of the '{@link #getTopics() <em>Topic</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> topics;

	/**
	 * The cached value of the '{@link #getContributors() <em>Contributor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributors()
	 * @generated
	 * @ordered
	 */
	protected EList<Contributor> contributors;

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
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected Markdown copyright;

	/**
	 * The cached value of the '{@link #getRelatedArtifacts() <em>Related Artifact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> relatedArtifacts;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Library</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> libraries;

	/**
	 * The cached value of the '{@link #getDisclaimer() <em>Disclaimer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisclaimer()
	 * @generated
	 * @ordered
	 */
	protected Markdown disclaimer;

	/**
	 * The cached value of the '{@link #getScoring() <em>Scoring</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoring()
	 * @generated
	 * @ordered
	 */
	protected Code scoring;

	/**
	 * The cached value of the '{@link #getCompositeScoring() <em>Composite Scoring</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeScoring()
	 * @generated
	 * @ordered
	 */
	protected Code compositeScoring;

	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> types;

	/**
	 * The cached value of the '{@link #getRiskAdjustment() <em>Risk Adjustment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskAdjustment()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String riskAdjustment;

	/**
	 * The cached value of the '{@link #getRateAggregation() <em>Rate Aggregation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateAggregation()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String rateAggregation;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected Markdown rationale;

	/**
	 * The cached value of the '{@link #getClinicalRecommendationStatement() <em>Clinical Recommendation Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalRecommendationStatement()
	 * @generated
	 * @ordered
	 */
	protected Markdown clinicalRecommendationStatement;

	/**
	 * The cached value of the '{@link #getImprovementNotation() <em>Improvement Notation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImprovementNotation()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String improvementNotation;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Markdown definition;

	/**
	 * The cached value of the '{@link #getGuidance() <em>Guidance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidance()
	 * @generated
	 * @ordered
	 */
	protected Markdown guidance;

	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String set;

	/**
	 * The cached value of the '{@link #getGroups() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureGroup> groups;

	/**
	 * The cached value of the '{@link #getSupplementalData() <em>Supplemental Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalData()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureSupplementalData> supplementalData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMeasure();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.MEASURE__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__VERSION, oldVersion, version));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__TITLE, oldTitle, title));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__EXPERIMENTAL, oldExperimental, experimental));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__EXPERIMENTAL, oldExperimental, experimental));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__DATE, oldDate, date));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__PURPOSE, oldPurpose, purpose));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getUsage() {
		if (usage != null && usage.eIsProxy()) {
			InternalEObject oldUsage = (InternalEObject)usage;
			usage = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldUsage);
			if (usage != oldUsage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__USAGE, oldUsage, usage));
			}
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(org.eclipse.mdht.uml.fhir.core.dataTypes.String newUsage) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getApprovalDate() {
		if (approvalDate != null && approvalDate.eIsProxy()) {
			InternalEObject oldApprovalDate = (InternalEObject)approvalDate;
			approvalDate = (Date)eResolveProxy(oldApprovalDate);
			if (approvalDate != oldApprovalDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__APPROVAL_DATE, oldApprovalDate, approvalDate));
			}
		}
		return approvalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetApprovalDate() {
		return approvalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalDate(Date newApprovalDate) {
		Date oldApprovalDate = approvalDate;
		approvalDate = newApprovalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__APPROVAL_DATE, oldApprovalDate, approvalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastReviewDate() {
		if (lastReviewDate != null && lastReviewDate.eIsProxy()) {
			InternalEObject oldLastReviewDate = (InternalEObject)lastReviewDate;
			lastReviewDate = (Date)eResolveProxy(oldLastReviewDate);
			if (lastReviewDate != oldLastReviewDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__LAST_REVIEW_DATE, oldLastReviewDate, lastReviewDate));
			}
		}
		return lastReviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetLastReviewDate() {
		return lastReviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastReviewDate(Date newLastReviewDate) {
		Date oldLastReviewDate = lastReviewDate;
		lastReviewDate = newLastReviewDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__LAST_REVIEW_DATE, oldLastReviewDate, lastReviewDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEffectivePeriod() {
		if (effectivePeriod != null && effectivePeriod.eIsProxy()) {
			InternalEObject oldEffectivePeriod = (InternalEObject)effectivePeriod;
			effectivePeriod = (Period)eResolveProxy(oldEffectivePeriod);
			if (effectivePeriod != oldEffectivePeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__EFFECTIVE_PERIOD, oldEffectivePeriod, effectivePeriod));
			}
		}
		return effectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetEffectivePeriod() {
		return effectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectivePeriod(Period newEffectivePeriod) {
		Period oldEffectivePeriod = effectivePeriod;
		effectivePeriod = newEffectivePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__EFFECTIVE_PERIOD, oldEffectivePeriod, effectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsageContext> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectResolvingEList<UsageContext>(UsageContext.class, this, ResourcesPackage.MEASURE__USE_CONTEXT);
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
			jurisdictions = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEASURE__JURISDICTION);
		}
		return jurisdictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTopics() {
		if (topics == null) {
			topics = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEASURE__TOPIC);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contributor> getContributors() {
		if (contributors == null) {
			contributors = new EObjectResolvingEList<Contributor>(Contributor.class, this, ResourcesPackage.MEASURE__CONTRIBUTOR);
		}
		return contributors;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__PUBLISHER, oldPublisher, publisher));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectResolvingEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.MEASURE__CONTACT);
		}
		return contacts;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__COPYRIGHT, oldCopyright, copyright));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedArtifact> getRelatedArtifacts() {
		if (relatedArtifacts == null) {
			relatedArtifacts = new EObjectResolvingEList<RelatedArtifact>(RelatedArtifact.class, this, ResourcesPackage.MEASURE__RELATED_ARTIFACT);
		}
		return relatedArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Library> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectResolvingEList<Library>(Library.class, this, ResourcesPackage.MEASURE__LIBRARY);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDisclaimer() {
		if (disclaimer != null && disclaimer.eIsProxy()) {
			InternalEObject oldDisclaimer = (InternalEObject)disclaimer;
			disclaimer = (Markdown)eResolveProxy(oldDisclaimer);
			if (disclaimer != oldDisclaimer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__DISCLAIMER, oldDisclaimer, disclaimer));
			}
		}
		return disclaimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown basicGetDisclaimer() {
		return disclaimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisclaimer(Markdown newDisclaimer) {
		Markdown oldDisclaimer = disclaimer;
		disclaimer = newDisclaimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__DISCLAIMER, oldDisclaimer, disclaimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getScoring() {
		if (scoring != null && scoring.eIsProxy()) {
			InternalEObject oldScoring = (InternalEObject)scoring;
			scoring = (Code)eResolveProxy(oldScoring);
			if (scoring != oldScoring) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__SCORING, oldScoring, scoring));
			}
		}
		return scoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetScoring() {
		return scoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScoring(Code newScoring) {
		Code oldScoring = scoring;
		scoring = newScoring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__SCORING, oldScoring, scoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCompositeScoring() {
		if (compositeScoring != null && compositeScoring.eIsProxy()) {
			InternalEObject oldCompositeScoring = (InternalEObject)compositeScoring;
			compositeScoring = (Code)eResolveProxy(oldCompositeScoring);
			if (compositeScoring != oldCompositeScoring) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__COMPOSITE_SCORING, oldCompositeScoring, compositeScoring));
			}
		}
		return compositeScoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCompositeScoring() {
		return compositeScoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeScoring(Code newCompositeScoring) {
		Code oldCompositeScoring = compositeScoring;
		compositeScoring = newCompositeScoring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__COMPOSITE_SCORING, oldCompositeScoring, compositeScoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<Code>(Code.class, this, ResourcesPackage.MEASURE__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getRiskAdjustment() {
		if (riskAdjustment != null && riskAdjustment.eIsProxy()) {
			InternalEObject oldRiskAdjustment = (InternalEObject)riskAdjustment;
			riskAdjustment = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldRiskAdjustment);
			if (riskAdjustment != oldRiskAdjustment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__RISK_ADJUSTMENT, oldRiskAdjustment, riskAdjustment));
			}
		}
		return riskAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetRiskAdjustment() {
		return riskAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskAdjustment(org.eclipse.mdht.uml.fhir.core.dataTypes.String newRiskAdjustment) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldRiskAdjustment = riskAdjustment;
		riskAdjustment = newRiskAdjustment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__RISK_ADJUSTMENT, oldRiskAdjustment, riskAdjustment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getRateAggregation() {
		if (rateAggregation != null && rateAggregation.eIsProxy()) {
			InternalEObject oldRateAggregation = (InternalEObject)rateAggregation;
			rateAggregation = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldRateAggregation);
			if (rateAggregation != oldRateAggregation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__RATE_AGGREGATION, oldRateAggregation, rateAggregation));
			}
		}
		return rateAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetRateAggregation() {
		return rateAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateAggregation(org.eclipse.mdht.uml.fhir.core.dataTypes.String newRateAggregation) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldRateAggregation = rateAggregation;
		rateAggregation = newRateAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__RATE_AGGREGATION, oldRateAggregation, rateAggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getRationale() {
		if (rationale != null && rationale.eIsProxy()) {
			InternalEObject oldRationale = (InternalEObject)rationale;
			rationale = (Markdown)eResolveProxy(oldRationale);
			if (rationale != oldRationale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__RATIONALE, oldRationale, rationale));
			}
		}
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown basicGetRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(Markdown newRationale) {
		Markdown oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getClinicalRecommendationStatement() {
		if (clinicalRecommendationStatement != null && clinicalRecommendationStatement.eIsProxy()) {
			InternalEObject oldClinicalRecommendationStatement = (InternalEObject)clinicalRecommendationStatement;
			clinicalRecommendationStatement = (Markdown)eResolveProxy(oldClinicalRecommendationStatement);
			if (clinicalRecommendationStatement != oldClinicalRecommendationStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT, oldClinicalRecommendationStatement, clinicalRecommendationStatement));
			}
		}
		return clinicalRecommendationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown basicGetClinicalRecommendationStatement() {
		return clinicalRecommendationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClinicalRecommendationStatement(Markdown newClinicalRecommendationStatement) {
		Markdown oldClinicalRecommendationStatement = clinicalRecommendationStatement;
		clinicalRecommendationStatement = newClinicalRecommendationStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT, oldClinicalRecommendationStatement, clinicalRecommendationStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getImprovementNotation() {
		if (improvementNotation != null && improvementNotation.eIsProxy()) {
			InternalEObject oldImprovementNotation = (InternalEObject)improvementNotation;
			improvementNotation = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldImprovementNotation);
			if (improvementNotation != oldImprovementNotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__IMPROVEMENT_NOTATION, oldImprovementNotation, improvementNotation));
			}
		}
		return improvementNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetImprovementNotation() {
		return improvementNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImprovementNotation(org.eclipse.mdht.uml.fhir.core.dataTypes.String newImprovementNotation) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldImprovementNotation = improvementNotation;
		improvementNotation = newImprovementNotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__IMPROVEMENT_NOTATION, oldImprovementNotation, improvementNotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (Markdown)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Markdown newDefinition) {
		Markdown oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getGuidance() {
		if (guidance != null && guidance.eIsProxy()) {
			InternalEObject oldGuidance = (InternalEObject)guidance;
			guidance = (Markdown)eResolveProxy(oldGuidance);
			if (guidance != oldGuidance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__GUIDANCE, oldGuidance, guidance));
			}
		}
		return guidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown basicGetGuidance() {
		return guidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuidance(Markdown newGuidance) {
		Markdown oldGuidance = guidance;
		guidance = newGuidance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__GUIDANCE, oldGuidance, guidance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getSet() {
		if (set != null && set.eIsProxy()) {
			InternalEObject oldSet = (InternalEObject)set;
			set = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldSet);
			if (set != oldSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEASURE__SET, oldSet, set));
			}
		}
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetSet() {
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(org.eclipse.mdht.uml.fhir.core.dataTypes.String newSet) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldSet = set;
		set = newSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE__SET, oldSet, set));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<MeasureGroup>(MeasureGroup.class, this, ResourcesPackage.MEASURE__GROUP);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureSupplementalData> getSupplementalData() {
		if (supplementalData == null) {
			supplementalData = new EObjectContainmentEList<MeasureSupplementalData>(MeasureSupplementalData.class, this, ResourcesPackage.MEASURE__SUPPLEMENTAL_DATA);
		}
		return supplementalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEASURE__GROUP:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEASURE__SUPPLEMENTAL_DATA:
				return ((InternalEList<?>)getSupplementalData()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEASURE__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case ResourcesPackage.MEASURE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MEASURE__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case ResourcesPackage.MEASURE__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ResourcesPackage.MEASURE__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case ResourcesPackage.MEASURE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.MEASURE__EXPERIMENTAL:
				if (resolve) return getExperimental();
				return basicGetExperimental();
			case ResourcesPackage.MEASURE__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case ResourcesPackage.MEASURE__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.MEASURE__PURPOSE:
				if (resolve) return getPurpose();
				return basicGetPurpose();
			case ResourcesPackage.MEASURE__USAGE:
				if (resolve) return getUsage();
				return basicGetUsage();
			case ResourcesPackage.MEASURE__APPROVAL_DATE:
				if (resolve) return getApprovalDate();
				return basicGetApprovalDate();
			case ResourcesPackage.MEASURE__LAST_REVIEW_DATE:
				if (resolve) return getLastReviewDate();
				return basicGetLastReviewDate();
			case ResourcesPackage.MEASURE__EFFECTIVE_PERIOD:
				if (resolve) return getEffectivePeriod();
				return basicGetEffectivePeriod();
			case ResourcesPackage.MEASURE__USE_CONTEXT:
				return getUseContexts();
			case ResourcesPackage.MEASURE__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.MEASURE__TOPIC:
				return getTopics();
			case ResourcesPackage.MEASURE__CONTRIBUTOR:
				return getContributors();
			case ResourcesPackage.MEASURE__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case ResourcesPackage.MEASURE__CONTACT:
				return getContacts();
			case ResourcesPackage.MEASURE__COPYRIGHT:
				if (resolve) return getCopyright();
				return basicGetCopyright();
			case ResourcesPackage.MEASURE__RELATED_ARTIFACT:
				return getRelatedArtifacts();
			case ResourcesPackage.MEASURE__LIBRARY:
				return getLibraries();
			case ResourcesPackage.MEASURE__DISCLAIMER:
				if (resolve) return getDisclaimer();
				return basicGetDisclaimer();
			case ResourcesPackage.MEASURE__SCORING:
				if (resolve) return getScoring();
				return basicGetScoring();
			case ResourcesPackage.MEASURE__COMPOSITE_SCORING:
				if (resolve) return getCompositeScoring();
				return basicGetCompositeScoring();
			case ResourcesPackage.MEASURE__TYPE:
				return getTypes();
			case ResourcesPackage.MEASURE__RISK_ADJUSTMENT:
				if (resolve) return getRiskAdjustment();
				return basicGetRiskAdjustment();
			case ResourcesPackage.MEASURE__RATE_AGGREGATION:
				if (resolve) return getRateAggregation();
				return basicGetRateAggregation();
			case ResourcesPackage.MEASURE__RATIONALE:
				if (resolve) return getRationale();
				return basicGetRationale();
			case ResourcesPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT:
				if (resolve) return getClinicalRecommendationStatement();
				return basicGetClinicalRecommendationStatement();
			case ResourcesPackage.MEASURE__IMPROVEMENT_NOTATION:
				if (resolve) return getImprovementNotation();
				return basicGetImprovementNotation();
			case ResourcesPackage.MEASURE__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case ResourcesPackage.MEASURE__GUIDANCE:
				if (resolve) return getGuidance();
				return basicGetGuidance();
			case ResourcesPackage.MEASURE__SET:
				if (resolve) return getSet();
				return basicGetSet();
			case ResourcesPackage.MEASURE__GROUP:
				return getGroups();
			case ResourcesPackage.MEASURE__SUPPLEMENTAL_DATA:
				return getSupplementalData();
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
			case ResourcesPackage.MEASURE__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.MEASURE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEASURE__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEASURE__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEASURE__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEASURE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.MEASURE__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.MEASURE__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.MEASURE__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.MEASURE__PURPOSE:
				setPurpose((Markdown)newValue);
				return;
			case ResourcesPackage.MEASURE__USAGE:
				setUsage((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEASURE__APPROVAL_DATE:
				setApprovalDate((Date)newValue);
				return;
			case ResourcesPackage.MEASURE__LAST_REVIEW_DATE:
				setLastReviewDate((Date)newValue);
				return;
			case ResourcesPackage.MEASURE__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case ResourcesPackage.MEASURE__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends UsageContext>)newValue);
				return;
			case ResourcesPackage.MEASURE__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEASURE__TOPIC:
				getTopics().clear();
				getTopics().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEASURE__CONTRIBUTOR:
				getContributors().clear();
				getContributors().addAll((Collection<? extends Contributor>)newValue);
				return;
			case ResourcesPackage.MEASURE__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEASURE__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.MEASURE__COPYRIGHT:
				setCopyright((Markdown)newValue);
				return;
			case ResourcesPackage.MEASURE__RELATED_ARTIFACT:
				getRelatedArtifacts().clear();
				getRelatedArtifacts().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case ResourcesPackage.MEASURE__LIBRARY:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends Library>)newValue);
				return;
			case ResourcesPackage.MEASURE__DISCLAIMER:
				setDisclaimer((Markdown)newValue);
				return;
			case ResourcesPackage.MEASURE__SCORING:
				setScoring((Code)newValue);
				return;
			case ResourcesPackage.MEASURE__COMPOSITE_SCORING:
				setCompositeScoring((Code)newValue);
				return;
			case ResourcesPackage.MEASURE__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.MEASURE__RISK_ADJUSTMENT:
				setRiskAdjustment((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEASURE__RATE_AGGREGATION:
				setRateAggregation((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEASURE__RATIONALE:
				setRationale((Markdown)newValue);
				return;
			case ResourcesPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT:
				setClinicalRecommendationStatement((Markdown)newValue);
				return;
			case ResourcesPackage.MEASURE__IMPROVEMENT_NOTATION:
				setImprovementNotation((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEASURE__DEFINITION:
				setDefinition((Markdown)newValue);
				return;
			case ResourcesPackage.MEASURE__GUIDANCE:
				setGuidance((Markdown)newValue);
				return;
			case ResourcesPackage.MEASURE__SET:
				setSet((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEASURE__GROUP:
				getGroups().clear();
				getGroups().addAll((Collection<? extends MeasureGroup>)newValue);
				return;
			case ResourcesPackage.MEASURE__SUPPLEMENTAL_DATA:
				getSupplementalData().clear();
				getSupplementalData().addAll((Collection<? extends MeasureSupplementalData>)newValue);
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
			case ResourcesPackage.MEASURE__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.MEASURE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MEASURE__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.MEASURE__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.MEASURE__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.MEASURE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.MEASURE__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.MEASURE__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.MEASURE__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.MEASURE__PURPOSE:
				setPurpose((Markdown)null);
				return;
			case ResourcesPackage.MEASURE__USAGE:
				setUsage((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.MEASURE__APPROVAL_DATE:
				setApprovalDate((Date)null);
				return;
			case ResourcesPackage.MEASURE__LAST_REVIEW_DATE:
				setLastReviewDate((Date)null);
				return;
			case ResourcesPackage.MEASURE__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case ResourcesPackage.MEASURE__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case ResourcesPackage.MEASURE__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.MEASURE__TOPIC:
				getTopics().clear();
				return;
			case ResourcesPackage.MEASURE__CONTRIBUTOR:
				getContributors().clear();
				return;
			case ResourcesPackage.MEASURE__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.MEASURE__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.MEASURE__COPYRIGHT:
				setCopyright((Markdown)null);
				return;
			case ResourcesPackage.MEASURE__RELATED_ARTIFACT:
				getRelatedArtifacts().clear();
				return;
			case ResourcesPackage.MEASURE__LIBRARY:
				getLibraries().clear();
				return;
			case ResourcesPackage.MEASURE__DISCLAIMER:
				setDisclaimer((Markdown)null);
				return;
			case ResourcesPackage.MEASURE__SCORING:
				setScoring((Code)null);
				return;
			case ResourcesPackage.MEASURE__COMPOSITE_SCORING:
				setCompositeScoring((Code)null);
				return;
			case ResourcesPackage.MEASURE__TYPE:
				getTypes().clear();
				return;
			case ResourcesPackage.MEASURE__RISK_ADJUSTMENT:
				setRiskAdjustment((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.MEASURE__RATE_AGGREGATION:
				setRateAggregation((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.MEASURE__RATIONALE:
				setRationale((Markdown)null);
				return;
			case ResourcesPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT:
				setClinicalRecommendationStatement((Markdown)null);
				return;
			case ResourcesPackage.MEASURE__IMPROVEMENT_NOTATION:
				setImprovementNotation((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.MEASURE__DEFINITION:
				setDefinition((Markdown)null);
				return;
			case ResourcesPackage.MEASURE__GUIDANCE:
				setGuidance((Markdown)null);
				return;
			case ResourcesPackage.MEASURE__SET:
				setSet((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.MEASURE__GROUP:
				getGroups().clear();
				return;
			case ResourcesPackage.MEASURE__SUPPLEMENTAL_DATA:
				getSupplementalData().clear();
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
			case ResourcesPackage.MEASURE__URL:
				return url != null;
			case ResourcesPackage.MEASURE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MEASURE__VERSION:
				return version != null;
			case ResourcesPackage.MEASURE__NAME:
				return name != null;
			case ResourcesPackage.MEASURE__TITLE:
				return title != null;
			case ResourcesPackage.MEASURE__STATUS:
				return status != null;
			case ResourcesPackage.MEASURE__EXPERIMENTAL:
				return experimental != null;
			case ResourcesPackage.MEASURE__DATE:
				return date != null;
			case ResourcesPackage.MEASURE__DESCRIPTION:
				return description != null;
			case ResourcesPackage.MEASURE__PURPOSE:
				return purpose != null;
			case ResourcesPackage.MEASURE__USAGE:
				return usage != null;
			case ResourcesPackage.MEASURE__APPROVAL_DATE:
				return approvalDate != null;
			case ResourcesPackage.MEASURE__LAST_REVIEW_DATE:
				return lastReviewDate != null;
			case ResourcesPackage.MEASURE__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case ResourcesPackage.MEASURE__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case ResourcesPackage.MEASURE__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.MEASURE__TOPIC:
				return topics != null && !topics.isEmpty();
			case ResourcesPackage.MEASURE__CONTRIBUTOR:
				return contributors != null && !contributors.isEmpty();
			case ResourcesPackage.MEASURE__PUBLISHER:
				return publisher != null;
			case ResourcesPackage.MEASURE__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.MEASURE__COPYRIGHT:
				return copyright != null;
			case ResourcesPackage.MEASURE__RELATED_ARTIFACT:
				return relatedArtifacts != null && !relatedArtifacts.isEmpty();
			case ResourcesPackage.MEASURE__LIBRARY:
				return libraries != null && !libraries.isEmpty();
			case ResourcesPackage.MEASURE__DISCLAIMER:
				return disclaimer != null;
			case ResourcesPackage.MEASURE__SCORING:
				return scoring != null;
			case ResourcesPackage.MEASURE__COMPOSITE_SCORING:
				return compositeScoring != null;
			case ResourcesPackage.MEASURE__TYPE:
				return types != null && !types.isEmpty();
			case ResourcesPackage.MEASURE__RISK_ADJUSTMENT:
				return riskAdjustment != null;
			case ResourcesPackage.MEASURE__RATE_AGGREGATION:
				return rateAggregation != null;
			case ResourcesPackage.MEASURE__RATIONALE:
				return rationale != null;
			case ResourcesPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT:
				return clinicalRecommendationStatement != null;
			case ResourcesPackage.MEASURE__IMPROVEMENT_NOTATION:
				return improvementNotation != null;
			case ResourcesPackage.MEASURE__DEFINITION:
				return definition != null;
			case ResourcesPackage.MEASURE__GUIDANCE:
				return guidance != null;
			case ResourcesPackage.MEASURE__SET:
				return set != null;
			case ResourcesPackage.MEASURE__GROUP:
				return groups != null && !groups.isEmpty();
			case ResourcesPackage.MEASURE__SUPPLEMENTAL_DATA:
				return supplementalData != null && !supplementalData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureImpl
