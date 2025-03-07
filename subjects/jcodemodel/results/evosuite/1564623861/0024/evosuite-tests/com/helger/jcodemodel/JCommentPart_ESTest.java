/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 02:13:24 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JCommentPart;
import java.util.ConcurrentModificationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JCommentPart_ESTest extends JCommentPart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCommentPart jCommentPart0 = new JCommentPart();
      Class<JArrayClass> class0 = JArrayClass.class;
      // Undeclared exception!
      try { 
        jCommentPart0.add((Object) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value is of an unsupported type: class java.lang.Class
         //
         verifyException("com.helger.jcodemodel.JCommentPart", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCommentPart jCommentPart0 = new JCommentPart();
      JCodeModel jCodeModel0 = new JCodeModel();
      jCommentPart0.add((Object) jCodeModel0.BOOLEAN);
      // Undeclared exception!
      try { 
        jCommentPart0.add((Object) jCommentPart0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }
}
