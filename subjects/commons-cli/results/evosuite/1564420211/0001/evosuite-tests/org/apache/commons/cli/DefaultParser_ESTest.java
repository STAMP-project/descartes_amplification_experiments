/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 29 17:12:36 GMT 2019
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DefaultParser_ESTest extends DefaultParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "OxnuaOT2/A823Z";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "OxnuaOT2/A823Z";
      stringArray0[5] = "";
      stringArray0[6] = "-[r`Lt$DDc";
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -[r`Lt$DDc
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[18];
      stringArray0[1] = "--5YZQtUA#H>YkE22tX[";
      stringArray0[0] = "-";
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --5YZQtUA#H>YkE22tX[
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "org.apache.commons.cli.Util";
      stringArray0[1] = "-h";
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -h
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-[r`LDDc";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[18];
      stringArray0[0] = "-";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser defaultParser0 = new DefaultParser(true);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "d87K?[%\")64)s";
      stringArray0[1] = "W";
      stringArray0[2] = "WzR~@CfFLsf#(za9";
      stringArray0[3] = "$.0<Ajj.d^'F$2";
      stringArray0[4] = "---";
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: ---
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "/Up7cA#_^2d(";
      stringArray0[1] = "Either opt or longOpt must be specified";
      stringArray0[2] = stringArray0[1];
      stringArray0[3] = "8 c{%?wHl5[Gz";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "org.apache.commons.cli.Option$1";
      stringArray0[8] = "--";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, false);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "->W-";
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: ->W-
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }
}
