package com.corejava.oops;

public class SurfaceArea_Of_Box {

	int length;
	int breath;
	int height;
	
	int box() {
		// surface area formula is 2lb + 2lh + 2hb
		int surfaceArea = 2*length*breath + 2*length*height + 2*height*breath;
		return surfaceArea;		
	}
	
	public static void main(String[] args) {
		
		SurfaceArea_Of_Box b = new SurfaceArea_Of_Box();
		
		b.length = 20;
		b.breath = 10;
		b.height = 3;
		
		int surfaceArea=b.box();
		System.out.println("SurfaceArea of a box is "+surfaceArea);

	}

}
