/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 23:58:50 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDirectClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JDirectClass_ESTest extends JDirectClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, ".x3}lXZ2Ob");
      assertEquals("x3}lXZ2Ob", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "com.helger.jcodemodel.JDirectClass");
      assertEquals("JDirectClass", jDirectClass0.name());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDirectClass jDirectClass0 = new JDirectClass(jCodeModel0, "&LmEh!sVoB!L!E");
      EClassType eClassType0 = EClassType.ENUM;
      JDirectClass jDirectClass1 = new JDirectClass(jCodeModel0, jDirectClass0, eClassType0, "Z?R2:");
      assertEquals("Z?R2:", jDirectClass1.name());
  }
}