/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 15:19:23 GMT 2019
 */

package org.eaxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.regex.PatternSyntaxException;
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
      QualifiedName qualifiedName0 = new QualifiedName("!~", "!~", "FQA}3n%0'4\"bCp$8z");
      Content[] contentArray0 = new Content[4];
      Namespace namespace0 = new Namespace("FQA}3n%0'4\"bCp$8z");
      contentArray0[1] = (Content) namespace0;
      Element element0 = new Element(qualifiedName0, contentArray0);
      assertEquals("!~", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("!~", "!~", "FQA}3n%0'4\"bCp$8z");
      Content[] contentArray0 = new Content[4];
      Namespace namespace0 = Namespace.NO_NAMESPACE;
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
      QualifiedName qualifiedName0 = new QualifiedName("=2Bz<)C0v9gt7C");
      LinkedHashSet<Content> linkedHashSet0 = new LinkedHashSet<Content>();
      Element element0 = new Element(qualifiedName0, linkedHashSet0);
      assertEquals("=2Bz<)C0v9gt7C", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Namespace namespace0 = new Namespace(" ");
      QualifiedName qualifiedName0 = new QualifiedName(namespace0, " ");
      Element element0 = new Element(qualifiedName0, (-1));
      assertEquals(" ", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("class", "class");
      Content[] contentArray0 = new Content[4];
      Attribute attribute0 = new Attribute(qualifiedName0, "class");
      contentArray0[0] = (Content) attribute0;
      Element element0 = new Element(qualifiedName0, contentArray0);
      boolean boolean0 = element0.hasClass("class");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("class", "class");
      Content[] contentArray0 = new Content[4];
      Attribute attribute0 = new Attribute(qualifiedName0, "class");
      contentArray0[0] = (Content) attribute0;
      Element element0 = new Element(qualifiedName0, contentArray0);
      boolean boolean0 = element0.hasClass("Invalid namespace ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("class", "class");
      Content[] contentArray0 = new Content[4];
      Attribute attribute0 = new Attribute(qualifiedName0, "class");
      contentArray0[0] = (Content) attribute0;
      Element element0 = new Element(qualifiedName0, contentArray0);
      // Undeclared exception!
      try { 
        element0.hasClass("\"M)Jq/WpG}x>g.FF");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unmatched closing ')' near index 5
         // .*\\b\"M)Jq/WpG}x>g.FF\\b.*
         //      ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("class", "class");
      Content[] contentArray0 = new Content[4];
      Attribute attribute0 = new Attribute(qualifiedName0, "class");
      contentArray0[0] = (Content) attribute0;
      Element element0 = new Element(qualifiedName0, contentArray0);
      // Undeclared exception!
      try { 
        element0.hasClass("\"*5.Z3poQl=%");
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Namespace namespace0 = Namespace.NO_NAMESPACE;
      QualifiedName qualifiedName0 = new QualifiedName(namespace0, "WQFAW@?0}J");
      TreeSet<Attribute> treeSet0 = new TreeSet<Attribute>();
      ArrayDeque<Namespace> arrayDeque0 = new ArrayDeque<Namespace>();
      Integer integer0 = new Integer(0);
      Element element0 = new Element(qualifiedName0, treeSet0, arrayDeque0, integer0);
      // Undeclared exception!
      try { 
        element0.hasClass("j .[=lD^~c1n,dE");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}