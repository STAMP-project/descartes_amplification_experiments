/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 22:04:55 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JCodeModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JAnnotationUse_ESTest extends JAnnotationUse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.BOOLEAN);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jArrayClass0);
      JAnnotationUse jAnnotationUse0 = new JAnnotationUse(jAnonymousClass0);
      // Undeclared exception!
      try { 
        jAnnotationUse0.param("", 40);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The value of the string 'Name' may not be empty!
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnnotationUse jAnnotationUse0 = new JAnnotationUse(jCodeModel0.NULL);
      JAnnotationUse jAnnotationUse1 = jAnnotationUse0.param("value", (-94));
      assertSame(jAnnotationUse0, jAnnotationUse1);
  }
}