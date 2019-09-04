/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 11:46:13 GMT 2019
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
      Vector vector0 = new Vector(1947, 125, 1947);
      Vector vector1 = vector0.multiply(vector0);
      assertEquals(15625.0, vector1.getY(), 0.01);
      assertEquals(5361036.270124182, vector1.getMagnitude(), 0.01);
      assertEquals(3790809, vector1.getIntZ());
      assertEquals(3790809.0, vector1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector vector0 = new Vector(125, 706.536568, 125);
      assertEquals(125.0, vector0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector vector0 = new Vector();
      assertEquals(0, vector0.getIntZ());
  }
}