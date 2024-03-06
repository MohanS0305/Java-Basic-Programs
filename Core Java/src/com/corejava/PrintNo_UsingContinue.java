package com.corejava;

public class PrintNo_UsingContinue {

	public static void main(String[] args) {
		
		for(int i=1; i<100; i++) {
			
			if(i%4==0 & i%6==0) {
				continue;
			}
			else if(i%4!=0 & i%6!=0) {
				System.out.println(i);
			}
		}
	}

}
