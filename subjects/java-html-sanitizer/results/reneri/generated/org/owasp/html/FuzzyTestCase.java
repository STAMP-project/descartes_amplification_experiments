/**
 * Copyright (c) 2011, Mike Samuel
 */
/**
 * All rights reserved.
 */
/**
 *
 */
/**
 * Redistribution and use in source and binary forms, with or without
 */
/**
 * modification, are permitted provided that the following conditions
 */
/**
 * are met:
 */
/**
 *
 */
/**
 * Redistributions of source code must retain the above copyright
 */
/**
 * notice, this list of conditions and the following disclaimer.
 */
/**
 * Redistributions in binary form must reproduce the above copyright
 */
/**
 * notice, this list of conditions and the following disclaimer in the
 */
/**
 * documentation and/or other materials provided with the distribution.
 */
/**
 * Neither the name of the OWASP nor the names of its contributors may
 */
/**
 * be used to endorse or promote products derived from this software
 */
/**
 * without specific prior written permission.
 */
/**
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 */
/**
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 */
/**
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 */
/**
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 */
/**
 * COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 */
/**
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 */
/**
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 */
/**
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 */
/**
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 */
/**
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 */
/**
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 */
/**
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.owasp.html;


/**
 * A testcase that has a random seed.
 * Subclasses are stochastic -- are not guaranteed to pass or fail consistently.
 * If you see a failure, please report it along with the seed from the output.
 * If you want to repeat a failure, set the system property "junit.seed".
 *
 * @author Mike Samuel (mikesamuel@gmail.com)
 */
abstract class FuzzyTestCase extends junit.framework.TestCase {
    protected long seed = java.lang.System.currentTimeMillis();

    {
        java.lang.String seedStr = java.lang.System.getProperty("junit.seed");
        if (seedStr != null) {
            try {
                seed = java.lang.Long.parseLong(seedStr);
            } catch (java.lang.NumberFormatException ex) {
                ex.printStackTrace();
            }
        }
    }

    protected java.util.Random rnd;

    @java.lang.Override
    protected void tearDown() throws java.lang.Exception {
        super.tearDown();
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.FuzzyTestCase|tearDown()|0", java.util.Random.class, (rnd = null));
    }

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        eu.stamp_project.reneri.instrumentation.StateObserver.<java.util.Random>observeState("org.owasp.html.FuzzyTestCase|setUp()|1", java.util.Random.class, (rnd = new java.util.Random(eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.FuzzyTestCase|setUp()|0", seed))));
    }
}

