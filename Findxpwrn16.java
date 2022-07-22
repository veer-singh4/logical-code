package javaproject;

import java.util.Scanner;

public class Findxpwrn16 {
	public static void main(String[] args) {
		
		//declaration
		int x,n,ans=1;
		
		//taking inputs
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter value of x");
		x= sc.nextInt();
		System.out.print("Enter value of n");
		n= sc.nextInt();
		
		int i=1;
		while(i<=n) {
			ans=ans*x;
			
			i++;
		}
		System.out.print(ans+" ");
		
	}

}
