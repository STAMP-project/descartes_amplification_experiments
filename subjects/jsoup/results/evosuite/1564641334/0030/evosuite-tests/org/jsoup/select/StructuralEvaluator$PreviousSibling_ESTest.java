/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 07:09:24 GMT 2019
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.StructuralEvaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class StructuralEvaluator$PreviousSibling_ESTest extends StructuralEvaluator$PreviousSibling_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Evaluator.IsOnlyOfType evaluator_IsOnlyOfType0 = new Evaluator.IsOnlyOfType();
      Element element0 = new Element(":prev*%s");
      Element element1 = new Element(":prev*%s");
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling(evaluator_IsOnlyOfType0);
      boolean boolean0 = structuralEvaluator_PreviousSibling0.matches(element0, element1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Evaluator.AllElements evaluator_AllElements0 = new Evaluator.AllElements();
      StructuralEvaluator.ImmediatePreviousSibling structuralEvaluator_ImmediatePreviousSibling0 = new StructuralEvaluator.ImmediatePreviousSibling(evaluator_AllElements0);
      StructuralEvaluator.Not structuralEvaluator_Not0 = new StructuralEvaluator.Not(structuralEvaluator_ImmediatePreviousSibling0);
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling(structuralEvaluator_Not0);
      Tag tag0 = mock(Tag.class, new ViolatedAssumptionAnswer());
      Element element0 = new Element(tag0, "fIAww6.Lr?fxIxK");
      boolean boolean0 = structuralEvaluator_PreviousSibling0.matches(element0, element0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Evaluator.AllElements evaluator_AllElements0 = new Evaluator.AllElements();
      StructuralEvaluator.ImmediatePreviousSibling structuralEvaluator_ImmediatePreviousSibling0 = new StructuralEvaluator.ImmediatePreviousSibling(evaluator_AllElements0);
      StructuralEvaluator.Not structuralEvaluator_Not0 = new StructuralEvaluator.Not(structuralEvaluator_ImmediatePreviousSibling0);
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling(structuralEvaluator_Not0);
      Tag tag0 = mock(Tag.class, new ViolatedAssumptionAnswer());
      Element element0 = new Element(tag0, "fIAww6.Lr?fxIxK");
      // Undeclared exception!
      try { 
        structuralEvaluator_PreviousSibling0.matches(element0, (Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.StructuralEvaluator$PreviousSibling", e);
      }
  }
}