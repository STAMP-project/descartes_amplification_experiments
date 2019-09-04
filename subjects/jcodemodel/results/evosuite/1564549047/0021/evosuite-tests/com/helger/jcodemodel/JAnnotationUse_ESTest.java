/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 05:22:49 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JTypeVar;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JAnnotationUse_ESTest extends JAnnotationUse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVar jTypeVar0 = new JTypeVar(jCodeModel0, "Name");
      LinkedList<JDirectClass> linkedList0 = new LinkedList<JDirectClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jTypeVar0, linkedList0);
      JAnnotationUse jAnnotationUse0 = new JAnnotationUse(jNarrowedClass0);
      // Undeclared exception!
      try { 
        jAnnotationUse0.param("", 198);
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
      JAnnotationUse jAnnotationUse1 = jAnnotationUse0.param("value", 16);
      assertSame(jAnnotationUse0, jAnnotationUse1);
  }
}