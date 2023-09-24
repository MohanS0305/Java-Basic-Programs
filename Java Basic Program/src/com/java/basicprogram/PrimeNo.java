package com.java.basicprogram;
import java.util.*;
public class PrimeNo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=input.nextInt();
		input.close();
		int i,count=0;
		for(i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("Prime number");
		}
		else{
			System.out.println("Not a prime number");
		}

	}

}
