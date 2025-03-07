/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 00:49:02 GMT 2019
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
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-8H|";
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -8H|
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "\tX DD-\"rfA~A1w_";
      stringArray0[1] = "1";
      stringArray0[2] = "=";
      stringArray0[3] = ",D!Wp/Rx}f";
      stringArray0[4] = "-8";
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -8
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-8H|";
      DefaultParser defaultParser0 = new DefaultParser();
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser defaultParser0 = new DefaultParser(false);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "S;d](#";
      stringArray0[2] = "-";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "NX1]IaNDGKu<AI]L}w";
      stringArray0[1] = "j";
      stringArray0[2] = "~N8SS/4!";
      stringArray0[3] = "--ol7ox-M,7x";
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --ol7ox-M,7x
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "--";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "-QnnTQY&x#";
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -QnnTQY&x#
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }
}
