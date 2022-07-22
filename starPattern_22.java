package javaproject;

import java.util.Scanner;

public class starPattern_22 {
	public static void main(String[] args) {
int i,j,size=5;
		
		
		
		for(i=0;i<size;i++) {
			if(i!=1) {
			for(j=size-i;j>=0;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}}
	}

}
