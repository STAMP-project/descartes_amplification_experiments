/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 19:13:01 GMT 2019
 */

package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.language.DoubleMetaphone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DoubleMetaphone_ESTest extends DoubleMetaphone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("W");
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("O(CZp");
      assertEquals("ASP", string0);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("UMB");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("AM", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("RxmM%B[");
      assertEquals("RKSM", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("|?u8h?YIkLL");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("KL", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("ILLO");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("AL", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("l)@%,cHzw.t");
      assertEquals("LXST", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("PNACH");
      assertNotNull(string0);
      assertEquals("NK", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("rg.apache.common.codec.EncodeException");
      assertEquals("RKPX", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("]Z~b.Rb");
      assertEquals("SPRP", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("c-S-Izz,V^74D2(");
      assertNotNull(string0);
      assertEquals("KSSF", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("V<Uz9|LkLk{Y~r");
      assertEquals("FSLK", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("2{q^tZxKOYs@pqn1");
      assertEquals("KTSK", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("3eHV{zihu=m7B");
      assertEquals("FSHM", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("lLzHev+GUN>IakON");
      assertEquals("LJFK", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("CU^7xxn95746(");
      assertEquals("KKSN", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode(";x");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("KS", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("^Dx");
      assertEquals("TKS", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("X");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("S", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("WH");
      assertNotNull(string0);
      assertEquals("A", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("TH");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("b)[ScHd|.S5.%j?UF4");
      assertNotNull(string0);
      assertEquals("PXTS", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("SC");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
      assertEquals("SK", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("5uC,,`0)2sCi");
      assertEquals("KS", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("FSHM");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("FXM", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("SCH");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("X", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("z0>d%TrrGM");
      assertEquals("STTR", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("IER");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("A", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("RANGER");
      assertNotNull(string0);
      assertEquals("RNJR", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("APPS");
      assertNotNull(string0);
      assertEquals("APS", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("\"M^)phvd{tx");
      assertNotNull(string0);
      assertEquals("MFFT", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("HOLZ");
      assertEquals("HLS", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode(">llhI{]Ghf1T5T");
      assertEquals("LKFT", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("!7oUj6");
      assertEquals("J", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("\")GEJA");
      assertEquals("JJ", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("9Emo\u0000YEJJ/$'8diDpX");
      assertEquals("MJTT", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("JSKJ");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("JSKJ", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("GNJOSE");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("NJS", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("JOSE");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("HS", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("zGNO*+(n7nK(GWg'H1");
      assertEquals("SKNN", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("Z?8:m8edG0");
      assertEquals("SMTK", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("ACH");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("AK", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("CHORE");
      assertEquals("XR", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("KNUCCES");
      assertEquals("NKSS", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("UCCES");
      assertNotNull(string0);
      assertEquals("AKSS", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("'<AUijCzgHJWS");
      assertEquals("JSKJ", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("Bh?(\"hs6+");
      assertEquals("PS", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("%_$3dBB$j+F; 47q");
      assertEquals("TPJF", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(209);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNull(string0);
  }
}
