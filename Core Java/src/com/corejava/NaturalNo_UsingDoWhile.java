package com.corejava;
import java.util.Scanner;

public class NaturalNo_UsingDoWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no");
		int n = input.nextInt();
		System.out.println("There are natural numbers :");
		input.close();
		
		int i=1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=n);
	}

}
