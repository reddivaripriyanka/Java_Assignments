/*
 *Write a Program in Java using class and object to input a Date in ddmmyyyy 8-digit format and print it in:

1) dd/mm/yyyy format
2) dd, month name, yyyy format

Example
1) Enter any date in 8 digits (ddmmyyyy) format: 02052013
Date in dd/mm/yyyy format = 02/05/2013
Date in dd, month name, yyyy format = 02 May, 2013
2) Enter any date in 8 digits (ddmmyyyy) format: 12111963
Date in dd/mm/yyyy format = 12/11/1963
Date in dd, month name, yyyy format = 
12 November, 1963
3) Enter any date in 8 digits (ddmmyyyy) format: 252013
Wrong Input
4) Enter any date in 8 digits (ddmmyyyy) format: 29022013
The day, month or year are outside acceptable limit

 */
package com.capgemini.training.date;

import static org.junit.Assert.*;

import org.junit.Test;

public class DatePrintTest {
private DatePrint date;
	@Test
	public void test() {
		date=new DatePrint();
		String result=date.isString("30102018");
		assertEquals("30/10/2018\n30 October, 2018",result);
	}

}
