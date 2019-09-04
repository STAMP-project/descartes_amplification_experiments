/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 05:03:31 GMT 2019
 */

package com.helger.jcodemodel.writer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.IJClassContainer;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JDirectClass;
import com.helger.jcodemodel.JDocComment;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JFormatter_ESTest extends JFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "Error on Writer: ");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "IndentString");
      JCodeModel jCodeModel0 = new JCodeModel();
      IJClassContainer<JDefinedClass> iJClassContainer0 = (IJClassContainer<JDefinedClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iJClassContainer0).isPackage();
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass0).owner();
      doReturn("IndentString").when(jDefinedClass0).toString();
      doReturn("Error on Writer: ").when(jDefinedClass0).name();
      doReturn(iJClassContainer0, (IJClassContainer) null).when(jDefinedClass0).parentContainer();
      doReturn(false).when(jDefinedClass0).hasHeaderComment();
      // Undeclared exception!
      try { 
        jFormatter0.writeClassFull(jDefinedClass0);
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
      JPackage jPackage0 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      JCodeModel jCodeModel0 = mock(JCodeModel.class, new ViolatedAssumptionAnswer());
      doReturn(jPackage0).when(jCodeModel0)._package(anyString());
      IJClassContainer<JDefinedClass> iJClassContainer0 = (IJClassContainer<JDefinedClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iJClassContainer0).isPackage();
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass0).owner();
      doReturn("Error on WrztZ4er: ").when(jDefinedClass0).toString();
      doReturn("Error on WrztZ4er: ").when(jDefinedClass0).name();
      doReturn(iJClassContainer0).when(jDefinedClass0).parentContainer();
      doReturn(true).when(jDefinedClass0).hasHeaderComment();
      doReturn((JDocComment) null).when(jDefinedClass0).headerComment();
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "Error on WrztZ4er: ");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "Error on WrztZ4er: ");
      // Undeclared exception!
      try { 
        jFormatter0.writeClassFull(jDefinedClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.writer.JFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      IJClassContainer<JDirectClass> iJClassContainer0 = (IJClassContainer<JDirectClass>) mock(IJClassContainer.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iJClassContainer0).isPackage();
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass0).owner();
      doReturn("#>pLK8").when(jDefinedClass0).toString();
      doReturn("#>pLK8").when(jDefinedClass0).name();
      doReturn(iJClassContainer0).when(jDefinedClass0).parentContainer();
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "#>pLK8");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "#>pLK8");
      // Undeclared exception!
      try { 
        jFormatter0.writeClassFull(jDefinedClass0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // this method is only for a pacakge-level class
         //
      }
  }
}