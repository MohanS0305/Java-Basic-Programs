package com.corejava;
import java.util.Scanner;

public class Average {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("How many digits of number you want to enter : ");
		int size = input.nextInt(); 
		int [ ] a = new int[ size];
		int i, sum=0;
		System.out.println("Enter any "+size+" numbers");
		for(i=0; i<size; i++) {
			 a[i] = input.nextInt();
		}
		
		for (i=0; i<size; i++) {
			 sum+= a[i];
		}
		int avg = sum/size;
		
		System.out.println("Average of this no is "+avg);
	}

}
