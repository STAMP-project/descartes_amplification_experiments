/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 00:59:38 GMT 2019
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
      Position position0 = new Position(world0, 0, 0, 0);
      Position position1 = new Position(world0);
      boolean boolean0 = position0.equals(position1);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
      assertTrue(boolean0);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 0, 125, (-867));
      boolean boolean0 = position0.equals(position0);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
      assertTrue(boolean0);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 0, 0, 0);
      World world1 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position1 = new Position(world1);
      boolean boolean0 = position0.equals(position1);
      assertFalse(boolean0);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, (-31), (-31), (-31));
      World world1 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position1 = new Position(world1, (-31), (-31), (-0.3960654983359009), (-31), (-31));
      boolean boolean0 = position0.equals(position1);
      assertEquals((-31.0F), position1.getPitch(), 0.01F);
      assertEquals((-31.0F), position1.getYaw(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 0, 0, 0);
      World world1 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position1 = new Position(world1, 0, (-859.0146156046067), 0);
      boolean boolean0 = position0.equals(position1);
      assertFalse(boolean0);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 5.999997769639694E7, 5.999997769639694E7, 5.999997769639694E7, 2610.0F, 2610.0F);
      World world1 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position1 = new Position(world1, 2610.0F, 5.999997769639694E7, 5.999997769639694E7, 2610.0F, 2610.0F);
      boolean boolean0 = position0.equals(position1);
      assertEquals(90.0F, position1.getYaw(), 0.01F);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0);
      boolean boolean0 = position0.equals("=/!HT");
      assertFalse(boolean0);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
  }
}
