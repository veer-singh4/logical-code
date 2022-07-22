package javaproject;

import java.util.Scanner;

public class matrixtranpose_21 {
	public static void main(String[] args) {
	int m,n,i,j=0;
		
		//taking inputs
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Size m");
		m= sc.nextInt();
		
		System.out.print("Enter Size n");
		n= sc.nextInt();
		
		
		//Matrix
		System.out.print("Enter Matrix");
		int mat[][]=new int[10][10];
		
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Print Matrix");
		
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		//transpose
		int trans[][]=new int[10][10];
		System.out.println("Print transpose Matrix");
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				
				trans[i][j]=mat[j][i];
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
