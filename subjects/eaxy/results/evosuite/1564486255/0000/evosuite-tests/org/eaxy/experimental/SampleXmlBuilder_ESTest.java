/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 11:32:03 GMT 2019
 */

package org.eaxy.experimental;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URL;
import java.util.LinkedList;
import org.eaxy.Document;
import org.eaxy.Element;
import org.eaxy.QualifiedName;
import org.eaxy.experimental.SampleXmlBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class SampleXmlBuilder_ESTest extends SampleXmlBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("rootEle ment", "rootEle ment");
      Element element0 = new Element(qualifiedName0, 7);
      Document document0 = new Document(element0);
      SampleXmlBuilder sampleXmlBuilder0 = new SampleXmlBuilder(document0, "rootEle ment");
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

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SampleXmlBuilder sampleXmlBuilder0 = null;
      try {
        sampleXmlBuilder0 = new SampleXmlBuilder((URL) null, "Yk[Jj]v!P6RB!26[d'");
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
      QualifiedName qualifiedName0 = new QualifiedName("\"quotD", "\"quotD", "\"quotD");
      Element element0 = new Element(qualifiedName0, 2368);
      LinkedList<Document> linkedList0 = new LinkedList<Document>();
      Document document0 = new Document(element0);
      SampleXmlBuilder sampleXmlBuilder0 = new SampleXmlBuilder("\"quotD", document0, linkedList0);
      // Undeclared exception!
      try { 
        sampleXmlBuilder0.createRandomElement(qualifiedName0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't find type definition of \"\"quotD\":\"quotD
         //
         verifyException("org.eaxy.experimental.SampleXmlBuilder", e);
      }
  }
}
