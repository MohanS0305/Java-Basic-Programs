package com.corejava.oops.library;

public class ReminderMessage {
	String bookDuration;
	String givenDate;
	String endDate;
	
	public void reminderMsg() {
		bookDuration = "5 days";
		givenDate = "12-jan-2022";
		endDate = "17-jan-2022";
		
		System.out.println("ReminderMessage :");
		System.out.println("Book Duration : "+bookDuration);
		System.out.println("Given Date : "+givenDate);
		System.out.println("End Date : "+endDate+"\n");
	}
}
