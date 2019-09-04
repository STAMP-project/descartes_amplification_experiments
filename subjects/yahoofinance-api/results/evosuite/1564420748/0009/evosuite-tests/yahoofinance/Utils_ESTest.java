/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 17:31:59 GMT 2019
 */

package yahoofinance;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import yahoofinance.Utils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, ")}~2z[u~o8LM<");
      Calendar calendar0 = Utils.parseDateTime("nan", ")}~2z[u~o8LM<", simpleTimeZone0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Calendar calendar0 = Utils.parseDateTime("-", "-", (TimeZone) null);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(256, "N(A");
      Calendar calendar0 = Utils.parseDateTime(".", ".", simpleTimeZone0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, ")}~2z[u~o8LM<");
      Calendar calendar0 = Utils.parseDateTime(")}~2z[u~o8LM<", "", simpleTimeZone0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2921), "N/A");
      Calendar calendar0 = Utils.parseDateTime("N/A", "N/A", simpleTimeZone0);
      assertNull(calendar0);
  }
}