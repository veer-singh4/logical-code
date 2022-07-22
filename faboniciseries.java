package javaproject;

import java.util.Scanner;

public class faboniciseries {
	public static void main(String[] args) {
		//declaration
		int size,n1=0,n2=1,n3;
		
		//taking inputs
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Size");
		size= sc.nextInt();
		
		System.out.print(n2);
		
		for(int i=1;i<size;++i) {
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		
		}
		}
		

}
