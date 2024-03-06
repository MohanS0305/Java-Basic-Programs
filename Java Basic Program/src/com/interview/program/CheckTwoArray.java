package com.interview.program;

public class CheckTwoArray {
	
	public static void main(String[] args) {

		int[] ar1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] ar2 = { 1, 2, 3, 4, 5, 6, 7};

		System.out.println(checkTwoArray(ar1, ar2));
	}

	@SuppressWarnings("unused")
	public static boolean checkTwoArray(int[] ar1, int[] ar2) {

		if (ar1.length == ar2.length) {
			for (int i = 0; i < ar1.length; i++) {
				if (ar1[i] == ar2[i]) {
					return true;
				} else {
					return false;
				}
			}
		}

		return false;
	}
}
