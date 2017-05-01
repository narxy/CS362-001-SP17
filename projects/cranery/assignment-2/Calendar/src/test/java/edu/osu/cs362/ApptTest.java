package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=33;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertFalse(appt.getValid());
	 }

	 @Test
		public void test03()  throws Throwable  {
		 int startHour=13;
		 int startMinute=-30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
							startMinute ,
							startDay ,
							startMonth ,
							startYear ,
							title,
						 description);
	// assertions
		 assertFalse(appt.getValid());
	 }

	 @Test
	  public void test04()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
	   appt.setStartHour(7);
		 appt.setStartMinute(12);
		 appt.setStartDay(29);
		 appt.setStartMonth(2);
		 appt.setStartYear(2016);
		 appt.setTitle("hehe xd");
		 appt.setDescription("best day ever");

		 assertEquals(7, appt.getStartHour());
		 assertEquals(12, appt.getStartMinute());
		 assertEquals(29, appt.getStartDay());
		 assertEquals(2, appt.getStartMonth());
		 assertEquals(2016, appt.getStartYear());
		 assertEquals("hehe xd", appt.getTitle());
		 assertEquals("best day ever", appt.getDescription());
	 }

@Test
	 public void test05() throws Throwable {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
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
						 int printableHour = appt.getStartHour();
						 if (printableHour > 11)
						 {
								 printableHour -= 12;
						 }
						 if (printableHour == 0)
						 {
								 printableHour = 12;
						 }
		 assertEquals("\t"+"4"+"/"+"10"+"/"+"2017" + " at "+"1"+":"+ "30" + "pm"+ " ," +  "Birthday Party"+ ", "+ "This is my birthday party."+"\n",appt.toString());
	 }
}
