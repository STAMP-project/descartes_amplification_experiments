/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 20:25:30 GMT 2019
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
      Object object0 = int2ReferenceOpenHashMap0.put(0, ";Z");
      int2ReferenceOpenHashMap0.maxFill = (-601);
      int2ReferenceOpenHashMap0.put((-601), ";Z");
      int2ReferenceOpenHashMap0.put(290, object0);
      Object object1 = int2ReferenceOpenHashMap0.put((-1630), object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap1 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap1.put(0, int2ReferenceOpenHashMap0);
      int2ReferenceOpenHashMap1.n = 0;
      Object object0 = int2ReferenceOpenHashMap1.put(0, "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      Object object0 = int2ReferenceOpenHashMap0.put(0, ";Z");
      int2ReferenceOpenHashMap0.maxFill = (-601);
      int2ReferenceOpenHashMap0.put((-601), object0);
      int2ReferenceOpenHashMap0.put((-1630), (Object) null);
      Integer integer0 = new Integer(6);
      Object object1 = int2ReferenceOpenHashMap0.put((-1630), integer0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      Object object0 = int2ReferenceOpenHashMap0.put(0, ";Z");
      int2ReferenceOpenHashMap0.maxFill = (-601);
      int2ReferenceOpenHashMap0.put((-601), object0);
      int2ReferenceOpenHashMap0.put((-1630), (Object) null);
      Object object1 = int2ReferenceOpenHashMap0.put(1566, (Object) null);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap0.size = (-4112);
      int2ReferenceOpenHashMap0.maxFill = (-4112);
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put(979, "qNP");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>(0, 1.0F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap1 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap1.put(0, int2ReferenceOpenHashMap0);
      Object object0 = int2ReferenceOpenHashMap1.put(0, (Object) null);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Int2ReferenceOpenHashMap<Integer> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Integer>(1, 1);
      Integer integer0 = new Integer((-2851));
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap1 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap1.mask = 1;
      Object object0 = int2ReferenceOpenHashMap1.put(2960, integer0);
      int2ReferenceOpenHashMap1.put(787, int2ReferenceOpenHashMap0);
      // Undeclared exception!
      int2ReferenceOpenHashMap1.put((-815), object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap1 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.key = null;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put(809, int2ReferenceOpenHashMap1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      Object object0 = int2ReferenceOpenHashMap0.put(0, ";Z");
      int2ReferenceOpenHashMap0.size = 2058005162;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put(290, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Too large (2058005164 expected elements with load factor 0.75)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      String[] stringArray0 = new String[6];
      int2ReferenceOpenHashMap0.value = stringArray0;
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap1 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap1.value = (Object[]) int2ReferenceOpenHashMap0.value;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap1.put((-4113), object0);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // java.lang.Object
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap0.put((-1630), (Object) null);
      Integer integer0 = new Integer(6);
      Object object0 = int2ReferenceOpenHashMap0.put((-1630), integer0);
      assertNull(object0);
  }
}
