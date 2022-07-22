package javaproject;

import java.util.Scanner;

public class series147_12 {
	public static void main(String[] args) {
		int size, n1=1,n2=4,n3=7,series=0;
		
		//taking inputs
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Size");
		size= sc.nextInt();
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		System.out.print(n3+" ");
		
		
		int i=3;
		while(i<size) {
			
			series=n1+n2+n3;
			
			n1=n2;
			n2=n3;
			n3=series;
			i++;
			System.out.print(series +" ");
		}
		
		
		
		
	}

}
