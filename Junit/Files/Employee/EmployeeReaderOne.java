package com.files;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.ObjectInputStream;

	public class EmployeeReaderOne {

		public EmployeeOne readFile(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
			EmployeeOne employee = (EmployeeOne) ois.readObject();
			ois.close();
			return employee;
		}

}



