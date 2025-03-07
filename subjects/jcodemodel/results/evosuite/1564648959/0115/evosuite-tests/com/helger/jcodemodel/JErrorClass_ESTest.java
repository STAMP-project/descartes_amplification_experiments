/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 10:47:48 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JErrorClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JErrorClass_ESTest extends JErrorClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "To.oUM i1BR|+)7@", "fGi$R?0u");
      assertEquals("To.oUM i1BR|+)7@", jErrorClass0.getMessage());
      assertEquals("fGi$R?0u", jErrorClass0.name());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "");
      assertFalse(jErrorClass0.isArray());
  }
}
