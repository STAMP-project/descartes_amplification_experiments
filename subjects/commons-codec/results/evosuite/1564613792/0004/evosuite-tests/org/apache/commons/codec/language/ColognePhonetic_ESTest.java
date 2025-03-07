/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 23:02:31 GMT 2019
 */

package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.language.ColognePhonetic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ColognePhonetic_ESTest extends ColognePhonetic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      boolean boolean0 = colognePhonetic0.isEncodeEqual("org.apache.commons.codec.language.ColognePhonetic$CologneBuffer", "org.apache.commons.codec.language.ColognePhonetic$CologneBuffer");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      boolean boolean0 = colognePhonetic0.isEncodeEqual("", "V1:zQ3gVgxu");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      boolean boolean0 = colognePhonetic0.isEncodeEqual("B", "&6DPNmL");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      // Undeclared exception!
      try { 
        colognePhonetic0.isEncodeEqual((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
