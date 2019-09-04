/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 02:12:09 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JReferencedClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JMethod_ESTest extends JMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jCodeModel0.NULL);
      JMethod jMethod0 = new JMethod(169, jAnonymousClass0);
      assertTrue(jMethod0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<JErrorClass> class0 = JErrorClass.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jReferencedClass0);
      JMethod jMethod0 = new JMethod(jAnonymousClass0, 1162, jCodeModel0.LONG, " annotation value to ");
      boolean boolean0 = jMethod0.hasVarArgs();
      assertFalse(boolean0);
  }
}