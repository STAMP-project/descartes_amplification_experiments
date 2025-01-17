/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 09:13:18 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JArray;
import com.helger.jcodemodel.JAtomDouble;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JConditional;
import com.helger.jcodemodel.JEnumConstantRef;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.JErrorClassUsedException;
import com.helger.jcodemodel.JFieldRef;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JMods;
import com.helger.jcodemodel.JOpUnaryTight;
import com.helger.jcodemodel.JReferencedClass;
import com.helger.jcodemodel.JStringLiteral;
import com.helger.jcodemodel.JTypeWildcard;
import com.helger.jcodemodel.JVar;
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
      Class<String> class0 = String.class;
      JReferencedClass jReferencedClass0 = new JReferencedClass(jCodeModel0, class0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jReferencedClass0);
      JMods jMods0 = new JMods((-4009));
      JEnumConstantRef jEnumConstantRef0 = new JEnumConstantRef(jCodeModel0.NULL, "Bound");
      JVar jVar0 = new JVar(jMods0, jCodeModel0.INT, "Bound", jEnumConstantRef0);
      JFieldRef jFieldRef0 = new JFieldRef(jAnonymousClass0, jVar0, false);
      JConditional jConditional0 = new JConditional(jFieldRef0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, ";");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "Pfh<");
      // Undeclared exception!
      try { 
        jConditional0.state(jFormatter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.helger.jcodemodel.JDefinedClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JLambda jLambda0 = new JLambda();
      JConditional jConditional0 = new JConditional(jLambda0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, ":%O");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, ":%O");
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
      JCodeModel jCodeModel0 = new JCodeModel();
      JErrorClass jErrorClass0 = new JErrorClass(jCodeModel0, "", (String) null);
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.SUPER;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jErrorClass0, eWildcardBoundMode0);
      JEnumConstantRef jEnumConstantRef0 = new JEnumConstantRef(jTypeWildcard0, "");
      JArray jArray0 = new JArray(jTypeWildcard0, jEnumConstantRef0);
      JConditional jConditional0 = new JConditional(jArray0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "");
      // Undeclared exception!
      try { 
        jConditional0.state(jFormatter0);
        fail("Expecting exception: JErrorClassUsedException");
      
      } catch(JErrorClassUsedException e) {
         //
         // 
         //
         verifyException("com.helger.jcodemodel.JErrorClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JStringLiteral jStringLiteral0 = new JStringLiteral("com.helger.jcodemodel.JConditional");
      JOpUnaryTight jOpUnaryTight0 = new JOpUnaryTight("com.helger.jcodemodel.JConditional", jStringLiteral0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "com.helger.jcodemodel.JConditional");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "com.helger.jcodemodel.JConditional");
      JConditional jConditional0 = new JConditional(jOpUnaryTight0);
      jConditional0.state(jFormatter0);
      assertEquals("if com.helger.jcodemodel.JConditional\"com.helger.jcodemodel.JConditional\"{com.helger.jcodemodel.JConditional}com.helger.jcodemodel.JConditional", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JAtomDouble jAtomDouble0 = new JAtomDouble(0.0);
      JConditional jConditional0 = new JConditional(jAtomDouble0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "java.lang.Double.POSITIVE_INFINITY");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "java.lang.Double.NEGATIVE_INFINITY");
      jConditional0.state(jFormatter0);
      assertEquals("if (0.0) {java.lang.Double.POSITIVE_INFINITY}java.lang.Double.POSITIVE_INFINITY", stringWriter0.toString());
  }
}
