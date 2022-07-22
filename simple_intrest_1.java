package javaproject;

import java.util.Scanner;

public class simple_intrest_1 {
	public static void main(String[] args) {
		//declaration
		double principle,rate,time,SI;
		
		//taking inputs
		Scanner sc =new Scanner(System.in);
		System.out.println("principle");
		principle= sc.nextDouble();
		System.out.println("rate");
		rate= sc.nextDouble();
		System.out.println("time");
		time= sc.nextDouble();
		
		//calculation
		SI=(principle*rate*time)/100;
		
		System.out.println("display Simple intrest");
		System.out.println(SI);
		
	}

}
