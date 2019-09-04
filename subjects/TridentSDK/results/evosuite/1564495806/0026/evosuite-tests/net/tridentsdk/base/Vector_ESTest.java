/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 14:44:17 GMT 2019
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
      Vector vector0 = new Vector((-2260), (-2300), (-2260));
      Vector vector1 = vector0.multiply(0.0, (-1.0), (-1238.52269657));
      assertEquals(-0.0, vector1.getX(), 0.01);
      assertEquals(2300.0, vector1.getY(), 0.01);
      assertEquals(7.834749418958408E12, vector1.getMagnitudeSquared(), 0.01);
      assertEquals(2799061, vector1.getIntZ());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = new Vector(3118.97307956781, 4276.011935121042, (-2260));
      assertEquals(3.311987114036631E7, vector0.getMagnitudeSquared(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = new Vector();
      assertEquals(0.0, vector0.getY(), 0.01);
  }
}