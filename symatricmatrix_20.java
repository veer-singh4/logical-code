package javaproject;

import java.util.Scanner;

public class symatricmatrix_20 {
	
	public static void main(String[] args) {
		int size,i,j=0;
		
		//taking inputs
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Size");
		size= sc.nextInt();
		
		//Matrix
		System.out.print("Enter Matrix");
		int mat[][]=new int[10][10];
		
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		//transpose
		int trans[][]=new int[10][10];
		System.out.println("Print transpose Matrix");
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				
				trans[i][j]=mat[j][i];
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
		
		//symmetric
		int flag=1;
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
		if(mat[i][j]!=trans[i][j]) {
			flag=0;
			break;
		}
		}
			if(flag==0) {
				System.out.println("not symetric Matrix");
				break;
			}
			}
		if(flag==1) {
			System.out.println("symetric Matrix");
		}	
	}

}
