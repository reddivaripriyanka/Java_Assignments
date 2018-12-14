
public class EmployeeMentDetails {
	private int employeeId;
	private String name;
	private double monthlyBasics;
	private static int pfRate;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlyBasics() {
		return monthlyBasics;
	}
	public void setMonthlyBasics(double monthlyBasics) {
		this.monthlyBasics = monthlyBasics;
	}
	public static int getPfRate() {
		return pfRate;
	}
	public static void setPfRate(int pfRate) {
		EmployeeMentDetails.pfRate = pfRate;
	}
	public int getAnnaualBasics() {
		return (int) (12*monthlyBasics);

	}
	public int getMonthlyGrossSalary() {
		final int medicalAllowance=1250;
		final int conveyanceAllowance =800;
		int hra=(int) ((50*monthlyBasics)/100);
		return (int) (monthlyBasics+hra+medicalAllowance+conveyanceAllowance);
	}
	public int getAnnualGrossSalary() {
		return 12*getMonthlyGrossSalary();
	}
	int providentFund()
	{
		int providentFund=(int) (EmployeeMentDetails.getPfRate()*monthlyBasics)/100;
		if(providentFund<=6500)
			providentFund=6500;
		return providentFund;
	}
	double esic()
	{
		double esic=(4.75*monthlyBasics)/100;
		if(esic<=5000)
			esic=5000;
		else
			esic=0;
		return esic;
		
	}
	int profissionalTax()
	{
		int profissionalTax;
		if(getMonthlyGrossSalary()<=10000)
			 profissionalTax=50;
		else
			profissionalTax=100;
		return profissionalTax;
	}
	public int getMonthlyDeductions() {
		return (int) (providentFund()+esic()+profissionalTax());
			 
	}
	public int getMonthlyTakeHome() {
		return getMonthlyGrossSalary()-getMonthlyDeductions();
	}
	public int getAnnualTakeHome() {
		return 12*getMonthlyTakeHome();
	}
	@Override
	public String toString() {
		return "EmployeeMentDetails [employeeId=" + employeeId + ", name="
				+ name + ", monthlyBasics=" + monthlyBasics + "]";
	}
	
	}
	
	
	
	
