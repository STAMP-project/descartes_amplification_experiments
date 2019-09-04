/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 05:56:47 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JMods;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JMods_ESTest extends JMods_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JMods jMods0 = new JMods(32);
      boolean boolean0 = jMods0.isAbstract();
      assertEquals(32, jMods0.getValue());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JMods jMods0 = new JMods(0);
      boolean boolean0 = jMods0.isAbstract();
      assertEquals(0, jMods0.getValue());
      assertFalse(boolean0);
  }
}