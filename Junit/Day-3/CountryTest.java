import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CountryTest {
private  CountryForTestingLargerOne countryOne,countryTwo,countryThree;
	@Before
	public void setUp() {
		countryOne=new CountryForTestingLargerOne();
		countryOne.setCountryName("India");
		countryOne.setCountryArea(5000);
		countryOne.setCountryPopulation(80000);
		countryTwo=new CountryForTestingLargerOne();
		countryTwo.setCountryName("America");
		countryTwo.setCountryArea(9000);
		countryTwo.setCountryPopulation(60000);
		countryThree=new CountryForTestingLargerOne();
		countryThree.setCountryName("china");
		countryThree.setCountryArea(15000);
		countryThree.setCountryPopulation(70000);			
	}
	
	@Test
	public void findLargestArea()
	{
		CountryForTestingLargerOne country[]={countryOne,countryTwo,countryThree};
		String answer=countryOne.isLargestArea(country);
		assertEquals("china",answer);
	}
	

	@Test
	public void findLargestPopulation()
	{
		CountryForTestingLargerOne country[]={countryOne,countryTwo,countryThree};
		String answer=countryOne.isLargestPopulation(country);
		assertEquals("India",answer);
	}
	
	@Test
	public void findLargestPopulationDensity()
	{
		CountryForTestingLargerOne country[]={countryOne,countryTwo,countryThree};
		String answer=countryOne.isLargestPopulationDensity(country);
		assertEquals("India",answer);
	}
	
}