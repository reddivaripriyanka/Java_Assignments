package com.collections;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class StudentMapTest {

	@Test
	public void test() {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("Priyanka","sapota");
		map.put("hema","banana");
		map.put("mrudula","apple");
		map.put("janu","orange");
		
		if(map.containsKey("Priyanka"))
		{
			String fruit=map.get("Priyanka");
			assertEquals(fruit,"sapota");
		}
		if(map.containsKey("hema"))
		{
			String fruit=map.get("hema");
			assertEquals(fruit,"banana");
		}
		
		String expected="{hema=banana, mrudula=apple, Priyanka=sapota, janu=orange}";
		assertEquals(expected,map.toString());
		
	}

}