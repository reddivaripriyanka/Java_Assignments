package com.files;
	import static org.junit.Assert.*;

	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.junit.Before;
	import org.junit.Test;

	public class EmployeeTest {

		
		private Employee employee;
		private EmployeeWrite empWrite;
		private EmployeeReader empReader;
		
		@Before
		public void setUp() {
			empWrite = new EmployeeWrite();
			empReader = new EmployeeReader();
			employee = new Employee(1356,"Priyanaka",10000);
		}
		
		
		@Test
		public void test() throws FileNotFoundException, IOException {
			String path ="src\\com\\file.txt";
			empWrite.main(path,employee);
		}
		@Test
		public void tes1t() throws FileNotFoundException, ClassNotFoundException, IOException{
			String path ="src\\com\\file.txt";
			Employee employeeReader=empReader.main(path);
			System.out.println(employeeReader.toString());
		}
}


