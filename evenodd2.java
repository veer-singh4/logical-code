package javaproject;

import java.util.Scanner;

public class evenodd2 {
	public static void main(String[] args) {
		//declaration
		int number;
		
		//taking inputs
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		number= sc.nextInt();
		
		//display even or odd;
		if(number%2==0) {
			
			System.out.println("Number is even");
			System.out.println(number);
		}
		else
		{
			
			System.out.println("number is odd");
			System.out.println(number);
		}
		}
}
