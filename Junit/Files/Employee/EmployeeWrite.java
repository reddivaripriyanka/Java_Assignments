
	package com.files;

	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectOutputStream;

	public class EmployeeWrite {

		
		public void main(String path, Employee emp) throws FileNotFoundException, IOException {
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(emp);
			oos.close();
			
		}
}

