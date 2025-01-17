/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 18:16:54 GMT 2019
 */

package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.codec.net.QCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class QCodec_ESTest extends QCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QCodec qCodec0 = new QCodec("US-ASCII");
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QCodec qCodec0 = new QCodec((Charset) null);
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.encode("Objects of type ", "UTF-16");
      assertEquals("=?UTF-16?Q?=FE=FF=00O=00b=00j=00e=00c=00t=00s=00 =00o=00f=00 =00t=00y=00p=00e=00 ?=", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      // Undeclared exception!
      try { 
        qCodec0.encode("AM", "AM");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // AM
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      // Undeclared exception!
      try { 
        qCodec0.encode(" cannot be encoded using Q codec", " cannot be encoded using Q codec");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         //  cannot be encoded using Q codec
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      qCodec0.encode((String) null, (String) null);
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      // Undeclared exception!
      try { 
        qCodec0.encode("<C", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }
}
