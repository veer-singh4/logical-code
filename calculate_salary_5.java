package javaproject;
import java.util.*; 

public class calculate_salary_5 {
	public static void main(String[] args) {
		//declaration
		String name;
		int emp_id;
		long basic,special_Allow,POB,monthly_tax_saving,gross_monthsal;
		double tax_pa = 0;
		
		//inputs
		Scanner sc =new Scanner(System.in);
		System.out.println("Name:");
		name= sc.nextLine(); 
		
		System.out.println("Emp id");
		emp_id= sc.nextInt(); 
		
		System.out.println("Basic");
		 basic=sc.nextLong();
		 
		 System.out.println("Special Allowance");
		  special_Allow=sc.nextLong();
		 
		 System.out.println("Percentage of bonus");
		  POB=sc.nextLong();
		 
		 System.out.println("Monthly tax saving amount");
		 monthly_tax_saving=sc.nextLong();
		 
		 
		 //calculate gross monthly salary
		 
		  gross_monthsal = basic + special_Allow + monthly_tax_saving;
		  
		  //annual salary
		  long annual_salary = gross_monthsal*12;
		 
		 //Gross Annual salary
		 long gross_annual_salary=annual_salary+((annual_salary*POB)/100);
		 
		 long tax_amount=0;
		 tax_amount=(monthly_tax_saving*12)-150000;
		 if(tax_amount<0) {
			 tax_amount=0;
		 }
		 
		 double taxable_amount=gross_annual_salary-tax_amount;
		 double net_annual=0;
		 
		 //annual net salary
		 if(gross_annual_salary<=250000) {
			 net_annual=taxable_amount;
			  tax_pa=0;
			 
		 }
		 else if(gross_annual_salary>250000 && gross_annual_salary<=500000) {
			 net_annual=taxable_amount-(taxable_amount*0.05);
			  tax_pa=taxable_amount*0.05;
		 }
		 else if(gross_annual_salary>500000 && gross_annual_salary<=1000000) {
			 net_annual = taxable_amount-(taxable_amount*0.2);
			 tax_pa=taxable_amount*0.2;
		 }
		 else if(gross_annual_salary>1000000) {
			 net_annual=taxable_amount-(taxable_amount*0.3);
			 tax_pa=taxable_amount*0.3;
		 }
		 
		 System.out.println("annual gross");
		 System.out.println(gross_annual_salary);
		 System.out.println("annual net");
		 System.out.println(net_annual);
		 System.out.println("tax payable");
		 System.out.println(tax_pa);
		 

	  }

}
