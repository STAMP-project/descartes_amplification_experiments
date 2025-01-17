/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 15:38:18 GMT 2019
 */

package org.eaxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import org.eaxy.Attribute;
import org.eaxy.Content;
import org.eaxy.Element;
import org.eaxy.Namespace;
import org.eaxy.QualifiedName;
import org.eaxy.Xml;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Element_ESTest extends Element_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("g*", "g*", "g*");
      Content[] contentArray0 = new Content[4];
      Namespace namespace0 = new Namespace("FL;4-\"s_R1e", "FL;4-\"s_R1e");
      contentArray0[3] = (Content) namespace0;
      Element element0 = new Element(qualifiedName0, contentArray0);
      assertEquals("g*", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Namespace namespace0 = Namespace.NO_NAMESPACE;
      QualifiedName qualifiedName0 = new QualifiedName(namespace0, "f]UI0fB7Vp]s");
      Content[] contentArray0 = new Content[9];
      contentArray0[2] = (Content) namespace0;
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
      QualifiedName qualifiedName0 = new QualifiedName("g*", "g*", "g*");
      Content[] contentArray0 = new Content[4];
      Attribute attribute0 = new Attribute(qualifiedName0, "g*");
      contentArray0[2] = (Content) attribute0;
      Element element0 = new Element(qualifiedName0, contentArray0);
      assertEquals("g*", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("&@", "ozBdkg(z*.", "");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      TreeSet<Attribute> treeSet0 = new TreeSet<Attribute>(linkedList0);
      ArrayDeque<Namespace> arrayDeque0 = new ArrayDeque<Namespace>();
      Integer integer0 = new Integer((-2712));
      Element element0 = new Element(qualifiedName0, treeSet0, arrayDeque0, integer0);
      assertEquals("ozBdkg(z*.", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("Kk_lDass", "Kk_lDass");
      LinkedHashSet<Content> linkedHashSet0 = new LinkedHashSet<Content>();
      Element element0 = new Element(qualifiedName0, linkedHashSet0);
      assertEquals("Kk_lDass", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("Kk_lDass", "Kk_lDass");
      Element element0 = new Element(qualifiedName0, (-17));
      assertEquals("Kk_lDass", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("&@", "ozBdkg(z*.", "");
      Content[] contentArray0 = new Content[4];
      Element element0 = new Element(qualifiedName0, contentArray0);
      Xml.CommentElement xml_CommentElement0 = new Xml.CommentElement("&@");
      boolean boolean0 = element0.equals(xml_CommentElement0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("&@", "ozBdkg(z*.", "");
      Content[] contentArray0 = new Content[4];
      Element element0 = new Element(qualifiedName0, contentArray0);
      contentArray0[0] = (Content) element0;
      boolean boolean0 = element0.equals(contentArray0[0]);
      assertTrue(boolean0);
  }
}
