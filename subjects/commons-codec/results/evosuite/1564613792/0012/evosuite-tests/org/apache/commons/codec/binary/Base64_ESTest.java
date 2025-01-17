/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 23:11:00 GMT 2019
 */

package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.binary.Base64;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Base64_ESTest extends Base64_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)126;
      Base64 base64_0 = new Base64(127, byteArray0, true);
      assertTrue(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Base64 base64_0 = new Base64((-486));
      base64_0.isInAlphabet("wy{J[d];15IB&d");
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-32);
      Base64 base64_0 = new Base64(64, byteArray0, false);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Base64 base64_0 = new Base64(64, byteArray0);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Base64 base64_0 = new Base64();
      assertFalse(base64_0.isUrlSafe());
  }
}
