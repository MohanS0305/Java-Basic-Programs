package com.java.basicprogram;
import java.util.Scanner;
public class Area_Of_Circle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// Formula for Area=pi*r*r
		// Area=(pi)3.14f*r*r
		System.out.println("Enter the radius of circle :");
		float r=input.nextFloat();
		input.close();
		float Area=3.14f*r*r; // we can write like this or we can directly print the values
		// System.out.println("Area="+(3.14f*r*r); like this
		System.out.println("Area= "+Area);
	}
}