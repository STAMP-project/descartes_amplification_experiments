/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 30 21:34:18 GMT 2019
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
      Vector vector0 = new Vector(5, 5, (-1640));
      Vector vector1 = vector0.multiply((-1430.8326255), (-1430.8326255), 2549.20705491993);
      assertEquals((-4180699.5700686853), vector1.getZ(), 0.01);
      assertEquals(4180711.812511429, vector1.getMagnitude(), 0.01);
      assertEquals((-7154.1631275), vector1.getX(), 0.01);
      assertEquals((-7154.1631275), vector1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = new Vector(729.01035762815, 1.0, 2549.20705491993);
      assertEquals(2549, vector0.getIntZ());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = new Vector();
      assertEquals(0.0, vector0.getX(), 0.01);
  }
}
