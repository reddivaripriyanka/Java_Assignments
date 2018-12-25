package com.capgemini.training.date;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class DaysAliveTest {
	private DaysAlive daysAlive;

	@Test
	public void daysAlivetest() {
		daysAlive=new DaysAlive();
		LocalDate dateBefore = LocalDate.of(1997, Month.APRIL, 20);
	
		long numberOfDays=daysAlive.numberOfDaysAlive(dateBefore);
		assertEquals(7919,numberOfDays);
		
		
	}

}
