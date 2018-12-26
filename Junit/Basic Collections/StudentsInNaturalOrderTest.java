//Add all the names of our class students randomly to a collection, iterate through them and print. Observe that collection keeps these elements in a natural order.
package com.collections;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class StudentsInNaturalOrderTest {
	private StudentNaturalOrder studentOne,studentTwo,studentThree,studentFour;
	
	
	
	@Before
	public void setUp() {
		studentOne=new StudentNaturalOrder("priyanka");
		studentTwo=new StudentNaturalOrder("theja");
		studentThree=new StudentNaturalOrder("Bhanu");
		studentFour=new StudentNaturalOrder("Hema");
		
		}
	@Test
	public void test() {
		TreeSet<Object> studentSet = new TreeSet<Object>();
		studentSet.add(studentOne);
		studentSet.add(studentTwo);
		studentSet.add(studentThree);
		studentSet.add(studentFour);
		String expected="[StudentNaturalOrder [name=Bhanu], StudentNaturalOrder [name=Hema], StudentNaturalOrder [name=priyanka], StudentNaturalOrder [name=theja]]";
		assertEquals(expected,studentSet.toString());
			
		}
}



