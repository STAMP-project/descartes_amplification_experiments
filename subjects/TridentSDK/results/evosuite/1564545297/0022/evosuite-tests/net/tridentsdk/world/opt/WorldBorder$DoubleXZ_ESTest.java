/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 04:22:20 GMT 2019
 */

package net.tridentsdk.world.opt;

import org.junit.Test;
import static org.junit.Assert.*;
import net.tridentsdk.world.opt.WorldBorder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class WorldBorder$DoubleXZ_ESTest extends WorldBorder$DoubleXZ_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ(1.0, 0.0);
      WorldBorder.DoubleXZ worldBorder_DoubleXZ1 = new WorldBorder.DoubleXZ(1.0, (-1956.376821));
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ1);
      assertFalse(boolean0);
      assertEquals(1.0, worldBorder_DoubleXZ1.getX(), 0.01);
      assertEquals((-1956.376821), worldBorder_DoubleXZ1.getZ(), 0.01);
      assertFalse(worldBorder_DoubleXZ1.equals((Object)worldBorder_DoubleXZ0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ(1.0, (-1140.2201));
      WorldBorder.DoubleXZ worldBorder_DoubleXZ1 = new WorldBorder.DoubleXZ(1360.9, (-1154.6226463));
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ1);
      assertFalse(boolean0);
      assertEquals((-1154.6226463), worldBorder_DoubleXZ1.getZ(), 0.01);
      assertEquals(1360.9, worldBorder_DoubleXZ1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ(6.000002848E7, (-2807.36));
      WorldBorder.DoubleXZ worldBorder_DoubleXZ1 = new WorldBorder.DoubleXZ(6.000002848E7, 6.000002848E7);
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ1);
      assertEquals(6.000002848E7, worldBorder_DoubleXZ0.getX(), 0.01);
      assertEquals(6.000002848E7, worldBorder_DoubleXZ1.getZ(), 0.01);
      assertFalse(worldBorder_DoubleXZ1.equals((Object)worldBorder_DoubleXZ0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ(6.000002848E7, (-2807.36));
      WorldBorder.DoubleXZ worldBorder_DoubleXZ1 = new WorldBorder.DoubleXZ((-2807.36), (-2807.36));
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ1);
      assertFalse(worldBorder_DoubleXZ1.equals((Object)worldBorder_DoubleXZ0));
      assertEquals((-2807.36), worldBorder_DoubleXZ1.getX(), 0.01);
      assertEquals((-2807.36), worldBorder_DoubleXZ0.getZ(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ(6.000002848E7, (-2807.36));
      WorldBorder.DoubleXZ worldBorder_DoubleXZ1 = new WorldBorder.DoubleXZ(6.000002848E7, (-2807.36));
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ1);
      assertTrue(boolean0);
      assertEquals(6.000002848E7, worldBorder_DoubleXZ1.getX(), 0.01);
      assertEquals((-2807.36), worldBorder_DoubleXZ1.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ(6.000002848E7, (-2807.36));
      boolean boolean0 = worldBorder_DoubleXZ0.equals(worldBorder_DoubleXZ0);
      assertTrue(boolean0);
      assertEquals((-2807.36), worldBorder_DoubleXZ0.getZ(), 0.01);
      assertEquals(6.000002848E7, worldBorder_DoubleXZ0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      WorldBorder.DoubleXZ worldBorder_DoubleXZ0 = new WorldBorder.DoubleXZ(1.0, (-1140.2201));
      boolean boolean0 = worldBorder_DoubleXZ0.equals("WorldBorder.DoubleXZ(x=");
      assertEquals(1.0, worldBorder_DoubleXZ0.getX(), 0.01);
      assertFalse(boolean0);
      assertEquals((-1140.2201), worldBorder_DoubleXZ0.getZ(), 0.01);
  }
}
