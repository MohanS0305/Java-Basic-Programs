package com.java.basicprogram;
import java.util.*;
public class TwoD_Array {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the rows of martix");
		int r=input.nextInt(); // input for row
		System.out.println("Enter the column of matrix");
		int c=input.nextInt(); // input for column
		System.out.println("Enter the matrix elements");
		int[][] a=new int[r][c]; // 2D array creation
		int i,j;
		for(i=0;i<r;i++) {     // for loop for row
			for(j=0;j<c;j++) { // for loop for column
				a[i][j]=input.nextInt(); 
			}
		}
		// output for 2D matrix
		System.out.println("Entered matrixs are :");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
