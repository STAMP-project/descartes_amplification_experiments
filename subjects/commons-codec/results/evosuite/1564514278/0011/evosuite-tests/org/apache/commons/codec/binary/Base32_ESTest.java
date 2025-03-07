/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 19:31:41 GMT 2019
 */

package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.BaseNCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Base32_ESTest extends Base32_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(0, byteArray0, false, (byte)0);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Base32 base32_0 = new Base32(8, byteArray0);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Base32 base32_0 = new Base32(473);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Base32 base32_0 = new Base32();
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte) (-99));
      boolean boolean0 = base32_0.isInAlphabet((byte)67);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte) (-99));
      boolean boolean0 = base32_0.isInAlphabet((byte) (-99));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte) (-99));
      boolean boolean0 = base32_0.isInAlphabet((byte)123);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[8] = (byte)55;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(27, byteArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00007]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)119;
      Base32 base32_0 = new Base32(30, byteArray0, true);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Base32 base32_0 = new Base32(false);
      boolean boolean0 = base32_0.isInAlphabet((byte)0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-68));
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }
}
