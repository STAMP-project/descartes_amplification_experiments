/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 21:35:12 GMT 2019
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
      Option option0 = new Option("", true, "");
      assertFalse(option0.hasLongOpt());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Option option0 = new Option("", "");
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Option option0 = new Option("", "", false, "[ option: ");
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals((-1), option0.getArgs());
      assertEquals("", option0.getOpt());
      assertFalse(boolean0);
      assertEquals("[ option: ", option0.getDescription());
      assertEquals("", option0.getLongOpt());
  }
}