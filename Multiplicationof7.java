package javaproject;

//import java.util.Scanner;

public class Multiplicationof7 {
	public static void main(String[] args) {
		//declaration
		int n=7;
		
		System.out.println("1st 2nd and 4th multiplication of 7 divisible by 2,3,4,5,6");
		int i=0;
		while(i<5) {
			if((n%2==1) && (n%3==1) && (n%4==1) && (n%5==1) && (n%6==1)) {
				i++;
				if(i<3 || i==4)
				{
					System.out.println(i+" "+"number"+n);
				}
			}
			n=n+7;
		}
		}
		

}
