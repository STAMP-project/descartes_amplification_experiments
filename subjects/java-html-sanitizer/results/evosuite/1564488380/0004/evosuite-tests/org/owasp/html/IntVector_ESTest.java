/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 12:10:19 GMT 2019
 */

package org.owasp.html;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.owasp.html.IntVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class IntVector_ESTest extends IntVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IntVector intVector0 = new IntVector();
      intVector0.clear();
      assertEquals(0, intVector0.size());
  }
}