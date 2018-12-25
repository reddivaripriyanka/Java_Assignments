/*Create classes for the below objects with the fields specified below.
Create three different instances for each type and add them to a collection.
Now, read from these collection and print each attribute in console.

Laptop : company, model, operatingSystem, processor*/

package com.collections;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author reddivaripriyanka
 *
 */
public class LaptopTest {
	private  Laptop lenovo,apple,hp,lenovoOne,lenovoTwo;
	@Test
	public void printCollectionElements()
	{
		Set<Laptop> laptopSets=new HashSet<Laptop>();
		lenovo=new Laptop("lenovo","g5","window","i5");
		apple=new Laptop("apple","a5","android","i7");
		hp=new Laptop("hp","a7","unix","i3");
		lenovoOne=new Laptop("lenovo","g5","window","i5");
		lenovoTwo=new Laptop("lenovo","g5","window","i9");
		laptopSets.add(lenovo);
		laptopSets.add(apple);
		laptopSets.add(hp);
		laptopSets.add(lenovoOne);
		laptopSets.add(lenovoTwo);
		String expected="[[Laptop [company=lenovo, model=g5, operatingSystem=window, processor=i5], [Laptop [company=hp, model=a7, operatingSystem=unix, processor=i3], [Laptop [company=apple, model=a5, operatingSystem=android, processor=i7]]";
		assertEquals(expected,laptopSets.toString());
	}


	@Test
	public void testToObjectsAreSameOrNot() {
		lenovo=new Laptop("lenovo","g5","window","i5");
		apple=new Laptop("apple","a5","android","i7");
		hp=new Laptop("hp","a7","unix","i3");
		lenovoOne=new Laptop("lenovo","g5","window","i5");
		lenovoTwo=new Laptop("lenovo","g5","windo","i9");
		boolean result=lenovo.equals(lenovoTwo);
		assertEquals(true,result);
	}
		
		@Test
		public void toTestmodelAndCompanySame() {
			lenovo=new Laptop("lenovo","g5","window","i5");
			apple=new Laptop("apple","a5","android","i7");
			hp=new Laptop("hp","a7","unix","i3");
			lenovoOne=new Laptop("lenovo","g5","window","i5");
			lenovoTwo=new Laptop("lenovo","g5","windo","i9");
			boolean result=lenovo.equals(lenovoOne);
			assertEquals(true,result);
		}
			
			@Test
			public void toTestmodelAndCompanyNotSame() {
				lenovo=new Laptop("lenovo","g5","window","i5");
				apple=new Laptop("apple","a5","android","i7");
				hp=new Laptop("hp","a7","unix","i3");
				lenovoOne=new Laptop("lenovo","g5","window","i5");
				lenovoTwo=new Laptop("lenovo","g5","windo","i9");
				boolean result=lenovo.equals(hp);
				assertEquals(false,result);
		
				
	}

}
