package com.java.basicprogram;
import java.util.*;
public class Duplicate_No_Remove {
	static int[] a;
	static int[] b;
	static int n,i,j,k=0;
	static int DuplicateRemove(int n) {
		for(j=0;j<k;j++) {
			if(b[j]==n) {
				return 0;
			}
		}
		b[k]=n;
		k++;
		return 0;
	}
	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		a=new int[n];
		b=new int[n];
		input.close();
		System.out.println("Enter the elements in array");
		for(i=0;i<n;i++) {
			a[i]=input.nextInt();
		}
		for(i=0;i<n;i++) {
			System.out.println(a[i]+"");
		}
		System.out.println("\nAfter removing duplicates");
		for(i=0;i<n;i++) {
			DuplicateRemove(a[i]);
		}
		for(i=0;i<k;i++) {
			System.out.println(b[i]+"");
		}
	}
}
