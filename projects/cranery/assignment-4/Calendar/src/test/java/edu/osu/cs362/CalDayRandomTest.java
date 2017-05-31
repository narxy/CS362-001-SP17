package edu.osu.cs362;


import org.junit.Test;
import java.util.*;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
	private final static float SET_TO_NULL = 0.20f;
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 long startTime = Calendar.getInstance().getTimeInMillis();
 		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


 		 System.out.println("Start testing...");


 			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
 				long randomseed =System.currentTimeMillis();
 	//			System.out.println(" Seed:"+randomseed );
 				Random random = new Random(randomseed);
				GregorianCalendar cal = new GregorianCalendar(2017,3,22);
				CalDay day = new CalDay(cal);
				int startHour=ValuesGenerator.getRandomIntBetween(random,0,23);
				int startMinute=ValuesGenerator.getRandomIntBetween(random,0,59);
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
for (int i = 0; i < NUM_TESTS; i++) {
	startHour=ValuesGenerator.getRandomIntBetween(random,-20,30);
	startMinute=ValuesGenerator.getRandomIntBetween(random,-40,100);
	startDay=22;
	startMonth=3;
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
day.addAppt(appt);
		}

 				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 			        if((iteration%10000)==0 && iteration!=0 )
 			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

 			}


 		 System.out.println("Done testing...");
 	 }


	 }
