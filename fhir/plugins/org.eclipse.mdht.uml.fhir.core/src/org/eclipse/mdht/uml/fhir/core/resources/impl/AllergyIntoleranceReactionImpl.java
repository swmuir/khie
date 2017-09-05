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
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DateTime;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.resources.AllergyIntoleranceReaction;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Intolerance Reaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceReactionImpl#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceReactionImpl#getCertainty <em>Certainty</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceReactionImpl#getManifestations <em>Manifestation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceReactionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceReactionImpl#getOnset <em>Onset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceReactionImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceReactionImpl#getExposureRoute <em>Exposure Route</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.AllergyIntoleranceReactionImpl#getNotes <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyIntoleranceReactionImpl extends BackboneElementImpl implements AllergyIntoleranceReaction {
	/**
	 * The cached value of the '{@link #getSubstance() <em>Substance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstance()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept substance;

	/**
	 * The cached value of the '{@link #getCertainty() <em>Certainty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertainty()
	 * @generated
	 * @ordered
	 */
	protected Code certainty;

	/**
	 * The cached value of the '{@link #getManifestations() <em>Manifestation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestations()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> manifestations;

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
	 * The cached value of the '{@link #getOnset() <em>Onset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnset()
	 * @generated
	 * @ordered
	 */
	protected DateTime onset;

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
	 * The cached value of the '{@link #getExposureRoute() <em>Exposure Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposureRoute()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept exposureRoute;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyIntoleranceReactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getAllergyIntoleranceReaction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubstance() {
		if (substance != null && substance.eIsProxy()) {
			InternalEObject oldSubstance = (InternalEObject)substance;
			substance = (CodeableConcept)eResolveProxy(oldSubstance);
			if (substance != oldSubstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__SUBSTANCE, oldSubstance, substance));
			}
		}
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetSubstance() {
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstance(CodeableConcept newSubstance) {
		CodeableConcept oldSubstance = substance;
		substance = newSubstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__SUBSTANCE, oldSubstance, substance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCertainty() {
		if (certainty != null && certainty.eIsProxy()) {
			InternalEObject oldCertainty = (InternalEObject)certainty;
			certainty = (Code)eResolveProxy(oldCertainty);
			if (certainty != oldCertainty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__CERTAINTY, oldCertainty, certainty));
			}
		}
		return certainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCertainty() {
		return certainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertainty(Code newCertainty) {
		Code oldCertainty = certainty;
		certainty = newCertainty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__CERTAINTY, oldCertainty, certainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getManifestations() {
		if (manifestations == null) {
			manifestations = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__MANIFESTATION);
		}
		return manifestations;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getOnset() {
		if (onset != null && onset.eIsProxy()) {
			InternalEObject oldOnset = (InternalEObject)onset;
			onset = (DateTime)eResolveProxy(oldOnset);
			if (onset != oldOnset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__ONSET, oldOnset, onset));
			}
		}
		return onset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetOnset() {
		return onset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnset(DateTime newOnset) {
		DateTime oldOnset = onset;
		onset = newOnset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__ONSET, oldOnset, onset));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__SEVERITY, oldSeverity, severity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getExposureRoute() {
		if (exposureRoute != null && exposureRoute.eIsProxy()) {
			InternalEObject oldExposureRoute = (InternalEObject)exposureRoute;
			exposureRoute = (CodeableConcept)eResolveProxy(oldExposureRoute);
			if (exposureRoute != oldExposureRoute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__EXPOSURE_ROUTE, oldExposureRoute, exposureRoute));
			}
		}
		return exposureRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetExposureRoute() {
		return exposureRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposureRoute(CodeableConcept newExposureRoute) {
		CodeableConcept oldExposureRoute = exposureRoute;
		exposureRoute = newExposureRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__EXPOSURE_ROUTE, oldExposureRoute, exposureRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__SUBSTANCE:
				if (resolve) return getSubstance();
				return basicGetSubstance();
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__CERTAINTY:
				if (resolve) return getCertainty();
				return basicGetCertainty();
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__MANIFESTATION:
				return getManifestations();
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__ONSET:
				if (resolve) return getOnset();
				return basicGetOnset();
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__SEVERITY:
				if (resolve) return getSeverity();
				return basicGetSeverity();
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__EXPOSURE_ROUTE:
				if (resolve) return getExposureRoute();
				return basicGetExposureRoute();
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__NOTE:
				return getNotes();
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
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__SUBSTANCE:
				setSubstance((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__CERTAINTY:
				setCertainty((Code)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__MANIFESTATION:
				getManifestations().clear();
				getManifestations().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__ONSET:
				setOnset((DateTime)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__SEVERITY:
				setSeverity((Code)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__EXPOSURE_ROUTE:
				setExposureRoute((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
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
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__SUBSTANCE:
				setSubstance((CodeableConcept)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__CERTAINTY:
				setCertainty((Code)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__MANIFESTATION:
				getManifestations().clear();
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__ONSET:
				setOnset((DateTime)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__SEVERITY:
				setSeverity((Code)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__EXPOSURE_ROUTE:
				setExposureRoute((CodeableConcept)null);
				return;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__NOTE:
				getNotes().clear();
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
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__SUBSTANCE:
				return substance != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__CERTAINTY:
				return certainty != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__MANIFESTATION:
				return manifestations != null && !manifestations.isEmpty();
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__DESCRIPTION:
				return description != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__ONSET:
				return onset != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__SEVERITY:
				return severity != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__EXPOSURE_ROUTE:
				return exposureRoute != null;
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION__NOTE:
				return notes != null && !notes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllergyIntoleranceReactionImpl
