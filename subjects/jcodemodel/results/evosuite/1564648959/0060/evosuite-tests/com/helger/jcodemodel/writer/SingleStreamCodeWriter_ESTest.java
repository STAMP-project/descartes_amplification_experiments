/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 09:48:37 GMT 2019
 */

package com.helger.jcodemodel.writer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.helger.jcodemodel.writer.SingleStreamCodeWriter;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class SingleStreamCodeWriter_ESTest extends SingleStreamCodeWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 179);
      SingleStreamCodeWriter singleStreamCodeWriter0 = new SingleStreamCodeWriter(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        singleStreamCodeWriter0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("qLKb}62+Gd^Gg=e");
      SingleStreamCodeWriter singleStreamCodeWriter0 = new SingleStreamCodeWriter(mockPrintStream0, "qLKb}62+Gd^Gg=e");
      singleStreamCodeWriter0.close();
      assertEquals("qLKb}62+Gd^Gg=e", singleStreamCodeWriter0.getNewLine());
  }
}
