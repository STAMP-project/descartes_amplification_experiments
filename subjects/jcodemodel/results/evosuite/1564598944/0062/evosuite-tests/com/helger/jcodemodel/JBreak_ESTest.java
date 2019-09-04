/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 19:57:09 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JBreak;
import com.helger.jcodemodel.JLabel;
import com.helger.jcodemodel.SourcePrintWriter;
import com.helger.jcodemodel.writer.JFormatter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JBreak_ESTest extends JBreak_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JBreak jBreak0 = new JBreak((JLabel) null);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "' ay not fbeTepaty!");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "' ay not fbeTepaty!");
      jBreak0.state(jFormatter0);
      assertEquals("break;' ay not fbeTepaty!", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JLabel jLabel0 = new JLabel("B>W");
      JBreak jBreak0 = new JBreak(jLabel0);
      StringWriter stringWriter0 = new StringWriter();
      SourcePrintWriter sourcePrintWriter0 = new SourcePrintWriter(stringWriter0, "B>W");
      JFormatter jFormatter0 = new JFormatter(sourcePrintWriter0, "B>W");
      jBreak0.state(jFormatter0);
      assertEquals("break B>W;B>W", stringWriter0.toString());
  }
}