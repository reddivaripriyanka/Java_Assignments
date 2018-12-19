
public class CountryForTestingLargerOne {
private String countryName;
private long countryPopulataion;
private long countryArea;
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public long getCountryArea() {
	return countryArea;
}
public void setCountryArea(long countryArea) {
	this.countryArea= countryArea;
}
public long getCountryPopulation() {
	return countryPopulataion;
}
public void setCountryPopulation(long countryPopulation) {
	this.countryPopulataion = countryPopulataion;
}
public String isLargestArea(CountryForTestingLargerOne[] country) { // It test largerArea and display the country name
	long temp=country[0].countryArea;
	int counter;
	int value=0;
	for( counter=1;counter<country.length;counter++)
	{
		if(temp<(country[counter].countryArea))
		{
			temp=country[counter].countryArea;
			value=counter;
		}
	
	}
	return country[value].countryName;
}
public String isLargestPopulation(CountryForTestingLargerOne[] country) {   //It test largerPopulation and display country name
	long temp=country[0].countryPopulataion;
	int counter;
	int value=0;
	for( counter=0;counter<country.length;counter++)
	{
		if(temp<(country[counter].countryPopulataion))
		{
			temp=country[counter].countryPopulataion;
			value=counter;
		}
	
	}
	return country[value].countryName;
}
public String isLargestPopulationDensity(CountryForTestingLargerOne[] country) { //It display larger density of country
	long temp=country[0].countryPopulataion/country[0].countryArea;
	int counter;
	int value=0;
	for( counter=0;counter<country.length;counter++)
	{
		if(temp<((country[counter].countryPopulataion)/(country[counter].countryArea)))
		{
			temp=((country[counter].countryPopulataion)/(country[counter].countryArea));
			value=counter;
		}
	
	}
	return country[value].countryName;
}



}