package javaproject;

import java.util.Scanner;

public class studentmarks_3 {
	public static void main(String[] args) {
		//declaration
		String name;
		int sub1,sub2,sub3,total;
		float avg;
		
		
		//inputs
		Scanner sc =new Scanner(System.in);
		System.out.println("Name:");
		name= sc.nextLine(); 
		System.out.println("Sub1");
		sub1= sc.nextInt(); 
		System.out.println("Sub2");
		sub2= sc.nextInt(); 
		System.out.println("Sub3");
		sub3= sc.nextInt(); 
		
		//calculation
		total=sub1+sub2+sub3;
		avg=total/3;
		
		//condition
		if(sub1>35 && sub2>35 && sub3 >35) {
			if(avg>=60) {
				System.out.println("1st class");
			}
			else if(avg>=50 && avg<60) {
				System.out.println("2nd class");
			}
			else if(avg>=35 && avg<50) {
				System.out.println("Pass");
			}
			else if(avg<35) {
				System.out.println("fail");
			}
		}
		else {
			System.out.println("Fail");
			
		}
		
		System.out.println("total" +total);
	
		System.out.println("avg" +avg);
	
		}
		
		
}
