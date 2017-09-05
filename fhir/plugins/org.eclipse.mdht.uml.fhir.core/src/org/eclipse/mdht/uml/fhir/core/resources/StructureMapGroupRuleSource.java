/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Id;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Map Group Rule Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getListMode <em>List Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getCheck <em>Check</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleSource()
 * @model
 * @generated
 */
public interface StructureMapGroupRuleSource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference.
	 * @see #setRequired(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleSource_Required()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean getRequired();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getRequired <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(org.eclipse.mdht.uml.fhir.core.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Id)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleSource_Context()
	 * @model required="true"
	 * @generated
	 */
	Id getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Id value);

	/**
	 * Returns the value of the '<em><b>Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Type</em>' reference.
	 * @see #setContextType(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleSource_ContextType()
	 * @model required="true"
	 * @generated
	 */
	Code getContextType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getContextType <em>Context Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Type</em>' reference.
	 * @see #getContextType()
	 * @generated
	 */
	void setContextType(Code value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' reference.
	 * @see #setMin(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleSource_Min()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.Integer getMin();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getMin <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(org.eclipse.mdht.uml.fhir.core.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' reference.
	 * @see #setMax(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleSource_Max()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getMax();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getMax <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleSource_Type()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleSource_Element()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>List Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Mode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Mode</em>' reference.
	 * @see #setListMode(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleSource_ListMode()
	 * @model
	 * @generated
	 */
	Code getListMode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getListMode <em>List Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Mode</em>' reference.
	 * @see #getListMode()
	 * @generated
	 */
	void setListMode(Code value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Id)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleSource_Variable()
	 * @model
	 * @generated
	 */
	Id getVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Id value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleSource_Condition()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Check</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check</em>' reference.
	 * @see #setCheck(org.eclipse.mdht.uml.fhir.core.dataTypes.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleSource_Check()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getCheck();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleSource#getCheck <em>Check</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check</em>' reference.
	 * @see #getCheck()
	 * @generated
	 */
	void setCheck(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

} // StructureMapGroupRuleSource
