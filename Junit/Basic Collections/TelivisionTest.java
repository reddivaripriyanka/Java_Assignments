//Television : company, type (LCD, LED, Plasma), 3D enabled, price
//Television : company, type (LCD, LED, Plasma) and price together define equality

package com.collections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
/**
 * 
 * @author reddivaripriyanka
 *
 */
public class TelivisionTest {
	private Telivision telivisionOne,telivisionTwo,telivisionThree,telivisionFour;
	@Test
	public void printCollectionElements() {
		Set<Telivision> telivisonSets=new HashSet<Telivision>();
		telivisionOne=new Telivision("LG","LCD",true,50000);
		telivisionTwo=new Telivision("SONY","LED",true,45000);
		telivisionThree=new Telivision("SAMSUNG","PLASMA",false,88000);
		telivisionFour=new Telivision("SONY","LED",true,45000);
		telivisonSets.add(telivisionOne);
		telivisonSets.add(telivisionTwo);
		telivisonSets.add(telivisionThree);
		String expected="[Telivision [company=SONY, type=LED, isThreeD=true, price=45000.0], Telivision [company=LG, type=LCD, isThreeD=true, price=50000.0], Telivision [company=SAMSUNG, type=PLASMA, isThreeD=false, price=88000.0]]";
		assertEquals(expected,telivisonSets.toString());
		}
		@Test
		public void testTwoObjectsAreSame() 
		{
			telivisionOne=new Telivision("LG","LCD",true,50000);
			telivisionTwo=new Telivision("SONY","LED",true,45000);
			telivisionThree=new Telivision("SAMSUNG","PLASMA",false,88000);
			telivisionFour=new Telivision("SONY","LED",false,45000);
			boolean result=telivisionTwo.equals(telivisionFour);
			assertEquals(true,result);
			
		}
		
		@Test
		public void testTwoObjectsAreNotSame() 
		{
			telivisionOne=new Telivision("LG","LCD",true,50000);
			telivisionTwo=new Telivision("SONY","LED",true,45000);
			telivisionThree=new Telivision("SAMSUNG","PLASMA",false,88000);
			telivisionFour=new Telivision("SONY","LED",false,45000);
			boolean result=telivisionTwo.equals(telivisionThree);
			assertEquals(false,result);
			
		}
}	
		
		
		
		
