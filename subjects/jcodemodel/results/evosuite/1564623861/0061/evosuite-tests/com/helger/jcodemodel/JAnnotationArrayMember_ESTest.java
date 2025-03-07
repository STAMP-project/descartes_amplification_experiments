/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 02:50:06 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JAnnotationArrayMember;
import com.helger.jcodemodel.JCodeModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JAnnotationArrayMember_ESTest extends JAnnotationArrayMember_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnnotationArrayMember jAnnotationArrayMember0 = new JAnnotationArrayMember(jCodeModel0);
      int[] intArray0 = new int[0];
      JAnnotationArrayMember jAnnotationArrayMember1 = jAnnotationArrayMember0.params(intArray0);
      assertSame(jAnnotationArrayMember1, jAnnotationArrayMember0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnnotationArrayMember jAnnotationArrayMember0 = new JAnnotationArrayMember(jCodeModel0);
      int[] intArray0 = new int[4];
      jAnnotationArrayMember0.params(intArray0);
      assertEquals(4, jAnnotationArrayMember0.size());
  }
}
