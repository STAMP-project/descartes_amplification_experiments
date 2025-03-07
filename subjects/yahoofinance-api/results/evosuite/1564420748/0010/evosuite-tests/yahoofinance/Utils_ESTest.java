/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 17:33:18 GMT 2019
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
      String string0 = Utils.unescape("[={YqT+7");
      assertEquals("[={YqT+7", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = Utils.unescape(".K,B7/xk1x\"+A;0] 6");
      assertEquals(".K,B7/xk1x\\\"+A;0] 6", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = Utils.unescape("\f");
      assertEquals("\\f", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = Utils.unescape("\b");
      assertEquals("\\b", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String string0 = Utils.unescape("t_@H'dQ!C=}");
      assertEquals("t_@H\\'dQ!C=}", string0);
  }
}
