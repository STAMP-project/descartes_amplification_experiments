/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 03:46:46 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JTypeVar;
import com.helger.jcodemodel.JTypeVarClass;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JNarrowedClass_ESTest extends JNarrowedClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jCodeModel0.NULL);
      AbstractJClass[] abstractJClassArray0 = new AbstractJClass[5];
      abstractJClassArray0[0] = (AbstractJClass) jTypeVarClass0;
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jTypeVarClass0, abstractJClassArray0);
      JNarrowedClass jNarrowedClass1 = null;
      try {
        jNarrowedClass1 = new JNarrowedClass(jNarrowedClass0, jNarrowedClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.JNarrowedClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVar jTypeVar0 = new JTypeVar(jCodeModel0, "%d=qz.7F&fY:m");
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jTypeVar0, jTypeVar0);
      LinkedList<JDefinedClass> linkedList0 = new LinkedList<JDefinedClass>();
      JNarrowedClass jNarrowedClass1 = null;
      try {
        jNarrowedClass1 = new JNarrowedClass(jNarrowedClass0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The expression must be false but it is not: aBasis may not be a narrowed class: com.helger.jcodemodel.JNarrowedClass(%d=qz.7F&fY:m<%d=qz.7F&fY:m>)
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVar jTypeVar0 = new JTypeVar(jCodeModel0, "%d=qz.7F&fY:m");
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jTypeVar0, jTypeVar0);
      LinkedList<JDefinedClass> linkedList0 = new LinkedList<JDefinedClass>();
      JTypeVarClass jTypeVarClass0 = new JTypeVarClass(jNarrowedClass0);
      JNarrowedClass jNarrowedClass1 = new JNarrowedClass(jTypeVarClass0, linkedList0);
      assertTrue(jNarrowedClass1.isReference());
  }
}
