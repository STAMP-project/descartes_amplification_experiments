/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 23:23:02 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JAtom;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JFieldRef;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JOp;
import com.helger.jcodemodel.JOpBinary;
import com.helger.jcodemodel.JOpUnary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JOp_ESTest extends JOp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JAtom jAtom0 = new JAtom("N !ia|{Su&QEO");
      JFieldRef jFieldRef0 = new JFieldRef(jAtom0, "#M5lI8kutcg 7");
      JOpBinary jOpBinary0 = new JOpBinary(jFieldRef0, "L:mN<z\"Q QD!q", jAtom0);
      boolean boolean0 = JOp.hasTopOp(jOpBinary0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JInvocation jInvocation0 = new JInvocation(jCodeModel0, jCodeModel0.NULL, "]8F");
      boolean boolean0 = JOp.hasTopOp(jInvocation0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JInvocation jInvocation0 = new JInvocation(jCodeModel0, jCodeModel0.NULL, "]8F");
      JOpUnary jOpUnary0 = new JOpUnary("]8F", jInvocation0);
      boolean boolean0 = JOp.hasTopOp(jOpUnary0);
      assertTrue(boolean0);
  }
}
