/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 12:11:41 GMT 2019
 */

package org.owasp.html;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.owasp.html.HtmlElementTables;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class HtmlElementTables_ESTest extends HtmlElementTables_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[][][] intArray0 = new int[3][6][7];
      int[][] intArray1 = new int[4][5];
      int[] intArray2 = new int[6];
      intArray2[0] = 3369;
      intArray1[0] = intArray2;
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = null;
      try {
        htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[][][] intArray0 = new int[7][5][1];
      int[][] intArray1 = new int[5][0];
      int[] intArray2 = new int[1];
      intArray1[0] = intArray2;
      int[] intArray3 = new int[8];
      intArray3[0] = (int) (byte)54;
      intArray1[1] = intArray3;
      intArray1[2] = intArray3;
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = null;
      try {
        htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[][][] intArray0 = new int[2][3][2];
      intArray0[0] = null;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = null;
      try {
        htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[][] intArray0 = new int[8][7];
      int[] intArray1 = new int[9];
      intArray1[2] = (-1391);
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementToElements htmlElementTables_SparseElementToElements0 = null;
      try {
        htmlElementTables_SparseElementToElements0 = new HtmlElementTables.SparseElementToElements(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // [I@65abcd38
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[][] intArray0 = new int[9][0];
      int[] intArray1 = new int[4];
      intArray1[0] = (-1217);
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementToElements htmlElementTables_SparseElementToElements0 = null;
      try {
        htmlElementTables_SparseElementToElements0 = new HtmlElementTables.SparseElementToElements(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[][] intArray0 = new int[3][6];
      int[] intArray1 = new int[2];
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementToElements htmlElementTables_SparseElementToElements0 = null;
      try {
        htmlElementTables_SparseElementToElements0 = new HtmlElementTables.SparseElementToElements(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[][] intArray0 = new int[7][0];
      int[] intArray1 = new int[9];
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementToElements htmlElementTables_SparseElementToElements0 = null;
      try {
        htmlElementTables_SparseElementToElements0 = new HtmlElementTables.SparseElementToElements(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // [I@831d3d
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      HtmlElementTables.DenseElementBinaryMatrix htmlElementTables_DenseElementBinaryMatrix0 = null;
      try {
        htmlElementTables_DenseElementBinaryMatrix0 = new HtmlElementTables.DenseElementBinaryMatrix(booleanArray0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      HtmlElementTables.DenseElementBinaryMatrix htmlElementTables_DenseElementBinaryMatrix0 = null;
      try {
        htmlElementTables_DenseElementBinaryMatrix0 = new HtmlElementTables.DenseElementBinaryMatrix(booleanArray0, (-923));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      HtmlElementTables.HtmlElementNames htmlElementTables_HtmlElementNames0 = new HtmlElementTables.HtmlElementNames(linkedList0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "nav";
      stringArray0[1] = "";
      stringArray0[2] = "tr";
      stringArray0[3] = "]Fhm%#J*(z";
      HtmlElementTables.HtmlElementNames htmlElementTables_HtmlElementNames0 = new HtmlElementTables.HtmlElementNames(stringArray0);
      boolean[] booleanArray0 = new boolean[0];
      HtmlElementTables.DenseElementBinaryMatrix htmlElementTables_DenseElementBinaryMatrix0 = new HtmlElementTables.DenseElementBinaryMatrix(booleanArray0, 0);
      int[][] intArray0 = new int[0][0];
      HtmlElementTables.SparseElementToElements htmlElementTables_SparseElementToElements0 = new HtmlElementTables.SparseElementToElements(intArray0);
      int[][][] intArray1 = new int[5][2][8];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray1);
      byte[] byteArray0 = new byte[1];
      HtmlElementTables.TextContentModel htmlElementTables_TextContentModel0 = new HtmlElementTables.TextContentModel(byteArray0);
      HtmlElementTables.DenseElementSet htmlElementTables_DenseElementSet0 = new HtmlElementTables.DenseElementSet(booleanArray0);
      HtmlElementTables htmlElementTables0 = null;
      try {
        htmlElementTables0 = new HtmlElementTables(htmlElementTables_HtmlElementNames0, htmlElementTables_DenseElementBinaryMatrix0, htmlElementTables_DenseElementBinaryMatrix0, htmlElementTables_DenseElementBinaryMatrix0, htmlElementTables_SparseElementToElements0, htmlElementTables_SparseElementMultitable0, htmlElementTables_TextContentModel0, htmlElementTables_DenseElementSet0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
