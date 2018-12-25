//Add all the names of our class students randomly to a collection, iterate through them and print. Observe that collection is maintaining the order that you add.

package com.cg;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	private Student StudentOne,StudentTwo,StudentThree,StudentFour,StudentFive;
	@Before
	public void setUp()
	{
	StudentOne=new Student("priyanka");
	StudentTwo=new Student("hema");
	StudentThree=new Student("jahnavi");
	StudentFour=new Student("m rudula");
	StudentFive=new Student("bhanu");
	}
   
	@Test
	public void toTestInsertionOrder() {  //it maintain insertion order
		ArrayList<Object> studentSet = new ArrayList<Object>();
		studentSet.add(StudentOne);
		studentSet.add(StudentTwo);
		studentSet.add(StudentThree);
		studentSet.add(StudentFour);
		studentSet.add(StudentFive);
		String expected="[Student [name=priyanka], Student [name=hema], Student [name=jahnavi], Student [name=m rudula], Student [name=bhanu]]";
		assertEquals(expected,studentSet.toString());
		}

	}

