//Employee salary is Calculated 

import java.util.*;
class Employee
{
	public static void main(String args[])
	{
		
		EmployeeBehaviour employee = new EmployeeBehaviour();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Employee Id");
		employee.setID(scanner.nextInt());
		

		System.out.println("Enter the Employee name");
		String name=scanner.next();
		//employee.setName(scanner.nextLine());
		
		System.out.println("Enter the basic salary");
		employee.setMonthlyBasic(scanner.nextInt());
		
		int monthlyBasic=employee.getMonthlyBasic();
		
		int ID=employee.getID();
		
		//String name=employee.getName();
		
		System.out.println("The Employee  "+name+" has ID no "+ID+" and basic salary is "+ monthlyBasic);
		
		int annualBasic=employee.getAnnualBasic(monthlyBasic );
		System.out.println("He/She has annual basic salary of "+ annualBasic);
		
		double hra= employee.getHra(monthlyBasic);
		
		
		double monthlyGrossSalary=employee.getMonthlyGrossSalary(monthlyBasic ,hra, 1250, 800);
		System.out.println("He/She has monthly gross salary of "+ monthlyGrossSalary);

		double monthlyDeductions=employee.getMonthlyDeductions(employee.getPf(), employee.getESIC(), employee.getProfitTax());
		System.out.println("He/She has monthly deduction of "+ monthlyDeductions);
		
		
		double monthlyTakeHome=employee.getMonthlyTakeHome(monthlyGrossSalary,monthlyDeductions);
		System.out.println("He/She has monthly take home of "+ monthlyTakeHome);

		double annualTakeHome=employee.getAnnualTakeHome(monthlyTakeHome);
		System.out.println("He/She has annula take home of "+ annualTakeHome);

	}
	

}