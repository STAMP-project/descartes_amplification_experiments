/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 17:34:49 GMT 2019
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
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen(" qjHbp*f^", 0, 72);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        StylingPolicy.isAlphanumericOrSpaceOrHyphen("s-resize", 0, 9);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen("Aca~aDW;*yI4@x8", 0, 130);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        StylingPolicy.isAlphanumericOrSpaceOrHyphen("900", 0, 65536);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen(" qjHbp*f^", 72, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StylingPolicy.StylingPolicyJoinStrategy stylingPolicy_StylingPolicyJoinStrategy0 = new StylingPolicy.StylingPolicyJoinStrategy();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CssSchema cssSchema0 = CssSchema.DEFAULT;
      Function<String, String> function0 = (Function<String, String>) mock(Function.class, new ViolatedAssumptionAnswer());
      StylingPolicy stylingPolicy0 = new StylingPolicy(cssSchema0, function0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen("q0xo-7C. #Q", 0, 7);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Undeclared exception!
      try { 
        StylingPolicy.isAlphanumericOrSpaceOrHyphen((String) null, 0, 1181);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.owasp.html.StylingPolicy", e);
      }
  }
}
