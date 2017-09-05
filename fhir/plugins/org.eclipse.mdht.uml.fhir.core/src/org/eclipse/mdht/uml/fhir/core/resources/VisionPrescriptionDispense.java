/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Decimal;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vision Prescription Dispense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getProduct <em>Product</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getEye <em>Eye</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getSphere <em>Sphere</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getPrism <em>Prism</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getAdd <em>Add</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getPower <em>Power</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getBackCurve <em>Back Curve</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getColor <em>Color</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getBrand <em>Brand</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getNote <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense()
 * @model
 * @generated
 */
public interface VisionPrescriptionDispense extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense_Product()
	 * @model
	 * @generated
	 */
	CodeableConcept getProduct();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Eye</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eye</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eye</em>' reference.
	 * @see #setEye(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense_Eye()
	 * @model
	 * @generated
	 */
	CodeableConcept getEye();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getEye <em>Eye</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eye</em>' reference.
	 * @see #getEye()
	 * @generated
	 */
	void setEye(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sphere</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sphere</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sphere</em>' reference.
	 * @see #setSphere(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense_Sphere()
	 * @model
	 * @generated
	 */
	Decimal getSphere();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getSphere <em>Sphere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sphere</em>' reference.
	 * @see #getSphere()
	 * @generated
	 */
	void setSphere(Decimal value);

	/**
	 * Returns the value of the '<em><b>Cylinder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cylinder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cylinder</em>' reference.
	 * @see #setCylinder(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense_Cylinder()
	 * @model
	 * @generated
	 */
	Decimal getCylinder();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getCylinder <em>Cylinder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylinder</em>' reference.
	 * @see #getCylinder()
	 * @generated
	 */
	void setCylinder(Decimal value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' reference.
	 * @see #setAxis(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense_Axis()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getAxis();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getAxis <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Prism</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prism</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prism</em>' reference.
	 * @see #setPrism(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense_Prism()
	 * @model
	 * @generated
	 */
	Decimal getPrism();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getPrism <em>Prism</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prism</em>' reference.
	 * @see #getPrism()
	 * @generated
	 */
	void setPrism(Decimal value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense_Base()
	 * @model
	 * @generated
	 */
	CodeableConcept getBase();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Add</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add</em>' reference.
	 * @see #setAdd(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense_Add()
	 * @model
	 * @generated
	 */
	Decimal getAdd();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getAdd <em>Add</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add</em>' reference.
	 * @see #getAdd()
	 * @generated
	 */
	void setAdd(Decimal value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' reference.
	 * @see #setPower(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense_Power()
	 * @model
	 * @generated
	 */
	Decimal getPower();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getPower <em>Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' reference.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(Decimal value);

	/**
	 * Returns the value of the '<em><b>Back Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Back Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back Curve</em>' reference.
	 * @see #setBackCurve(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense_BackCurve()
	 * @model
	 * @generated
	 */
	Decimal getBackCurve();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getBackCurve <em>Back Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Curve</em>' reference.
	 * @see #getBackCurve()
	 * @generated
	 */
	void setBackCurve(Decimal value);

	/**
	 * Returns the value of the '<em><b>Diameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter</em>' reference.
	 * @see #setDiameter(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense_Diameter()
	 * @model
	 * @generated
	 */
	Decimal getDiameter();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getDiameter <em>Diameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter</em>' reference.
	 * @see #getDiameter()
	 * @generated
	 */
	void setDiameter(Decimal value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' reference.
	 * @see #setDuration(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense_Duration()
	 * @model
	 * @generated
	 */
	SimpleQuantity getDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getDuration <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' reference.
	 * @see #setColor(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense_Color()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getColor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getColor <em>Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Brand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' reference.
	 * @see #setBrand(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense_Brand()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getBrand();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getBrand <em>Brand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' reference.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' reference.
	 * @see #setNote(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getVisionPrescriptionDispense_Note()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getNote();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.VisionPrescriptionDispense#getNote <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

} // VisionPrescriptionDispense
