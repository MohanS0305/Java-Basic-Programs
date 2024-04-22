package com.java.basicprogram;

public class CheckNo {

	public static void main(String[] args) {
		// input is n = 1385757879
		// check how many times 7 will present in this no
		// output is 3
		
		int n = 1385757879;
		System.out.println(checkTheNo(n));
	}
	
	private static int checkTheNo(int no) {
		int count = 0;
		// check the no is greater than 0 or not
		while(no > 0) {
			// extract the last digit in the number
			int rem = no % 10;
			// and check the extracted no is 7 or not
			if (rem == 7) {
				// if it's 7 increment the count by 1
				count++;
			}
			// after remove the last digits in the number
			no = no / 10;
		}
		return count;
	}
}
