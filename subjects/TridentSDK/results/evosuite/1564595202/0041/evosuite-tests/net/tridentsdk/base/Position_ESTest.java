/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 18:40:28 GMT 2019
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
      doReturn("8C[o k3<(F|)}igo").when(world0).getName();
      Position position0 = new Position(world0, (-804.18745), (-804.18745), (-804.18745));
      Position position1 = position0.subtract((-4022), (-4022), (-4022));
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(201, position1.getChunkZ());
      assertEquals(0.0F, position1.getPitch(), 0.01F);
      assertEquals(3217.81255, position1.getY(), 0.01);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
      assertEquals(3217.81255, position1.getX(), 0.01);
      assertEquals(0.0F, position1.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, (-4022), (-4022), (-4022));
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0, (-633.2176228300208), (-633.2176228300208), 0.0, 979.1F, 1.0F);
      assertEquals(1.0F, position0.getPitch(), 0.01F);
      assertEquals(259.09998F, position0.getYaw(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      World world0 = mock(World.class, new ViolatedAssumptionAnswer());
      Position position0 = new Position(world0);
      assertEquals(0.0F, position0.getYaw(), 0.01F);
      assertEquals(0.0F, position0.getPitch(), 0.01F);
  }
}
