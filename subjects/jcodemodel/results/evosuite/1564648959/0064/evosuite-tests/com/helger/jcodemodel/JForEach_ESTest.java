/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 09:53:22 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JArray;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JForEach;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JLambdaMethodRef;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JOpUnaryTight;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JForEach_ESTest extends JForEach_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jCodeModel0.NULL);
      JMethod jMethod0 = new JMethod(1, jAnonymousClass0);
      JInvocation jInvocation0 = new JInvocation(jCodeModel0, jCodeModel0.DOUBLE, jMethod0);
      JOpUnaryTight jOpUnaryTight0 = new JOpUnaryTight(jInvocation0, "IiJh");
      JForEach jForEach0 = new JForEach(jCodeModel0.NULL, "IiJh", jOpUnaryTight0);
      StringWriter stringWriter0 = new StringWriter(1);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "IiJh");
      // Undeclared exception!
      try { 
        jForEach0.state(jFormatter0);
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
      JCodeModel jCodeModel0 = new JCodeModel();
      JLambda jLambda0 = new JLambda();
      JForEach jForEach0 = new JForEach(jCodeModel0.BYTE, "VarName", jLambda0);
      StringWriter stringWriter0 = new StringWriter(59);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "VarName");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "VarName");
      // Undeclared exception!
      try { 
        jForEach0.state(jFormatter0);
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
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "Collection");
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.SUPER;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jErrorClass0, eWildcardBoundMode0);
      JInvocation jInvocation0 = new JInvocation(jCodeModel0.FLOAT);
      JLambdaMethodRef jLambdaMethodRef0 = new JLambdaMethodRef(jInvocation0, "aXW<cM_");
      JArray jArray0 = new JArray(jCodeModel0.VOID, jLambdaMethodRef0);
      JForEach jForEach0 = new JForEach(jTypeWildcard0, "Collection", jArray0);
      StringWriter stringWriter0 = new StringWriter(3636);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "aXW<cM_");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "Collection");
      // Undeclared exception!
      try { 
        jForEach0.state(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // Collection
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JLambdaMethodRef jLambdaMethodRef0 = new JLambdaMethodRef(jCodeModel0.LONG);
      JForEach jForEach0 = new JForEach(jCodeModel0.LONG, "P", jLambdaMethodRef0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "P");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "P");
      jForEach0.state(jFormatter0);
      assertEquals("for (long P: long::new);P", stringWriter0.toString());
  }
}
