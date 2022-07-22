package javaproject;

import java.util.Scanner;

public class linearsearch17 {
      public static void main(String[] args) {
	        //declaration
			int n;
			
			Scanner sc =new Scanner(System.in);
			
			System.out.println("Size of array");
			n=sc.nextInt();
			
			int num;
			System.out.println("Enter search number");
			num=sc.nextInt();
	
	      int[] arr= new int[10];
	
	     //enter array
	     System.out.println("Enter element of array");
	     for(int i=0;i<n;i++) {
		     arr[i]=sc.nextInt();
	        }
	     
	   //display array
			System.out.println("Print element of array");
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]);
			}
			
			//linear search
			int found=0;
			int i=0;
			while(i<arr.length) {
				if(arr[i]==num) {
					found=1;
				}
				i++;
			}
			if(found==1) {
				
				System.out.println("element present in array");
				
			}
			else {
				System.out.println("element not present in array");
			}
			
     }
}
