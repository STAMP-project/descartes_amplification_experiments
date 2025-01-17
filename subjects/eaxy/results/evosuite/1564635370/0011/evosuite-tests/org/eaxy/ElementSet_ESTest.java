/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 05:10:15 GMT 2019
 */

package org.eaxy;

import org.junit.Test;
import static org.junit.Assert.*;
import org.eaxy.Content;
import org.eaxy.Element;
import org.eaxy.ElementSet;
import org.eaxy.QualifiedName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ElementSet_ESTest extends ElementSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QualifiedName qualifiedName0 = new QualifiedName("5ukg:s", "5ukg:s");
      Content[] contentArray0 = new Content[0];
      Element element0 = new Element(qualifiedName0, contentArray0);
      ElementSet elementSet0 = new ElementSet(element0);
      Element element1 = elementSet0.singleOrDefault();
      assertNotNull(element1);
      assertFalse(elementSet0.isEmpty());
  }
}
