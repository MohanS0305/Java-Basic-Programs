import java.util.*;
public class StarPattern {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the n numbers for star pattern");
		int r=input.nextInt();
		 int i,j;
		 
		 // nested loop for row & column
		
		 for(i=0;i<r;i++) {
			 for(j=0;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
	 }

}
