/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 09:16:29 GMT 2019
 */

package org.apache.commons.codec.language.bm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.language.bm.BeiderMorseEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class BeiderMorseEncoder_ESTest extends BeiderMorseEncoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      beiderMorseEncoder0.encode("");
      assertTrue(beiderMorseEncoder0.isConcat());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      // Undeclared exception!
      beiderMorseEncoder0.encode("fgvuptvo|fgvuptvu|fkwuptvo|fkwuptvu|wgvuptvo|wgvuptvu|wkwuptvo|wkwuptvu");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      beiderMorseEncoder0.encode((String) null);
      assertTrue(beiderMorseEncoder0.isConcat());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      String string0 = beiderMorseEncoder0.encode("+r`~+(o.tj[}d");
      assertNotNull(string0);
      assertTrue(beiderMorseEncoder0.isConcat());
  }
}
