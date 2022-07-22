package javaproject;

import java.util.Scanner;

public class Sereis126_10 {

	public static void main(String[] args) {
		//declaration
				int size,series=1;
				
				//taking inputs
				Scanner sc =new Scanner(System.in);
				System.out.print("Enter Size");
				size= sc.nextInt();
				
				int i=0;
				while(i<size) {
					series=series+(i*i);
					System.out.print(series+" ");
					i++;
				}

	}

}
