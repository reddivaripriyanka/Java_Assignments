package com.files;
import java.io.Serializable;

public class EmployeeOne implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4476253495983120846L;
	private int id;
	private String name;
	private double salary;
	public EmployeeOne(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}
	
	
}

