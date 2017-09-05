/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal;
import org.eclipse.mdht.uml.fhir.core.dataTypes.impl.BackboneElementImpl;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;
import org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage;
import org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vision Prescription Dispense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.VisionPrescriptionDispenseImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.VisionPrescriptionDispenseImpl#getEye <em>Eye</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.VisionPrescriptionDispenseImpl#getSphere <em>Sphere</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.VisionPrescriptionDispenseImpl#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.VisionPrescriptionDispenseImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.VisionPrescriptionDispenseImpl#getPrism <em>Prism</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.VisionPrescriptionDispenseImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.VisionPrescriptionDispenseImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.VisionPrescriptionDispenseImpl#getPower <em>Power</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.VisionPrescriptionDispenseImpl#getBackCurve <em>Back Curve</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.VisionPrescriptionDispenseImpl#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.VisionPrescriptionDispenseImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.VisionPrescriptionDispenseImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.VisionPrescriptionDispenseImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.impl.VisionPrescriptionDispenseImpl#getNote <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisionPrescriptionDispenseImpl extends BackboneElementImpl implements VisionPrescriptionDispense {
	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept product;

	/**
	 * The cached value of the '{@link #getEye() <em>Eye</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEye()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept eye;

	/**
	 * The cached value of the '{@link #getSphere() <em>Sphere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSphere()
	 * @generated
	 * @ordered
	 */
	protected Decimal sphere;

	/**
	 * The cached value of the '{@link #getCylinder() <em>Cylinder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCylinder()
	 * @generated
	 * @ordered
	 */
	protected Decimal cylinder;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.Integer axis;

	/**
	 * The cached value of the '{@link #getPrism() <em>Prism</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrism()
	 * @generated
	 * @ordered
	 */
	protected Decimal prism;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept base;

	/**
	 * The cached value of the '{@link #getAdd() <em>Add</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdd()
	 * @generated
	 * @ordered
	 */
	protected Decimal add;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected Decimal power;

	/**
	 * The cached value of the '{@link #getBackCurve() <em>Back Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackCurve()
	 * @generated
	 * @ordered
	 */
	protected Decimal backCurve;

	/**
	 * The cached value of the '{@link #getDiameter() <em>Diameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameter()
	 * @generated
	 * @ordered
	 */
	protected Decimal diameter;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity duration;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String color;

	/**
	 * The cached value of the '{@link #getBrand() <em>Brand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String brand;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.dataTypes.String note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisionPrescriptionDispenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getVisionPrescriptionDispense();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (CodeableConcept)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(CodeableConcept newProduct) {
		CodeableConcept oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getEye() {
		if (eye != null && eye.eIsProxy()) {
			InternalEObject oldEye = (InternalEObject)eye;
			eye = (CodeableConcept)eResolveProxy(oldEye);
			if (eye != oldEye) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__EYE, oldEye, eye));
			}
		}
		return eye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetEye() {
		return eye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEye(CodeableConcept newEye) {
		CodeableConcept oldEye = eye;
		eye = newEye;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__EYE, oldEye, eye));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getSphere() {
		if (sphere != null && sphere.eIsProxy()) {
			InternalEObject oldSphere = (InternalEObject)sphere;
			sphere = (Decimal)eResolveProxy(oldSphere);
			if (sphere != oldSphere) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__SPHERE, oldSphere, sphere));
			}
		}
		return sphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetSphere() {
		return sphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSphere(Decimal newSphere) {
		Decimal oldSphere = sphere;
		sphere = newSphere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__SPHERE, oldSphere, sphere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getCylinder() {
		if (cylinder != null && cylinder.eIsProxy()) {
			InternalEObject oldCylinder = (InternalEObject)cylinder;
			cylinder = (Decimal)eResolveProxy(oldCylinder);
			if (cylinder != oldCylinder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER, oldCylinder, cylinder));
			}
		}
		return cylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetCylinder() {
		return cylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCylinder(Decimal newCylinder) {
		Decimal oldCylinder = cylinder;
		cylinder = newCylinder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER, oldCylinder, cylinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getAxis() {
		if (axis != null && axis.eIsProxy()) {
			InternalEObject oldAxis = (InternalEObject)axis;
			axis = (org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)eResolveProxy(oldAxis);
			if (axis != oldAxis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__AXIS, oldAxis, axis));
			}
		}
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.Integer basicGetAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer newAxis) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.Integer oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__AXIS, oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPrism() {
		if (prism != null && prism.eIsProxy()) {
			InternalEObject oldPrism = (InternalEObject)prism;
			prism = (Decimal)eResolveProxy(oldPrism);
			if (prism != oldPrism) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__PRISM, oldPrism, prism));
			}
		}
		return prism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetPrism() {
		return prism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrism(Decimal newPrism) {
		Decimal oldPrism = prism;
		prism = newPrism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__PRISM, oldPrism, prism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (CodeableConcept)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(CodeableConcept newBase) {
		CodeableConcept oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getAdd() {
		if (add != null && add.eIsProxy()) {
			InternalEObject oldAdd = (InternalEObject)add;
			add = (Decimal)eResolveProxy(oldAdd);
			if (add != oldAdd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__ADD, oldAdd, add));
			}
		}
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetAdd() {
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdd(Decimal newAdd) {
		Decimal oldAdd = add;
		add = newAdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__ADD, oldAdd, add));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPower() {
		if (power != null && power.eIsProxy()) {
			InternalEObject oldPower = (InternalEObject)power;
			power = (Decimal)eResolveProxy(oldPower);
			if (power != oldPower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__POWER, oldPower, power));
			}
		}
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(Decimal newPower) {
		Decimal oldPower = power;
		power = newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getBackCurve() {
		if (backCurve != null && backCurve.eIsProxy()) {
			InternalEObject oldBackCurve = (InternalEObject)backCurve;
			backCurve = (Decimal)eResolveProxy(oldBackCurve);
			if (backCurve != oldBackCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE, oldBackCurve, backCurve));
			}
		}
		return backCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetBackCurve() {
		return backCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackCurve(Decimal newBackCurve) {
		Decimal oldBackCurve = backCurve;
		backCurve = newBackCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE, oldBackCurve, backCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getDiameter() {
		if (diameter != null && diameter.eIsProxy()) {
			InternalEObject oldDiameter = (InternalEObject)diameter;
			diameter = (Decimal)eResolveProxy(oldDiameter);
			if (diameter != oldDiameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER, oldDiameter, diameter));
			}
		}
		return diameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetDiameter() {
		return diameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiameter(Decimal newDiameter) {
		Decimal oldDiameter = diameter;
		diameter = newDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER, oldDiameter, diameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getDuration() {
		if (duration != null && duration.eIsProxy()) {
			InternalEObject oldDuration = (InternalEObject)duration;
			duration = (SimpleQuantity)eResolveProxy(oldDuration);
			if (duration != oldDuration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__DURATION, oldDuration, duration));
			}
		}
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(SimpleQuantity newDuration) {
		SimpleQuantity oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getColor() {
		if (color != null && color.eIsProxy()) {
			InternalEObject oldColor = (InternalEObject)color;
			color = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldColor);
			if (color != oldColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__COLOR, oldColor, color));
			}
		}
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(org.eclipse.mdht.uml.fhir.core.dataTypes.String newColor) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getBrand() {
		if (brand != null && brand.eIsProxy()) {
			InternalEObject oldBrand = (InternalEObject)brand;
			brand = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldBrand);
			if (brand != oldBrand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BRAND, oldBrand, brand));
			}
		}
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetBrand() {
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrand(org.eclipse.mdht.uml.fhir.core.dataTypes.String newBrand) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldBrand = brand;
		brand = newBrand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BRAND, oldBrand, brand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String getNote() {
		if (note != null && note.eIsProxy()) {
			InternalEObject oldNote = (InternalEObject)note;
			note = (org.eclipse.mdht.uml.fhir.core.dataTypes.String)eResolveProxy(oldNote);
			if (note != oldNote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__NOTE, oldNote, note));
			}
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.dataTypes.String basicGetNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(org.eclipse.mdht.uml.fhir.core.dataTypes.String newNote) {
		org.eclipse.mdht.uml.fhir.core.dataTypes.String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__EYE:
				if (resolve) return getEye();
				return basicGetEye();
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__SPHERE:
				if (resolve) return getSphere();
				return basicGetSphere();
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER:
				if (resolve) return getCylinder();
				return basicGetCylinder();
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__AXIS:
				if (resolve) return getAxis();
				return basicGetAxis();
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__PRISM:
				if (resolve) return getPrism();
				return basicGetPrism();
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__ADD:
				if (resolve) return getAdd();
				return basicGetAdd();
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__POWER:
				if (resolve) return getPower();
				return basicGetPower();
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE:
				if (resolve) return getBackCurve();
				return basicGetBackCurve();
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER:
				if (resolve) return getDiameter();
				return basicGetDiameter();
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__DURATION:
				if (resolve) return getDuration();
				return basicGetDuration();
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__COLOR:
				if (resolve) return getColor();
				return basicGetColor();
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BRAND:
				if (resolve) return getBrand();
				return basicGetBrand();
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__NOTE:
				if (resolve) return getNote();
				return basicGetNote();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT:
				setProduct((CodeableConcept)newValue);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__EYE:
				setEye((CodeableConcept)newValue);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__SPHERE:
				setSphere((Decimal)newValue);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER:
				setCylinder((Decimal)newValue);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__AXIS:
				setAxis((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__PRISM:
				setPrism((Decimal)newValue);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BASE:
				setBase((CodeableConcept)newValue);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__ADD:
				setAdd((Decimal)newValue);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__POWER:
				setPower((Decimal)newValue);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE:
				setBackCurve((Decimal)newValue);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER:
				setDiameter((Decimal)newValue);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__DURATION:
				setDuration((SimpleQuantity)newValue);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__COLOR:
				setColor((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BRAND:
				setBrand((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__NOTE:
				setNote((org.eclipse.mdht.uml.fhir.core.dataTypes.String)newValue);
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
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT:
				setProduct((CodeableConcept)null);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__EYE:
				setEye((CodeableConcept)null);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__SPHERE:
				setSphere((Decimal)null);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER:
				setCylinder((Decimal)null);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__AXIS:
				setAxis((org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)null);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__PRISM:
				setPrism((Decimal)null);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BASE:
				setBase((CodeableConcept)null);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__ADD:
				setAdd((Decimal)null);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__POWER:
				setPower((Decimal)null);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE:
				setBackCurve((Decimal)null);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER:
				setDiameter((Decimal)null);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__DURATION:
				setDuration((SimpleQuantity)null);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__COLOR:
				setColor((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BRAND:
				setBrand((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__NOTE:
				setNote((org.eclipse.mdht.uml.fhir.core.dataTypes.String)null);
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
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT:
				return product != null;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__EYE:
				return eye != null;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__SPHERE:
				return sphere != null;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER:
				return cylinder != null;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__AXIS:
				return axis != null;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__PRISM:
				return prism != null;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BASE:
				return base != null;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__ADD:
				return add != null;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__POWER:
				return power != null;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE:
				return backCurve != null;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER:
				return diameter != null;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__DURATION:
				return duration != null;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__COLOR:
				return color != null;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__BRAND:
				return brand != null;
			case ResourcesPackage.VISION_PRESCRIPTION_DISPENSE__NOTE:
				return note != null;
		}
		return super.eIsSet(featureID);
	}

} //VisionPrescriptionDispenseImpl
