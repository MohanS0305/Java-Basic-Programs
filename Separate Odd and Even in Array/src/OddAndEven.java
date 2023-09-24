import java.util.*;
public class OddAndEven {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=input.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the "+n+" elements");
		int i;
		for(i=0;i<n;i++) {
			a[i]=input.nextInt();// input for array
		}
		input.close();
		int evensize=0; // initial even size is 0
		int oddsize=0; //  initial odd size is 0
		for(i=0;i<n;i++) {
			if(a[i]%2==0) {
				evensize++;
			}
			else {
				oddsize++;
			}
		}
		// even and odd array size
		int[] even=new int[evensize];
		int[] odd=new int[oddsize];
		// even and odd loop
		int j=0,k=0;
		for(i=0;i<n;i++) {
			if(a[i]%2==0) {
				even[j++]=a[i];
			}
			else {
				odd[k++]=a[i];
			}
		}
		System.out.println("Even numbers are :");
		System.out.print(Arrays.toString(even));
		System.out.println();
		System.out.println("Odd numbers are :");
		System.out.print(Arrays.toString(odd));
	}
}
