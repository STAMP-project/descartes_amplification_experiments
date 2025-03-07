/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 21:48:29 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDefinedClass_ESTest extends JDefinedClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      EClassType eClassType0 = EClassType.INTERFACE;
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 1, "x");
      JDefinedClass jDefinedClass1 = new JDefinedClass(jDefinedClass0, 1, "x", eClassType0);
      assertFalse(jDefinedClass1.isHidden());
  }
}
