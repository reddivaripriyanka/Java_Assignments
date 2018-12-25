/*
  Write a Java application that displays today's date. You want the date to be displayed in the following format: week day, month, date, and year.

More specifically you want your Java application to display the date in the following manner:
 */

package com.capgemini.training.date;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.time.LocalDate;
import java.time.Month;

public class CurrentDate {
		String stringDate="";

		
		public String toString(SimpleDateFormat sdf) {
			String stringDate = sdf.format(new Date());
			
			return stringDate;
		
		}

}


