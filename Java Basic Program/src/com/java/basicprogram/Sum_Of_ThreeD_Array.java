package com.java.basicprogram;
import java.util.*;
public class Sum_Of_ThreeD_Array {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); // scanner class for input
		System.out.println("Enter the matrix no");
		int n=input.nextInt(); // input for matrix no
		System.out.println("Enter the row of matrix");
		int r=input.nextInt(); // input for row matrix
		System.out.println("Enter the column of matrix");
		int c=input.nextInt(); // input for column matrix
		System.out.println("Enter the matrix elements");
		int[][][] a=new int[n][r][c]; // 3D array creation for no of matrix, rows & columns 
		int i,j,k;
		for(k=0;k<n;k++) {          // k loop for no of matrix
			for(i=0;i<r;i++) {      // i loop for row of matrix
				for(j=0;j<c;j++) {  // j loop for column of matrix
					a[k][i][j]=input.nextInt(); 
				}
			}
		}
		// creating a no of matrix
		for(k=0;k<n;k++) {
			System.out.println("Matrix no is "+k);
			for(i=0;i<r;i++) {
				for(j=0;j<c;j++) {
					System.out.print(a[k][i][j]+" ");
				}
				// after complete the j(column) loop print next i(row) loop in new line
				System.out.println();
			}
		}
		// sum of n matrix
		System.out.println("Sum of "+n+" matrix is");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				System.out.print(a[0][i][j]+a[1][i][j]+" ");
				// a[0] is first matrix
				// a[1] is second matrix
			    // sum of matrix is a[0]+a[1]
			}
			// after complete the j(column) loop print next i(row) loop in new line
			System.out.println();
		}
	}
}
