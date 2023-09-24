package com.BinarySearch;

public class TestBinarySearch {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 5, 7, 9, 11, 14};
		BinarySearch search = new BinarySearch();
		int result =search.binarSearch(arr, 5);
		System.out.println(result);
	}

}
