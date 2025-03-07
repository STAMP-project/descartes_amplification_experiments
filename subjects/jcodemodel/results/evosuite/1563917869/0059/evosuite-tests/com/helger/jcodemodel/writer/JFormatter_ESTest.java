/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 22:49:27 GMT 2019
 */

package com.helger.jcodemodel.writer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.IJClassContainer;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
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
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(jDefinedClass0).isPackage();
      JPackage jPackage0 = mock(JPackage.class, new ViolatedAssumptionAnswer());
      JCodeModel jCodeModel0 = mock(JCodeModel.class, new ViolatedAssumptionAnswer());
      doReturn(jPackage0).when(jCodeModel0)._package(anyString());
      JDefinedClass jDefinedClass1 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      JDefinedClass jDefinedClass2 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass2).owner();
      doReturn("").when(jDefinedClass2).toString();
      doReturn("").when(jDefinedClass2).name();
      doReturn(jDefinedClass0, (IJClassContainer) null).when(jDefinedClass2).parentContainer();
      doReturn(false).when(jDefinedClass2).hasHeaderComment();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      // Undeclared exception!
      try { 
        jFormatter0.writeClassFull(jDefinedClass2);
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
      StringWriter stringWriter0 = new StringWriter();
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(jDefinedClass0).isPackage();
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass1 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass1).owner();
      doReturn("").when(jDefinedClass1).toString();
      doReturn("").when(jDefinedClass1).name();
      doReturn(jDefinedClass0).when(jDefinedClass1).parentContainer();
      doReturn(true).when(jDefinedClass1).hasHeaderComment();
      doReturn((JDocComment) null).when(jDefinedClass1).headerComment();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      // Undeclared exception!
      try { 
        jFormatter0.writeClassFull(jDefinedClass1);
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
      StringWriter stringWriter0 = new StringWriter();
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jDefinedClass0).isPackage();
      JDefinedClass jDefinedClass1 = mock(JDefinedClass.class, new ViolatedAssumptionAnswer());
      doReturn(jCodeModel0).when(jDefinedClass1).owner();
      doReturn("qpPJw]=*}gkiP").when(jDefinedClass1).toString();
      doReturn("qpPJw]=*}gkiP").when(jDefinedClass1).name();
      doReturn(jDefinedClass0).when(jDefinedClass1).parentContainer();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "qpPJw]=*}gkiP");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "qpPJw]=*}gkiP");
      // Undeclared exception!
      try { 
        jFormatter0.writeClassFull(jDefinedClass1);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // this method is only for a pacakge-level class
         //
      }
  }
}
