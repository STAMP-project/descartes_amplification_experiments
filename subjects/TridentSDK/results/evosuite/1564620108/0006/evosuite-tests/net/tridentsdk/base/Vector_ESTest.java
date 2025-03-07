/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 00:49:02 GMT 2019
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
      Vector vector0 = new Vector((-5), (-5), (-5));
      assertEquals((-5), vector0.getIntZ());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = new Vector(0, 1.0, 1.0);
      assertEquals(1.0, vector0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = new Vector();
      Vector vector1 = vector0.divide(vector0);
      assertEquals(Double.NaN, vector1.getY(), 0.01);
      assertEquals(Double.NaN, vector1.getX(), 0.01);
      assertEquals(Double.NaN, vector1.getZ(), 0.01);
  }
}
