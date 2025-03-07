/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 18:01:47 GMT 2019
 */

package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.security.MessageDigest;
import org.apache.commons.codec.digest.DigestUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DigestUtils_ESTest extends DigestUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils((MessageDigest) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils("SHA");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getDigest("MD2", (MessageDigest) null);
      assertEquals("MD2", messageDigest0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getDigest("UTF-16LE", (MessageDigest) null);
      assertNull(messageDigest0);
  }
}
