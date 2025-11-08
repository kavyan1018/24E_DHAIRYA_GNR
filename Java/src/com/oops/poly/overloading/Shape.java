package com.oops.poly.overloading;

public class Shape {

	public void getArea() {

		System.out.println("get area called....");
	}

	public void getArea(float r) {

		System.out.println("area of circle = " + 3.14 *(r*r));
	
	}
	public int getArea(int h,int w) {
		
		System.out.println("area of rect");
		
		return h *w;
	}
	public void getArea(String s) {
		
		System.out.println("stirng area..");
	}
	
	public void getArea(int x,String str) {
		
		
	}
	
	public double getArea(double h) {
		
		System.out.println("are of square...");
		return h *h;
	}

	public static void main(String[] args) {

		Shape s = new Shape();
		s.getArea();
		s.getArea(12.23);
		s.getArea(12f);
		s.getArea(12, 4);
		
		
		
		
		
		
		
	}
}
