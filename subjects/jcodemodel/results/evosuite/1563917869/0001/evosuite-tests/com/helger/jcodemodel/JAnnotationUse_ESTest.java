/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 21:40:20 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JTypeWildcard;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JAnnotationUse_ESTest extends JAnnotationUse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "#", "T-chW:zuO");
      JAnnotationUse jAnnotationUse0 = new JAnnotationUse(jErrorClass0);
      int[] intArray0 = new int[4];
      JAnnotationUse jAnnotationUse1 = jAnnotationUse0.paramArray("{ }", intArray0);
      assertSame(jAnnotationUse0, jAnnotationUse1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "#", "T-chW:zuO");
      JAnnotationUse jAnnotationUse0 = new JAnnotationUse(jErrorClass0);
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        jAnnotationUse0.paramArray("", intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The value of the string 'Name' may not be empty!
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "Can't cast ", (String) null);
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.SUPER;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jErrorClass0, eWildcardBoundMode0);
      JAnnotationUse jAnnotationUse0 = new JAnnotationUse(jTypeWildcard0);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        jAnnotationUse0.paramArray((String) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The value of 'Name' may not be null!
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }
}
