/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 07:55:01 GMT 2019
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
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      Object object0 = new Object();
      int2ReferenceOpenHashMap0.put((-231), object0);
      Object object1 = int2ReferenceOpenHashMap0.put((-231), object0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      Int2ReferenceOpenHashMap<Integer> int2ReferenceOpenHashMap1 = new Int2ReferenceOpenHashMap<Integer>();
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap2 = new Int2ReferenceOpenHashMap<Object>(1, 1);
      int2ReferenceOpenHashMap2.put(1, int2ReferenceOpenHashMap1);
      int2ReferenceOpenHashMap2.put(3100, "Y;N<@#^`$#o5f.*n");
      Object object0 = int2ReferenceOpenHashMap2.put((-459), int2ReferenceOpenHashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      Object object0 = new Object();
      Object object1 = int2ReferenceOpenHashMap0.put((-2927), object0);
      int2ReferenceOpenHashMap0.maxFill = (-2927);
      int2ReferenceOpenHashMap0.put(1, object0);
      Object object2 = int2ReferenceOpenHashMap0.put(1, object1);
      assertSame(object0, object2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      Int2ReferenceOpenHashMap<Integer> int2ReferenceOpenHashMap1 = new Int2ReferenceOpenHashMap<Integer>();
      Integer integer0 = new Integer(1);
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap2 = new Int2ReferenceOpenHashMap<Object>(1, 1);
      int2ReferenceOpenHashMap2.put(1, int2ReferenceOpenHashMap1);
      int2ReferenceOpenHashMap2.put(3088, "Y;N<@,^`$#o5f.*n");
      int2ReferenceOpenHashMap2.put((-459), int2ReferenceOpenHashMap0);
      Object object0 = int2ReferenceOpenHashMap2.put(2, integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap1 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap1.put(0, int2ReferenceOpenHashMap0);
      Object object0 = int2ReferenceOpenHashMap1.put(0, int2ReferenceOpenHashMap0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>(1, 1);
      int2ReferenceOpenHashMap0.put(0, "Load factor must be greater than 0 and smaller than or equal to 1");
      Object object0 = int2ReferenceOpenHashMap0.put(3839, "R$_");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Int2ReferenceOpenHashMap<Integer> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Integer>();
      int2ReferenceOpenHashMap0.maxFill = (-507);
      int2ReferenceOpenHashMap0.size = (-507);
      Integer integer0 = new Integer((-507));
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put(1664, integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>(0, 1.0F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Int2ReferenceOpenHashMap<Integer> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Integer>(1, 1);
      int[] intArray0 = new int[9];
      intArray0[0] = (-2351);
      intArray0[1] = (-2351);
      int2ReferenceOpenHashMap0.key = intArray0;
      // Undeclared exception!
      int2ReferenceOpenHashMap0.put(1, (Integer) intArray0[4]);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Int2ReferenceOpenHashMap<Integer> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Integer>(1202, 1.0F);
      int2ReferenceOpenHashMap0.key = null;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put(1202, (Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.size = 2146185162;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put(1, "v");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Too large (2146185164 expected elements with load factor 0.75)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }
}
