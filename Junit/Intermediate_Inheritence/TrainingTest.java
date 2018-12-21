package com.training;
/**
 * 
 * @author ReddivariPriyanka
 *It is a TrainingTest class to test all the test classes
 *
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrainingTest { 
private Training publicTraining,corporateTraining;

	@Before
	public void setUp()
	{
		publicTraining=new PublicTraining("java",5000,50);
		corporateTraining=new CorporateTraining("Big data",35000,4);
		
	}
	
	@Test
	public void testForPublicTraining() {
		double result=publicTraining.getOrderValue();
		assertEquals(250000,result,0.0);
	}
	
	@Test
	public void testForCorporateTraining() {
		double result=corporateTraining.getOrderValue();
		assertEquals(140000,result,0.0);
	}
	
	

}
