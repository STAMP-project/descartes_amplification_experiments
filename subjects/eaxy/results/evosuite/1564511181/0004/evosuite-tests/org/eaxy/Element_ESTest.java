/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 18:32:12 GMT 2019
 */

package org.eaxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Vector;
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
      QualifiedName qualifiedName0 = new QualifiedName("or!.eaxyuXml", "or!.eaxyuXml", "or!.eaxyuXml");
      Content[] contentArray0 = new Content[13];
      Namespace namespace0 = new Namespace("or!.eaxyuXml");
      contentArray0[2] = (Content) namespace0;
      Namespace namespace1 = new Namespace("or!.eaxyuXml", "or!.eaxyuXml");
      contentArray0[3] = (Content) namespace1;
      Element element0 = new Element(qualifiedName0, contentArray0);
      assertEquals("or!.eaxyuXml", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Content[] contentArray0 = new Content[6];
      Namespace namespace0 = Namespace.NO_NAMESPACE;
      contentArray0[3] = (Content) namespace0;
      QualifiedName qualifiedName0 = new QualifiedName("\b.*");
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
      QualifiedName qualifiedName0 = new QualifiedName(" nZN,1lY/+x+ft", " nZN,1lY/+x+ft", " nZN,1lY/+x+ft");
      Content[] contentArray0 = new Content[9];
      Attribute attribute0 = new Attribute(qualifiedName0, " nZN,1lY/+x+ft");
      contentArray0[7] = (Content) attribute0;
      Element element0 = new Element(qualifiedName0, contentArray0);
      // Undeclared exception!
      try { 
        element0.hasClass(" nZN,1lY/+x+ft");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("w!tBS{IwX6", "=A");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Vector<Namespace> vector0 = new Vector<Namespace>();
      Integer integer0 = new Integer(0);
      Element element0 = new Element(qualifiedName0, arrayList0, vector0, integer0);
      assertEquals("=A", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName(" nZN,1lY/+x+ft", " nZN,1lY/+x+ft", " nZN,1lY/+x+ft");
      Element element0 = new Element(qualifiedName0, (-1565));
      assertEquals(" nZN,1lY/+x+ft", element0.tagName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName(" nZN,1lY/+x+ft", " nZN,1lY/+x+ft", " nZN,1lY/+x+ft");
      ArrayList<Content> arrayList0 = new ArrayList<Content>();
      Element element0 = new Element(qualifiedName0, arrayList0);
      // Undeclared exception!
      try { 
        element0.hasClass(" nZN,1lY/+x+ft");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
