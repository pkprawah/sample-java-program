package com.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Test {
	public static void main(String args[]) throws Exception {
		// Vector

		// ArrayList

		// LinkedList

		// HashSet
		// Stack
		/*
		 * // Get calendar set to current date and time Calendar c =
		 * GregorianCalendar.getInstance();
		 * 
		 * System.out.println("Current week = " + Calendar.DAY_OF_WEEK);
		 * 
		 * // Set the calendar to monday of the current week
		 * c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		 * System.out.println("Current week = " + Calendar.DAY_OF_WEEK);
		 * 
		 * // Print dates of the current week starting on Monday DateFormat df =
		 * new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S", Locale.getDefault());
		 * String startDate = "", endDate = "";
		 * 
		 * startDate = df.format(c.getTime()); c.add(Calendar.DATE, 6); endDate
		 * = df.format(c.getTime());
		 * 
		 * System.out.println("Start Date = " + startDate);
		 * System.out.println("End Date = " + endDate);
		 */

		DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateAsString = "25/12/2010";
		Date date = sourceFormat.parse(dateAsString);
		System.out.println("End Date = " + date);
	}
}
