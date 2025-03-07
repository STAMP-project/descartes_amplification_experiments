/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 22:19:19 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.JAtomDouble;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JFieldRef;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JOpUnary;
import com.helger.jcodemodel.JSwitch;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JSwitch_ESTest extends JSwitch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JAtomDouble jAtomDouble0 = new JAtomDouble(33);
      JSwitch jSwitch0 = new JSwitch(jAtomDouble0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "java.lang.Double.NEGATIVE_INFINITY");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "java.lang.Double.POSITIVE_INFINITY");
      jSwitch0.state(jFormatter0);
      assertEquals("switch (33.0) {java.lang.Double.NEGATIVE_INFINITY}java.lang.Double.NEGATIVE_INFINITY", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JLambda jLambda0 = new JLambda();
      JSwitch jSwitch0 = new JSwitch(jLambda0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "ykDQH~BFa'awD cH2,J");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "ykDQH~BFa'awD cH2,J");
      // Undeclared exception!
      try { 
        jSwitch0.state(jFormatter0);
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
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "w%N*PESh");
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jErrorClass0, eWildcardBoundMode0);
      JInvocation jInvocation0 = new JInvocation(jTypeWildcard0);
      JSwitch jSwitch0 = new JSwitch(jInvocation0);
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "w%N*PESh");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "w%N*PESh");
      // Undeclared exception!
      try { 
        jSwitch0.state(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // w%N*PESh
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JInvocation jInvocation0 = new JInvocation(jCodeModel0, jCodeModel0.DOUBLE, "s:witth(");
      JOpUnary jOpUnary0 = new JOpUnary("s:witth(", jInvocation0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "s:witth(");
      JSwitch jSwitch0 = new JSwitch(jOpUnary0);
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "s:witth(");
      jSwitch0.state(jFormatter0);
      assertEquals("switch (s:witth(double.s:witth(()) {s:witth(}s:witth(", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JDefinedClass jDefinedClass0 = new JDefinedClass(jCodeModel0, 0, (String) null);
      JFieldRef jFieldRef0 = new JFieldRef(jDefinedClass0, "iO@1w8iXg&R,B'w", true);
      JSwitch jSwitch0 = new JSwitch(jFieldRef0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "if (");
      // Undeclared exception!
      try { 
        jSwitch0.state(jFormatter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.JDefinedClass", e);
      }
  }
}
