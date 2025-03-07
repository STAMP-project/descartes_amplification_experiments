/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 18:59:18 GMT 2019
 */

package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.charset.Charset;
import org.apache.commons.codec.net.BCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class BCodec_ESTest extends BCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BCodec bCodec0 = new BCodec("UTF-8");
      assertEquals("UTF-8", bCodec0.getDefaultCharset());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BCodec bCodec0 = new BCodec((Charset) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.encodeText("UTF8", "UTF8");
      assertEquals("=?UTF-8?B?VVRGOA==?=", string0);
  }
}
