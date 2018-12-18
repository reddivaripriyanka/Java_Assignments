
public class Person {
	int monthArray[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
	private String name; // data member to store the name of a person.
	private int day;
	private int month;    // data members to store the day, month and year of a date.
	private int year;	// data member to store the date of birth of a person.
	public Person(String n, int d, int m, int y) //constructor to initialize Person objects
	{
		this.name=n;
		this.day=d;
		this.month=m;
		this.year=y;
		
	}
	public String isDisplay(Person dateOne) 
	{
		return dateOne.name+dateOne.day+dateOne.month+dateOne.year;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String olderOne(Person dateOne)
	{
		Person dateTwo = new Person("Ram", 1, 1, 1995);
		int daysOne=dateOne.noOfdays();
		int daysTwo=dateTwo.noOfdays();
		int totalDays;
		int yearResult,totalYears;
		if(daysOne>daysTwo)
			totalDays=daysOne-daysTwo;
		 else
			 totalDays=daysTwo-daysOne;
		 totalYears=totalDays/365;
		int totalMonths =((totalDays % 365) / 30);
		int remainingDays = ((totalDays % 365) % 30);
		if(daysOne<daysTwo)
		return dateOne.name+" is older than "+dateTwo.name+" by "+totalYears+" years, "+totalMonths+" months, "+remainingDays+" day";
		else
			return dateTwo.name+" is older than "+dateOne.name+" by "+totalYears+" years, "+totalMonths+" months, "+remainingDays+" day";
		
	}

	int noOfdays() {
		int days=day;
		int years=year-1;
		days=days+years*365;
		days=days+(years/4-years/100+years/400);
		for(int counter=1;counter<month;counter++)
		{
			days=days+monthArray[counter];
		}
		return days;
		
	}
	
}
