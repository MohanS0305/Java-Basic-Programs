package com.java.basicprogram;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String");
		char[] a=input.next().toCharArray(); // input
		input.close();
		int i,j,count=0; // initial count is zero
		// condition for given string stating index[0] increment by one
		// the reverse string last index[-1] decrement by one 
		//       mom==mom
		// index 012  210
		//       mohan==nahom
		// index 01234  43210
		for(i=0,j=a.length-1;i<a.length;i++,j--) { 
			if(a[i]!=a[j]) { // the given string and reverse string is mismatch
				count++; // count increment by one
			}
			System.out.println(a[i]+"=="+a[j]+" "+count);
		}
		if(count==0) { // the given string & reverse string is match
			System.out.println("Palindrome"); // palindrome
		}
		else {        // the given string & reverse string is mis-match
			System.out.println("Not a palindrome"); // not a palindrome
		}
	}
}
