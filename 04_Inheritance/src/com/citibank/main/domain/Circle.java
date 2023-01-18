package com.citibank.main.domain;

public class Circle extends Shapes {
	public Circle() {
		System.out.println("Default Constructor of Circle");
	}
	public Circle(int size) {
//		super(); -- This is default written by compiler implicitly
		super(size);
		System.out.println("Parm Counstructor of Circle");
		System.out.println("Size" + size);
	}	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
}
