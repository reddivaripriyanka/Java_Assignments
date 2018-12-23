

	import static org.junit.Assert.*;

	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectOutputStream;

	import org.junit.Before;
	import org.junit.Test;

	public class EmployeeTestOne {
		private EmployeeOne employee;
		private EmployeeReaderOne reader;
		@Before
		public void setUp() {
			employee = new EmployeeOne(12134,"bhanu",25000);
			reader = new EmployeeReaderOne();
		}
		

		@Test
		public void write() throws FileNotFoundException, IOException {
			String path = "src\\com\\fileOne.txt";
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(employee);
			oos.close();
		}

		@Test
		public void read() throws FileNotFoundException, ClassNotFoundException, IOException {
			String path = "src\\com\\fileOne.txt";
			EmployeeOne employee2 = reader.readFile(path);
			System.out.println(employee2);
			
		}
}
