/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 00:06:25 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JNullType;
import com.helger.jcodemodel.JPackage;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDirectClass_ESTest extends JDirectClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "!]T.+Io(P^hj");
      LinkedList<JNullType> linkedList0 = new LinkedList<JNullType>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jDirectClass0, jDirectClass0);
      JNarrowedClass jNarrowedClass1 = null;
      try {
        jNarrowedClass1 = new JNarrowedClass(jNarrowedClass0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The expression must be false but it is not: aBasis may not be a narrowed class: com.helger.jcodemodel.JNarrowedClass(!]T.+Io(P^hj<!]T.+Io(P^hj>)
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, ".YRe/}");
      assertEquals("YRe/}", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "");
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jDirectClass0);
      EClassType eClassType0 = EClassType.CLASS;
      JDirectClass jDirectClass1 = new JDirectClass(jCodeModel0, jAnonymousClass0, eClassType0, "");
      boolean boolean0 = jDirectClass0.equals(jDirectClass1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "");
      JPackage jPackage0 = new JPackage("com.helger.jcodemodel.JDirectClass", jCodeModel0);
      boolean boolean0 = jDirectClass0.equals(jPackage0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "");
      boolean boolean0 = jDirectClass0.equals(jDirectClass0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "!]T.+Io(P^hj");
      boolean boolean0 = jDirectClass0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals("+Io(P^hj", jDirectClass0.name());
  }
}