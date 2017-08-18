/**
 */
package org.eclipse.mdht.uml.term.core.profile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context To Value Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getContext <em>Context</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getValueSetName <em>Value Set Name</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getValueSetURI <em>Value Set URI</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getValueSetOID <em>Value Set OID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getContextToValueSet()
 * @model
 * @generated
 */
public interface ContextToValueSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getContextToValueSet_Context()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Value Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Set Name</em>' attribute.
	 * @see #setValueSetName(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getContextToValueSet_ValueSetName()
	 * @model ordered="false"
	 * @generated
	 */
	String getValueSetName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getValueSetName <em>Value Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Name</em>' attribute.
	 * @see #getValueSetName()
	 * @generated
	 */
	void setValueSetName(String value);

	/**
	 * Returns the value of the '<em><b>Value Set URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Set URI</em>' attribute.
	 * @see #setValueSetURI(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getContextToValueSet_ValueSetURI()
	 * @model ordered="false"
	 * @generated
	 */
	String getValueSetURI();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getValueSetURI <em>Value Set URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set URI</em>' attribute.
	 * @see #getValueSetURI()
	 * @generated
	 */
	void setValueSetURI(String value);

	/**
	 * Returns the value of the '<em><b>Value Set OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set OID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Set OID</em>' attribute.
	 * @see #setValueSetOID(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getContextToValueSet_ValueSetOID()
	 * @model ordered="false"
	 * @generated
	 */
	String getValueSetOID();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getValueSetOID <em>Value Set OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set OID</em>' attribute.
	 * @see #getValueSetOID()
	 * @generated
	 */
	void setValueSetOID(String value);

} // ContextToValueSet
