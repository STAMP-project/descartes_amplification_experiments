/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 22:46:45 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JAtom;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JOp;
import com.helger.jcodemodel.JOpBinary;
import com.helger.jcodemodel.JOpUnaryTight;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JOp_ESTest extends JOp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JEnumConstant jEnumConstant0 = new JEnumConstant(jCodeModel0.NULL, "vqMX");
      JOpBinary jOpBinary0 = new JOpBinary(jEnumConstant0, "vqMX", jCodeModel0.NULL);
      boolean boolean0 = JOp.hasTopOp(jOpBinary0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JAtom jAtom0 = new JAtom("");
      boolean boolean0 = JOp.hasTopOp(jAtom0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JAtom jAtom0 = new JAtom("");
      JOpUnaryTight jOpUnaryTight0 = new JOpUnaryTight(jAtom0, "");
      boolean boolean0 = JOp.hasTopOp(jOpUnaryTight0);
      assertTrue(boolean0);
  }
}
