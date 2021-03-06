/*
 * This file was automatically generated by EvoSuite
 * Mon May 15 23:43:33 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.osu.cs362.Appt;
import edu.osu.cs362.CalDay;
import edu.osu.cs362.TimeTable;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimeTable_ESTest extends TimeTable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      Appt appt0 = new Appt(1, 0, 0, 12, 1, "+", "+");
      linkedList0.add(appt0);
      Appt appt1 = new Appt(1, 1, 1, 0, 1444, "", "");
      linkedList0.add(appt1);
      appt1.setStartMonth(1);
      timeTable0.deleteAppt(linkedList0, appt1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      // Undeclared exception!
      try { 
        timeTable0.getApptRange((LinkedList<Appt>) null, (GregorianCalendar) null, (GregorianCalendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.TimeTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0);
      mockGregorianCalendar0.setLenient(false);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "InvalidXGCRepresentation");
      Locale locale0 = Locale.PRC;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((TimeZone) simpleTimeZone0, locale0);
      // Undeclared exception!
      try { 
        timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         assertThrownBy("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      Appt appt0 = new Appt(1, 1, 1, 0, 1444, "", "");
      linkedList0.add((Appt) null);
      appt0.setStartMonth(1);
      // Undeclared exception!
      try { 
        timeTable0.deleteAppt(linkedList0, appt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.TimeTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      Appt appt0 = new Appt(1, 0, 0, 12, 1, "+", "+");
      linkedList0.add(appt0);
      Appt appt1 = new Appt(1, 1, 1, 0, 1444, "", "");
      appt1.setStartMonth(1);
      timeTable0.deleteAppt(linkedList0, appt1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      LinkedList<Appt> linkedList0 = calDay0.appts;
      Appt appt0 = new Appt(1, 1, 1, 1, 2057, "%h:%m:%s%z", "");
      linkedList0.add(appt0);
      timeTable0.deleteAppt(linkedList0, appt0);
      assertEquals(0, linkedList0.size());
      assertEquals(0, calDay0.getSizeAppts());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, (Appt) null);
      assertNull(linkedList1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      Appt appt0 = new Appt(0, 3, 1864, 145, 5, "", "InvalidXGCRepresentation");
      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, appt0);
      assertNull(linkedList1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      Appt appt0 = new Appt(1, 1, 1321, 109, 109, "InvalidXGCValue-fractional", "InvalidXGCValue-fractional");
      LinkedList<Appt> linkedList0 = timeTable0.deleteAppt((LinkedList<Appt>) null, appt0);
      assertNull(linkedList0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        timeTable0.getApptRange((LinkedList<Appt>) null, mockGregorianCalendar0, mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Second date specified is not before the first date specified.
         //
         assertThrownBy("edu.osu.cs362.TimeTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "InvalidXGCRepresentation");
      Locale locale0 = Locale.PRC;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((TimeZone) simpleTimeZone0, locale0);
      // Undeclared exception!
      try { 
        timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar1);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }
}
