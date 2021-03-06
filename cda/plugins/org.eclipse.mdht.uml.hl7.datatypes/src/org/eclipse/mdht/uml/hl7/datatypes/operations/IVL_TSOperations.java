/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.hl7.datatypes.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesValidator;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>IVL TS</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.IVL_TS#validateOptionsContainingLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Low</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.IVL_TS#validateOptionsContainingCenter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Center</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.IVL_TS#validateOptionsContainingHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing High</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.IVL_TS#validateOptionsContainingWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IVL_TSOperations extends ANYOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IVL_TSOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOptionsContainingLow(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOptionsContainingLow(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPTIONS_CONTAINING_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.low.oclIsUndefined() implies self.center.oclIsUndefined() and (self.width.oclIsUndefined() or self.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOptionsContainingLow(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOptionsContainingLow(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_OPTIONS_CONTAINING_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ivL_TS The receiving '<em><b>IVL TS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOptionsContainingLow(IVL_TS ivL_TS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_OPTIONS_CONTAINING_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			synchronized (EOCL_ENV) {
				OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
				helper.setContext(DatatypesPackage.Literals.IVL_TS);
				try {
					VALIDATE_OPTIONS_CONTAINING_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
						helper.createInvariant(VALIDATE_OPTIONS_CONTAINING_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
				} catch (ParserException pe) {
					throw new UnsupportedOperationException(pe.getLocalizedMessage());
				}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_OPTIONS_CONTAINING_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			ivL_TS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, DatatypesValidator.DIAGNOSTIC_SOURCE,
						DatatypesValidator.IVL_TS__OPTIONS_CONTAINING_LOW,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"validateOptionsContainingLow",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ivL_TS, context) }),
						new Object[] { ivL_TS }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOptionsContainingCenter(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Center</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOptionsContainingCenter(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPTIONS_CONTAINING_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.center.oclIsUndefined() implies self.high.oclIsUndefined() and self.low.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateOptionsContainingCenter(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Center</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOptionsContainingCenter(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_OPTIONS_CONTAINING_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ivL_TS The receiving '<em><b>IVL TS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOptionsContainingCenter(IVL_TS ivL_TS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_OPTIONS_CONTAINING_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			synchronized (EOCL_ENV) {
				OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
				helper.setContext(DatatypesPackage.Literals.IVL_TS);
				try {
					VALIDATE_OPTIONS_CONTAINING_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
						helper.createInvariant(VALIDATE_OPTIONS_CONTAINING_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
				} catch (ParserException pe) {
					throw new UnsupportedOperationException(pe.getLocalizedMessage());
				}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_OPTIONS_CONTAINING_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			ivL_TS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, DatatypesValidator.DIAGNOSTIC_SOURCE,
						DatatypesValidator.IVL_TS__OPTIONS_CONTAINING_CENTER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"validateOptionsContainingCenter",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ivL_TS, context) }),
						new Object[] { ivL_TS }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOptionsContainingHigh(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOptionsContainingHigh(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPTIONS_CONTAINING_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.high.oclIsUndefined() implies (self.low.oclIsUndefined() and self.center.oclIsUndefined() and self.width.oclIsUndefined()) or ((not self.low.oclIsUndefined()) and self.width.oclIsUndefined() and self.center.oclIsUndefined()) or ((not self.width.oclIsUndefined()) and self.low.oclIsUndefined() and self.center.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOptionsContainingHigh(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOptionsContainingHigh(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_OPTIONS_CONTAINING_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ivL_TS The receiving '<em><b>IVL TS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOptionsContainingHigh(IVL_TS ivL_TS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_OPTIONS_CONTAINING_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			synchronized (EOCL_ENV) {
				OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
				helper.setContext(DatatypesPackage.Literals.IVL_TS);
				try {
					VALIDATE_OPTIONS_CONTAINING_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
						helper.createInvariant(VALIDATE_OPTIONS_CONTAINING_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
				} catch (ParserException pe) {
					throw new UnsupportedOperationException(pe.getLocalizedMessage());
				}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_OPTIONS_CONTAINING_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			ivL_TS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, DatatypesValidator.DIAGNOSTIC_SOURCE,
						DatatypesValidator.IVL_TS__OPTIONS_CONTAINING_HIGH,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"validateOptionsContainingHigh",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ivL_TS, context) }),
						new Object[] { ivL_TS }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOptionsContainingWidth(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOptionsContainingWidth(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPTIONS_CONTAINING_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.width.oclIsUndefined() implies ((not self.low.oclIsUndefined()) and self.center.oclIsUndefined() and self.high.oclIsUndefined()) or (self.low.oclIsUndefined() and self.center.oclIsUndefined()) or ((not self.center.oclIsUndefined()) and self.low.oclIsUndefined() and self.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOptionsContainingWidth(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOptionsContainingWidth(IVL_TS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_OPTIONS_CONTAINING_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ivL_TS The receiving '<em><b>IVL TS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOptionsContainingWidth(IVL_TS ivL_TS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_OPTIONS_CONTAINING_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			synchronized (EOCL_ENV) {
				OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
				helper.setContext(DatatypesPackage.Literals.IVL_TS);
				try {
					VALIDATE_OPTIONS_CONTAINING_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
						helper.createInvariant(VALIDATE_OPTIONS_CONTAINING_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
				} catch (ParserException pe) {
					throw new UnsupportedOperationException(pe.getLocalizedMessage());
				}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_OPTIONS_CONTAINING_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			ivL_TS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, DatatypesValidator.DIAGNOSTIC_SOURCE,
						DatatypesValidator.IVL_TS__OPTIONS_CONTAINING_WIDTH,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"validateOptionsContainingWidth",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ivL_TS, context) }),
						new Object[] { ivL_TS }));
			}
			return false;
		}
		return true;
	}

} // IVL_TSOperations
