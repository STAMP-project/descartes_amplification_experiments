/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 17:56:09 GMT 2019
 */

package net.tridentsdk.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import net.tridentsdk.base.Position;
import net.tridentsdk.world.World;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Position_ESTest extends Position_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      doReturn("T").when(world0).getName();
      Position position0 = new Position(world0);
      Position position1 = position0.divide(position0);
      assertEquals(Double.NaN, position1.getX(), 0.01);
      assertEquals(Double.NaN, position1.getY(), 0.01);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
      assertEquals(Double.NaN, position1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 2146022988, 2146022988, 2146022988);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 1.0, 1324.1472672024, 0.0, (-622.0F), (-622.0F));
      assertEquals((-82.0F), position0.getPitch(), 0.01F);
      assertEquals((-262.0F), position0.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 0.0, 0.0, 0.0);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
  }
}