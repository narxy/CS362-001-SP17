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
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
			assertTrue(appt.getValid());
	   appt.setStartHour(26);
		 assertFalse(appt.getValid());
		 appt.setStartHour(22);

		 appt.setStartMinute(75);
		 assertFalse(appt.getValid());
		 appt.setStartMinute(5);

		 appt.setStartDay(46);
		 assertFalse(appt.getValid());
		 appt.setStartDay(6);

		 appt.setStartMonth(17);
		 assertFalse(appt.getValid());
		 appt.setStartMonth(7);
		 appt.setStartYear(2016);
		 appt.setTitle("hehe xd");
		 appt.setDescription("best day ever");

		 assertEquals(22, appt.getStartHour());
		 assertEquals(5, appt.getStartMinute());
		 assertEquals(6, appt.getStartDay());
		 assertEquals(7, appt.getStartMonth());
		 assertEquals(2016, appt.getStartYear());
		 assertEquals("hehe xd", appt.getTitle());
		 assertEquals("best day ever", appt.getDescription());
	 }

@Test
	 public void test05() throws Throwable {
		 int startHour=12;
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
		 assertEquals("\t"+"4"+"/"+"10"+"/"+"2017" + " at "+"12"+":"+ "30" + "pm"+ " ," +  "Birthday Party"+ ", "+ "This is my birthday party."+"\n",appt.toString());
	 }


@Test
	 public void test06() throws Throwable {
		 int startHour=-1;
		 int startMinute=-1;
		 int startDay=-1;
		 int startMonth=-1;
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
assertFalse(appt.getValid());
}

@Test
	 public void test07() throws Throwable {
		 int startHour=25;
		 int startMinute=61;
		 int startDay=32;
		 int startMonth=13;
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
assertFalse(appt.getValid());
assertEquals(null,appt.toString());

}
@Test
	 public void test08() throws Throwable {
		 int startHour=0;
		 int startMinute=0;
		 int startDay=1;
		 int startMonth=1;
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
assertTrue(appt.getValid());
}
@Test
	 public void test09() throws Throwable {
		 int startHour=23;
		 int startMinute=59;
		 int startDay=31;
		 int startMonth=12;
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
assertTrue(appt.getValid());
}
@Test
	 public void test10() throws Throwable {
		 int startHour=11;
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
		 assertEquals("\t"+"4"+"/"+"10"+"/"+"2017" + " at "+"11"+":"+ "30" + "am"+ " ," +  "Birthday Party"+ ", "+ "This is my birthday party."+"\n",appt.toString());
	 }

}
