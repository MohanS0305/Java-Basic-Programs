package com.corejava.oops;

public class TwoDigit_Or_Not {
	
	static boolean twoDigit(int n) {
		if(n>9) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		boolean result = twoDigit(25);

		System.out.println(result);
	}

}
