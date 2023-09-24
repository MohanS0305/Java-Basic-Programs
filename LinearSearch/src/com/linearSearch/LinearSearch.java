package com.linearSearch;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter how many elements you want");
			int size = input.nextInt();
			
			System.out.println("Enter the "+size+" elements");
			int arr[] = new int[size];
			for(int i=0; i<arr.length; i++) {
				arr[i] = input.nextInt();
			}
			
			System.out.print("your elements are: "); 
			for(int temp : arr) {
				System.out.print(temp+" ");
			}
			System.out.println();
			System.out.println("Enter the find element :");
			int key = input.nextInt();
			input.close();
			int result = linearSearch(arr, key);
			if(result != -1) {
				System.out.println(key+" element was found successfully in index "+result);
			} else {
				System.out.println(key+" is not found "+result);
			}
			
	}
	
	public static int linearSearch(int arr[], int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
