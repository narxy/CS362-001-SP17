package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;
import java.util.*;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {

    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
			long randomseed =System.currentTimeMillis();
//			System.out.println(" Seed:"+randomseed );
			Random random = new Random(randomseed);
LinkedList<Appt> apts= new LinkedList<Appt>();
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
				apts.add(appt);
				TimeTable week = new TimeTable();
				for (int i = 0; i < 10000; i++) {
					startHour=ValuesGenerator.getRandomIntBetween(random,0,23);
					startMinute=ValuesGenerator.getRandomIntBetween(random,0,59);
					startDay=ValuesGenerator.getRandomIntBetween(random,1,31);
					startMonth=ValuesGenerator.getRandomIntBetween(random,1,13);
					startYear=2017;
					title="Birthday Party";
					description="This is my birthday party.";
					appt = new Appt(startHour,
									 startMinute ,
									 startDay ,
									 startMonth ,
									 startYear ,
									 title,
									description);
				apts.add(appt);
				if(ValuesGenerator.getBoolean(.1f,random))
					week.deleteAppt(null,appt);
				else if(ValuesGenerator.getBoolean(.1f,random))
					week.deleteAppt(apts,null);
				else if(ValuesGenerator.getBoolean(.3f,random)){
					week.deleteAppt(apts,appt);
				}
				else{
					startHour=ValuesGenerator.getRandomIntBetween(random,0,23);
					startMinute=ValuesGenerator.getRandomIntBetween(random,0,59);
					startDay=ValuesGenerator.getRandomIntBetween(random,1,31);
					startMonth=ValuesGenerator.getRandomIntBetween(random,1,13);
					startYear=2017;
					title="Birthday Party";
					description="This is my birthday party.";
					appt = new Appt(startHour,
									 startMinute ,
									 startDay ,
									 startMonth ,
									 startYear ,
									 title,
									description);
					week.deleteAppt(apts,appt);
				}
		}


	 }

}
