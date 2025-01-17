/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 15:51:38 GMT 2019
 */

package org.owasp.html;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.owasp.html.HtmlElementTables;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class HtmlElementTables$SparseElementMultitable_ESTest extends HtmlElementTables$SparseElementMultitable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[][][] intArray0 = new int[12][1][7];
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      int[] intArray1 = htmlElementTables_SparseElementMultitable0.getElementIndexList(1, 0);
      assertEquals(6, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[][][] intArray0 = new int[2][1][0];
      int[][] intArray1 = new int[1][1];
      int[] intArray2 = new int[4];
      intArray2[0] = (-140);
      intArray1[0] = intArray2;
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      int[] intArray3 = htmlElementTables_SparseElementMultitable0.getElementIndexList(0, (-140));
      assertArrayEquals(new int[] {0, 0, 0}, intArray3);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[][][] intArray0 = new int[1][2][7];
      int[][] intArray1 = new int[1][8];
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      int[] intArray2 = htmlElementTables_SparseElementMultitable0.getElementIndexList(41, 0);
      assertEquals(0, intArray2.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[][][] intArray0 = new int[1][2][7];
      int[][] intArray1 = new int[1][8];
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      // Undeclared exception!
      try { 
        htmlElementTables_SparseElementMultitable0.getElementIndexList((-813), (-813));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -813
         //
         verifyException("org.owasp.html.HtmlElementTables$SparseElementMultitable", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[][][] intArray0 = new int[1][2][7];
      int[][] intArray1 = new int[1][8];
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      int[] intArray2 = htmlElementTables_SparseElementMultitable0.getElementIndexList(0, 404);
      assertEquals(0, intArray2.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[][][] intArray0 = new int[1][2][7];
      int[][] intArray1 = new int[1][8];
      intArray0[0] = intArray1;
      HtmlElementTables.SparseElementMultitable htmlElementTables_SparseElementMultitable0 = new HtmlElementTables.SparseElementMultitable(intArray0);
      int[] intArray2 = htmlElementTables_SparseElementMultitable0.getElementIndexList(1, 3392);
      assertArrayEquals(new int[] {}, intArray2);
  }
}
