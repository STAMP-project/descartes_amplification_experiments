/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 21:50:57 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JPackage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDefinedClass_ESTest extends JDefinedClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JPackage jPackage0 = new JPackage("++GTG3!}*'WEMTn", jCodeModel0);
      EClassType eClassType0 = EClassType.ANNOTATION_TYPE_DECL;
      JDefinedClass jDefinedClass0 = new JDefinedClass(jPackage0, 62, "SuperClass", eClassType0);
      assertFalse(jDefinedClass0.isHidden());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, "Name");
      assertFalse(jDefinedClass0.isHidden());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jCodeModel0.NULL);
      boolean boolean0 = jAnonymousClass0.hasHeaderComment();
      assertFalse(boolean0);
      assertFalse(jAnonymousClass0.isHidden());
  }
}
