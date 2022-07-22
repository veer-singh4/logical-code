package javaproject;

import java.util.Scanner;

public class matrix_19 {
	
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
		
		//idenity matrix or not
		
		boolean flag=true;
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				if(i==j && mat[i][j]!=1) {
					flag=false;
					break;
				}
				if(i!=j && mat[i][j]!=0) {
					flag=false;
					break;
				}
			}
		}
		if(flag) {
			System.out.print("Matrix is identity");
		}
		else
		System.out.print("Matrix not is identity");
	}

}
