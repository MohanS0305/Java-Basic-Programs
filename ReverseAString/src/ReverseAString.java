import java.util.*;
public class ReverseAString {

	public static void main(String[] args) {
		String str="MOHAN";
		String revstr="";
		int i;
		for(i=str.length()-1;i>=0;i--) {
		revstr=revstr+str.charAt(i);
		}
		System.out.println("Original String "+str);
		System.out.println("Reverse String "+revstr);

	}
}
