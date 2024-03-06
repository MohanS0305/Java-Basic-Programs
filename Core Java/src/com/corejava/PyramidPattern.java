package com.corejava;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		System.out.println("Enter the no:");
		Scanner input = new Scanner(System.in);
		// ask the user input
		int n = input.nextInt();
		input.close();
		pyramidPattern(n); // calling the pyramidPattern method
	}

	static void pyramidPattern(int starSize) {
		// outer loop for rows
		for (int row = 1; row <= starSize; row++) {
			// inner loop for print some space

			for (int s = starSize; s >= row; s--) {
				// print the space
				System.out.print(" ");
			}

			// inner loop for column
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}

			// after both inner loop print a new line
			System.out.println();
		}
	}

}
