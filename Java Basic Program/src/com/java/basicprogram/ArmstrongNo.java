package com.java.basicprogram;
import java.util.*;
public class ArmstrongNo {
	// static is family member of main method
	static int pow(int a,int b) { // a is base number b is power of base
		int power=1; // initial power is 1
		int i;
		for(i=0;i<b;i++) {  // for loop for base of power
			power=power*a;  // multiply base*power
		}
		return power;       // return the power value
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);  // scanner class
		System.out.println("Enter the n number"); 
		int n=input.nextInt(); // input for n numbers
		input.close();
		int count=0,copy=n,ans=0;
		while(n>0) { 
			count++;
			n=n/10; // the given number is divided by 10
			System.out.println(count);
		}
		// after the while loop n=0
		// so we reset the n value
		n=copy;
		while(n>0) {
			ans=ans+pow((n%10),count); // ans=given number+power((n%10),count)
            n=n/10;
		}
		System.out.println(ans);
		if(ans==copy) { // check the given number and copy of number is equal are not
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}
}
