/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 19:47:24 GMT 2019
 */

package com.helger.jcodemodel.writer;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.JErrorClass;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JFormatter_ESTest extends JFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<JErrorClass> arrayList0 = new ArrayList<JErrorClass>();
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "2v<].sj7y ");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "2v<].sj7y ");
      jFormatter0.addDontImportClasses(arrayList0);
      assertFalse(jFormatter0.isDebugImports());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "2v<].sj7y ");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "2v<].sj7y ");
      jFormatter0.addDontImportClasses((Iterable<? extends AbstractJClass>) null);
      assertFalse(jFormatter0.isDebugImports());
  }
}
