/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 23:24:13 GMT 2019
 */

package com.helger.jcodemodel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.util.JCHashCodeGenerator;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCHashCodeGenerator_ESTest extends JCHashCodeGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JCHashCodeGenerator jCHashCodeGenerator0 = new JCHashCodeGenerator(class0);
      assertEquals(0, JCHashCodeGenerator.ILLEGAL_HASHCODE);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      JCHashCodeGenerator jCHashCodeGenerator0 = new JCHashCodeGenerator(treeSet0);
      // Undeclared exception!
      try { 
        jCHashCodeGenerator0.append((Iterable<?>) treeSet0);
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
