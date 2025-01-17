/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 02:19:23 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JPrimitiveType;
import com.helger.jcodemodel.JTypeVarClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCodeModel_ESTest extends JCodeModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<Void> class0 = Void.TYPE;
      JPrimitiveType jPrimitiveType0 = null;
      try {
        jPrimitiveType0 = new JPrimitiveType(jCodeModel0, "P1jR\"05iGV;W8(SFG?", class0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // void is a primitive
         //
         verifyException("com.helger.jcodemodel.JCodeModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JPackage jPackage0 = new JPackage("\n", jCodeModel0);
      assertEquals("\n", jPackage0.name());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jCodeModel0.NULL);
      jCodeModel0.addDontImportClass((AbstractJClass) jTypeVarClass0);
      boolean boolean0 = jCodeModel0.addDontImportClass((AbstractJClass) jTypeVarClass0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      AbstractJClass[] abstractJClassArray0 = new AbstractJClass[4];
      // Undeclared exception!
      try { 
        jCodeModel0.addDontImportClass(abstractJClassArray0[2]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The value of 'Class' may not be null!
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }
}
