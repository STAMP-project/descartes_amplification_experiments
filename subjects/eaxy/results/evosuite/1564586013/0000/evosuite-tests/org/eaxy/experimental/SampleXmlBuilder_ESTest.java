/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 15:14:41 GMT 2019
 */

package org.eaxy.experimental;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URL;
import java.util.LinkedList;
import org.eaxy.Document;
import org.eaxy.Element;
import org.eaxy.Namespace;
import org.eaxy.QualifiedName;
import org.eaxy.experimental.SampleXmlBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class SampleXmlBuilder_ESTest extends SampleXmlBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Namespace namespace0 = Namespace.NO_NAMESPACE;
      QualifiedName qualifiedName0 = new QualifiedName(namespace0, "say");
      Element element0 = new Element(qualifiedName0, 89);
      Document document0 = new Document(element0);
      LinkedList<Document> linkedList0 = new LinkedList<Document>();
      SampleXmlBuilder sampleXmlBuilder0 = new SampleXmlBuilder("say", document0, linkedList0);
      // Undeclared exception!
      try { 
        sampleXmlBuilder0.createRandomElement(qualifiedName0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't find type definition of say
         //
         verifyException("org.eaxy.experimental.SampleXmlBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SampleXmlBuilder sampleXmlBuilder0 = null;
      try {
        sampleXmlBuilder0 = new SampleXmlBuilder((URL) null, "Ah\":");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("Xqt97h");
      Element element0 = new Element(qualifiedName0, (-22));
      Document document0 = new Document(element0);
      SampleXmlBuilder sampleXmlBuilder0 = new SampleXmlBuilder(document0, "Xqt97h");
      // Undeclared exception!
      try { 
        sampleXmlBuilder0.createRandomElement((QualifiedName) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elementName shouldn't be null
         //
         verifyException("org.eaxy.experimental.SampleXmlBuilder", e);
      }
  }
}
