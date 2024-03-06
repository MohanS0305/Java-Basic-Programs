package com.corejava;

import java.util.Scanner;

public class CombinedRev_StarPattern {

	public static void main(String[] args) {
		System.out.println("Enter the no:");
		Scanner input = new Scanner(System.in);
		// ask the user input
		int n = input.nextInt();
		input.close();
		CombinedRev_StarPattern.combinedRevStarPattern(n);

	}

	static void combinedRevStarPattern(int starSize) {
		// reverse starPattern
		// outer loop for row
		for (int row = 1; row <= starSize; row++) {
			// inner loop for column
			for (int col = starSize; col >= row; col--) {
				// print the star
				System.out.print("* ");
			}
			// after inner loop complete print one new line
			System.out.println();
		}

		// starPattern
		for (int row = 2; row <= starSize; row++) {
			// inner loop for column
			for (int col = 1; col <= row; col++) {
				// print the star
				System.out.print("* ");
			}
			// after inner loop complete print one new line
			System.out.println();
		}
	}

}
