package com.hcl;
	
	public class Circle extends Shape {
		private double radius;
		final double PI = 3.14;

		public Circle(String name, double d) {
			super(name);
			this.radius = d;
		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}

		public float calculateArea() {
			return (float) (PI * radius * radius);
		}

	}

