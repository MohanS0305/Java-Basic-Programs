package com.corejava;
import java.util.Scanner;
public class AllType_Of_UserInput {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			/* user input for byte */
			System.out.println("Enter the no");
			byte b = input.nextByte();
			System.out.println("This is \"Byte\" datatype"+" "+b+"\n");
			/* User input for short */
			System.out.println("Enter the no");
			short s = input.nextShort();
			System.out.println("This is \"Short\" datatype"+" "+s+"\n");
			/* User input for int */
			System.out.println("Enter the no");
			int i = input.nextInt();
			System.out.println("This is \"int\" datatype"+" "+i+"\n");
			/*User input for long */
			System.out.println("Enter the no");
			long l = input.nextLong();
			System.out.println("This is \"Long\" datatype"+" "+l+"\n");
			/*User input for float */
			System.out.println("Enter the no");
			float f = input.nextFloat();
			System.out.println("This is \"Float\" datatype"+" "+f+"\n");
			/* User input for double */
			System.out.println("Enter the no");
			double d = input.nextDouble();
			System.out.println("This is \"Double\" datatype"+" "+d+"\n");
			/* User input for boolean */
			System.out.println("Enter true 'or' false");
			boolean bl = input.nextBoolean();
			System.out.println("This is \"Boolean\" datatype"+" "+bl+"\n");
			/*User input for char */
			System.out.println("Enter any character");
			String c = input.next();
			System.out.println("This is \"Char\" datatype"+" "+c+"\n");
			input.nextLine();
			/* User input for string */
			System.out.println("Enter the name");
			String str = input.nextLine();
			System.out.println("This is \"String\" datatype"+" "+str);
			
			input.close();
		
	}

}
