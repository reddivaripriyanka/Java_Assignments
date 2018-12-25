//CellPhone : company, model, description, operatingSstem, price
//CellPhone : company, model and operatingSstem together define equality

package com.cg;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.collections.Telivision;

public class CellPhoneTest {
	private CellPhone cellPhoneOne,cellPhoneTwo,cellPhoneThree,cellPhoneFour;
	private Set<CellPhone> cellPhoneSets=new HashSet<CellPhone>();
	
	@Test
	public void test() {
		cellPhoneOne=new CellPhone("samsung","i5","it is samsung","android",10000);
		cellPhoneTwo=new CellPhone("Redme","g7","it is a redmi phone","android",25000);
		cellPhoneThree=new CellPhone("lenovo","a5","it is a lenovo","apple",80000);
		cellPhoneFour=new CellPhone("samsung","i5","it is samsung","android",10000);
		cellPhoneSets.add(cellPhoneOne);
		cellPhoneSets.add(cellPhoneTwo);
		cellPhoneSets.add(cellPhoneThree);
		cellPhoneSets.add(cellPhoneFour);
		String expected="[CellPhone [company=Redme, model=g7, description=it is a redmi phone, operatingSystem=android, price=25000], CellPhone [company=lenovo, model=a5, description=it is a lenovo, operatingSystem=apple, price=80000], CellPhone [company=samsung, model=i5, description=it is samsung, operatingSystem=android, price=10000]]";
		assertEquals(expected,cellPhoneSets.toString());
		}
		
}


