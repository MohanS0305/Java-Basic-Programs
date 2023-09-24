package com.java.basicprogram;
import java.util.*;
public class Duplicate_Char_Remove {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String");
		char[] a=input.next().toCharArray();
		char[] b=new char[a.length+1];
		input.close();
		int i=0,j=0;
		int n=a.length-1;
		i=0;
		while(i<n) {
			if((a[i]==a[i+1]) || (i>0 && a[i]==a[i-1])) {
				i++;
			}
			else {
				b[j]=a[i];
				j++;
				i++;
			}
		}
		if(a[a.length-1]!=a[a.length-2]) {
			b[j]=a[a.length-1];
		}
		System.out.println(b);
	}
}
