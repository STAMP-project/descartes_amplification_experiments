/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 01:04:52 GMT 2019
 */

package yahoofinance;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import yahoofinance.Utils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2029), "E&IM9]I?ov'K(En");
      Calendar calendar0 = Utils.parseDateTime("E&IM9]I?ov'K(En", "nan", simpleTimeZone0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(319, "-");
      Calendar calendar0 = Utils.parseDateTime("-", "-", simpleTimeZone0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1652), "L4");
      Calendar calendar0 = Utils.parseDateTime("M/C", "", simpleTimeZone0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1652), "L4");
      Calendar calendar0 = Utils.parseDateTime("L4", "L4", simpleTimeZone0);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1652), "L4");
      Calendar calendar0 = Utils.parseDateTime("N/A", "N/A", simpleTimeZone0);
      assertNull(calendar0);
  }
}
