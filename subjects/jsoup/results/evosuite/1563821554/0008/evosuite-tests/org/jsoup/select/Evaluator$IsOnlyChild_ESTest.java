/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 19:04:08 GMT 2019
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Evaluator$IsOnlyChild_ESTest extends Evaluator$IsOnlyChild_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Evaluator.IsOnlyChild evaluator_IsOnlyChild0 = new Evaluator.IsOnlyChild();
      Element element0 = new Element("p");
      boolean boolean0 = evaluator_IsOnlyChild0.matches((Element) null, element0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Evaluator.IsOnlyChild evaluator_IsOnlyChild0 = new Evaluator.IsOnlyChild();
      // Undeclared exception!
      try { 
        evaluator_IsOnlyChild0.matches((Element) null, (Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.Evaluator$IsOnlyChild", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Evaluator.IsOnlyChild evaluator_IsOnlyChild0 = new Evaluator.IsOnlyChild();
      Element element0 = new Element("&fH@~C[C*Lj[");
      boolean boolean0 = evaluator_IsOnlyChild0.matches(element0, element0);
      assertFalse(boolean0);
  }
}
