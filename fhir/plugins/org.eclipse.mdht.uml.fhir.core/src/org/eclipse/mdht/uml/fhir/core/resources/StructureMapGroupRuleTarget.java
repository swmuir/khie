/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.mdht.uml.fhir.core.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.fhir.core.dataTypes.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Code;
import org.eclipse.mdht.uml.fhir.core.dataTypes.Id;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Map Group Rule Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget#getListModes <em>List Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget#getListRuleId <em>List Rule Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget#getParameters <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleTarget()
 * @model
 * @generated
 */
public interface StructureMapGroupRuleTarget extends BackboneElement {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleTarget_Context()
	 * @model
	 * @generated
	 */
	Id getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget#getContext <em>Context</em>}' reference.
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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleTarget_ContextType()
	 * @model
	 * @generated
	 */
	Code getContextType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget#getContextType <em>Context Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Type</em>' reference.
	 * @see #getContextType()
	 * @generated
	 */
	void setContextType(Code value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleTarget_Element()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.dataTypes.String getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(org.eclipse.mdht.uml.fhir.core.dataTypes.String value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleTarget_Variable()
	 * @model
	 * @generated
	 */
	Id getVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Id value);

	/**
	 * Returns the value of the '<em><b>List Mode</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Mode</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Mode</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleTarget_ListMode()
	 * @model
	 * @generated
	 */
	EList<Code> getListModes();

	/**
	 * Returns the value of the '<em><b>List Rule Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Rule Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Rule Id</em>' reference.
	 * @see #setListRuleId(Id)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleTarget_ListRuleId()
	 * @model
	 * @generated
	 */
	Id getListRuleId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget#getListRuleId <em>List Rule Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Rule Id</em>' reference.
	 * @see #getListRuleId()
	 * @generated
	 */
	void setListRuleId(Id value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' reference.
	 * @see #setTransform(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleTarget_Transform()
	 * @model
	 * @generated
	 */
	Code getTransform();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTarget#getTransform <em>Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Code value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resources.StructureMapGroupRuleTargetParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resources.ResourcesPackage#getStructureMapGroupRuleTarget_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureMapGroupRuleTargetParameter> getParameters();

} // StructureMapGroupRuleTarget
