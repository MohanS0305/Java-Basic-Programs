package com.corejava;
import java.util.Scanner;

public class MinElement {

	public static void main(String[] args) {
		//ask the user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of an element: ");
		int size = input.nextInt();
		//create an array
		int[] array = new int[size];
		//loop through that array
		System.out.println("Enter the " + size +" elements:");
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		//take each element in the array check less than minimum
		int len = array.length;
		int min = array[0];
		for (int i = 0; i < len; i++) {
			if (array[i] < min) {
				//if it less than minimum store it in minimum itself
				min = array[i];
			}
		}
		System.out.println("Minimum element in the array is: " + min);
	}

}
