import java.util.*;
public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); // scanner class
		// input for a & b
		System.out.print("Enter the value for a: ");
		int a=input.nextInt();
		System.out.print("Enter the value for b: ");
		int b=input.nextInt();
		input.close();
		// swap a & b
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is : "+a+"\nb is : "+b);
	}
}
