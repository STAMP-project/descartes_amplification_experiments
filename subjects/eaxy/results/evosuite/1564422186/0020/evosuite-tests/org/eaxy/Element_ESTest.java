/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 18:09:19 GMT 2019
 */

package org.eaxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.TreeSet;
import org.eaxy.Attribute;
import org.eaxy.Content;
import org.eaxy.Element;
import org.eaxy.Namespace;
import org.eaxy.QualifiedName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Element_ESTest extends Element_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("SFKWn+r(**v_P,^=", "SFKWn+r(**v_P,^=");
      Content[] contentArray0 = new Content[10];
      Attribute attribute0 = new Attribute(qualifiedName0, "SFKWn+r(**v_P,^=");
      contentArray0[4] = (Content) attribute0;
      Namespace namespace0 = new Namespace("SFKWn+r(**v_P,^=", "SFKWn+r(**v_P,^=");
      contentArray0[5] = (Content) namespace0;
      Element element0 = new Element(qualifiedName0, contentArray0);
      assertEquals("SFKWn+r(**v_P,^=", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Content[] contentArray0 = new Content[9];
      Namespace namespace0 = Namespace.NO_NAMESPACE;
      contentArray0[6] = (Content) namespace0;
      QualifiedName qualifiedName0 = new QualifiedName("EKif'\"Uo3W{wl", "EKif'\"Uo3W{wl");
      Element element0 = null;
      try {
        element0 = new Element(qualifiedName0, contentArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid namespace {uri=null,prefix=null}
         //
         verifyException("org.eaxy.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("k", "\"&pTwdrlw&S");
      TreeSet<Attribute> treeSet0 = new TreeSet<Attribute>();
      ArrayDeque<Namespace> arrayDeque0 = new ArrayDeque<Namespace>();
      Integer integer0 = new Integer((-1));
      Element element0 = new Element(qualifiedName0, treeSet0, arrayDeque0, integer0);
      assertEquals("\"&pTwdrlw&S", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("dmu6)9,", "dmu6)9,");
      Element element0 = new Element(qualifiedName0, (-21));
      assertEquals("dmu6)9,", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("h[aE.8bi^FbS+,", "h[aE.8bi^FbS+,", "h[aE.8bi^FbS+,");
      PriorityQueue<Content> priorityQueue0 = new PriorityQueue<Content>();
      Element element0 = new Element(qualifiedName0, priorityQueue0);
      boolean boolean0 = element0.equals(priorityQueue0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("h[aE.8bi^FbS+,", "h[aE.8bi^FbS+,", "h[aE.8bi^FbS+,");
      PriorityQueue<Content> priorityQueue0 = new PriorityQueue<Content>();
      Element element0 = new Element(qualifiedName0, priorityQueue0);
      boolean boolean0 = element0.equals(element0);
      assertTrue(boolean0);
  }
}
