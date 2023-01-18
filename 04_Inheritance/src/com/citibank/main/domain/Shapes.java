package com.citibank.main.domain;
//Generalized class
public abstract class Shapes {
	public Shapes() {
		System.out.println("Default Counstructor of shape");
	}
	public Shapes(int size) {
		System.out.println("Parm Counstructor of Shapes");
		System.out.println("Size" + size);
	}
//	public void draw() {
//		System.out.println("Drawing Shapes");
//	}
// Abstract Method
	public abstract void draw();
	
}
