package javaproject;

import java.util.Scanner;

public class sqrofprime_9 {
	public static void main(String[] args) {
		
		//declaration
		int size,num=0,i,j;
		int c=0;
		//taking inputs
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Size");
		size= sc.nextInt();
		
		//find prime 
		int con=0;
		for(i=1;i<=size;i++) {	
			if(i==9) {
				System.out.println(i*i+" ");
				con++;
			}

			int count=0;
			for(j=2;j<=i/2;j++) {	
				if(i%j==0) {
					count++;
					break;	
				}
			}
		
			//get number
			if(count==0) {
				num=i*i;
				con++;
				//condition for num not more than size
				if(num>size) {
					break;
				}
				if(con%4!=0) {
				    System.out.println(num);
				    
					//find number having 9
					while(num!=0) {
						int digit=num%10;
						if(digit==9) {
							c++;
						}
						num/=10;
				}
			}	
			
		}
	}
		System.out.println("number having digit 9 :"+c);
		
		
		
	}

}
