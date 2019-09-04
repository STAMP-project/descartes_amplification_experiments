/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 31 00:50:17 GMT 2019
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
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "yes";
      stringArray0[1] = "-rnqG>Qd1(";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -rnqG>Qd1(
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-$XY=8RzW>UD^";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -$XY=8RzW>UD^
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "org.apache.commons.cli.Options";
      stringArray0[1] = "zh<RhP3=&hil5F}";
      stringArray0[2] = "--le]";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --le]
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "org.apache.commons.cli.MissingArgumentException";
      stringArray0[1] = "H3FnC%i NH>";
      stringArray0[2] = "-J";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -J
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Unrecognized option: ";
      stringArray0[1] = "";
      stringArray0[2] = "r%3";
      stringArray0[3] = "";
      stringArray0[4] = "rnqG>Qd1(";
      stringArray0[5] = "--";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      defaultParser0.stopAtNonOption = true;
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      defaultParser0.skipParsing = true;
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "&M[V ZTH720T>/>nTm/";
      stringArray0[1] = "true";
      stringArray0[2] = "-";
      stringArray0[3] = "zlG%.";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "D)2(AGgKld7!/p";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "zlG%.";
      stringArray0[1] = "J";
      stringArray0[2] = "D)2(AGgKld7!/p";
      stringArray0[3] = "";
      stringArray0[4] = "-";
      stringArray0[5] = "true";
      stringArray0[6] = "";
      stringArray0[7] = "D)2(AGgKld7!/p";
      stringArray0[8] = "--$XY=8RzW>UD^";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --$XY=8RzW>UD^
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }
}