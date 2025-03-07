/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 16:10:50 GMT 2019
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Option_ESTest extends Option_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Option option0 = new Option("K", true, "K");
      assertFalse(option0.hasLongOpt());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Option option0 = new Option("", "a2~jkum L0K", true, "");
      assertEquals("", option0.getDescription());
      assertEquals(1, option0.getArgs());
      assertEquals("", option0.getOpt());
      assertEquals("a2~jkum L0K", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Option option0 = new Option("@", "@");
      boolean boolean0 = option0.hasValueSeparator();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }
}
