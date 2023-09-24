import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("1-->Addition ,2-->Subtraction ,3-->Multiplication ,4-->Division");
		System.out.println("Enter the choice");
		char choice=input.next().charAt(0);
		System.out.print("Enter the first number : ");
		int a=input.nextInt();
		System.out.print("Enter the second number : ");
		int b=input.nextInt();
		int ans=0;
		switch(choice) {
		case '1': // Addition
			ans=a+b;
			System.out.println("a "+"+ "+"b "+"ans = "+ans);
			break;
		case '2': // Subtraction
			ans=a-b;
			System.out.println("a "+"- "+"b "+"ans = "+ans);
			break;
		case '3': // Multiplication
			ans=a*b;
			System.out.println("a "+"* "+"b "+"ans = "+ans);
			break;
		case '4': // Multiplication
			ans=a/b;
			System.out.println("a "+"/ "+"b "+"ans = "+ans);
			break;
		default:
			System.out.println("Invalid Please enter the correct choice");
		}
		input.close();
	}
}
