/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 23:13:42 GMT 2019
 */

package com.helger.jcodemodel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.util.JCHashCodeGenerator;
import javax.imageio.metadata.IIOMetadataNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.Node;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCHashCodeGenerator_ESTest extends JCHashCodeGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<String> class0 = String.class;
      JCHashCodeGenerator jCHashCodeGenerator0 = new JCHashCodeGenerator(class0);
      assertEquals(17, JCHashCodeGenerator.INITIAL_HASHCODE);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      JCHashCodeGenerator jCHashCodeGenerator0 = new JCHashCodeGenerator(iIOMetadataNode0);
      // Undeclared exception!
      try { 
        jCHashCodeGenerator0.append((Node) iIOMetadataNode0);
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // Hash code cannot be changed anymore!
         //
         verifyException("com.helger.jcodemodel.util.JCHashCodeGenerator", e);
      }
  }
}