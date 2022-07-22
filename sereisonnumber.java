//1,3,7,13,21.....n
package javaproject;

import java.util.Scanner;

public class sereisonnumber {
	public static void main(String[] args) {
		//declaration
		int number,sum=0;
		
		
		//input
		Scanner sc =new Scanner(System.in);
		System.out.println("number of series");
		number=sc.nextInt();
		
		int i=1;
		while(i<=number) {
			sum=i*i-i+1;
			System.out.print(sum+" ");
			i++;
			
		}
		
		}
}
