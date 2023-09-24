import java.util.*;
public class Fabonnaci {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the n numbers");
		int n=input.nextInt();
		int[] a=new int[n];
		input.close();
		int count=0;
 		a[0]=0;
 		a[1]=1;
 		for( int i=2;i<n;i++) {
 			 count++;
 			a[i]=a[i-1]+a[i-2];
 		}
 		for(int i=0;i<n;i++) {
 			System.out.println(a[i]);
 		}

	}

}
