import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class EmployeeDetails {
private EmployeeMentDetails employee;
	@Before
	public void setUp()
	{
		employee =new EmployeeMentDetails();
		employee.setEmployeeId(121122);
		employee.setName("priyanka");
		employee.setMonthlyBasics(15000);
		EmployeeMentDetails.setPfRate(10);
	}
	
	
	// method for getAnnanualBasics
	@Test
	public void getAnnaualBasics(){
	int answer=employee.getAnnaualBasics();
	assertEquals(180000,answer);
	}
	
	//method for getMonthlyGrossSalary
	@Test
	public void getMonthlyGrossSalary(){
	int answer=employee.getMonthlyGrossSalary();
	assertEquals(24550,answer);
	}
	
	//method for getMonthlyGrossSalary
	@Test
	public void getAnnualGrossSalary(){
	int answer=employee.getAnnualGrossSalary();
	assertEquals(294600,answer);
	}
	
	//method for getMonthlyDeductions()
	@Test
	public void getMonthlyDeductions(){
	int answer=employee.getMonthlyDeductions();
	assertEquals(11600,answer);
	}
	
	//method for getMonthlyTakeHome()
	@Test
	public void getMonthlyTakeHome(){
	int answer=employee.getMonthlyTakeHome();
	assertEquals(12950,answer);
	}
	
	//method for getAnnualTakeHome()
	@Test
	public void getAnnualTakeHome(){
	int answer=employee.getAnnualTakeHome();
	assertEquals(155400,answer);
	}
	
}
