package com.corejava;
import java.util.Scanner;

public class RightAngle_StrPattern {

	public static void main(String[] args) {
		System.out.println("Enter the no:");
		Scanner input = new Scanner(System.in);
		//ask the user input
		int n = input.nextInt();
		input.close();
		RightAngle_StrPattern.rightAngleStrPatter(n);

	}
	
	static void rightAngleStrPatter(int starSize) {
		// starPattern
		for(int row = 1; row <= starSize; row++) {
			//inner loop for column
			for(int col = 1; col <= row; col++) {
				//print the star
				System.out.print("* ");
			}
			//after inner loop complete print one new line
			System.out.println();
		}
		
		//reverse starPattern
		//outer loop for row
		for(int row = 1; row <= starSize; row++) {
			//inner loop for column
			for(int col = starSize-1; col >= row; col--) {
				//print the star
				System.out.print("* ");
			}
			//after inner loop complete print one new line
			System.out.println();
		}
	}

}
