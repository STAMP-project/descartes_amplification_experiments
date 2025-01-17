/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 11:12:57 GMT 2019
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
      BigDecimal bigDecimal0 = Utils.getBigDecimal("31ut/W+DY6|~", ".0");
      assertEquals((short)0, bigDecimal0.shortValue());
      assertNotNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("Failed to parse datetime: ", "~K");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("(K$?5F7\"g6VQ4w[M", "(K$?5F7\"g6VQ4w[M");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("uZB,", "Oq#q3IT");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("nan", "nan");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("R_;xdV\"g}S9Re", "-");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("N/A", "Oq#q3IT");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("", "]:QT,AJDX");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.getBigDecimal(",", "MMM d");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("-4", "KQ}CA$AR)3");
      assertNotNull(bigDecimal0);
      assertEquals((short) (-4), bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal(".0", ".0");
      assertNotNull(bigDecimal0);
      assertEquals((short)0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BigDecimal bigDecimal0 = Utils.getBigDecimal("5", "5");
      assertNotNull(bigDecimal0);
      assertEquals((short)5, bigDecimal0.shortValue());
  }
}
