/*******************************************************************************
 * Copyright (c) 2010 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.util.test;

import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.junit.Test;

public class TestCDAPackageLoad {

	@Test
	public void testLoadPackages() {
		CDAUtil.loadPackages();
	}

}
