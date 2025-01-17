/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 19:24:21 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JTypeWildcard_ESTest extends JTypeWildcard_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JArrayClass jArrayClass0 = new JArrayClass(jCodeModel0, jCodeModel0.FLOAT);
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.SUPER;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jArrayClass0, eWildcardBoundMode0);
      JTypeWildcard jTypeWildcard1 = new JTypeWildcard(jTypeWildcard0, eWildcardBoundMode0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "]");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "]");
      // Undeclared exception!
      try { 
        jTypeWildcard1.generate(jFormatter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.JTypeWildcard", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "TYe", "TYe");
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.SUPER;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jErrorClass0, eWildcardBoundMode0);
      StringWriter stringWriter0 = new StringWriter(0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "@$I");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "~y|Gn>ab=G");
      // Undeclared exception!
      try { 
        jTypeWildcard0.generate(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // TYe
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jCodeModel0.NULL, eWildcardBoundMode0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "pG-$SPkB6k");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "pG-$SPkB6k");
      jTypeWildcard0.generate(jFormatter0);
      assertEquals("?", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jCodeModel0.NULL, eWildcardBoundMode0);
      LinkedList<JArrayClass> linkedList0 = new LinkedList<JArrayClass>();
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jTypeWildcard0, linkedList0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "pG-$SPkB6k");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "pG-$SPkB6k");
      JTypeWildcard jTypeWildcard1 = new JTypeWildcard(jNarrowedClass0, eWildcardBoundMode0);
      jTypeWildcard1.generate(jFormatter0);
      assertEquals("? extends ? extends null<>", stringWriter0.toString());
  }
}
