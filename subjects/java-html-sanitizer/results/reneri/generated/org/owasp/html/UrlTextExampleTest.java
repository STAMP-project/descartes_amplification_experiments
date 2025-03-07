/**
 * Copyright (c) 2013, Mike Samuel
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


@java.lang.SuppressWarnings("javadoc")
public final class UrlTextExampleTest extends junit.framework.TestCase {
    @org.junit.Test
    public static void testExample() throws java.io.IOException {
        java.lang.StringBuilder out = eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.UrlTextExampleTest|testExample()|0", java.lang.StringBuilder.class, new java.lang.StringBuilder());
        org.owasp.html.examples.UrlTextExample.run(eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.UrlTextExampleTest|testExample()|1", java.lang.StringBuilder.class, out), "<a href=\'//www.example.com/\'>Examples<br> like this</a> are fun!\n", "<img src=\'https://www.example.com/example.png\'> are fun!\n", "<a href='www.google.com'>This</a> is not a link to google!");
        junit.framework.TestCase.assertEquals(("" + (((((("<a href=\"//www.example.com/\">Examples<br /> like this</a>" + " - www.example.com are fun!\n") + "\n") + "<img src=\"https://www.example.com/example.png\" />") + " - www.example.com are fun!\n") + "\n") + "<a href=\"www.google.com\">This</a> is not a link to google!")), eu.stamp_project.reneri.instrumentation.StateObserver.observe("org.owasp.html.UrlTextExampleTest|testExample()|3", eu.stamp_project.reneri.instrumentation.StateObserver.<java.lang.StringBuilder>observeState("org.owasp.html.UrlTextExampleTest|testExample()|2", java.lang.StringBuilder.class, out).toString()));
    }
}

