package com.corejava.oops.library;

public class User {
	int usrId;
	String usrName;
	String usrBooks;
	String usrCheckIn;
	
	public void user() {
		usrId = 31011801;
		usrName = "S Mohan";
		usrBooks = "2";
		usrCheckIn = "yes";
		
		System.out.println("User Details :");
		System.out.println("usrId : "+usrId);
		System.out.println("usrName : "+usrName);
		System.out.println("usrBooks : "+usrBooks);
		System.out.println("UsrCheckIn status : "+usrCheckIn+"\n");
	}
}
