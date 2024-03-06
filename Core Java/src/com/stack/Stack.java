package com.stack;

import java.util.Scanner;

public class Stack {
	
	private static Scanner input;

	public static void main(String args[]) throws Exception {
		input = new Scanner(System.in);
		System.out.println("Enter the stack size");
		int s = input.nextInt();  // input for stack size
		int stack[ ] = new  int[s]; // array creation for stack
		System.out.println("Enter the "+s+" no to push into stack");
		int i;
		for(i=0; i<s; i++) {
			stack[i] = input.nextInt();
		}
		System.out.print("Stack push elements are : ");
		for(i=0; i<s; i++) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the pop element index value it start with 1");
		int pop = input.nextInt();
		System.out.println("Stack pop element is "+stack[i-pop]);
	}
	
}
