/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 15:59:59 GMT 2019
 */

package org.springframework.samples.petclinic.vet;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.samples.petclinic.vet.Specialty;
import org.springframework.samples.petclinic.vet.Vet;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Vet_ESTest extends Vet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vet vet0 = new Vet();
      Specialty specialty0 = new Specialty();
      vet0.addSpecialty(specialty0);
      assertTrue(vet0.isNew());
  }
}
