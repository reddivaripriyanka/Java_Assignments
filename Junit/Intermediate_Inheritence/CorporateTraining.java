package com.training;
/**
 * 
 * @author ReddivariPriyanka
 *It is a corporateTraining Training class declaring instance variable is days and based on that we are calling a method is getOrdervalue.
 *
 */
public class CorporateTraining extends Training{
	private int days;
	
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public CorporateTraining(String subject, double fees,int days) {
		super(subject, fees);
		this.days=days;
		
	}
	public double getOrderValue()
	{
		return getFees()*days;
	}
	
}
