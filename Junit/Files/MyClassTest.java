

	import static org.junit.Assert.*;

	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.ArrayList;

	import org.junit.Before;
	import org.junit.Test;

	public class MyClassTest {
		private MyClass myclass1,myclass2,myclass3,myclass4,myclass5;
		private ArrayList<MyClass> al;
		@Before
		public void setUp() {
			myclass1 = new MyClass(101,"priyanka",15000);
			myclass2 = new MyClass(102,"hema",23000);
			myclass3 = new MyClass(103,"mrudula",32000);
			myclass4 = new MyClass(104,"srivani",54000);
			myclass5 = new MyClass(105,"jahnavi",59000);
			
			 al = new ArrayList<MyClass>();
			al.add(myclass1);
			al.add(myclass2);
			al.add(myclass3);
			al.add(myclass4);
			al.add(myclass5);

		}
		@Test
		public void test() throws FileNotFoundException, IOException {
			MyClass myclass= new MyClass();
			myclass.main(al);
			   
		}
		
		
		@Test
		public void test2() throws ClassNotFoundException, IOException {
			MyClass m = new MyClass();
			ArrayList<MyClass> myc=m.read();
			System.out.println(myc);
		}

}
