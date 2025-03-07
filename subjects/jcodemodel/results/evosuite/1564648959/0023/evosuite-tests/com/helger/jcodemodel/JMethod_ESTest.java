/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 09:09:32 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JMethod;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JMethod_ESTest extends JMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "xnm", "xnm");
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jErrorClass0);
      JMethod jMethod0 = new JMethod(jAnonymousClass0, 44, jAnonymousClass0, "xnm");
      assertEquals("xnm", jMethod0.name());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jCodeModel0.NULL);
      JMethod jMethod0 = new JMethod(46, jAnonymousClass0);
      boolean boolean0 = jMethod0.hasVarArgs();
      assertFalse(boolean0);
  }
}
