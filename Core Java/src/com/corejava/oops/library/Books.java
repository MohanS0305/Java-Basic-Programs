package com.corejava.oops.library;

public class Books {
	String bookName;
	String author;
	String releaseDate;
	
	public void books() {
		bookName = "To Kill a Mockingbird";
		author = "Harper Lee";
		releaseDate = "11-July-1960";
		
		System.out.println("Books Details :");
		System.out.println("Book Name : "+bookName);
		System.out.println("Author : "+author);
		System.out.println("Release Date : "+releaseDate+"\n");
	}
}
