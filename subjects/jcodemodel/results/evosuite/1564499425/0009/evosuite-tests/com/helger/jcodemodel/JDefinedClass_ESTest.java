/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 15:22:47 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JReferencedClass;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDefinedClass_ESTest extends JDefinedClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, (String) null);
      assertFalse(jDefinedClass0.isHidden());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<JDefinedClass> class0 = JDefinedClass.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      LinkedList<JReferencedClass> linkedList0 = new LinkedList<JReferencedClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jReferencedClass0, linkedList0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jNarrowedClass0);
      EClassType eClassType0 = EClassType.INTERFACE;
      JDefinedClass jDefinedClass0 = new JDefinedClass(jAnonymousClass0, 0, "r", eClassType0);
      assertFalse(jDefinedClass0.isHidden());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      Class<JDefinedClass> class0 = JDefinedClass.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      LinkedList<JReferencedClass> linkedList0 = new LinkedList<JReferencedClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jReferencedClass0, linkedList0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jNarrowedClass0);
      boolean boolean0 = jAnonymousClass0.hasHeaderComment();
      assertFalse(jAnonymousClass0.isHidden());
      assertFalse(boolean0);
  }
}
