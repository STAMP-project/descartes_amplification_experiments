/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 14:30:11 GMT 2019
 */

package com.helger.jcodemodel;

import org.junit.Test;
import static org.junit.Assert.*;
import com.helger.jcodemodel.JArrayCompRef;
import com.helger.jcodemodel.JAtomLong;
import com.helger.jcodemodel.JForLoop;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class JForLoop_ESTest extends JForLoop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JForLoop jForLoop0 = new JForLoop();
      JAtomLong jAtomLong0 = new JAtomLong(0L);
      JArrayCompRef jArrayCompRef0 = new JArrayCompRef(jAtomLong0, jAtomLong0);
      jForLoop0.update(jArrayCompRef0);
  }
}
