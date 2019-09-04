/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 00:16:29 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JAtomLong;
import com.helger.jcodemodel.JCast;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JLambdaMethodRef;
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
      JLambda jLambda0 = new JLambda();
      JOpUnaryTight jOpUnaryTight0 = new JOpUnaryTight(jLambda0, "Zn0");
      StringWriter stringWriter0 = new StringWriter(0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "Zn0");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
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
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "L", "");
      StringWriter stringWriter0 = new StringWriter(4393);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "L");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "L");
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jErrorClass0);
      JEnumConstant jEnumConstant0 = new JEnumConstant(jArrayClass0, "L");
      JCast jCast0 = new JCast(jArrayClass0, jEnumConstant0);
      JOpUnaryTight jOpUnaryTight0 = new JOpUnaryTight(jCast0, "com.helger.jcodemodel.AbstractJAnnotationValue");
      // Undeclared exception!
      try { 
        jOpUnaryTight0.generate(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // L
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAtomLong jAtomLong0 = new JAtomLong(2932L);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jCodeModel0.NULL);
      JMethod jMethod0 = new JMethod(0, jAnonymousClass0);
      JInvocation jInvocation0 = new JInvocation(jCodeModel0, jAtomLong0, jMethod0);
      JLambdaMethodRef jLambdaMethodRef0 = new JLambdaMethodRef(jInvocation0, jMethod0);
      JOpUnaryTight jOpUnaryTight0 = new JOpUnaryTight("", jLambdaMethodRef0);
      StringWriter stringWriter0 = new StringWriter(1288);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
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
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "2mIO%5!T{vbh2YYS", "2mIO%5!T{vbh2YYS");
      JLambdaMethodRef jLambdaMethodRef0 = new JLambdaMethodRef(jErrorClass0);
      JOpUnaryTight jOpUnaryTight0 = new JOpUnaryTight(jLambdaMethodRef0, "2mIO%5!T{vbh2YYS");
      StringWriter stringWriter0 = new StringWriter(0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "2mIO%5!T{vbh2YYS");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "@3ukQqVVEp+'|{07\"S");
      jOpUnaryTight0.generate(jFormatter0);
      assertEquals("Object::new2mIO%5!T{vbh2YYS", stringWriter0.toString());
  }
}