/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Annotation;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Base;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Identifier;
import org.eclipse.mdht.uml.fhir.core.resources.MedicationStatement;
import org.eclipse.mdht.uml.fhir.core.resources.Resource;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationStatementImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationStatementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationStatementImpl#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationStatementImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationStatementImpl#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationStatementImpl#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationStatementImpl#getDerivedFroms <em>Derived From</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationStatementImpl#getDateAsserted <em>Date Asserted</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationStatementImpl#getNotTaken <em>Not Taken</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationStatementImpl#getReasonNotTakens <em>Reason Not Taken</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationStatementImpl#getReasonForUseCodeableConcepts <em>Reason For Use Codeable Concept</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationStatementImpl#getReasonForUseReferences <em>Reason For Use Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationStatementImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationStatementImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.MedicationStatementImpl#getDosages <em>Dosage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationStatementImpl extends DomainResourceImpl implements MedicationStatement {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getMedicationx() <em>Medicationx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationx()
	 * @generated
	 * @ordered
	 */
	protected Base medicationx;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Resource subject;

	/**
	 * The cached value of the '{@link #getEffectivex() <em>Effectivex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivex()
	 * @generated
	 * @ordered
	 */
	protected DataType effectivex;

	/**
	 * The cached value of the '{@link #getInformationSource() <em>Information Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSource()
	 * @generated
	 * @ordered
	 */
	protected Resource informationSource;

	/**
	 * The cached value of the '{@link #getDerivedFroms() <em>Derived From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFroms()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> derivedFroms;

	/**
	 * The cached value of the '{@link #getDateAsserted() <em>Date Asserted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAsserted()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateAsserted;

	/**
	 * The cached value of the '{@link #getNotTaken() <em>Not Taken</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotTaken()
	 * @generated
	 * @ordered
	 */
	protected Code notTaken;

	/**
	 * The cached value of the '{@link #getReasonNotTakens() <em>Reason Not Taken</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonNotTakens()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonNotTakens;

	/**
	 * The cached value of the '{@link #getReasonForUseCodeableConcepts() <em>Reason For Use Codeable Concept</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForUseCodeableConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonForUseCodeableConcepts;

	/**
	 * The cached value of the '{@link #getReasonForUseReferences() <em>Reason For Use Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForUseReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> reasonForUseReferences;

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
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Code category;

	/**
	 * The cached value of the '{@link #getDosages() <em>Dosage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosages()
	 * @generated
	 * @ordered
	 */
	protected EList<DosageInstruction> dosages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, ResourcesPackage.MEDICATION_STATEMENT__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_STATEMENT__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getMedicationx() {
		if (medicationx != null && medicationx.eIsProxy()) {
			InternalEObject oldMedicationx = (InternalEObject)medicationx;
			medicationx = (Base)eResolveProxy(oldMedicationx);
			if (medicationx != oldMedicationx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_STATEMENT__MEDICATIONX, oldMedicationx, medicationx));
			}
		}
		return medicationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetMedicationx() {
		return medicationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationx(Base newMedicationx) {
		Base oldMedicationx = medicationx;
		medicationx = newMedicationx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__MEDICATIONX, oldMedicationx, medicationx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (Resource)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_STATEMENT__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Resource newSubject) {
		Resource oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getEffectivex() {
		if (effectivex != null && effectivex.eIsProxy()) {
			InternalEObject oldEffectivex = (InternalEObject)effectivex;
			effectivex = (DataType)eResolveProxy(oldEffectivex);
			if (effectivex != oldEffectivex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_STATEMENT__EFFECTIVEX, oldEffectivex, effectivex));
			}
		}
		return effectivex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetEffectivex() {
		return effectivex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectivex(DataType newEffectivex) {
		DataType oldEffectivex = effectivex;
		effectivex = newEffectivex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__EFFECTIVEX, oldEffectivex, effectivex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getInformationSource() {
		if (informationSource != null && informationSource.eIsProxy()) {
			InternalEObject oldInformationSource = (InternalEObject)informationSource;
			informationSource = (Resource)eResolveProxy(oldInformationSource);
			if (informationSource != oldInformationSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, oldInformationSource, informationSource));
			}
		}
		return informationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetInformationSource() {
		return informationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationSource(Resource newInformationSource) {
		Resource oldInformationSource = informationSource;
		informationSource = newInformationSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, oldInformationSource, informationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getDerivedFroms() {
		if (derivedFroms == null) {
			derivedFroms = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.MEDICATION_STATEMENT__DERIVED_FROM);
		}
		return derivedFroms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateAsserted() {
		if (dateAsserted != null && dateAsserted.eIsProxy()) {
			InternalEObject oldDateAsserted = (InternalEObject)dateAsserted;
			dateAsserted = (DateTime)eResolveProxy(oldDateAsserted);
			if (dateAsserted != oldDateAsserted) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_STATEMENT__DATE_ASSERTED, oldDateAsserted, dateAsserted));
			}
		}
		return dateAsserted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDateAsserted() {
		return dateAsserted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateAsserted(DateTime newDateAsserted) {
		DateTime oldDateAsserted = dateAsserted;
		dateAsserted = newDateAsserted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__DATE_ASSERTED, oldDateAsserted, dateAsserted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getNotTaken() {
		if (notTaken != null && notTaken.eIsProxy()) {
			InternalEObject oldNotTaken = (InternalEObject)notTaken;
			notTaken = (Code)eResolveProxy(oldNotTaken);
			if (notTaken != oldNotTaken) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_STATEMENT__NOT_TAKEN, oldNotTaken, notTaken));
			}
		}
		return notTaken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetNotTaken() {
		return notTaken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotTaken(Code newNotTaken) {
		Code oldNotTaken = notTaken;
		notTaken = newNotTaken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__NOT_TAKEN, oldNotTaken, notTaken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonNotTakens() {
		if (reasonNotTakens == null) {
			reasonNotTakens = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN);
		}
		return reasonNotTakens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonForUseCodeableConcepts() {
		if (reasonForUseCodeableConcepts == null) {
			reasonForUseCodeableConcepts = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT);
		}
		return reasonForUseCodeableConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getReasonForUseReferences() {
		if (reasonForUseReferences == null) {
			reasonForUseReferences = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE);
		}
		return reasonForUseReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.MEDICATION_STATEMENT__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (Code)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.MEDICATION_STATEMENT__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Code newCategory) {
		Code oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_STATEMENT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DosageInstruction> getDosages() {
		if (dosages == null) {
			dosages = new EObjectResolvingEList<DosageInstruction>(DosageInstruction.class, this, ResourcesPackage.MEDICATION_STATEMENT__DOSAGE);
		}
		return dosages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_STATEMENT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MEDICATION_STATEMENT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case ResourcesPackage.MEDICATION_STATEMENT__MEDICATIONX:
				if (resolve) return getMedicationx();
				return basicGetMedicationx();
			case ResourcesPackage.MEDICATION_STATEMENT__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case ResourcesPackage.MEDICATION_STATEMENT__EFFECTIVEX:
				if (resolve) return getEffectivex();
				return basicGetEffectivex();
			case ResourcesPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				if (resolve) return getInformationSource();
				return basicGetInformationSource();
			case ResourcesPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				return getDerivedFroms();
			case ResourcesPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				if (resolve) return getDateAsserted();
				return basicGetDateAsserted();
			case ResourcesPackage.MEDICATION_STATEMENT__NOT_TAKEN:
				if (resolve) return getNotTaken();
				return basicGetNotTaken();
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN:
				return getReasonNotTakens();
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT:
				return getReasonForUseCodeableConcepts();
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE:
				return getReasonForUseReferences();
			case ResourcesPackage.MEDICATION_STATEMENT__NOTE:
				return getNotes();
			case ResourcesPackage.MEDICATION_STATEMENT__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case ResourcesPackage.MEDICATION_STATEMENT__DOSAGE:
				return getDosages();
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
			case ResourcesPackage.MEDICATION_STATEMENT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__MEDICATIONX:
				setMedicationx((Base)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__EFFECTIVEX:
				setEffectivex((DataType)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				setInformationSource((Resource)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				getDerivedFroms().clear();
				getDerivedFroms().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				setDateAsserted((DateTime)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__NOT_TAKEN:
				setNotTaken((Code)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN:
				getReasonNotTakens().clear();
				getReasonNotTakens().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT:
				getReasonForUseCodeableConcepts().clear();
				getReasonForUseCodeableConcepts().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE:
				getReasonForUseReferences().clear();
				getReasonForUseReferences().addAll((Collection<? extends Resource>)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__CATEGORY:
				setCategory((Code)newValue);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__DOSAGE:
				getDosages().clear();
				getDosages().addAll((Collection<? extends DosageInstruction>)newValue);
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
			case ResourcesPackage.MEDICATION_STATEMENT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__MEDICATIONX:
				setMedicationx((Base)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__SUBJECT:
				setSubject((Resource)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__EFFECTIVEX:
				setEffectivex((DataType)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				setInformationSource((Resource)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				getDerivedFroms().clear();
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				setDateAsserted((DateTime)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__NOT_TAKEN:
				setNotTaken((Code)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN:
				getReasonNotTakens().clear();
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT:
				getReasonForUseCodeableConcepts().clear();
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE:
				getReasonForUseReferences().clear();
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__CATEGORY:
				setCategory((Code)null);
				return;
			case ResourcesPackage.MEDICATION_STATEMENT__DOSAGE:
				getDosages().clear();
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
			case ResourcesPackage.MEDICATION_STATEMENT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MEDICATION_STATEMENT__STATUS:
				return status != null;
			case ResourcesPackage.MEDICATION_STATEMENT__MEDICATIONX:
				return medicationx != null;
			case ResourcesPackage.MEDICATION_STATEMENT__SUBJECT:
				return subject != null;
			case ResourcesPackage.MEDICATION_STATEMENT__EFFECTIVEX:
				return effectivex != null;
			case ResourcesPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				return informationSource != null;
			case ResourcesPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				return derivedFroms != null && !derivedFroms.isEmpty();
			case ResourcesPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				return dateAsserted != null;
			case ResourcesPackage.MEDICATION_STATEMENT__NOT_TAKEN:
				return notTaken != null;
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN:
				return reasonNotTakens != null && !reasonNotTakens.isEmpty();
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT:
				return reasonForUseCodeableConcepts != null && !reasonForUseCodeableConcepts.isEmpty();
			case ResourcesPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE:
				return reasonForUseReferences != null && !reasonForUseReferences.isEmpty();
			case ResourcesPackage.MEDICATION_STATEMENT__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.MEDICATION_STATEMENT__CATEGORY:
				return category != null;
			case ResourcesPackage.MEDICATION_STATEMENT__DOSAGE:
				return dosages != null && !dosages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationStatementImpl
