package com.corejava.oops;

public class Sum_Of_No {
	
	static int sum(int a, int b, int c) {
		int sum=0;
		sum += a + b + c;
		return sum;
	}

	public static void main(String[] args) {
		
		int totalSum = sum(10,15,21);
		
		System.out.println("Total sum of no is "+totalSum);
		System.out.println("Total sum of 2nd no is "+sum(34,52,87));

	}

}
