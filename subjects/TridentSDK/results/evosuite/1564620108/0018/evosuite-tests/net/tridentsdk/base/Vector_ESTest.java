/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 01:05:53 GMT 2019
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
      Vector vector0 = new Vector(0.0, 0.0, (-180.66082684116748));
      Vector vector1 = vector0.multiply((-3367), 0, (-3367));
      assertEquals(0.0, vector1.getY(), 0.01);
      assertEquals(-0.0, vector1.getX(), 0.01);
      assertEquals(608285, vector1.getIntZ());
      assertEquals(3.700106460599058E11, vector1.getMagnitudeSquared(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = new Vector(1, 1176, 0);
      Vector vector1 = vector0.multiply(0, (-3077), (-397));
      assertEquals(-0.0, vector1.getZ(), 0.01);
      assertEquals(0.0, vector1.getX(), 0.01);
      assertEquals(1.3093918576704E13, vector1.getMagnitudeSquared(), 0.01);
      assertEquals((-3618552.0), vector1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = new Vector();
      assertEquals(0, vector0.getIntZ());
  }
}
