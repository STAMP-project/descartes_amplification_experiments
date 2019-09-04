/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 21:47:18 GMT 2019
 */

package yahoofinance;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import yahoofinance.Utils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal((String) null, "5c@f;_wK");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("", "0TSNg &o.[f3RM");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("cLq/'TsHnkB", "cLq/'TsHnkB");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("+vqHD+@`:50;1;C8={8", "nan");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("-", "");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("N/A", "");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("44bw3Z_?\",8O%&w@Lx", "i^A/gw");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.getBigDecimal(",", "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("+0", "+0");
      assertEquals((short)0, bigDecimal0.shortValue());
      assertNotNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("4", "P0:[9BH5");
      assertEquals((byte)4, bigDecimal0.byteValue());
      assertNotNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("", "6");
      assertNotNull(bigDecimal0);
      assertEquals((byte)6, bigDecimal0.byteValue());
  }
}