/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 19:13:31 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JAtomDouble;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JReferencedClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JAnnotationUse_ESTest extends JAnnotationUse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jCodeModel0.NULL);
      JAnnotationUse jAnnotationUse0 = new JAnnotationUse(jAnonymousClass0);
      // Undeclared exception!
      try { 
        jAnnotationUse0.param("", 512);
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
      Class<JAtomDouble> class0 = JAtomDouble.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jReferencedClass0, jCodeModel0.NULL);
      JAnnotationUse jAnnotationUse0 = new JAnnotationUse(jNarrowedClass0);
      JAnnotationUse jAnnotationUse1 = jAnnotationUse0.param("d?B<G|M>nbf52}'i18\"", 0);
      assertSame(jAnnotationUse1, jAnnotationUse0);
  }
}
