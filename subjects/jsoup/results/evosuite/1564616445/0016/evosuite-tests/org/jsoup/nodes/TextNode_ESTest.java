/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 23:59:25 GMT 2019
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.TextNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class TextNode_ESTest extends TextNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TextNode textNode0 = new TextNode("FSxw-dp%`Dj_foHd$", "p]xIpN66vH\"g2zJ&");
      assertFalse(textNode0.hasParent());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TextNode textNode0 = new TextNode("Insert position out of bounds.");
      assertEquals("#text", textNode0.nodeName());
  }
}
