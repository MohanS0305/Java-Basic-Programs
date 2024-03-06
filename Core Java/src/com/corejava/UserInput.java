package com.corejava;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = input.nextInt();
		input.close();
		System.out.println(" "+" "+" "+no);
		System.out.println(" "+" "+no+no+no);
		System.out.println(" "+no+no+no+no+no);
		System.out.println(no+""+no+""+no+""+no+""+no+""+no+""+no);
	}
}
