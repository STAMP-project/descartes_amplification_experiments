/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 02:51:59 GMT 2019
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 65533);
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.AfterAttributeName;
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
      CharacterReader characterReader0 = new CharacterReader("");
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 8482);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.RawtextEndTagName;
      tokeniser0.error(tokeniserState0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParseErrorList parseErrorList0 = new ParseErrorList(2123, 0);
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.ScriptDataEscapeStart;
      tokeniser0.error(tokeniserState0);
  }
}
