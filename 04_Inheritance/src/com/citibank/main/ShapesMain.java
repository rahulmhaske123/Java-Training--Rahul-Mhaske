package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Circle;
import com.citibank.main.domain.Line;
import com.citibank.main.domain.Shapes;
import com.citibank.main.domain.Triangle;

public class ShapesMain {

	public static void main(String[] args) {
//		int Choice;
//		Circle circle = new Circle();
//		circle.draw();
//		Line line = new Line();
//		Triangle triangle = new Triangle();
//		Shapes shapes = new Circle();
//		circle.print();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1- Circle , 2-Triangle , 3-Line");
		System.out.println("Enter Yuor Choice-");
		int Choice = scanner.nextInt();
		Shapes shapes = getshape(Choice);
		shapes.draw();
	}

	public static Shapes getshape(int Choice) {
		if (Choice == 1) {
			Shapes shapes = new Circle();
			return shapes;
		}
		if (Choice == 2) {
			return new Triangle();
		}
		if (Choice == 3) {
			return new Line();
		}
//		return new Shapes();
		return null;
	}

}
