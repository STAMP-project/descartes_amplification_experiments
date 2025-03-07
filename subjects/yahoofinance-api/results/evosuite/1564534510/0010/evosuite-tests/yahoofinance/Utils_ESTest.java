/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 01:08:31 GMT 2019
 */

package yahoofinance;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import yahoofinance.Utils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Utils utils0 = new Utils();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = Utils.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.unescape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("yahoofinance.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = Utils.unescape("%RU!-ZaZ{Di'");
      assertEquals("%RU!-ZaZ{Di\\'", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = Utils.unescape("G\"4(?G$OWMF<`m");
      assertEquals("G\\\"4(?G$OWMF<`m", string0);
  }
}
