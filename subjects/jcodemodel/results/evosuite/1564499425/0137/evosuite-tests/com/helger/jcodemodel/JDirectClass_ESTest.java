/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 17:38:01 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDirectClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDirectClass_ESTest extends JDirectClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "com.helger.jcodemodel.JClassAlreadyExistsException");
      EClassType eClassType0 = EClassType.ANNOTATION_TYPE_DECL;
      JDirectClass jDirectClass1 = new JDirectClass(jCodeModel0, jDirectClass0, eClassType0, "");
      assertEquals("JClassAlreadyExistsException", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "com.helger.jcodemodel.JClassAlreadyExistsException");
      EClassType eClassType0 = EClassType.ANNOTATION_TYPE_DECL;
      JDirectClass jDirectClass1 = new JDirectClass(jCodeModel0, jDirectClass0, eClassType0, ".@7yM#$`wXp/");
      assertEquals("JClassAlreadyExistsException", jDirectClass0.name());
  }
}
