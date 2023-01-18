package com.citibank.main.domain;

public class Triangle extends Shapes {
	public Triangle() {
		System.out.println("Default Constructor of Triangle");
	}
	
	public Triangle(int size) {
		System.out.println("Parm Counstructor of Triangle");
		System.out.println("Size" + size);
	}

	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}
}
