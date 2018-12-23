package com.files;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeReader {
	public Employee main(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream(path));
		Employee employee =(Employee) ois.readObject();
		ois.close();
		return employee;
		
	}
}
