/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 15:45:38 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JTypeWildcard_ESTest extends JTypeWildcard_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.SUPER;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jCodeModel0.NULL, eWildcardBoundMode0);
      JTypeWildcard jTypeWildcard1 = new JTypeWildcard(jTypeWildcard0, eWildcardBoundMode0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "com.helger.jcodemodel.DocComment");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "com.helger.jcodemodel.DocComment");
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
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "Ux", "Ux");
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.SUPER;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jErrorClass0, eWildcardBoundMode0);
      StringWriter stringWriter0 = new StringWriter(46);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "X.*w^rqq$dDfKP");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "|");
      // Undeclared exception!
      try { 
        jTypeWildcard0.generate(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // Ux
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      JNarrowedClass jNarrowedClass0 = new JNarrowedClass(jCodeModel0.NULL, ((AbstractJClass) jCodeModel0.NULL).EMPTY_ARRAY);
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jNarrowedClass0, eWildcardBoundMode0);
      jTypeWildcard0.generate(jFormatter0);
      assertEquals("?", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jCodeModel0.NULL, eWildcardBoundMode0);
      JTypeWildcard jTypeWildcard1 = new JTypeWildcard(jTypeWildcard0, eWildcardBoundMode0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "EbO<i,");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "EbO<i,");
      jTypeWildcard1.generate(jFormatter0);
      assertEquals("? extends ?", stringWriter0.toString());
  }
}
