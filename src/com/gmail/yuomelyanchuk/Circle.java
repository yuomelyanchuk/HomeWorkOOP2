package com.gmail.yuomelyanchuk;

public class Circle extends Shape {
	private Point centr = new Point();
	private double radius;

	public Circle(Point centr, double radius) throws Exception {
		super();
		if (radius > 0) {
			this.centr = centr;
			this.radius = radius;
		}
		else{
			throw new Exception("radius must be greater than 0");
		}
	}

	@Override
	public double getPerimetr() {
		return (2 * Math.PI * radius);
	}

	@Override
	public double getArea() {
		return (Math.PI * Math.pow(radius, 2));

	}

}
