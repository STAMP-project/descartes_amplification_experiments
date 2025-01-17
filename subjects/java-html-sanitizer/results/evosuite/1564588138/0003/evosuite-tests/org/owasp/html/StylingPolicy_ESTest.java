/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 15:52:54 GMT 2019
 */

package org.owasp.html;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Function;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.owasp.html.CssSchema;
import org.owasp.html.StylingPolicy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class StylingPolicy_ESTest extends StylingPolicy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen("H L%K M0", 0, 16);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        StylingPolicy.isAlphanumericOrSpaceOrHyphen("table-capti9n", 0, 630);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen("q?!@40:m(\"l5WF]", 4, 827);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen("G)dO@^Xc:C", 264, 26);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StylingPolicy.StylingPolicyJoinStrategy stylingPolicy_StylingPolicyJoinStrategy0 = new StylingPolicy.StylingPolicyJoinStrategy();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CssSchema cssSchema0 = CssSchema.DEFAULT;
      Function<String, String> function0 = (Function<String, String>) mock(Function.class, new ViolatedAssumptionAnswer());
      StylingPolicy stylingPolicy0 = new StylingPolicy(cssSchema0, function0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        StylingPolicy.isAlphanumericOrSpaceOrHyphen((String) null, (-3069), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.owasp.html.StylingPolicy", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen("z6^6i3NarQgt", 0, 138);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen(" y<u#5bT/", 605, 605);
      assertTrue(boolean0);
  }
}
