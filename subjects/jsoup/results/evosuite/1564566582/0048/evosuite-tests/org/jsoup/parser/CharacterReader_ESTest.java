/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 10:41:47 GMT 2019
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
      CharacterReader characterReader0 = new CharacterReader("J%e>EHl+CPx(");
      char[] charArray0 = new char[5];
      characterReader0.consumeToAnySorted(charArray0);
      assertEquals(12, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("org.jsoup.UncheckedIOException");
      char[] charArray0 = new char[9];
      charArray0[6] = 'x';
      characterReader0.consumeToAnySorted(charArray0);
      char[] charArray1 = new char[0];
      characterReader0.consumeToAnySorted(charArray1);
      assertEquals(30, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("j$3cL9_RHk~Pq");
      char[] charArray0 = new char[3];
      charArray0[0] = '_';
      charArray0[1] = 't';
      characterReader0.consumeToAnySorted(charArray0);
      assertEquals(6, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.jsoup.parser.CharacterReader");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 1);
      char[] charArray0 = new char[0];
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
  public void test4()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("org.jsoup.parser.CharacterReader");
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
  public void test5()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Array must not contain any null objects");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      char[] charArray0 = new char[7];
      characterReader0.consumeToAnySorted(charArray0);
      characterReader0.consumeToAnySorted(charArray0);
      assertEquals(39, characterReader0.pos());
  }
}
