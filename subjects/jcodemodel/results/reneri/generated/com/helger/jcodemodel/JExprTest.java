/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 * Portions Copyright 2013-2018 Philip Helger + contributors
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package com.helger.jcodemodel;


/**
 * {@link JExpr} tests.
 */
public final class JExprTest {
    /**
     * Tests double literal expression.
     */
    @org.junit.Test
    public void testLitDouble() {
        org.junit.Assert.assertEquals(com.helger.jcodemodel.JAtomDouble.JAVA_LANG_DOUBLE_POSITIVE_INFINITY, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JExprTest|testLitDouble()|1", com.helger.jcodemodel.util.CodeModelTestsHelper.toString(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAtomDouble>observeState("com.helger.jcodemodel.JExprTest|testLitDouble()|0", com.helger.jcodemodel.JAtomDouble.class, com.helger.jcodemodel.JExpr.lit(java.lang.Double.POSITIVE_INFINITY)))));
        org.junit.Assert.assertEquals(com.helger.jcodemodel.JAtomDouble.JAVA_LANG_DOUBLE_NEGATIVE_INFINITY, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JExprTest|testLitDouble()|3", com.helger.jcodemodel.util.CodeModelTestsHelper.toString(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAtomDouble>observeState("com.helger.jcodemodel.JExprTest|testLitDouble()|2", com.helger.jcodemodel.JAtomDouble.class, com.helger.jcodemodel.JExpr.lit(java.lang.Double.NEGATIVE_INFINITY)))));
        org.junit.Assert.assertEquals(com.helger.jcodemodel.JAtomDouble.JAVA_LANG_DOUBLE_NAN, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JExprTest|testLitDouble()|5", com.helger.jcodemodel.util.CodeModelTestsHelper.toString(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAtomDouble>observeState("com.helger.jcodemodel.JExprTest|testLitDouble()|4", com.helger.jcodemodel.JAtomDouble.class, com.helger.jcodemodel.JExpr.lit(java.lang.Double.NaN)))));
    }

    @org.junit.Test
    public void testLitFloat() {
        org.junit.Assert.assertEquals(com.helger.jcodemodel.JAtomFloat.JAVA_LANG_FLOAT_POSITIVE_INFINITY, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JExprTest|testLitFloat()|1", com.helger.jcodemodel.util.CodeModelTestsHelper.toString(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAtomFloat>observeState("com.helger.jcodemodel.JExprTest|testLitFloat()|0", com.helger.jcodemodel.JAtomFloat.class, com.helger.jcodemodel.JExpr.lit(java.lang.Float.POSITIVE_INFINITY)))));
        org.junit.Assert.assertEquals(com.helger.jcodemodel.JAtomFloat.JAVA_LANG_FLOAT_NEGATIVE_INFINITY, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JExprTest|testLitFloat()|3", com.helger.jcodemodel.util.CodeModelTestsHelper.toString(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAtomFloat>observeState("com.helger.jcodemodel.JExprTest|testLitFloat()|2", com.helger.jcodemodel.JAtomFloat.class, com.helger.jcodemodel.JExpr.lit(java.lang.Float.NEGATIVE_INFINITY)))));
        org.junit.Assert.assertEquals(com.helger.jcodemodel.JAtomFloat.JAVA_LANG_FLOAT_NAN, eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JExprTest|testLitFloat()|5", com.helger.jcodemodel.util.CodeModelTestsHelper.toString(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAtomFloat>observeState("com.helger.jcodemodel.JExprTest|testLitFloat()|4", com.helger.jcodemodel.JAtomFloat.class, com.helger.jcodemodel.JExpr.lit(java.lang.Float.NaN)))));
    }

    @org.junit.Test
    public void testLitIntAndLong() {
        org.junit.Assert.assertEquals("5", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JExprTest|testLitIntAndLong()|1", com.helger.jcodemodel.util.CodeModelTestsHelper.toString(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAtomInt>observeState("com.helger.jcodemodel.JExprTest|testLitIntAndLong()|0", com.helger.jcodemodel.JAtomInt.class, com.helger.jcodemodel.JExpr.lit(5)))));
        org.junit.Assert.assertEquals("5L", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JExprTest|testLitIntAndLong()|3", com.helger.jcodemodel.util.CodeModelTestsHelper.toString(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAtomLong>observeState("com.helger.jcodemodel.JExprTest|testLitIntAndLong()|2", com.helger.jcodemodel.JAtomLong.class, com.helger.jcodemodel.JExpr.lit(5L)))));
        org.junit.Assert.assertEquals("5L", eu.stamp_project.reneri.instrumentation.StateObserver.observe("com.helger.jcodemodel.JExprTest|testLitIntAndLong()|5", com.helger.jcodemodel.util.CodeModelTestsHelper.toString(eu.stamp_project.reneri.instrumentation.StateObserver.<com.helger.jcodemodel.JAtomLong>observeState("com.helger.jcodemodel.JExprTest|testLitIntAndLong()|4", com.helger.jcodemodel.JAtomLong.class, com.helger.jcodemodel.JExpr.lit(((long) (5)))))));
    }
}

