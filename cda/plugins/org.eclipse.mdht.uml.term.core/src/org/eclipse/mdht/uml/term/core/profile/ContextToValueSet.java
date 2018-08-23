/**
 */
package org.eclipse.mdht.uml.term.core.profile;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context To Value Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getValueSetName <em>Value Set Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getValueSetURI <em>Value Set URI</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getValueSetOID <em>Value Set OID</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getContextToValueSet()
 * @model
 * @generated
 */
public interface ContextToValueSet extends EObject {
	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.common.notify.Notifier#eAdapters()
	 */
	@Override
	EList<Adapter> eAdapters();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.common.notify.Notifier#eDeliver()
	 */
	@Override
	boolean eDeliver();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.common.notify.Notifier#eSetDeliver(boolean)
	 */
	@Override
	void eSetDeliver(boolean deliver);

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.common.notify.Notifier#eNotify(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	void eNotify(Notification notification);

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	String toString();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.EObject#eClass()
	 */
	@Override
	EClass eClass();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.EObject#eResource()
	 */
	@Override
	Resource eResource();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.EObject#eContainer()
	 */
	@Override
	EObject eContainer();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.EObject#eContainingFeature()
	 */
	@Override
	EStructuralFeature eContainingFeature();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.EObject#eContainmentFeature()
	 */
	@Override
	EReference eContainmentFeature();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.EObject#eContents()
	 */
	@Override
	EList<EObject> eContents();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.EObject#eAllContents()
	 */
	@Override
	TreeIterator<EObject> eAllContents();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.EObject#eIsProxy()
	 */
	@Override
	boolean eIsProxy();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.EObject#eCrossReferences()
	 */
	@Override
	EList<EObject> eCrossReferences();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.EObject#eGet(org.eclipse.emf.ecore.EStructuralFeature)
	 */
	@Override
	Object eGet(EStructuralFeature feature);

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.EObject#eGet(org.eclipse.emf.ecore.EStructuralFeature, boolean)
	 */
	@Override
	Object eGet(EStructuralFeature feature, boolean resolve);

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.EObject#eSet(org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 */
	@Override
	void eSet(EStructuralFeature feature, Object newValue);

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.EObject#eIsSet(org.eclipse.emf.ecore.EStructuralFeature)
	 */
	@Override
	boolean eIsSet(EStructuralFeature feature);

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.EObject#eUnset(org.eclipse.emf.ecore.EStructuralFeature)
	 */
	@Override
	void eUnset(EStructuralFeature feature);

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.EObject#eInvoke(org.eclipse.emf.ecore.EOperation, org.eclipse.emf.common.util.EList)
	 */
	@Override
	Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException;

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getContextToValueSet_Context()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
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
	 * @return the value of the '<em>Value Set Name</em>' attribute.
	 * @see #setValueSetName(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getContextToValueSet_ValueSetName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getValueSetName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getValueSetName <em>Value Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Name</em>' attribute.
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
	 * @return the value of the '<em>Value Set URI</em>' attribute.
	 * @see #setValueSetURI(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getContextToValueSet_ValueSetURI()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getValueSetURI();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getValueSetURI <em>Value Set URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set URI</em>' attribute.
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
	 * @return the value of the '<em>Value Set OID</em>' attribute.
	 * @see #setValueSetOID(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getContextToValueSet_ValueSetOID()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getValueSetOID();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getValueSetOID <em>Value Set OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set OID</em>' attribute.
	 * @see #getValueSetOID()
	 * @generated
	 */
	void setValueSetOID(String value);

} // ContextToValueSet
