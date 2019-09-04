/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 16:01:30 GMT 2019
 */

package org.springframework.samples.petclinic.owner;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.springframework.samples.petclinic.owner.OwnerController;
import org.springframework.samples.petclinic.owner.OwnerRepository;
import org.springframework.web.bind.WebDataBinder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class OwnerController_ESTest extends OwnerController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OwnerRepository ownerRepository0 = mock(OwnerRepository.class, new ViolatedAssumptionAnswer());
      OwnerController ownerController0 = new OwnerController(ownerRepository0);
      // Undeclared exception!
      try { 
        ownerController0.setAllowedFields((WebDataBinder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.samples.petclinic.owner.OwnerController", e);
      }
  }
}