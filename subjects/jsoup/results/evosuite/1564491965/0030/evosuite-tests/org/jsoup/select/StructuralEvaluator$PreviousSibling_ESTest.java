/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 13:40:56 GMT 2019
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.StructuralEvaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class StructuralEvaluator$PreviousSibling_ESTest extends StructuralEvaluator$PreviousSibling_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Evaluator.Id evaluator_Id0 = new Evaluator.Id("Q*~42369>K");
      Element element0 = new Element("k)}LIl@~<:aGRD?*");
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling(evaluator_Id0);
      Element element1 = new Element("td");
      boolean boolean0 = structuralEvaluator_PreviousSibling0.matches(element1, element0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling((Evaluator) null);
      Tag tag0 = mock(Tag.class, new ViolatedAssumptionAnswer());
      Attributes attributes0 = new Attributes();
      Element element0 = new Element(tag0, "UxoU]xdN3f'~a", attributes0);
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

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Evaluator.IsLastOfType evaluator_IsLastOfType0 = new Evaluator.IsLastOfType();
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling(evaluator_IsLastOfType0);
      Element element0 = new Element("(y");
      boolean boolean0 = structuralEvaluator_PreviousSibling0.matches(element0, element0);
      assertFalse(boolean0);
  }
}