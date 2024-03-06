package com.corejava;
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		/* Get 2 input numbers from user. 
		   Perform all arithmetic operations and display. */
		Scanner input = new Scanner(System.in);
		// Addition Operation
		System.out.println("Enter the first no");
		int a = input.nextInt();
		System.out.println("Enter the second no");
		int b = input.nextInt();
		int c = a + b;
		input.close();
		System.out.println("Addition of "+a+" & "+b+" is "+c);
		
		// Subtraction
		int s = a - b;
		System.out.println("Subtraction of "+a+" & "+b+" is "+s);
		
		// Multiplication
		int m = a * b;
		System.out.println("Multiplication of "+a+" & "+b+" is "+m);
		
		// Division
		int d = a / b;
		System.out.println("Division of "+a+" & "+b+" is "+d);
		
		// Modular
		int mod = a % b;
		System.out.println("Modular of "+a+" & "+b+" is "+mod);
		
	}

}
