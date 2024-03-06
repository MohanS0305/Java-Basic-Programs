package com.corejava.oops.library;

public class Card {
	String title;
	int pageNo;
	String description;
	
	public void card() {
		title = "To kill a mockingbird";
		pageNo = 281;
		description = "To Kill a Mockingbird is a novel by the American author Harper Lee. "
				+ "It was published in 1960 and was instantly successful.";
		
		System.out.println("Card Details :");
		System.out.println("Title : "+title);
		System.out.println("Page No : "+pageNo);
		System.out.println("Description : "+description+"\n");
	}
}
