/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 05:40:28 GMT 2019
 */

package org.owasp.html;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
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
      ImmutableSet<String> immutableSet0 = ElementAndAttributePolicyBasedSanitizerPolicy.SKIPPABLE_ELEMENT_CONTENT;
      ElementAndAttributePolicyBasedSanitizerPolicy elementAndAttributePolicyBasedSanitizerPolicy0 = new ElementAndAttributePolicyBasedSanitizerPolicy((HtmlStreamEventReceiver) null, (ImmutableMap<String, ElementAndAttributePolicies>) null, immutableSet0);
      TagBalancingHtmlStreamEventReceiver tagBalancingHtmlStreamEventReceiver0 = new TagBalancingHtmlStreamEventReceiver(elementAndAttributePolicyBasedSanitizerPolicy0);
      tagBalancingHtmlStreamEventReceiver0.closeTag("");
      assertFalse(immutableSet0.contains(""));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ImmutableSet<String> immutableSet0 = ElementAndAttributePolicyBasedSanitizerPolicy.SKIPPABLE_ELEMENT_CONTENT;
      ElementAndAttributePolicyBasedSanitizerPolicy elementAndAttributePolicyBasedSanitizerPolicy0 = new ElementAndAttributePolicyBasedSanitizerPolicy((HtmlStreamEventReceiver) null, (ImmutableMap<String, ElementAndAttributePolicies>) null, immutableSet0);
      TagBalancingHtmlStreamEventReceiver tagBalancingHtmlStreamEventReceiver0 = new TagBalancingHtmlStreamEventReceiver(elementAndAttributePolicyBasedSanitizerPolicy0);
      // Undeclared exception!
      try { 
        tagBalancingHtmlStreamEventReceiver0.closeTag((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.owasp.html.HtmlLexer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockFile mockFile0 = new MockFile("object");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0);
      Handler<Object> handler0 = (Handler<Object>) mock(Handler.class, new ViolatedAssumptionAnswer());
      Handler<Object> handler1 = (Handler<Object>) mock(Handler.class, new ViolatedAssumptionAnswer());
      HtmlStreamRenderer.CloseableHtmlStreamRenderer htmlStreamRenderer_CloseableHtmlStreamRenderer0 = new HtmlStreamRenderer.CloseableHtmlStreamRenderer(mockFileWriter0, handler0, handler1);
      TagBalancingHtmlStreamEventReceiver tagBalancingHtmlStreamEventReceiver0 = new TagBalancingHtmlStreamEventReceiver(htmlStreamRenderer_CloseableHtmlStreamRenderer0);
      // Undeclared exception!
      try { 
        tagBalancingHtmlStreamEventReceiver0.closeTag("Q#");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.owasp.html.HtmlStreamRenderer", e);
      }
  }
}
