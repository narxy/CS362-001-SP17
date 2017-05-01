package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
				GregorianCalendar cal = new GregorianCalendar(2017,3,22);
				CalDay day = new CalDay(cal);
				int startHour=13;
				int startMinute=30;
				int startDay=22;
				int startMonth=3;
				int startYear=2017;
				String title="Birthday Party";
				String description="This is my birthday party.";
				Appt appt = new Appt(startHour,
								 startMinute ,
								 startDay ,
								 startMonth ,
								 startYear ,
								 title,
								description);
								day.addAppt(appt);

								assertEquals(1, day.getSizeAppts());
								assertEquals(22, day.getDay());
								assertEquals(3, day.getMonth());
								assertEquals(2017, day.getYear());
								assertTrue(day.isValid());

	 }

	 @Test
		public void test02()  throws Throwable  {
				GregorianCalendar cal = new GregorianCalendar(2017,3,22);
				CalDay day = new CalDay(cal);
				int startHour=13;
				int startMinute=30;
				int startDay=22;
				int startMonth=3;
				int startYear=2017;
				String title="Birthday Party";
				String description="This is my birthday party.";
				Appt appt = new Appt(startHour,
								 startMinute ,
								 startDay ,
								 startMonth ,
								 startYear ,
								 title,
								description);

								day.addAppt(appt);

								String todayDate = (day.getMonth()) + "/" + day.getDay() + "/" + day.getYear();

 assertEquals(day.toString(),"\t --- " +todayDate+" --- \n"+" --- -------- Appointments ------------ --- \n"+appt.toString()+" \n");


	 }

}
