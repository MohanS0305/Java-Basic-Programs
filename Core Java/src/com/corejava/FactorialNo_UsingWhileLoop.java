package com.corejava;
import java.util.Scanner;

public class FactorialNo_UsingWhileLoop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no :");
		int n = input.nextInt();
		System.out.println("Factorial of "+n);
		input.close();
		int i=1,sum=1;
		
		while(i<=n) {
			sum *= i;
			i++;
		}
		System.out.print(sum);
	}

}
