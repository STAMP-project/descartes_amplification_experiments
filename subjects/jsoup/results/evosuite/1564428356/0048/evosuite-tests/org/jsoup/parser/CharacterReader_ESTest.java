/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 20:21:53 GMT 2019
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.CharacterReader;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class CharacterReader_ESTest extends CharacterReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.jsoup.parser.CharacterReader");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 1);
      char[] charArray0 = new char[9];
      characterReader0.consumeToAnySorted(charArray0);
      characterReader0.consumeToAnySorted(charArray0);
      characterReader0.consumeToAnySorted(charArray0);
      characterReader0.consumeToAnySorted(charArray0);
      characterReader0.consumeToAnySorted(charArray0);
      characterReader0.consumeToAnySorted(charArray0);
      characterReader0.consumeToAnySorted(charArray0);
      assertEquals(7, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringReader stringReader0 = new StringReader("BXJ^w;~xLKwJ >K");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 2);
      char[] charArray0 = new char[5];
      characterReader0.consumeToAnySorted(charArray0);
      characterReader0.consumeToAnySorted(charArray0);
      characterReader0.consumeToAnySorted(charArray0);
      characterReader0.consumeToAnySorted(charArray0);
      assertEquals(8, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".NS~kUS??U@WZVm");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      char[] charArray0 = new char[6];
      charArray0[2] = 'm';
      characterReader0.consumeToAnySorted(charArray0);
      char[] charArray1 = new char[9];
      characterReader0.consumeToAnySorted(charArray1);
      assertEquals(16, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringReader stringReader0 = new StringReader("MLoY>hgCjz=BV7H");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      char[] charArray0 = new char[4];
      charArray0[0] = '>';
      charArray0[1] = 'A';
      characterReader0.consumeToAnySorted(charArray0);
      assertEquals(4, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.jsoup.UncheckedIOException");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      char[] charArray0 = new char[6];
      charArray0[4] = 'c';
      characterReader0.consumeToAnySorted(charArray0);
      assertEquals(12, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("s{J\"+)(4EB*C");
      // Undeclared exception!
      try { 
        characterReader0.consumeToAnySorted((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringReader stringReader0 = new StringReader("BXJ^w;~xLKwJ >K");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 2);
      char[] charArray0 = new char[5];
      characterReader0.consumeToAnySorted(charArray0);
      charArray0[1] = ';';
      charArray0[2] = 'L';
      characterReader0.consumeToAnySorted(charArray0);
      characterReader0.consumeToAnySorted(charArray0);
      characterReader0.consumeToAnySorted(charArray0);
      assertEquals(6, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("Array must not contain any null objects");
      char[] charArray0 = new char[7];
      characterReader0.consumeToAnySorted(charArray0);
      characterReader0.consumeToAnySorted(charArray0);
      assertEquals(39, characterReader0.pos());
  }
}
