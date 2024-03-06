package com.corejava;

public class Avg {
	
	static int avg(int a, int b) {
		int sum = a+b;
		return sum/2;
	}
	
	static double avg(double a,double b, double c) {
		double sum = a+b+c;
		return sum/3;
	}

	public static void main(String[] args) {
		System.out.println("Average of two no is "+avg(10,15));
		System.out.println("Average of three no is "+avg(12, 20.34,14.7));
	}

}
