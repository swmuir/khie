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
import org.eclipse.mdht.uml.hl7.datatypes.BN;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesValidator;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>BN</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.hl7.datatypes.BN#validateNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Null Flavor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BNOperations extends BLOperations {
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
	protected BNOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNullFlavor(BN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNullFlavor(BN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.isNullFlavorUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateNullFlavor(BN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNullFlavor(BN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param bn The receiving '<em><b>BN</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNullFlavor(BN bn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			synchronized (EOCL_ENV) {
				OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
				helper.setContext(DatatypesPackage.Literals.BN);
				try {
					VALIDATE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
						helper.createInvariant(VALIDATE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
				} catch (ParserException pe) {
					throw new UnsupportedOperationException(pe.getLocalizedMessage());
				}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(bn)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, DatatypesValidator.DIAGNOSTIC_SOURCE, DatatypesValidator.BN__NULL_FLAVOR,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"validateNullFlavor",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(bn, context) }),
						new Object[] { bn }));
			}
			return false;
		}
		return true;
	}

} // BNOperations
