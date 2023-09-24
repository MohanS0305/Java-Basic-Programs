import java.util.Scanner;
public class ReverseNoPattern{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); // scanner class
		System.out.print("Enter the n numbers :");
		int n=input.nextInt(); // input for n numbers
		input.close();
		int count=0; // initial count is 0
		while(n>0) {
			count++;
			System.out.println(n+" ");
			n=n/10;
		}
	}
}