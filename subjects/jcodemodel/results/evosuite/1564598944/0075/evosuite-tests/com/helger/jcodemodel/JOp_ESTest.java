/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 20:11:28 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JAtomLong;
import com.helger.jcodemodel.JOp;
import com.helger.jcodemodel.JOpBinary;
import com.helger.jcodemodel.JOpUnary;
import com.helger.jcodemodel.JOpUnaryTight;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JOp_ESTest extends JOp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JAtomLong jAtomLong0 = new JAtomLong(4961L);
      JOpBinary jOpBinary0 = new JOpBinary(jAtomLong0, "", jAtomLong0);
      boolean boolean0 = JOp.hasTopOp(jOpBinary0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JAtomLong jAtomLong0 = new JAtomLong(4961L);
      boolean boolean0 = JOp.hasTopOp(jAtomLong0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JAtomLong jAtomLong0 = new JAtomLong(4961L);
      JOpBinary jOpBinary0 = new JOpBinary(jAtomLong0, "", jAtomLong0);
      JOpUnary jOpUnary0 = new JOpUnary("", jOpBinary0);
      JOpUnaryTight jOpUnaryTight0 = new JOpUnaryTight("", jOpUnary0);
      boolean boolean0 = JOp.hasTopOp(jOpUnaryTight0);
      assertTrue(boolean0);
  }
}
