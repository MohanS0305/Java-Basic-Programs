package com.corejava;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		System.out.println("Enter the no:");
		Scanner input = new Scanner(System.in);
		// ask the user input
		int n = input.nextInt();
		input.close();
		StarPattern.starPattern(n);
	}

	static void starPattern(int starSize) {
		// outer for loop for rows
		for (int row = 1; row <= starSize; row++) {
			// inner for loop for columns
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			// inner loop complete print one new line
			System.out.println();
		}

	}

}
