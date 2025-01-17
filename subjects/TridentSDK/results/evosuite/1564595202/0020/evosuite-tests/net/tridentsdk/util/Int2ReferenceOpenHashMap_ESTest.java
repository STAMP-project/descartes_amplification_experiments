/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 18:11:48 GMT 2019
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
  public void test0()  throws Throwable  {
      Int2ReferenceOpenHashMap<String> int2ReferenceOpenHashMap0 = null;
      try {
        int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<String>(2147483610, 0.21013004F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Too large (2147483610 expected elements with load factor 0.21013004)
         //
         verifyException("net.tridentsdk.util.Int2ReferenceOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>(0, 1.0F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Int2ReferenceOpenHashMap<Object> int2ReferenceOpenHashMap0 = new Int2ReferenceOpenHashMap<Object>();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = Int2ReferenceOpenHashMap.maxFill(1162, 0.0F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = Int2ReferenceOpenHashMap.maxFill(1162, 0.75F);
      assertEquals(872, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = Int2ReferenceOpenHashMap.maxFill(0, 0.0F);
      assertEquals((-1), int0);
  }
}
