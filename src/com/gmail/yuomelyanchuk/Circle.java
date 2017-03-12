package com.gmail.yuomelyanchuk;

public class Circle extends Shape {
	private Point centr = new Point();
	private double radius;

	public Circle(Point centr, double radius) {
		super();
		this.centr = centr;
		this.radius = radius;
		testCircle();

	}

	public Circle() {
		super();

	}

	public void setCentr(Point centr) {
		this.centr = centr;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		testCircle();
	}

	private void testCircle() throws IllegalArgumentException {
		if (this.radius < 0)
			throw new IllegalArgumentException("radius must be greater than 0");
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
