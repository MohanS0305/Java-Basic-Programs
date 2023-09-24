package com.BinarySearch;

public class BinarySearch {
	
	public int binarSearch(int[] arr, int findElement) {
		
		int startIndex = 0;
		int endIndex =arr.length-1;
		
		while (startIndex <= endIndex) {
			int midPosition = (startIndex + endIndex)/2;
			int midNumber = arr[midPosition];
			
			if(findElement == midNumber) {
				return midPosition;
			}
			
			if(findElement < midNumber) {
				endIndex = midPosition - 1;
			} else {
				startIndex = midPosition + 1;
			}	
		}
		return -1;
	}
}
