package com.corejava;
import java.util.Scanner;

public class Week_days_UsingSwitch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice like : 1,2,3,4,5,6,7");
		int no = input.nextInt();
		input.close();
		
		switch(no) {
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("Wednesday");
			break;
		case 4 :
			System.out.println("Thursday");
			break;
		case 5 :
			System.out.println("Friday");
			break;
		case 6 :
			System.out.println("Saturday");
			break;
		case 7 :
			System.out.println("Sunday");
			break;
		default :
			System.out.println("Incorrect choice pls enter 1 to 7");
		}
		
	}

}
