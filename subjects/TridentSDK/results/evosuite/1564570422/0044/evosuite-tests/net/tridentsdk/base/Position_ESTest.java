/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 11:51:14 GMT 2019
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
      Position position0 = new Position(world0);
      Position position1 = position0.add(3398.5601767188, 473.87043896, 2230.7612096);
      assertEquals(0.0F, position1.getPitch(), 0.01F);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(2230, position1.getIntZ());
      assertEquals(473, position1.getIntY());
      assertEquals(0.0F, position0.getPitch(), 0.01F);
      assertEquals(3398.5601767188, position1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 3558, 3558, 3558);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 0.0, 0.2, 0.0, 1336.4F, 1.0F);
      assertEquals(1.0F, position0.getPitch(), 0.01F);
      assertEquals(256.40002F, position0.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, 0.0, 0.0, 0.0);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
  }
}
