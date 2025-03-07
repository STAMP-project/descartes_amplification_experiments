/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 00:09:27 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JAtomDouble;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JOpUnaryTight;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JOpUnaryTight_ESTest extends JOpUnaryTight_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jCodeModel0.NULL);
      JMethod jMethod0 = new JMethod(0, jAnonymousClass0);
      JInvocation jInvocation0 = new JInvocation(jCodeModel0, jCodeModel0.DOUBLE, jMethod0);
      JOpUnaryTight jOpUnaryTight0 = new JOpUnaryTight(jInvocation0, "|U5q");
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "|U5q");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "r");
      // Undeclared exception!
      try { 
        jOpUnaryTight0.generate(jFormatter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.writer.JFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JLambda jLambda0 = new JLambda();
      JOpUnaryTight jOpUnaryTight0 = new JOpUnaryTight("the specified class (", jLambda0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "the specified class (");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "? super ");
      // Undeclared exception!
      try { 
        jOpUnaryTight0.generate(jFormatter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Lambda expression is empty!
         //
         verifyException("com.helger.jcodemodel.JLambda", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JAtomDouble jAtomDouble0 = new JAtomDouble(0.0);
      JOpUnaryTight jOpUnaryTight0 = new JOpUnaryTight("yg}*AiKR%KY;}/]", jAtomDouble0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "java.lang.Double.NaN");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "java.lang.Double.POSITIVE_INFINITY");
      jOpUnaryTight0.generate(jFormatter0);
      assertEquals("yg}*AiKR%KY;}/] 0.0", stringWriter0.toString());
  }
}
