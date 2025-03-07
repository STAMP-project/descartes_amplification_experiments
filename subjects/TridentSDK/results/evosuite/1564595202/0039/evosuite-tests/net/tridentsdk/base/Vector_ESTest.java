/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 18:38:03 GMT 2019
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
      Vector vector0 = new Vector((-38), (-38), (-38));
      Vector vector1 = vector0.multiply(vector0);
      assertEquals(6255408.0, vector1.getMagnitudeSquared(), 0.01);
      assertEquals(1444.0, vector1.getZ(), 0.01);
      assertEquals(1444.0, vector1.getY(), 0.01);
      assertEquals(1444.0, vector1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = new Vector((-2466.1975770856766), (-2466.1975770856766), 1055.436109055682);
      assertEquals((-2466.1975770856766), vector0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = new Vector();
      assertEquals(0, vector0.getIntZ());
  }
}
