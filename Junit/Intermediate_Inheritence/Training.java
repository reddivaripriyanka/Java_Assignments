package com.training;

/**
 * 
 * @author ReddivariPriyanka
 * It is Training class and the fields like id,subject,fees and idGenarator is static method
 * Here we are implementing abstract method to call a function like getOrderValue.
 * 
 */ 
public abstract class Training {
	private int id;
	private String subject;
	private double fees;
	public static int idGenarator;
	static{
		idGenarator=100;
	}
	{
		id=idGenarator++;
	}
	public Training(String subject,double fees)
	{
		this.subject=subject;
		this.fees=fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public static int getIdGenarator() {
		return idGenarator;
	}
	public static void setIdGenarator(int idGenarator) {
		Training.idGenarator = idGenarator;
	}
	public abstract double getOrderValue();
	

}
