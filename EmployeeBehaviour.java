
public class EmployeeBehaviour {
	
	private int ID;
	
	private int monthlyBasic;
	
	private double pf;
	private double esic;
	private int profTax;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getMonthlyBasic() {
		return monthlyBasic;
	}
	public void setMonthlyBasic(int monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	
	//function to calculate PF
	public double getPf()
	{
	if(0.1*monthlyBasic<6500)
	{
		pf=0.1*monthlyBasic;
	}
	else
		pf=6500;
	return pf;
	}
	
	//function to calculate ESIC
	public double getESIC()
	{
	if(monthlyBasic<=5000)
	{
		esic=0.0475*monthlyBasic;
	}
	else
		esic=0;
	return esic;
	}
	
	//function to calculate Profit Tax
	public int getProfitTax()
	{
	if(monthlyBasic<=10000)
	{
		profTax=50;
	}
	else
		profTax=100;
	return profTax;
	}
	
	
	//function to calculate HRA
	public double getHra(int basic)
	{
		double hra=0.5*basic;
		return hra;
	}
	
	
	
	//function to get Annual Basic Salary
	public int getAnnualBasic(int monthlyBasic)
	{
		int annualBasic=12*monthlyBasic;
		return annualBasic;
	}
	
	//function to get Monthly Gross Salary
	public double getMonthlyGrossSalary(int monthlyBasic, double hra, int medical, int conveyance)
	{
		double monthlyGrossSalary= monthlyBasic + hra + medical + conveyance;
		return monthlyGrossSalary;
	}
	
	//function to get Annual Gross Salary
	public int getAnnualGrossSalary(int monthlyGrossSalary)
	{
		int annualGrossSalary= 12*monthlyGrossSalary;
		return annualGrossSalary;
	}
	
	
	//function to get Monthly Deduction	
	public double getMonthlyDeductions(double pf, double esic,int profTax)
	{
		double monthlyDeduction=pf + esic + profTax;
		return monthlyDeduction;
	}

	//function to get Monthly Take Home
	public double getMonthlyTakeHome(double monthlyGrossSalary,double monthlyDeduction)
	{
		
		double monthlyTakeHome=monthlyGrossSalary - monthlyDeduction;
		return monthlyTakeHome;
	}
	
//function to get Annual Take Home
	public double getAnnualTakeHome(double monthlyTakeHome)
	{
		
		double annualTakeHome=12*monthlyTakeHome;
		return annualTakeHome;
	}
}