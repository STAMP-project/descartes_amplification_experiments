/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 22:33:29 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JArray;
import com.helger.jcodemodel.JArrayCompRef;
import com.helger.jcodemodel.JAtom;
import com.helger.jcodemodel.JAtomInt;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JConditional;
import com.helger.jcodemodel.JEnumConstantRef;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JOpUnary;
import com.helger.jcodemodel.JOpUnaryTight;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JConditional_ESTest extends JConditional_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jCodeModel0.NULL);
      JMethod jMethod0 = new JMethod(41, jAnonymousClass0);
      JInvocation jInvocation0 = new JInvocation(jCodeModel0, jCodeModel0.CHAR, jMethod0);
      JConditional jConditional0 = new JConditional(jInvocation0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "Uqh");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "Uqh");
      // Undeclared exception!
      try { 
        jConditional0.state(jFormatter0);
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
      JOpUnary jOpUnary0 = new JOpUnary(jLambda0, "9=]w7~HMB");
      JArrayCompRef jArrayCompRef0 = new JArrayCompRef(jOpUnary0, jLambda0);
      JConditional jConditional0 = new JConditional(jArrayCompRef0);
      StringWriter stringWriter0 = new StringWriter(0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "9=]w7~HMB");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "9=]w7~HMB");
      // Undeclared exception!
      try { 
        jConditional0.state(jFormatter0);
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
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "qmnh/?^t}N,s%(");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "qmnh/?^t}N,s%(");
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "com.helger.jcodemodel.JReturn");
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jErrorClass0, eWildcardBoundMode0);
      JEnumConstantRef jEnumConstantRef0 = new JEnumConstantRef(jTypeWildcard0, "qmnh/?^t}N,s%(");
      JOpUnaryTight jOpUnaryTight0 = new JOpUnaryTight("", jEnumConstantRef0);
      JArray jArray0 = new JArray(jTypeWildcard0, jOpUnaryTight0);
      JConditional jConditional0 = new JConditional(jArray0);
      // Undeclared exception!
      try { 
        jConditional0.state(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // com.helger.jcodemodel.JReturn
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JAtomInt jAtomInt0 = new JAtomInt(2782);
      JOpUnaryTight jOpUnaryTight0 = new JOpUnaryTight(jAtomInt0, "Mm");
      JConditional jConditional0 = new JConditional(jOpUnaryTight0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "Mm");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "Mm");
      jConditional0.state(jFormatter0);
      assertEquals("if  2782 Mm {Mm}Mm", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JAtom jAtom0 = new JAtom("false");
      JConditional jConditional0 = new JConditional(jAtom0);
      StringWriter stringWriter0 = new StringWriter(15);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "false");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "if ");
      jConditional0.state(jFormatter0);
      assertEquals("if (false) {false}false", stringWriter0.toString());
  }
}
