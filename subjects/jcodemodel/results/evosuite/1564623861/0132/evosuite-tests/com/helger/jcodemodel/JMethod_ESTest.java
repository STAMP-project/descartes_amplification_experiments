/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 04:03:59 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.EWildcardBoundMode;
import com.helger.jcodemodel.JAnnotationUse;
import com.helger.jcodemodel.JAnonymousClass;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JTypeVar;
import com.helger.jcodemodel.JTypeWildcard;
import java.lang.annotation.Annotation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JMethod_ESTest extends JMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JTypeVar jTypeVar0 = new JTypeVar(jCodeModel0, "'x)y\"z[;DWu");
      EWildcardBoundMode eWildcardBoundMode0 = EWildcardBoundMode.EXTENDS;
      JTypeWildcard jTypeWildcard0 = new JTypeWildcard(jTypeVar0, eWildcardBoundMode0);
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jTypeWildcard0);
      JMethod jMethod0 = new JMethod(jAnonymousClass0, 1097, jCodeModel0.DOUBLE, "'x)y\"z[;DWu");
      assertEquals("'x)y\"z[;DWu", jMethod0.name());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JCodeModel jCodeModel0 = new JCodeModel();
      JAnonymousClass jAnonymousClass0 = new JAnonymousClass(jCodeModel0.NULL);
      JMethod jMethod0 = new JMethod(15, jAnonymousClass0);
      Class<Annotation> class0 = Annotation.class;
      JAnnotationUse jAnnotationUse0 = jMethod0.annotate(class0);
      assertFalse(jAnnotationUse0.hasAnnotationMembers());
  }
}
