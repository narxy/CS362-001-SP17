package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
			GregorianCalendar cal = new GregorianCalendar(2017,3,22);
			GregorianCalendar cai = new GregorianCalendar(2017,3,23);
			GregorianCalendar ca1 = new GregorianCalendar(2017,3,24);
			LinkedList<Appt> apts= new LinkedList<Appt>();
			LinkedList<CalDay> days = new LinkedList<CalDay>();
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
							CalDay day1 = new CalDay(cal);
							day1.addAppt(appt);
							days.add(day1);

apts.add(appt);
							startHour=7;
							startMinute=00;
							startDay=23;
							startMonth=3;
							startYear=2017;
							title="Dentist";
							description="Teeth cleaning.";
							appt = new Appt(startHour,
											 startMinute ,
											 startDay ,
											 startMonth ,
											 startYear ,
											 title,
											description);
											CalDay day2 = new CalDay(cai);
											day1.addAppt(appt);
											days.add(day2);
											apts.add(appt);
											startHour=20;
											startMinute=00;
											startDay=24;
											startMonth=3;
											startYear=2017;
											title="Dinner date";
											description="meet at orupa.";
											 appt = new Appt(startHour,
															 startMinute ,
															 startDay ,
															 startMonth ,
															 startYear ,
															 title,
															description);
															CalDay day3 = new CalDay(ca1);
															day1.addAppt(appt);
															days.add(day3);
															apts.add(appt);
										TimeTable week = new TimeTable();
										boolean thrown = false;

									  try {
									    week.getApptRange(apts,ca1,cal);
									  } catch (IllegalArgumentException e) {
									    thrown = true;
									  }
									  assertTrue(thrown);

										assertEquals(week.deleteAppt(apts,null),null);
										week.deleteAppt(apts,appt);
										assertEquals(apts.size(),2);
	 }

}
