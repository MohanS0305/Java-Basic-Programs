import java.util.*;
public class SquareNo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the n numbers");
		int n=input.nextInt();
		input.close();
		int i;
		System.out.println("N Square numbers are:");
		for(i=1;i<=n;i++) {
			System.out.print(i*i+" ");
		}
	}
}
