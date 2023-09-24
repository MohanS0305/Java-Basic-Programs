
public class Transaction {

	public static void main(String[] args) {
		// initializing the balance amount here
		double balance = 10550.55;
		
		// initializing the deposite amount here
		double depositeAmount = 1000;
		
		// calculation for deposite amount
		balance = balance + depositeAmount;
		
		// print the current balance 
		System.out.println("After deposite balance is "+balance+" rs");
		
		// initializing the withdraw amount
		double withdraw = 2500;
		
		// calculation for withdraw amount
		balance = balance - withdraw;
		
		// after withdraw print the current balance
		System.out.println("After withdraw balance is "+balance+" rs");
	}
}
