package com.corejava.oops;

public class Student {

	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		System.out.println("Rollno :" + rollNo);
		System.out.println("Name : " + name);
	}

	void totalMarks() {
		int marks[] = { 64, 72, 84, 52, 92 };
		System.out.println("marks : ");
		int count = 0;
		for(int i = 0; i < marks.length; i++) {
			count++;
			System.out.println("Subject"+count+": "+marks[i]);
		}
	}

	public static void main(String[] args) {

		Student s1 = new Student(1, "Rahul");
		s1.totalMarks();
		System.out.println();
	}

}
