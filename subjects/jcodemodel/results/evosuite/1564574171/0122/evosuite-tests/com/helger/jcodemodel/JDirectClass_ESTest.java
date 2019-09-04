/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 14:10:37 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JNarrowedClass;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDirectClass_ESTest extends JDirectClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "coE.PelgrrjcodLmoTl.JDirectClnss");
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jDirectClass0, jCodeModel0.NULL);
      LinkedList<JArrayClass> linkedList0 = new LinkedList<JArrayClass>();
      JNarrowedClass jNarrowedClass1 = null;
      try {
        jNarrowedClass1 = new JNarrowedClass(jNarrowedClass0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The expression must be false but it is not: aBasis may not be a narrowed class: com.helger.jcodemodel.JNarrowedClass(coE.PelgrrjcodLmoTl.JDirectClnss<null>)
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, ".5,,sy[ahk,VC3{");
      assertEquals("5,,sy[ahk,VC3{", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "_]I<V[6eqaS+N@s2o0");
      EClassType eClassType0 = EClassType.INTERFACE;
      JDirectClass jDirectClass1 = new JDirectClass(jCodeModel0, jDirectClass0, eClassType0, "(Ljava/lang/String;)V");
      assertEquals("(Ljava/lang/String;)V", jDirectClass1.name());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "M)%\"h");
      JDirectClass jDirectClass1 = new JDirectClass(jCodeModel0, "M)%\"h");
      jDirectClass0.equals(jDirectClass1);
      assertEquals("M)%\"h", jDirectClass1.name());
      assertEquals("M)%\"h", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "M)%\"h");
      boolean boolean0 = jDirectClass0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals("M)%\"h", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "M)%\"h");
      boolean boolean0 = jDirectClass0.equals(jDirectClass0);
      assertTrue(boolean0);
      assertEquals("M)%\"h", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "M)%\"h");
      boolean boolean0 = jDirectClass0.equals("M)%\"h");
      assertFalse(boolean0);
      assertEquals("M)%\"h", jDirectClass0.name());
  }
}