/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 02:15:47 GMT 2019
 */

package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.net.PercentCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class PercentCodec_ESTest extends PercentCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      PercentCodec percentCodec0 = new PercentCodec(byteArray0, true);
      byte[] byteArray1 = new byte[7];
      byteArray1[2] = (byte) (-52);
      byte[] byteArray2 = percentCodec0.encode(byteArray1);
      assertEquals(21, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)70;
      PercentCodec percentCodec0 = new PercentCodec(byteArray0, true);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      PercentCodec percentCodec0 = new PercentCodec(byteArray0, false);
      byte[] byteArray1 = percentCodec0.encode(byteArray0);
      byte[] byteArray2 = percentCodec0.encode(byteArray1);
      assertEquals(15, byteArray2.length);
      assertArrayEquals(new byte[] {(byte)37, (byte)48, (byte)48, (byte)37, (byte)48, (byte)48, (byte)37, (byte)48, (byte)48}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PercentCodec percentCodec0 = new PercentCodec((byte[]) null, true);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = percentCodec0.encode(byteArray0);
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PercentCodec percentCodec0 = new PercentCodec((byte[]) null, true);
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)32;
      byte[] byteArray1 = percentCodec0.encode(byteArray0);
      byte[] byteArray2 = percentCodec0.encode(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)43, (byte)0, (byte)0}, byteArray1);
      assertSame(byteArray2, byteArray1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PercentCodec percentCodec0 = new PercentCodec();
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = percentCodec0.encode(byteArray0);
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      PercentCodec percentCodec0 = new PercentCodec(byteArray0, true);
      byte[] byteArray1 = percentCodec0.encode(byteArray0);
      byte[] byteArray2 = percentCodec0.encode(byteArray1);
      assertArrayEquals(new byte[] {(byte)37, (byte)50, (byte)53, (byte)48, (byte)48}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PercentCodec percentCodec0 = new PercentCodec((byte[]) null, true);
      byte[] byteArray0 = percentCodec0.encode((byte[]) null);
      assertNull(byteArray0);
  }
}
