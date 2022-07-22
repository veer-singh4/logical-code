package javaproject;

import java.util.Scanner;

public class qus23series800 {
	public static void main(String[] args) {
		//declaration
				int number;
				int value=800;
				int arr[]=new int[50];
				//taking inputs
				Scanner sc =new Scanner(System.in);
				System.out.print("Enter size: ");
				number= sc.nextInt();
				
					for(int i=0;i<number*2;i++) {
						if(i%2==0) {
							value+=i;
							arr[i]=value;
							System.out.print(arr[i]+" ");
							
						}
						
					}
					System.out.println();
					System.out.print("Sum Of Digit: ");
					int count=0;
					for(int i=0;i<arr.length;i++) {
						int sd=0;
						while(arr[i]>0) {
							int digit=arr[i]%10;
							sd+=digit;
							arr[i]/=10;
						}
						if(sd!=0) {
						System.out.print(sd+" ");
						}
						
						while(sd>0) {
							int cdigit=sd%10;
							sd/=10;
							if(cdigit==1) {
								count++;
								break;
							}
						}
					}
					System.out.println();
					System.out.print("digit having 1: ");
					System.out.print(count+" ");	
	}

}
