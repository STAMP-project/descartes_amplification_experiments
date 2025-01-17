/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 14:28:07 GMT 2019
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
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.put((-807), "#@]W-[uV1qH!$*i`Hx|");
      int2ReferenceOpenHashMap0.maxFill = 1;
      String string0 = int2ReferenceOpenHashMap0.put(2231, "#@]W-[uV1qH!$*i`Hx|");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap0.put(4385, (Object) null);
      int2ReferenceOpenHashMap0.size = 1;
      int2ReferenceOpenHashMap0.mask = 1;
      int2ReferenceOpenHashMap0.size = 24;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put(4385, (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap0.mask = 4;
      Integer integer0 = new Integer(4);
      int2ReferenceOpenHashMap0.put(4, integer0);
      Object object0 = int2ReferenceOpenHashMap0.put(4, (Object) null);
      assertEquals(4, object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.mask = 0;
      int2ReferenceOpenHashMap0.put((-810), "FD:7H{\"g`Izpbbs!T`}");
      // Undeclared exception!
      int2ReferenceOpenHashMap0.put(2236, "");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.put(1172, "Load factor must be greater than 0 and smaller than or equal to 1");
      String string0 = int2ReferenceOpenHashMap0.put(710, "[W g>q^,:846\"v");
      assertNull(string0);
      
      String string1 = int2ReferenceOpenHashMap0.put(710, "");
      assertEquals("[W g>q^,:846\"v", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.put(0, "");
      String string0 = int2ReferenceOpenHashMap0.put(0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.size = 5702;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put(0, "cX)%r)vG:9ow09CF[c{");
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
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap0.size = (-13);
      int2ReferenceOpenHashMap0.maxFill = (-13);
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put((-13), int2ReferenceOpenHashMap0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Int2ReferenceOpenHashMap<Integer> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Integer>(0, 0.8337573F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.mask = 0;
      int2ReferenceOpenHashMap0.put((-810), "FD:7H{\"g`Izbbs!T`}");
      // Undeclared exception!
      int2ReferenceOpenHashMap0.put((-2976), "");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>();
      int2ReferenceOpenHashMap0.value = null;
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put(0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
      int2ReferenceOpenHashMap0.size = 976399737;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        int2ReferenceOpenHashMap0.put(164, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Too large (976399739 expected elements with load factor 0.75)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }
}
