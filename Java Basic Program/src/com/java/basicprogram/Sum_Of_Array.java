package com.java.basicprogram;
import java.util.*;
public class Sum_Of_Array {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the size of array"); 
			int n=input.nextInt(); // size of an array
			System.out.println("Enter the array elements");  
			int[] a=new int[n]; // array creation
			int i;
			for(i=0;i<n;i++) {
				a[i]=input.nextInt(); // input for array elements 
			}
			int sum=0; // initial sum is 0
			for(i=0;i<n;i++) {
				sum=a[i]+sum; // array elements is add to next array elements
			}
			System.out.println("The sum of n elements are: "+sum); // print sum of total array elements
		}
	}
}
