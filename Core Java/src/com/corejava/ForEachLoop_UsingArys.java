package com.corejava;

public class ForEachLoop_UsingArys {

	public static void main(String[] args) {
		
		int [ ] arr1 = {12, 24, 58, 5, 35};
		
		int sum = 0;
		
		for(int x : arr1) {
			
			sum += x;
			System.out.println(sum);
		}
	}

}
