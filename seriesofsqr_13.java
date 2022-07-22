package javaproject;

import java.util.Scanner;

public class seriesofsqr_13 {

	public static void main(String[] args) {
		//declaration
		int size,series;
		
		//taking inputs
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Size");
		size= sc.nextInt();
		
		int i=1;
		while(i<size) {
			if(i%4!=0) {
			series=i*i;
			System.out.print(series+" ");
		
			}
			i++;
			
			
		}

	}

}
