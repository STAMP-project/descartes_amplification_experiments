/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 21:50:41 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.IJClassContainer;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JNarrowedClass;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDefinedClass_ESTest extends JDefinedClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, "Sy");
      LinkedList<JErrorClass> linkedList0 = new LinkedList<JErrorClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jDefinedClass0, linkedList0);
      JNarrowedClass jNarrowedClass1 = null;
      try {
        jNarrowedClass1 = new JNarrowedClass(jNarrowedClass0, jCodeModel0.NULL);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.JDefinedClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      IJClassContainer<JDirectClass> iJClassContainer0 = (IJClassContainer<JDirectClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      EClassType eClassType0 = EClassType.INTERFACE;
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, iJClassContainer0, eClassType0, "VarType");
      JDefinedClass jDefinedClass0 = new JDefinedClass(jDirectClass0, 1, "VarType", eClassType0);
      boolean boolean0 = jDefinedClass0.hasHeaderComment();
      assertFalse(jDefinedClass0.isHidden());
      assertFalse(boolean0);
  }
}
