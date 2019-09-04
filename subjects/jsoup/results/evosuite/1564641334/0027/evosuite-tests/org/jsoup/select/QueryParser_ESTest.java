/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 07:05:15 GMT 2019
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.MissingFormatArgumentException;
import java.util.UnknownFormatConversionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.select.Evaluator;
import org.jsoup.select.QueryParser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class QueryParser_ESTest extends QueryParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":matchesOwn(%s)");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":containsData(text) query must not be empty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":containsOwn(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Did not find balanced marker at ''
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":contains(text) query must not be empty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":has(el) subselect must not be empty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":lt(%d)");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Index must be numeric
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":nth-last-of-type(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse nth-index '': unexpected format
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("[^%s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse("[3/pM]Q7c*%O=z");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query '[3/pM]Q7c*%O=z': unexpected token at '%O=z'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("[%s^=%s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("6|");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse("0~f[ x``g0t>$A&C");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Did not find balanced marker at ' x``g0t>$A&C'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(">contains(text) querw must not be empty");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query 'contains(text)': unexpected token at '(text)'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("uX~B");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse("7>Df XX9^T.1");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query 'XX9^T.1': unexpected token at '^T.1'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":not(selector) subselect must not be empty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":matches(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Did not find balanced marker at ''
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse("Q[%'z(pS~iL");
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = '''
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse("JYZ[6z%aev,={\"a");
        fail("Expecting exception: MissingFormatArgumentException");
      
      } catch(MissingFormatArgumentException e) {
         //
         // Format specifier '%a'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("*|V");
      assertNotNull(evaluator0);
  }
}