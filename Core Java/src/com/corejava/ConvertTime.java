package com.corejava;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ConvertTime {

	public static void main(String[] args) {
		// ask the user input
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the 12hrs time in number:");
		try {
			int time = input.nextInt();
			input.close();
			//convert to 24hrs time
			if (time > 0 && time <= 12) {
				int changeTime = time + 12;
				//print the time
				System.out.println(time + "hrs is " + changeTime + "hrs in 24hrs time.");
			}
			else {
				System.out.println("Pls Enter the 12hrs time.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Pls enter the number.");
		}
		
	}

}
