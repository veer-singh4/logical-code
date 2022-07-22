package javaproject;

import java.util.Scanner;

public class printseries_sqrofevneno_4 {
	public static void main(String[] args) {
		//declaration
		int number,series_num=0;
		
		
		//input
		Scanner sc =new Scanner(System.in);
		System.out.println("number of series");
		number=sc.nextInt();
		
		int i=2;
		while(i<=number) {
			if(i%2==0) {
			series_num=i*i;
			System.out.print(series_num+" ");
			}
			i++;
			
		}
		
		}
		
		

}
