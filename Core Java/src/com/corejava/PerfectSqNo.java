package com.corejava;
import java.lang.Math;
import java.util.Scanner;

public class PerfectSqNo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no :");
		int n = input.nextInt();
		input.close();
		
		System.out.println(Math.sqrt(n));

	}

}
