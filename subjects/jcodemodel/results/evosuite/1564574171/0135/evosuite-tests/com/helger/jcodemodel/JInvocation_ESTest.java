/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 14:21:55 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JAtomLong;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JInvocation_ESTest extends JInvocation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JInvocation jInvocation0 = new JInvocation(jCodeModel0, jCodeModel0.INT, "yN&~[Y!");
      assertFalse(jInvocation0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jCodeModel0.NULL);
      JMethod jMethod0 = new JMethod(jAnonymousClass0, 60, jCodeModel0.SHORT, "T");
      JInvocation jInvocation0 = new JInvocation(jCodeModel0, jCodeModel0.BOOLEAN, jMethod0);
      assertFalse(jInvocation0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "],WZ}hzGFN", (String) null);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jErrorClass0);
      JMethod jMethod0 = new JMethod(jAnonymousClass0, 46, jCodeModel0.DOUBLE, "],WZ}hzGFN");
      JInvocation jInvocation0 = new JInvocation((IJExpression) null, jMethod0);
      assertFalse(jInvocation0.isConstructor());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JAtomLong jAtomLong0 = new JAtomLong((-1291L));
      StringWriter stringWriter0 = new StringWriter(40);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "L");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      JInvocation jInvocation0 = new JInvocation(jAtomLong0, "");
      jInvocation0.generate(jFormatter0);
      assertEquals("-1291L.()", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "");
      StringWriter stringWriter0 = new StringWriter(62);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "W%UzrVY~dBLorLLKaW");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "FC(L_j_6]VwYZ");
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jErrorClass0);
      JMethod jMethod0 = new JMethod(62, jAnonymousClass0);
      JInvocation jInvocation0 = new JInvocation(jErrorClass0, jMethod0);
      // Undeclared exception!
      try { 
        jInvocation0.generate(jFormatter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.writer.JFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JLambda jLambda0 = new JLambda();
      JInvocation jInvocation0 = new JInvocation(jLambda0, "Method");
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "Method");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "5#@G}0>");
      // Undeclared exception!
      try { 
        jInvocation0.generate(jFormatter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Lambda expression is empty!
         //
         verifyException("com.helger.jcodemodel.JLambda", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JInvocation jInvocation0 = new JInvocation((IJExpression) null, "OmKYM(#a");
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "OmKYM(#a");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "OmKYM(#a");
      jInvocation0.generate(jFormatter0);
      assertEquals("OmKYM(#a()", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.SHORT);
      JInvocation jInvocation0 = new JInvocation(jArrayClass0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "com.helger.jcodemodel.JSwitch");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "com.helger.jcodemodel.JSwitch");
      jInvocation0.generate(jFormatter0);
      assertEquals("new short[] {}", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.DOUBLE);
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.SUPER;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jArrayClass0, eWildcardBoundMode0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jTypeWildcard0);
      JInvocation jInvocation0 = new JInvocation(jAnonymousClass0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "tC(FpEH");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "tC(FpEH");
      jInvocation0.generate(jFormatter0);
      assertEquals("new? super double[]() {tC(FpEH}tC(FpEH", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "");
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jErrorClass0, eWildcardBoundMode0);
      JInvocation jInvocation0 = new JInvocation(jTypeWildcard0, "_S%h8M(Wz");
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "_S%h8M(Wz");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "g@|{>O");
      // Undeclared exception!
      try { 
        jInvocation0.generate(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // 
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }
}