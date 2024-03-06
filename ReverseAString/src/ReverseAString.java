import java.util.*;

/**
 * 
 */
class ReverseAString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any name");
		String name = input.nextLine(); // string input 
		input.close();
		String revString = ""; // empty string for reverse string
		
		// take each character of a string using for loop
		for(int i = name.length()-1; i >= 0; i--) { // reverse the loop for reverse the string
				revString += name.charAt(i); // add each character to revString 
		}
		System.out.print(revString); // print the revString
	}
	
}
