/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.dataTypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataType;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DataTypesPackage;
import org.eclipse.mdht.uml.fhir.core.dataTypes.DosageInstruction;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Ratio;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Timing;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dosage Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl#getAdditionalInstructions <em>Additional Instructions</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl#getTiming <em>Timing</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl#getAsNeededx <em>As Neededx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl#getSite <em>Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl#getDosex <em>Dosex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl#getMaxDosePerPeriod <em>Max Dose Per Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl#getMaxDosePerAdministration <em>Max Dose Per Administration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl#getMaxDosePerLifetime <em>Max Dose Per Lifetime</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.dataTypes.impl.DosageInstructionImpl#getRatex <em>Ratex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DosageInstructionImpl extends DataTypeImpl implements DosageInstruction {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer sequence;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String text;

	/**
	 * The cached value of the '{@link #getAdditionalInstructions() <em>Additional Instructions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> additionalInstructions;

	/**
	 * The cached value of the '{@link #getTiming() <em>Timing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing timing;

	/**
	 * The cached value of the '{@link #getAsNeededx() <em>As Neededx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeededx()
	 * @generated
	 * @ordered
	 */
	protected DataType asNeededx;

	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept site;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept route;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getDosex() <em>Dosex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosex()
	 * @generated
	 * @ordered
	 */
	protected DataType dosex;

	/**
	 * The cached value of the '{@link #getMaxDosePerPeriod() <em>Max Dose Per Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDosePerPeriod()
	 * @generated
	 * @ordered
	 */
	protected Ratio maxDosePerPeriod;

	/**
	 * The cached value of the '{@link #getMaxDosePerAdministration() <em>Max Dose Per Administration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDosePerAdministration()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity maxDosePerAdministration;

	/**
	 * The cached value of the '{@link #getMaxDosePerLifetime() <em>Max Dose Per Lifetime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDosePerLifetime()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity maxDosePerLifetime;

	/**
	 * The cached value of the '{@link #getRatex() <em>Ratex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatex()
	 * @generated
	 * @ordered
	 */
	protected DataType ratex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DosageInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.DOSAGE_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getSequence() {
		if (sequence != null && sequence.eIsProxy()) {
			InternalEObject oldSequence = (InternalEObject)sequence;
			sequence = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldSequence);
			if (sequence != oldSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.DOSAGE_INSTRUCTION__SEQUENCE, oldSequence, sequence));
			}
		}
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newSequence) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_INSTRUCTION__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.DOSAGE_INSTRUCTION__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.eclipse.mdht.uml.fhir.core.dataTypes.String newText) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_INSTRUCTION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getAdditionalInstructions() {
		if (additionalInstructions == null) {
			additionalInstructions = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, DataTypesPackage.DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS);
		}
		return additionalInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getTiming() {
		if (timing != null && timing.eIsProxy()) {
			InternalEObject oldTiming = (InternalEObject)timing;
			timing = (Timing)eResolveProxy(oldTiming);
			if (timing != oldTiming) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.DOSAGE_INSTRUCTION__TIMING, oldTiming, timing));
			}
		}
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing basicGetTiming() {
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiming(Timing newTiming) {
		Timing oldTiming = timing;
		timing = newTiming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_INSTRUCTION__TIMING, oldTiming, timing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getAsNeededx() {
		if (asNeededx != null && asNeededx.eIsProxy()) {
			InternalEObject oldAsNeededx = (InternalEObject)asNeededx;
			asNeededx = (DataType)eResolveProxy(oldAsNeededx);
			if (asNeededx != oldAsNeededx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.DOSAGE_INSTRUCTION__AS_NEEDEDX, oldAsNeededx, asNeededx));
			}
		}
		return asNeededx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetAsNeededx() {
		return asNeededx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsNeededx(DataType newAsNeededx) {
		DataType oldAsNeededx = asNeededx;
		asNeededx = newAsNeededx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_INSTRUCTION__AS_NEEDEDX, oldAsNeededx, asNeededx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSite() {
		if (site != null && site.eIsProxy()) {
			InternalEObject oldSite = (InternalEObject)site;
			site = (CodeableConcept)eResolveProxy(oldSite);
			if (site != oldSite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.DOSAGE_INSTRUCTION__SITE, oldSite, site));
			}
		}
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSite(CodeableConcept newSite) {
		CodeableConcept oldSite = site;
		site = newSite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_INSTRUCTION__SITE, oldSite, site));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRoute() {
		if (route != null && route.eIsProxy()) {
			InternalEObject oldRoute = (InternalEObject)route;
			route = (CodeableConcept)eResolveProxy(oldRoute);
			if (route != oldRoute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.DOSAGE_INSTRUCTION__ROUTE, oldRoute, route));
			}
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(CodeableConcept newRoute) {
		CodeableConcept oldRoute = route;
		route = newRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_INSTRUCTION__ROUTE, oldRoute, route));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (CodeableConcept)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.DOSAGE_INSTRUCTION__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_INSTRUCTION__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDosex() {
		if (dosex != null && dosex.eIsProxy()) {
			InternalEObject oldDosex = (InternalEObject)dosex;
			dosex = (DataType)eResolveProxy(oldDosex);
			if (dosex != oldDosex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.DOSAGE_INSTRUCTION__DOSEX, oldDosex, dosex));
			}
		}
		return dosex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDosex() {
		return dosex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDosex(DataType newDosex) {
		DataType oldDosex = dosex;
		dosex = newDosex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_INSTRUCTION__DOSEX, oldDosex, dosex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getMaxDosePerPeriod() {
		if (maxDosePerPeriod != null && maxDosePerPeriod.eIsProxy()) {
			InternalEObject oldMaxDosePerPeriod = (InternalEObject)maxDosePerPeriod;
			maxDosePerPeriod = (Ratio)eResolveProxy(oldMaxDosePerPeriod);
			if (maxDosePerPeriod != oldMaxDosePerPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD, oldMaxDosePerPeriod, maxDosePerPeriod));
			}
		}
		return maxDosePerPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio basicGetMaxDosePerPeriod() {
		return maxDosePerPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDosePerPeriod(Ratio newMaxDosePerPeriod) {
		Ratio oldMaxDosePerPeriod = maxDosePerPeriod;
		maxDosePerPeriod = newMaxDosePerPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD, oldMaxDosePerPeriod, maxDosePerPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getMaxDosePerAdministration() {
		if (maxDosePerAdministration != null && maxDosePerAdministration.eIsProxy()) {
			InternalEObject oldMaxDosePerAdministration = (InternalEObject)maxDosePerAdministration;
			maxDosePerAdministration = (SimpleQuantity)eResolveProxy(oldMaxDosePerAdministration);
			if (maxDosePerAdministration != oldMaxDosePerAdministration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_ADMINISTRATION, oldMaxDosePerAdministration, maxDosePerAdministration));
			}
		}
		return maxDosePerAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetMaxDosePerAdministration() {
		return maxDosePerAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDosePerAdministration(SimpleQuantity newMaxDosePerAdministration) {
		SimpleQuantity oldMaxDosePerAdministration = maxDosePerAdministration;
		maxDosePerAdministration = newMaxDosePerAdministration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_ADMINISTRATION, oldMaxDosePerAdministration, maxDosePerAdministration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getMaxDosePerLifetime() {
		if (maxDosePerLifetime != null && maxDosePerLifetime.eIsProxy()) {
			InternalEObject oldMaxDosePerLifetime = (InternalEObject)maxDosePerLifetime;
			maxDosePerLifetime = (SimpleQuantity)eResolveProxy(oldMaxDosePerLifetime);
			if (maxDosePerLifetime != oldMaxDosePerLifetime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_LIFETIME, oldMaxDosePerLifetime, maxDosePerLifetime));
			}
		}
		return maxDosePerLifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetMaxDosePerLifetime() {
		return maxDosePerLifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDosePerLifetime(SimpleQuantity newMaxDosePerLifetime) {
		SimpleQuantity oldMaxDosePerLifetime = maxDosePerLifetime;
		maxDosePerLifetime = newMaxDosePerLifetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_LIFETIME, oldMaxDosePerLifetime, maxDosePerLifetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getRatex() {
		if (ratex != null && ratex.eIsProxy()) {
			InternalEObject oldRatex = (InternalEObject)ratex;
			ratex = (DataType)eResolveProxy(oldRatex);
			if (ratex != oldRatex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.DOSAGE_INSTRUCTION__RATEX, oldRatex, ratex));
			}
		}
		return ratex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetRatex() {
		return ratex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatex(DataType newRatex) {
		DataType oldRatex = ratex;
		ratex = newRatex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_INSTRUCTION__RATEX, oldRatex, ratex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.DOSAGE_INSTRUCTION__SEQUENCE:
				if (resolve) return getSequence();
				return basicGetSequence();
			case DataTypesPackage.DOSAGE_INSTRUCTION__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case DataTypesPackage.DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS:
				return getAdditionalInstructions();
			case DataTypesPackage.DOSAGE_INSTRUCTION__TIMING:
				if (resolve) return getTiming();
				return basicGetTiming();
			case DataTypesPackage.DOSAGE_INSTRUCTION__AS_NEEDEDX:
				if (resolve) return getAsNeededx();
				return basicGetAsNeededx();
			case DataTypesPackage.DOSAGE_INSTRUCTION__SITE:
				if (resolve) return getSite();
				return basicGetSite();
			case DataTypesPackage.DOSAGE_INSTRUCTION__ROUTE:
				if (resolve) return getRoute();
				return basicGetRoute();
			case DataTypesPackage.DOSAGE_INSTRUCTION__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
			case DataTypesPackage.DOSAGE_INSTRUCTION__DOSEX:
				if (resolve) return getDosex();
				return basicGetDosex();
			case DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD:
				if (resolve) return getMaxDosePerPeriod();
				return basicGetMaxDosePerPeriod();
			case DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_ADMINISTRATION:
				if (resolve) return getMaxDosePerAdministration();
				return basicGetMaxDosePerAdministration();
			case DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_LIFETIME:
				if (resolve) return getMaxDosePerLifetime();
				return basicGetMaxDosePerLifetime();
			case DataTypesPackage.DOSAGE_INSTRUCTION__RATEX:
				if (resolve) return getRatex();
				return basicGetRatex();
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
			case DataTypesPackage.DOSAGE_INSTRUCTION__SEQUENCE:
				setSequence((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS:
				getAdditionalInstructions().clear();
				getAdditionalInstructions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__TIMING:
				setTiming((Timing)newValue);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__AS_NEEDEDX:
				setAsNeededx((DataType)newValue);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__SITE:
				setSite((CodeableConcept)newValue);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__ROUTE:
				setRoute((CodeableConcept)newValue);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__DOSEX:
				setDosex((DataType)newValue);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD:
				setMaxDosePerPeriod((Ratio)newValue);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_ADMINISTRATION:
				setMaxDosePerAdministration((SimpleQuantity)newValue);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_LIFETIME:
				setMaxDosePerLifetime((SimpleQuantity)newValue);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__RATEX:
				setRatex((DataType)newValue);
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
			case DataTypesPackage.DOSAGE_INSTRUCTION__SEQUENCE:
				setSequence((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS:
				getAdditionalInstructions().clear();
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__TIMING:
				setTiming((Timing)null);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__AS_NEEDEDX:
				setAsNeededx((DataType)null);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__SITE:
				setSite((CodeableConcept)null);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__ROUTE:
				setRoute((CodeableConcept)null);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__DOSEX:
				setDosex((DataType)null);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD:
				setMaxDosePerPeriod((Ratio)null);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_ADMINISTRATION:
				setMaxDosePerAdministration((SimpleQuantity)null);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_LIFETIME:
				setMaxDosePerLifetime((SimpleQuantity)null);
				return;
			case DataTypesPackage.DOSAGE_INSTRUCTION__RATEX:
				setRatex((DataType)null);
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
			case DataTypesPackage.DOSAGE_INSTRUCTION__SEQUENCE:
				return sequence != null;
			case DataTypesPackage.DOSAGE_INSTRUCTION__TEXT:
				return text != null;
			case DataTypesPackage.DOSAGE_INSTRUCTION__ADDITIONAL_INSTRUCTIONS:
				return additionalInstructions != null && !additionalInstructions.isEmpty();
			case DataTypesPackage.DOSAGE_INSTRUCTION__TIMING:
				return timing != null;
			case DataTypesPackage.DOSAGE_INSTRUCTION__AS_NEEDEDX:
				return asNeededx != null;
			case DataTypesPackage.DOSAGE_INSTRUCTION__SITE:
				return site != null;
			case DataTypesPackage.DOSAGE_INSTRUCTION__ROUTE:
				return route != null;
			case DataTypesPackage.DOSAGE_INSTRUCTION__METHOD:
				return method != null;
			case DataTypesPackage.DOSAGE_INSTRUCTION__DOSEX:
				return dosex != null;
			case DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_PERIOD:
				return maxDosePerPeriod != null;
			case DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_ADMINISTRATION:
				return maxDosePerAdministration != null;
			case DataTypesPackage.DOSAGE_INSTRUCTION__MAX_DOSE_PER_LIFETIME:
				return maxDosePerLifetime != null;
			case DataTypesPackage.DOSAGE_INSTRUCTION__RATEX:
				return ratex != null;
		}
		return super.eIsSet(featureID);
	}

} //DosageInstructionImpl
