package javaproject;

import java.util.Scanner;

public class series12467_15 {
	public static void main(String[] args) {
	
	//declaration
			int size,series,n1=1,n2=2;
			
			//taking inputs
			Scanner sc =new Scanner(System.in);
			System.out.print("Enter Size");
			size= sc.nextInt();
			
			System.out.print(n1+" ");
			System.out.print(n2+" ");
			
			int i=1;
			while(i<=size) 
			{
				if(i%2!=0) {
					series=n1+3;
					n1=series;
					System.out.print(series+" ");
				}
				else {
					series=n2+4;
					n2=series;
					System.out.print(series+" ");
				}
				i++;
			}
	}

}
