package com.files;

import java.io.Serializable;

public class Employee implements Serializable{

		private static final long serialVersionUID = -3470065790058337793L;
		private int Id;
		private String name;
		private double salary;
		public Employee(int id, String name, double salary) {
			super();
			Id = id;
			this.name = name;
			this.salary = salary;
		}
		public Employee() {
			
		}
		@Override
		public String toString() {
			return "Employee [id=" + Id + ", name=" + name + ", salary=" + salary
					+ "]";
		}
		
		
		
		
		
		
	}
}

