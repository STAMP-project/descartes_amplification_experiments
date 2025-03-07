/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 23:01:32 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JTypeWildcard;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDefinedClass_ESTest extends JDefinedClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jCodeModel0.NULL, ((AbstractJClass) jCodeModel0.NULL).EMPTY_ARRAY);
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jNarrowedClass0, eWildcardBoundMode0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jTypeWildcard0);
      EClassType eClassType0 = EClassType.CLASS;
      JDefinedClass jDefinedClass0 = new JDefinedClass(jAnonymousClass0, 0, "QB", eClassType0);
      assertFalse(jDefinedClass0.isHidden());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      EClassType eClassType0 = EClassType.INTERFACE;
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 46, (String) null);
      JDefinedClass jDefinedClass1 = null;
      try {
        jDefinedClass1 = new JDefinedClass(jDefinedClass0, 46, (String) null, eClassType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The expression must be false but it is not: Illegal modifiers for interface: com.helger.jcodemodel.JMods@0000000026
         //
         verifyException("com.helger.jcodemodel.util.JCValueEnforcer", e);
      }
  }
}
