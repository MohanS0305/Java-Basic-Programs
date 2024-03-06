package com.corejava;

import java.util.Scanner;

public class ReverseStarPattern {

	public static void main(String[] args) {
		System.out.println("Enter the no:");
		Scanner input = new Scanner(System.in);
		// ask the user input
		int n = input.nextInt();
		input.close();
		ReverseStarPattern.revStrPattern(n);
	}

	static void revStrPattern(int starSize) {
		// outer loop is for row
		for (int row = 1; row <= starSize; row++) {
			// inner loop is for column
			for (int col = starSize; col >= row; col--) {
				// print the star
				System.out.print("* ");
			}
			// after the inner for loop is complete print new line
			System.out.println();
		}

	}

}
