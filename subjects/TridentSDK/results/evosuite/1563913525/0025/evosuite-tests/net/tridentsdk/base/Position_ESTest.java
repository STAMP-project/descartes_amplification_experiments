/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 21:03:31 GMT 2019
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
      doReturn((String) null).when(world0).getName();
      Position position0 = new Position(world0, (-833.538), (-833.538), (-833.538));
      Position position1 = position0.multiply(847.43, (-833.538), 0.0);
      assertEquals(694785.5974440001, position1.getY(), 0.01);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
      assertEquals(-0.0, position1.getZ(), 0.01);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
      assertEquals((-44148), position1.getChunkX());
      assertEquals(0.0F, position0.getPitch(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, (-1592), (-1592), (-1592));
      assertEquals(0.0F, position0.getPitch(), 0.01F);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 177.444233, 544.0, (-2585.0), 1319.0562F, (-1.0F));
      assertEquals((-1.0F), position0.getPitch(), 0.01F);
      assertEquals(239.05615F, position0.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
  }
}
