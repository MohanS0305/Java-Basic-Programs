package com.corejava;
import java.util.Scanner;

public class Vowels_UsingSwitch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any alphabet");
		char ch = input.next().charAt(0);
		input.close();
		
		switch(ch) {
		case ('a') :
		case ('e') :
		case ('i')  :
		case ('o') :
		case ('u') :
			System.out.println("It is Vowels");
		break;
		default :
			System.out.println("It is Consonant");
		}
		
	}

}
