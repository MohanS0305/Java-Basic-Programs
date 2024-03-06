package com.corejava;

public class CompoundAssignment {

	public static void main(String[] args) {
		/* compound using Addition */
		int a=10;
		a += 100;
		System.out.println("Addition "+a);
		
		/* compound using Subtraction */
		double b=50;
		b -= 100;
		System.out.println("Subtraction "+b);
		
		/* compound using Multiplication */
		float c=20.24f;
		c *= 100;
		System.out.println("Multiplication "+c);
		
		/* compound using Division */
		short d=128;
		d /= 100;
		System.out.println("Division "+d);
		
		/* compound using Modular */
		int f=24;
		f %= 100;
		System.out.println("Modular "+f);
	}

}
