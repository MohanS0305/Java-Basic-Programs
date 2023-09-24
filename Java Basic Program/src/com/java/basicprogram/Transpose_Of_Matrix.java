package com.java.basicprogram;
import java.util.*;
public class Transpose_Of_Matrix {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the row of matrix");
		int r=input.nextInt();
		System.out.println("Enter the column of matrix");
		int c=input.nextInt();
		System.out.println("Enter the matrix elements");
		int[][] a=new int[r][c];
		int i,j;
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				a[i][j]=input.nextInt();
			}
		}
			System.out.println("This is Actual matrix");
			for(i=0;i<r;i++) {
				for(j=0;j<c;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("Transpose of an matrix");
			for(i=0;i<r;i++) {
				for(j=0;j<c;j++) {
					System.out.print(a[j][i]+" ");
				}
				System.out.println();
			}
	}
}
