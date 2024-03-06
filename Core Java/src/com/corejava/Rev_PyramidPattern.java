package com.corejava;
import java.util.Scanner;

public class Rev_PyramidPattern {

	public static void main(String[] args) {
		System.out.println("Enter the no:");
		Scanner input = new Scanner(System.in);
		//ask the user input
		int n = input.nextInt();
		input.close();
		//call the method
		revPyramidPattern(n);
	}
	// create the method
	static void revPyramidPattern(int starSize) {
		// outer loop for row
		for(int row = 1; row <= starSize; row++) {
			// inner loop for space
			for(int s = 1; s <= row; s++) {
				// print the space
				System.out.print(" ");
			}
			// this inner loop for column
			for(int col = starSize; col >= row; col--) {
				// print the star
				System.out.print("* ");
			}
			// after both the inner loop print new line is for new row
			System.out.println();
		}
		
	}
}
