/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 09:50:51 GMT 2019
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Tokeniser_ESTest extends Tokeniser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParseErrorList parseErrorList0 = new ParseErrorList(67, 18);
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.ScriptDataDoubleEscapeEnd;
      // Undeclared exception!
      try { 
        tokeniser0.error(tokeniserState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.Tokeniser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("(");
      ParseErrorList parseErrorList0 = new ParseErrorList(12, 12);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.ScriptDataEscapeStartDash;
      tokeniser0.error(tokeniserState0);
      assertEquals(1, parseErrorList0.size());
      assertFalse(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 3134);
      ParseErrorList parseErrorList0 = new ParseErrorList(3134, (-1213));
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.AttributeValue_doubleQuoted;
      tokeniser0.error(tokeniserState0);
      assertEquals(0, parseErrorList0.size());
      assertTrue(parseErrorList0.isEmpty());
  }
}
