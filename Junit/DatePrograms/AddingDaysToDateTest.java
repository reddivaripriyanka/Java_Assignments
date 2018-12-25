/*
 Write a java program using class and object to accept a date in the string format dd/mm/yyyy. Check whether the date entered is valid or not. If it is valid, then input a certain number of days. Then calculate and print the future date after adding the given number of days if the future date is valid. If the date entered is invalid, then display a proper error message.
Example
Enter the date in (dd/mm/yyyy) format: 18/02/2014
Entered Date: 18/02/2014
Enter number of days after which future date is to be found: 2
Future Date : 20/2/2014
 */

package com.capgemini.training.date;

import static org.junit.Assert.*;

import java.time.LocalDate;

/*
 Write a java program using class and object to accept a date in the string format dd/mm/yyyy. Check whether the date entered is valid or not. If it is valid, then input a certain number of days. Then calculate and print the future date after adding the given number of days if the future date is valid. If the date entered is invalid, then display a proper error message.
Example
Enter the date in (dd/mm/yyyy) format: 18/02/2014
Entered Date: 18/02/2014
Enter number of days after which future date is to be found: 2
Future Date : 20/2/2014
 */

import org.junit.Test;

public class AddingDaysToDateTest {
	private AddingDaysToDate addingDays;
		@Test(expected=RuntimeException.class)
		public void test() {
			addingDays=new AddingDaysToDate();
			LocalDate date2 =  LocalDate.of(2018, 03, 32).plusDays(20);
			String resultDate=addingDays.findNewDate(date2);
			
		}
		@Test
		public void addingDays() {
			addingDays=new AddingDaysToDate();
			LocalDate date2 =  LocalDate.of(2018, 03, 14).plusDays(20);
			String resultDate=addingDays.findNewDate(date2);
			String expected="newdate 2018-04-03";
			assertEquals(expected, resultDate);
		}
}


