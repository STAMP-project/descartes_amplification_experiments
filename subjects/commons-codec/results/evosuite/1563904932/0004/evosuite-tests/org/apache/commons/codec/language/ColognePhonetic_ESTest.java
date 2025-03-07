/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 18:11:41 GMT 2019
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
      boolean boolean0 = colognePhonetic0.isEncodeEqual(". But actually it was of the type ", "5*t$zr");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.EncoderException", "org.apache.commons.codec.EncoderException");
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.EncoderException", "org.apache.commons.codec.EncoderException");
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.EncoderException", "org.apache.commons.codec.EncoderException");
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer", "org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer");
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer", "org.apache.commons.codec.EncoderException");
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer", (String) null);
      colognePhonetic0.isEncodeEqual("", "org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer");
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.^anguage.Co3ognePhonetic$CologneOutput=uffer", "e/X|>?q'!f,^X");
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.^anguage.Co3ognePhonetic$CologneOutput=uffer", "gF.TCx{_FFQG#");
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.EncoderException", "I");
      // Undeclared exception!
      colognePhonetic0.isEncodeEqual("org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer", "org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      // Undeclared exception!
      try { 
        colognePhonetic0.isEncodeEqual((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
