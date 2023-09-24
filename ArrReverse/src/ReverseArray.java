import java.util.*;
public class ReverseArray {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter n numbers");
		int n=input.nextInt();
		int[] a=new int[n];
		int[] rev=new int[n];
		System.out.println("Enter elements in array");
		int i;
		int j=0;
		for(i=0;i<n;i++) {
			a[i]=input.nextInt();
		}
		System.out.println("Before reverse an array");
		for(i=0;i<n;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("After reverse an array");
		for(i=n;i>0;i--) {
			rev[j]=a[i-1];
			System.out.println(rev[j]+" ");
		}
		
	}

}
