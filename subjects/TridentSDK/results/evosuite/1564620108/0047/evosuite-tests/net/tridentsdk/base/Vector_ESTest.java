/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 01:43:05 GMT 2019
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
      Vector vector0 = new Vector();
      Vector vector1 = vector0.divide(0, 2222, 0);
      assertEquals(0.0, vector1.getY(), 0.01);
      assertEquals(Double.NaN, vector1.getX(), 0.01);
      assertEquals(Double.NaN, vector1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = new Vector();
      Vector vector1 = vector0.divide(0, 0, (-1));
      assertEquals(-0.0, vector1.getZ(), 0.01);
      assertEquals(Double.NaN, vector1.getX(), 0.01);
      assertEquals(Double.NaN, vector1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = new Vector(275, 275, 275);
      assertEquals(476.31397208144125, vector0.getMagnitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector vector0 = new Vector(0, 0.0, 2222);
      assertEquals(4937284.0, vector0.getMagnitudeSquared(), 0.01);
  }
}
