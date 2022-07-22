package javaproject;

import java.util.Scanner;

public class sortarrayandbinarysearch_18 {

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
		
		//sort array
		int temp;
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
				temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				}
			}
		}
		System.out.println("sort element of array");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
			System.out.println(arr[i]);
			}
		}
		
		//binary search
		int first=arr[0];
		int last=arr.length-1;
		int mid=(first+last)/2;
		while(first<=last) {
		if(arr[mid]<num) {
			first=mid+1;
		}
		else if(arr[mid]==num) {
			System.out.println("Element present");
			break;
		}
		else {
			last=mid-1;
		}
		mid=(first+last)/2;
	}
		if(first>last) {
			System.out.println("Element not present");
		}
		
	
		
				
}}
