package javaproject;

import java.util.Scanner;

public class numberij_14 {

	public static void main(String[] args) {
		
		int i,j,size;
		
		//taking inputs
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Size");
		size= sc.nextInt();
		int value=1;
		
		
		i=0;
		while(i<=size) {
			
			j=0;
			while(j<i) {
				
				if(value%2!=0) {
				System.out.print(value*value+"\t");
				}
				else {
					System.out.print(-value*value+"\t");
				}
				value++;
				j++;
				
			}
			System.out.println();
			i++;
		}
	}
	
}
