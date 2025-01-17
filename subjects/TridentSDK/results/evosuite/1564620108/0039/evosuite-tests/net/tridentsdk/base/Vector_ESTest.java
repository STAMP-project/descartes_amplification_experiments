/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 01:34:23 GMT 2019
 */

package net.tridentsdk.base;

import org.junit.Test;
import static org.junit.Assert.*;
import net.tridentsdk.base.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Vector_ESTest extends Vector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector vector0 = new Vector((-989), (-989), (-989));
      assertEquals((-989), vector0.getIntY());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = new Vector(1.0, 1.0, 630.3575);
      assertEquals(1, vector0.getIntX());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = new Vector();
      Vector vector1 = new Vector(1.0, 1.0, 630.3575);
      Vector vector2 = vector1.multiply(vector0);
      assertTrue(vector2.equals((Object)vector0));
  }
}
