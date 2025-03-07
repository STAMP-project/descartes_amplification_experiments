/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 11:15:23 GMT 2019
 */

package yahoofinance;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import yahoofinance.Utils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = Utils.getInt("nan");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = Utils.getInt("-");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = Utils.getInt("N/A");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = Utils.getInt("8PEE|\"Y,Ek?c-P1L");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = Utils.getInt(",");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Integer integer0 = Utils.getInt("0");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Integer integer0 = Utils.getInt("2");
      assertEquals(2, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Integer integer0 = Utils.getInt("");
      assertNull(integer0);
  }
}
