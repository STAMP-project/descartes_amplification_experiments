/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 20:36:06 GMT 2019
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
      doReturn("vE+XW(").when(world0).getName();
      Position position0 = new Position(world0, (-2141534941), (-2141534941), (-2141534941));
      Position position1 = position0.divide(position0);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
      assertEquals(1.0, position1.getZ(), 0.01);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(1.0, position1.getY(), 0.01);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
      assertEquals(1.0, position1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, (-3831.0567198), (-3831.0567198), (-3831.0567198), 1335.2F, 0.0F);
      assertEquals(255.19995F, position0.getYaw(), 0.01F);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, (double) (-2141534941), (double) (-2141534941), (double) (-2141534941));
      assertEquals(0.0F, position0.getPitch(), 0.01F);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
  }
}