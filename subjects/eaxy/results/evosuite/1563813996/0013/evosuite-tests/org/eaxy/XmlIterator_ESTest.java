/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 17:06:33 GMT 2019
 */

package org.eaxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.xml.stream.XMLStreamReader;
import org.eaxy.ElementFilters;
import org.eaxy.XmlIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class XmlIterator_ESTest extends XmlIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ElementFilters.Identity elementFilters_Identity0 = new ElementFilters.Identity();
      XmlIterator xmlIterator0 = null;
      try {
        xmlIterator0 = new XmlIterator((XMLStreamReader) null, elementFilters_Identity0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eaxy.XmlIterator", e);
      }
  }
}
