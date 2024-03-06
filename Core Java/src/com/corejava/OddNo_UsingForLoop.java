package com.corejava;
import java.util.Scanner;
public class OddNo_UsingForLoop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no");
		int n = input.nextInt();
		input.close();
		System.out.println("There are odd numbers :");
		
		for(int i=1; i<=n; i=i+2) {
			System.out.print(i+" ");
		}
		
	}

}
