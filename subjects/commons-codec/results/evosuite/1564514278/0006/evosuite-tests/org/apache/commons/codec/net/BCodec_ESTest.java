/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 19:26:45 GMT 2019
 */

package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.codec.net.BCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.encode("US-ASCII", "US-ASCII");
      assertNotNull(string0);
      assertEquals("=?US-ASCII?B?VVMtQVNDSUk=?=", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      // Undeclared exception!
      try { 
        bCodec0.encode("2i?'", "2i?'");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 2i?'
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Charset charset0 = mock(Charset.class, new ViolatedAssumptionAnswer());
      BCodec bCodec0 = new BCodec(charset0);
      // Undeclared exception!
      try { 
        bCodec0.encode(" cannot be decoded using BCodec", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.encode((String) null, "=?US-ASCII?B?VVMtQVNDSUk=?=");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      // Undeclared exception!
      try { 
        bCodec0.encode("T", "T");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // T
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }
}
