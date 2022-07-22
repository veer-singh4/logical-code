package javaproject;

public class EightQueen {
	public static void main(String[] args) {
		int i,j,flag=1;
		int bor[][]=new int[10][10];
		for(i=0;i<8;i++) {
			for(j=0;j<8;j++) {
				if(bor[i][j]!=1) {
				System.out.print("1"+" ");
				}
			}
			System.out.println();
		}
		
	}

}
