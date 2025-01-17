/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 18:36:04 GMT 2019
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
      Base32 base32_0 = new Base32((-330), byteArray0, true, (byte)123);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(84, byteArray0, false, (byte)123);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Base32 base32_0 = new Base32(false, (byte)4);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(true, (byte)102);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Base32 base32_0 = new Base32(3, byteArray0, false, (byte) (-66));
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base32 base32_0 = new Base32((-9), byteArray0, true);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Base32 base32_0 = new Base32((-1853), byteArray0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Base32 base32_0 = new Base32((int) (byte)40);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)40);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Base32 base32_0 = new Base32();
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }
}
