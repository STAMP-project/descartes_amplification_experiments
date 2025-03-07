/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 17:06:14 GMT 2019
 */

package org.springframework.samples.petclinic.owner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.samples.petclinic.owner.PetValidator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class PetValidator_ESTest extends PetValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PetValidator petValidator0 = new PetValidator();
      Class<Pet> class0 = Pet.class;
      boolean boolean0 = petValidator0.supports(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PetValidator petValidator0 = new PetValidator();
      // Undeclared exception!
      try { 
        petValidator0.supports((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PetValidator petValidator0 = new PetValidator();
      Class<String> class0 = String.class;
      boolean boolean0 = petValidator0.supports(class0);
      assertFalse(boolean0);
  }
}
