package com.java.basicprogram;
import java.util.*;
public class Triangle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the sides of triangle");
		System.out.println("Enter the value of ab side of an triangle");
		int ab=input.nextInt();
		System.out.println("Enter the value of bc side of an triangle");
		int bc=input.nextInt();
		System.out.println("Enter the value of ca side of an triangle");
		int ca=input.nextInt();
		input.close();
		// 1. ab==bc==ca 3 sides are equal (Equilateral Triangle)
		// 2. ab==bc || bc==ca || ca==ab 2 sides are equal (Isosceles Triangle)
		// 3. ab!=bc & bc!=ca & ca!=ab 3 sides are different (Scalene Triangle)
		 if(ab==bc && ab==ca){
			System.out.println("Equilateral Triangle");
		}
		else if((ab==bc) || (bc==ca) || (ca==ab)){
			System.out.println("Isosceles Triangle");
		}
		else{
			System.out.println("Scalene Triangle");
			}
	}

}
