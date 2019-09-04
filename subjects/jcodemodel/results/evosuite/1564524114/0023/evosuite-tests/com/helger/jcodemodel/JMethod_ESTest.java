/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 22:28:39 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JNarrowedClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JMethod_ESTest extends JMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.CHAR);
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jArrayClass0, jArrayClass0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jNarrowedClass0);
      JMethod jMethod0 = new JMethod(jAnonymousClass0, 0, jCodeModel0.BYTE, "com.helger.jcodemodel.AbstractJClassContainer");
      assertFalse(jMethod0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jCodeModel0.NULL);
      JMethod jMethod0 = new JMethod(1198, jAnonymousClass0);
      boolean boolean0 = jMethod0.hasVarArgs();
      assertFalse(boolean0);
  }
}