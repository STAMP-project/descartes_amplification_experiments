/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 21:09:52 GMT 2019
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
      Vector vector0 = new Vector((-3834), (-3834), (-3834));
      assertEquals((-3834.0), vector0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = new Vector(6.0E7, 6.0E7, 6.0E7);
      assertEquals(1.08E16, vector0.getMagnitudeSquared(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = new Vector();
      Vector vector1 = vector0.divide(vector0);
      assertEquals(Double.NaN, vector1.getZ(), 0.01);
      assertEquals(Double.NaN, vector1.getX(), 0.01);
      assertEquals(Double.NaN, vector1.getY(), 0.01);
  }
}