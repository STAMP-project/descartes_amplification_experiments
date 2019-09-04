/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 07:33:48 GMT 2019
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.DocumentType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DocumentType_ESTest extends DocumentType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentType documentType0 = new DocumentType((String) null, "", "28OVA6", "PUBLIC");
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("SYSTEM", "L,^r@%MGi|O/B", (String) null, "SYSTEM");
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("             ", "             ", "             ", "             ", "             ");
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("SYSTEM", "PUBLIC", "             ");
      assertEquals("#doctype", documentType0.nodeName());
  }
}