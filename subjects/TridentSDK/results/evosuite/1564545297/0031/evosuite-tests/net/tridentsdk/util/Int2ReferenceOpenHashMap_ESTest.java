/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 04:37:27 GMT 2019
 */

package net.tridentsdk.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.tridentsdk.util.Int2ReferenceOpenHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Int2ReferenceOpenHashMap_ESTest extends Int2ReferenceOpenHashMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>(1, 1);
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      intArray0[1] = 1;
      int2ReferenceOpenHashMap0.key = intArray0;
      // Undeclared exception!
      int2ReferenceOpenHashMap0.remove((-462));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int[] intArray0 = new int[2];
      intArray0[0] = (-1489);
      int2ReferenceOpenHashMap0.key = intArray0;
      int2ReferenceOpenHashMap0.mask = 0;
      // Undeclared exception!
      int2ReferenceOpenHashMap0.remove((-277));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>(1, 1);
      int[] intArray0 = new int[11];
      intArray0[0] = (-1710);
      intArray0[1] = (-1710);
      int2ReferenceOpenHashMap0.key = intArray0;
      // Undeclared exception!
      int2ReferenceOpenHashMap0.remove((-1710));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int[] intArray0 = new int[6];
      intArray0[3] = 294;
      intArray0[4] = 1620;
      int2ReferenceOpenHashMap0.key = intArray0;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.remove(294);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 31
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.n = 0;
      int2ReferenceOpenHashMap0.containsNullKey = true;
      int2ReferenceOpenHashMap0.remove(0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = null;
      try {
        int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>(2146515440, 0.75F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Too large (2146515440 expected elements with load factor 0.75)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>(0, 1.0F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>(1, 1);
      int[] intArray0 = new int[2];
      intArray0[0] = (-1733);
      intArray0[1] = (-1733);
      int2ReferenceOpenHashMap0.key = intArray0;
      // Undeclared exception!
      int2ReferenceOpenHashMap0.remove((-1733));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap0.key = null;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.remove((-1474));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int[] intArray0 = new int[6];
      intArray0[2] = 1620;
      intArray0[3] = 294;
      intArray0[4] = 526;
      int2ReferenceOpenHashMap0.key = intArray0;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.remove(526);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 31
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int[] intArray0 = new int[6];
      intArray0[2] = 1620;
      intArray0[3] = 294;
      int2ReferenceOpenHashMap0.key = intArray0;
      Object object0 = int2ReferenceOpenHashMap0.remove(526);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>(1, 1);
      int[] intArray0 = new int[2];
      intArray0[1] = (-1733);
      int2ReferenceOpenHashMap0.key = intArray0;
      Object object0 = int2ReferenceOpenHashMap0.remove((-1733));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.containsNullKey = true;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.remove(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      Object object0 = int2ReferenceOpenHashMap0.remove(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Int2ReferenceOpenHashMap<Integer> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Integer>();
      Integer integer0 = int2ReferenceOpenHashMap0.remove((-329));
      assertNull(integer0);
  }
}