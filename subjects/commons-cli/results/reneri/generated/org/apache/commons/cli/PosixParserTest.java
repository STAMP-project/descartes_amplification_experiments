/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.cli;


/**
 * Test case for the PosixParser.
 */
public class PosixParserTest extends org.apache.commons.cli.ParserTestCase {
    @java.lang.SuppressWarnings("deprecation")
    @org.junit.Before
    public void setUp() {
        super.setUp();
        eu.stamp_project.reneri.instrumentation.StateObserver.<org.apache.commons.cli.CommandLineParser>observeState("org.apache.commons.cli.PosixParserTest|setUp()|0", org.apache.commons.cli.CommandLineParser.class, (parser = new org.apache.commons.cli.PosixParser()));
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the PosixParser")
    public void testDoubleDash2() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the PosixParser")
    public void testLongWithoutEqualSingleDash() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the PosixParser")
    public void testAmbiguousLongWithoutEqualSingleDash() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the PosixParser (CLI-184)")
    public void testNegativeOption() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the PosixParser")
    public void testLongWithUnexpectedArgument1() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the PosixParser")
    public void testLongWithEqualSingleDash() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the PosixParser")
    public void testShortWithEqual() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the PosixParser")
    public void testUnambiguousPartialLongOption4() throws java.lang.Exception {
    }

    @java.lang.Override
    @org.junit.Test
    @org.junit.Ignore("not supported by the PosixParser")
    public void testAmbiguousPartialLongOption4() throws java.lang.Exception {
    }
}

