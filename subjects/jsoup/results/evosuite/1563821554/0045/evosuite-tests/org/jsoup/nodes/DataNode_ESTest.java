/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 19:50:16 GMT 2019
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.DataNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DataNode_ESTest extends DataNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataNode dataNode0 = new DataNode("#data", "p;[o^7-*@3s");
      assertEquals(0, dataNode0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataNode dataNode0 = new DataNode("M:<");
      assertEquals(0, dataNode0.siblingIndex());
  }
}
