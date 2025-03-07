/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 11:41:31 GMT 2019
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
      Namespace namespace0 = new Namespace("^F+b8D@gbXg!", "^F+b8D@gbXg!");
      QualifiedName qualifiedName0 = new QualifiedName(namespace0, "^F+b8D@gbXg!");
      Element element0 = new Element(qualifiedName0, 0);
      Document document0 = new Document(element0);
      LinkedList<Document> linkedList0 = new LinkedList<Document>();
      SampleXmlBuilder sampleXmlBuilder0 = new SampleXmlBuilder("^F+b8D@gbXg!", document0, linkedList0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SampleXmlBuilder sampleXmlBuilder0 = null;
      try {
        sampleXmlBuilder0 = new SampleXmlBuilder((URL) null, "org.eaxyElem5ntFil1es$1");
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
      QualifiedName qualifiedName0 = new QualifiedName("simpleType", "simpleType", "_WM,>;w6o'B8h>Jd7Uc");
      Element element0 = new Element(qualifiedName0, 1784);
      Document document0 = new Document(element0);
      SampleXmlBuilder sampleXmlBuilder0 = new SampleXmlBuilder(document0, (String) null);
      // Undeclared exception!
      try { 
        sampleXmlBuilder0.randomData(element0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find <java.lang.String@0000000031> below [java.lang.String@0000000038]. Actual elements: java.util.ArrayList@0000000039
         //
         verifyException("org.eaxy.ElementSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("simpleTyXe");
      Element element0 = new Element(qualifiedName0, 780);
      Document document0 = new Document(element0);
      SampleXmlBuilder sampleXmlBuilder0 = new SampleXmlBuilder(document0, "");
      // Undeclared exception!
      try { 
        sampleXmlBuilder0.randomData(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
