package com.java.basicprogram;
import java.util.*;
public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the n numbers");
		int n=input.nextInt();
		input.close();
		int rev=0,copy=n;
		while(n>0) {
			rev=rev*10;
			rev=rev+(n%10);
			n=n/10;
		}
		System.out.println("given no="+copy+" rev="+rev+"\n");
		if(rev==copy) {
			System.out.println("Palindrome No");
		}
		else {
			System.out.println("Not a Palindrome No");
		}
	}
}
