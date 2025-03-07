/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 04:38:10 GMT 2019
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
      BigDecimal bigDecimal0 = Utils.getBigDecimal("nan");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("N/A");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("Q:,sxlY$Y*w");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal(".1");
      assertNotNull(bigDecimal0);
      assertEquals((short)0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("72");
      assertNotNull(bigDecimal0);
      assertEquals((byte)72, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.getBigDecimal(",");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("|5TM");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("PK");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("k1Huf;wL3AT[HLYQweB");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("-");
      assertNull(bigDecimal0);
  }
}
