package com.corejava.oops;

public class Student_Demo {
	int rollNo;
	String name;
	int marks;
	int age;

	Student_Demo(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	Student_Demo(String name, int rollNo, int marks, int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.age = age;
	}

	public static void main(String[] args) {
		 Student_Demo s1 = new Student_Demo(12301, "Rahul", 85);
		 System.out.println("Rollno: "+s1.rollNo);
		 System.out.println("Name: "+s1.name);
		 System.out.println("Marks: "+s1.marks+"\n");
		 
		 System.out.println("This is constructor overloading");
		 Student_Demo s2 = new Student_Demo("Mohan", 12302, 65, 22);
		 System.out.println("Rollno: "+s2.rollNo);
		 System.out.println("Name: "+s2.name);
		 System.out.println("Marks: "+s2.marks);
		 System.out.println("Age: "+s2.age);
	}

}
