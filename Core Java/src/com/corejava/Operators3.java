package com.corejava;

public class Operators3 {

	public static void main(String[] args) {
		/* Operators using Different data types */
		// byte for add, sub, mul, div, mod 
		byte a=100, b=18, c;
		c = (byte) ((byte) a + b);
		System.out.println("Addition "+c);
		
		c = (byte) ((byte)a - b);
		System.out.println("Subraction "+c);
		
		c = (byte) ((byte) a * b);
		System.out.println("Multiplication "+c);
		
		c = (byte) ((byte) a / b);
		System.out.println("Division "+c);
		
		c = (byte) ((byte) a % b);
		System.out.println("Modular "+c+"\n");
		
		// double for add, sub, mul, div, mod
		
		double s=12.4, f=5.47, d;
		
		d = s + f;
		System.out.println("Addition "+d);
		
		d = a - b;
		System.out.println("Subtraction "+d);
		
		d = s * f;
		System.out.println("Multiplication "+d);
		
		d = s / f;
		System.out.println("Division "+d);
		
		d = s % f;
		System.out.println("Modular "+d);
		
	}

}
