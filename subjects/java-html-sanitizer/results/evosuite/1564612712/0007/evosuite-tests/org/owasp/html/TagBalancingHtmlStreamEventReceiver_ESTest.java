/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 22:47:24 GMT 2019
 */

package org.owasp.html;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.owasp.html.ElementAndAttributePolicies;
import org.owasp.html.ElementAndAttributePolicyBasedSanitizerPolicy;
import org.owasp.html.Handler;
import org.owasp.html.HtmlStreamEventReceiver;
import org.owasp.html.HtmlStreamRenderer;
import org.owasp.html.TagBalancingHtmlStreamEventReceiver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class TagBalancingHtmlStreamEventReceiver_ESTest extends TagBalancingHtmlStreamEventReceiver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      HtmlStreamRenderer.CloseableHtmlStreamRenderer htmlStreamRenderer_CloseableHtmlStreamRenderer0 = new HtmlStreamRenderer.CloseableHtmlStreamRenderer(stringWriter0, (Handler<? super IOException>) null, (Handler<? super String>) null);
      ImmutableSet<String> immutableSet0 = ElementAndAttributePolicyBasedSanitizerPolicy.SKIPPABLE_ELEMENT_CONTENT;
      ElementAndAttributePolicyBasedSanitizerPolicy elementAndAttributePolicyBasedSanitizerPolicy0 = new ElementAndAttributePolicyBasedSanitizerPolicy(htmlStreamRenderer_CloseableHtmlStreamRenderer0, (ImmutableMap<String, ElementAndAttributePolicies>) null, immutableSet0);
      TagBalancingHtmlStreamEventReceiver tagBalancingHtmlStreamEventReceiver0 = new TagBalancingHtmlStreamEventReceiver(elementAndAttributePolicyBasedSanitizerPolicy0);
      tagBalancingHtmlStreamEventReceiver0.closeTag("Mb1md>b 6.a");
      assertFalse(immutableSet0.contains("Mb1md>b 6.a"));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TagBalancingHtmlStreamEventReceiver tagBalancingHtmlStreamEventReceiver0 = new TagBalancingHtmlStreamEventReceiver((HtmlStreamEventReceiver) null);
      // Undeclared exception!
      try { 
        tagBalancingHtmlStreamEventReceiver0.closeTag("@L");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.owasp.html.TagBalancingHtmlStreamEventReceiver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      Handler<Object> handler0 = (Handler<Object>) mock(Handler.class, new ViolatedAssumptionAnswer());
      Handler<Object> handler1 = (Handler<Object>) mock(Handler.class, new ViolatedAssumptionAnswer());
      HtmlStreamRenderer htmlStreamRenderer0 = new HtmlStreamRenderer(charArrayWriter0, handler1, handler0);
      TagBalancingHtmlStreamEventReceiver tagBalancingHtmlStreamEventReceiver0 = new TagBalancingHtmlStreamEventReceiver(htmlStreamRenderer0);
      // Undeclared exception!
      try { 
        tagBalancingHtmlStreamEventReceiver0.closeTag("Os):Hg");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.owasp.html.HtmlStreamRenderer", e);
      }
  }
}