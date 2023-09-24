import java.util.Scanner;
public class AtmTransaction {

	public static void main(String[] args) {
		// input for user
		Scanner input = new Scanner(System.in);
		// initialize the current balance
		double currentBalance = 0.00;
		// print current balance
		System.out.println("Your current balance is "+currentBalance);
		// user input for deposite amount
		System.out.print("Enter the deposite amount to your account : ");
		double depositeAmount = input.nextDouble();
		// calculation for currentBalance and deposite amount
		currentBalance = currentBalance + depositeAmount;
		// print the currentBalance after deposite amount
		System.out.println("After deposite your current account balance is "+currentBalance+"rs");
		// user input for withdraw amount
		System.out.print("Enter the withdraw amount : ");
		double withdrawAmount = input.nextDouble();
		// calculation for withdraw amount
		currentBalance = currentBalance - withdrawAmount;
		// print the currentBalance after withdraw amount
		if(currentBalance>withdrawAmount) {
			System.out.println("After withdraw your current account balance is "+currentBalance+"rs");
		}
		else {
			System.out.println("InSufficient amount to your account");
			System.out.println("Your current account balance is "+depositeAmount);
		}
	}
}
