/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 15:50:16 GMT 2019
 */

package org.owasp.html;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.owasp.html.Strings;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Strings_ESTest extends Strings_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('e', 'Z').when(charSequence0).charAt(anyInt());
      doReturn(4260, 1822).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, 91, charSequence0, (-1194), 82);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('|', '|', 'A', 'x').when(charSequence0).charAt(anyInt());
      doReturn(1410, 1410).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, 97, charSequence0, 705, 123);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('a', 'a', 'a', 'a', 'a').when(charSequence0).charAt(anyInt());
      doReturn(4260, 0).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, 91, charSequence0, (-1194), 82);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn(1335).when(charSequence0).length();
      CharSequence charSequence1 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(charSequence1).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, 700, charSequence1, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn(700, 0).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, 0, charSequence0, (-1), 700);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Strings.regionMatchesIgnoreCase((CharSequence) null, (-3053), (CharSequence) null, 122, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.owasp.html.Strings", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('Y', 'v').when(charSequence0).charAt(anyInt());
      doReturn(91, 91).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, (-2940), charSequence0, (-2940), 1288);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('X', '>').when(charSequence0).charAt(anyInt());
      doReturn(82, 91).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, (-2261), charSequence0, (-1194), 91);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('8').when(charSequence0).charAt(anyInt());
      doReturn((-170)).when(charSequence0).length();
      CharSequence charSequence1 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('(').when(charSequence1).charAt(anyInt());
      doReturn(0).when(charSequence1).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, (-1120), charSequence1, (-1120), 90);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('t', 'T', 't', '2').when(charSequence0).charAt(anyInt());
      doReturn(4260, 91).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, 91, charSequence0, (-1194), 82);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn('O', 'O', '{', 'O').when(charSequence0).charAt(anyInt());
      doReturn(1410, 1410).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, 97, charSequence0, 705, 123);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn(123).when(charSequence0).length();
      boolean boolean0 = Strings.regionMatchesIgnoreCase(charSequence0, 873, charSequence0, (-1297), 873);
      assertFalse(boolean0);
  }
}
