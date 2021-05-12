package com.main;

import java.util.Scanner;
import java.text.DecimalFormat;
import com.hcl.Circle;
import com.hcl.Rectangle;
import com.hcl.Square;

public class Main_1 {

	public static void main(String[] args) {
		DecimalFormat df2 = new DecimalFormat("#.##");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the shapes : ");
		scanner.next();
		scanner.next();
		scanner.next();

		System.out.println("Enter the Shape name : ");
		String name = scanner.next();

		if (name.equals("Circle")) {
			System.out.println("Enter the radius : ");
			int radius = scanner.nextInt();
			Circle circle = new Circle(name, radius);
			System.out.println("Area of the circle is : " + df2.format(circle.calculateArea()));
		} else if (name.equalsIgnoreCase("Square")) {
			System.out.println("Enter the side : ");
			int side = scanner.nextInt();
			Square square = new Square(name, side);
			System.out.println("Area of the Square is : " + df2.format(square.calculateArea()));
		} else if (name.equalsIgnoreCase("Rectangle")) {
			System.out.println("Enter the length : ");
			int length = scanner.nextInt();
			System.out.println("Enter the Breadth : ");
			int breadth = scanner.nextInt();
			Rectangle rectangle = new Rectangle(name, length, breadth);
			System.out.println("Area of the Rectangle is : " + df2.format(rectangle.calculateArea()));
		}
		// Dereferencing
		scanner.close();

	}

}
