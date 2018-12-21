package com.training;
/**
 * 
 * @author ReddivariPriyanka
 * It is a publicTraining class in this class we are implementing getOrderValue method
 *
 */

public class PublicTraining extends Training {
	private int participants;
	

	public PublicTraining(String subject, double fees,int participants) {
		super(subject, fees);
		this.participants=participants;
		
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}
	public double getOrderValue()
	{
		return getFees()*participants;

	}

	
}
