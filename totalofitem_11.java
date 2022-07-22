package javaproject;

import java.util.Scanner;

public class totalofitem_11 {
	public static void main(String[] args) {
		
	//decleration
	int item_code;
	String des;
	int qty=0;
	long price;
	long total=0,gtotal=0;
	double newtotal;
	char ch='y',pay='c';
	int f=1;
	
	
	      Scanner sc=new Scanner(System.in);
	      //inputs
	      while(f>0) {
			System.out.print("item code: ");
			item_code= sc.nextInt();
			
			System.out.print("Discription: ");
			des= sc.next(); 
			
			System.out.print("Qty: ");
			qty= sc.nextInt(); 
			
			System.out.print("Price: ");
			price= sc.nextLong();
			System.out.println("Total of items");
		    total=qty*price;
			System.out.println(total);
			gtotal+=total;
			System.out.print("Enter your choise: ");
			
			//for taking option
			ch=sc.next().charAt(0);
			if(ch!='y') {
				f=0;
				System.out.print("Grand total: ");
				System.out.println(gtotal);
				break;
			}
			f++;
		    }
	     
	      //for grand total discount
	      if(gtotal>10000) {
	    	  newtotal=gtotal-(gtotal*10)/100;
	    	  System.out.print("new Grand total: ");
	    	  System.out.println(newtotal);
	      }
	      if(gtotal<1000) {
	    	  System.out.print("pay by card: ");
	    	  pay=sc.next().charAt(0);
	    	  if(pay=='c') {
	    		  newtotal=gtotal-(gtotal*2.5/100);
	    		  System.out.print("new Grand total: ");
	    		  System.out.println(newtotal);
	    	  }
	    	  else {
	    		  System.out.print("Grand total: ");
					System.out.println(gtotal);
	    	  }
	      }
	      }
		
	}  


