package com.gmail.yuomelyanchuk;

public class Square extends Shape {
	private Point a = new Point();
	private Point b = new Point();
	private Point c = new Point();
	private Point d = new Point();

	public Square(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		testSquare();

	}

	public Square() {
		super();
	}

	public void setSquareCoordinates(Point a, Point b, Point c, Point d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		testSquare();
	}	

	private void testSquare() throws IllegalArgumentException {
		if (super.getDistance(a, b) == super.getDistance(b, c) & super.getDistance(b, c) == super.getDistance(c, d)
				& super.getDistance(c, d) == super.getDistance(d, a)) {

		} else {
			throw new IllegalArgumentException("not square point");
		}
	}

	@Override
	public double getPerimetr() {
		return (super.getDistance(a, b) * 4);
	}

	@Override
	public double getArea() {
		return (Math.pow(super.getDistance(c, d), 2));
	}

}
