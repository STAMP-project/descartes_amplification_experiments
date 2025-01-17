/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 18:35:35 GMT 2019
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
      Vector vector0 = new Vector((-8), (-8), (-8));
      assertEquals((-8), vector0.getIntZ());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = new Vector(0, 0, 236.060629);
      assertEquals(0, vector0.getIntX());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = new Vector();
      Vector vector1 = vector0.add((-8), (-8), (-8));
      assertEquals((-8), vector1.getIntY());
      assertEquals((-8), vector1.getIntX());
      assertEquals(13.856406460551018, vector1.getMagnitude(), 0.01);
      assertEquals((-8.0), vector1.getZ(), 0.01);
  }
}
