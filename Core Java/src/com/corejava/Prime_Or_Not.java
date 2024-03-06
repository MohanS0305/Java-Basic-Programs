package com.corejava;
import java.util.Scanner;

public class Prime_Or_Not {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = input.nextInt();
		input.close();
		
			if(n%2==0) {
				System.out.println(n+" is Not a prime number");
			}
			else {
				System.out.println(n+" is a prime number");
			}
		
	}

}
