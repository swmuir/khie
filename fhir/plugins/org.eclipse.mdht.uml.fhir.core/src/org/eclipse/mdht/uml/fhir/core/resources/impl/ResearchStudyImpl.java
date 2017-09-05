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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.ContactDetail;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Markdown;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Period;
import org.eclipse.mdht.uml.fhir.core.dataTypes.RelatedArtifact;
import org.eclipse.mdht.uml.fhir.core.resources.Group;
import org.eclipse.mdht.uml.fhir.core.resources.Location;
import org.eclipse.mdht.uml.fhir.core.resources.Organization;
import org.eclipse.mdht.uml.fhir.core.resources.PlanDefinition;
import org.eclipse.mdht.uml.fhir.core.resources.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resources.ResearchStudy;
import org.eclipse.mdht.uml.fhir.core.resources.ResearchStudyArm;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getProtocols <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getFoci <em>Focus</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getRelatedArtifacts <em>Related Artifact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getKeywords <em>Keyword</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getEnrollments <em>Enrollment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getSponsor <em>Sponsor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getPrincipalInvestigator <em>Principal Investigator</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getSites <em>Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getReasonStopped <em>Reason Stopped</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.ResearchStudyImpl#getArms <em>Arm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResearchStudyImpl extends DomainResourceImpl implements ResearchStudy {
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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String title;

	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocol</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinition> protocols;

	/**
	 * The cached value of the '{@link #getPartOfs() <em>Part Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfs()
	 * @generated
	 * @ordered
	 */
	protected EList<ResearchStudy> partOfs;

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
	 * The cached value of the '{@link #getCategories() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> categories;

	/**
	 * The cached value of the '{@link #getFoci() <em>Focus</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoci()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> foci;

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
	 * The cached value of the '{@link #getRelatedArtifacts() <em>Related Artifact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> relatedArtifacts;

	/**
	 * The cached value of the '{@link #getKeywords() <em>Keyword</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> keywords;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getEnrollments() <em>Enrollment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrollments()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> enrollments;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getSponsor() <em>Sponsor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSponsor()
	 * @generated
	 * @ordered
	 */
	protected Organization sponsor;

	/**
	 * The cached value of the '{@link #getPrincipalInvestigator() <em>Principal Investigator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalInvestigator()
	 * @generated
	 * @ordered
	 */
	protected Practitioner principalInvestigator;

	/**
	 * The cached value of the '{@link #getSites() <em>Site</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSites()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> sites;

	/**
	 * The cached value of the '{@link #getReasonStopped() <em>Reason Stopped</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonStopped()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reasonStopped;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * The cached value of the '{@link #getArms() <em>Arm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArms()
	 * @generated
	 * @ordered
	 */
	protected EList<ResearchStudyArm> arms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getResearchStudy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.RESEARCH_STUDY__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESEARCH_STUDY__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlanDefinition> getProtocols() {
		if (protocols == null) {
			protocols = new EObjectResolvingEList<PlanDefinition>(PlanDefinition.class, this, ResourcesPackage.RESEARCH_STUDY__PROTOCOL);
		}
		return protocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResearchStudy> getPartOfs() {
		if (partOfs == null) {
			partOfs = new EObjectResolvingEList<ResearchStudy>(ResearchStudy.class, this, ResourcesPackage.RESEARCH_STUDY__PART_OF);
		}
		return partOfs;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESEARCH_STUDY__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategories() {
		if (categories == null) {
			categories = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.RESEARCH_STUDY__CATEGORY);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getFoci() {
		if (foci == null) {
			foci = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.RESEARCH_STUDY__FOCUS);
		}
		return foci;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectResolvingEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.RESEARCH_STUDY__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedArtifact> getRelatedArtifacts() {
		if (relatedArtifacts == null) {
			relatedArtifacts = new EObjectResolvingEList<RelatedArtifact>(RelatedArtifact.class, this, ResourcesPackage.RESEARCH_STUDY__RELATED_ARTIFACT);
		}
		return relatedArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getKeywords() {
		if (keywords == null) {
			keywords = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.RESEARCH_STUDY__KEYWORD);
		}
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getJurisdictions() {
		if (jurisdictions == null) {
			jurisdictions = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.RESEARCH_STUDY__JURISDICTION);
		}
		return jurisdictions;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESEARCH_STUDY__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getEnrollments() {
		if (enrollments == null) {
			enrollments = new EObjectResolvingEList<Group>(Group.class, this, ResourcesPackage.RESEARCH_STUDY__ENROLLMENT);
		}
		return enrollments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (Period)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESEARCH_STUDY__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getSponsor() {
		if (sponsor != null && sponsor.eIsProxy()) {
			InternalEObject oldSponsor = (InternalEObject)sponsor;
			sponsor = (Organization)eResolveProxy(oldSponsor);
			if (sponsor != oldSponsor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESEARCH_STUDY__SPONSOR, oldSponsor, sponsor));
			}
		}
		return sponsor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetSponsor() {
		return sponsor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSponsor(Organization newSponsor) {
		Organization oldSponsor = sponsor;
		sponsor = newSponsor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__SPONSOR, oldSponsor, sponsor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getPrincipalInvestigator() {
		if (principalInvestigator != null && principalInvestigator.eIsProxy()) {
			InternalEObject oldPrincipalInvestigator = (InternalEObject)principalInvestigator;
			principalInvestigator = (Practitioner)eResolveProxy(oldPrincipalInvestigator);
			if (principalInvestigator != oldPrincipalInvestigator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR, oldPrincipalInvestigator, principalInvestigator));
			}
		}
		return principalInvestigator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetPrincipalInvestigator() {
		return principalInvestigator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrincipalInvestigator(Practitioner newPrincipalInvestigator) {
		Practitioner oldPrincipalInvestigator = principalInvestigator;
		principalInvestigator = newPrincipalInvestigator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR, oldPrincipalInvestigator, principalInvestigator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getSites() {
		if (sites == null) {
			sites = new EObjectResolvingEList<Location>(Location.class, this, ResourcesPackage.RESEARCH_STUDY__SITE);
		}
		return sites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReasonStopped() {
		if (reasonStopped != null && reasonStopped.eIsProxy()) {
			InternalEObject oldReasonStopped = (InternalEObject)reasonStopped;
			reasonStopped = (CodeableConcept)eResolveProxy(oldReasonStopped);
			if (reasonStopped != oldReasonStopped) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESEARCH_STUDY__REASON_STOPPED, oldReasonStopped, reasonStopped));
			}
		}
		return reasonStopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetReasonStopped() {
		return reasonStopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonStopped(CodeableConcept newReasonStopped) {
		CodeableConcept oldReasonStopped = reasonStopped;
		reasonStopped = newReasonStopped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__REASON_STOPPED, oldReasonStopped, reasonStopped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.RESEARCH_STUDY__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResearchStudyArm> getArms() {
		if (arms == null) {
			arms = new EObjectContainmentEList<ResearchStudyArm>(ResearchStudyArm.class, this, ResourcesPackage.RESEARCH_STUDY__ARM);
		}
		return arms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.RESEARCH_STUDY__ARM:
				return ((InternalEList<?>)getArms()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.RESEARCH_STUDY__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.RESEARCH_STUDY__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case ResourcesPackage.RESEARCH_STUDY__PROTOCOL:
				return getProtocols();
			case ResourcesPackage.RESEARCH_STUDY__PART_OF:
				return getPartOfs();
			case ResourcesPackage.RESEARCH_STUDY__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.RESEARCH_STUDY__CATEGORY:
				return getCategories();
			case ResourcesPackage.RESEARCH_STUDY__FOCUS:
				return getFoci();
			case ResourcesPackage.RESEARCH_STUDY__CONTACT:
				return getContacts();
			case ResourcesPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				return getRelatedArtifacts();
			case ResourcesPackage.RESEARCH_STUDY__KEYWORD:
				return getKeywords();
			case ResourcesPackage.RESEARCH_STUDY__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.RESEARCH_STUDY__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.RESEARCH_STUDY__ENROLLMENT:
				return getEnrollments();
			case ResourcesPackage.RESEARCH_STUDY__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case ResourcesPackage.RESEARCH_STUDY__SPONSOR:
				if (resolve) return getSponsor();
				return basicGetSponsor();
			case ResourcesPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR:
				if (resolve) return getPrincipalInvestigator();
				return basicGetPrincipalInvestigator();
			case ResourcesPackage.RESEARCH_STUDY__SITE:
				return getSites();
			case ResourcesPackage.RESEARCH_STUDY__REASON_STOPPED:
				if (resolve) return getReasonStopped();
				return basicGetReasonStopped();
			case ResourcesPackage.RESEARCH_STUDY__NOTE:
				return getNotes();
			case ResourcesPackage.RESEARCH_STUDY__ARM:
				return getArms();
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
			case ResourcesPackage.RESEARCH_STUDY__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PROTOCOL:
				getProtocols().clear();
				getProtocols().addAll((Collection<? extends PlanDefinition>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PART_OF:
				getPartOfs().clear();
				getPartOfs().addAll((Collection<? extends ResearchStudy>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__FOCUS:
				getFoci().clear();
				getFoci().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				getRelatedArtifacts().clear();
				getRelatedArtifacts().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__KEYWORD:
				getKeywords().clear();
				getKeywords().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__ENROLLMENT:
				getEnrollments().clear();
				getEnrollments().addAll((Collection<? extends Group>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__SPONSOR:
				setSponsor((Organization)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR:
				setPrincipalInvestigator((Practitioner)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__SITE:
				getSites().clear();
				getSites().addAll((Collection<? extends Location>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__REASON_STOPPED:
				setReasonStopped((CodeableConcept)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__ARM:
				getArms().clear();
				getArms().addAll((Collection<? extends ResearchStudyArm>)newValue);
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
			case ResourcesPackage.RESEARCH_STUDY__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PROTOCOL:
				getProtocols().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__PART_OF:
				getPartOfs().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__FOCUS:
				getFoci().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				getRelatedArtifacts().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__KEYWORD:
				getKeywords().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__ENROLLMENT:
				getEnrollments().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__SPONSOR:
				setSponsor((Organization)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR:
				setPrincipalInvestigator((Practitioner)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__SITE:
				getSites().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__REASON_STOPPED:
				setReasonStopped((CodeableConcept)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__ARM:
				getArms().clear();
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
			case ResourcesPackage.RESEARCH_STUDY__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__TITLE:
				return title != null;
			case ResourcesPackage.RESEARCH_STUDY__PROTOCOL:
				return protocols != null && !protocols.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__PART_OF:
				return partOfs != null && !partOfs.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__STATUS:
				return status != null;
			case ResourcesPackage.RESEARCH_STUDY__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__FOCUS:
				return foci != null && !foci.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				return relatedArtifacts != null && !relatedArtifacts.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__KEYWORD:
				return keywords != null && !keywords.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__DESCRIPTION:
				return description != null;
			case ResourcesPackage.RESEARCH_STUDY__ENROLLMENT:
				return enrollments != null && !enrollments.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__PERIOD:
				return period != null;
			case ResourcesPackage.RESEARCH_STUDY__SPONSOR:
				return sponsor != null;
			case ResourcesPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR:
				return principalInvestigator != null;
			case ResourcesPackage.RESEARCH_STUDY__SITE:
				return sites != null && !sites.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__REASON_STOPPED:
				return reasonStopped != null;
			case ResourcesPackage.RESEARCH_STUDY__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__ARM:
				return arms != null && !arms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResearchStudyImpl
