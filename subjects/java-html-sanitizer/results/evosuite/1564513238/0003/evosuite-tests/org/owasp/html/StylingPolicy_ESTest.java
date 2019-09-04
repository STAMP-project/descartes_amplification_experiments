/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 19:04:39 GMT 2019
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
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        StylingPolicy.isAlphanumericOrSpaceOrHyphen("tZ", 0, 2349);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen("r9=w<uE", 0, 155);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen("A0CT$WEN:d3@@+aR", 0, 31);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen("!important", 52, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StylingPolicy.StylingPolicyJoinStrategy stylingPolicy_StylingPolicyJoinStrategy0 = new StylingPolicy.StylingPolicyJoinStrategy();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CssSchema cssSchema0 = CssSchema.DEFAULT;
      Function<String, String> function0 = (Function<String, String>) mock(Function.class, new ViolatedAssumptionAnswer());
      StylingPolicy stylingPolicy0 = new StylingPolicy(cssSchema0, function0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        StylingPolicy.isAlphanumericOrSpaceOrHyphen((String) null, 0, 729);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.owasp.html.StylingPolicy", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen("-webkit-border-radiu)-bottom-lef/", 0, 95);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen("Y8|yi_MO.@5-_W$$BQ", 0, 95);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen("p3y /w>!C", 0, 124);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = StylingPolicy.isAlphanumericOrSpaceOrHyphen("p3y /w>!C", 124, 124);
      assertTrue(boolean0);
  }
}