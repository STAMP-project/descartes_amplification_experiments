/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 02:56:03 GMT 2019
 */

package com.helger.jcodemodel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.util.JCHashCodeCalculator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCHashCodeCalculator_ESTest extends JCHashCodeCalculator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      int int0 = JCHashCodeCalculator.append((-6), object0);
      assertEquals((-185), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = JCHashCodeCalculator.append(0, (Object) null);
      assertEquals(129, int0);
  }
}
