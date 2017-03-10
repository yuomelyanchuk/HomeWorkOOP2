package com.gmail.yuomelyanchuk;

public class Triangle extends Shape {
	private Point a = new Point();
	private Point b = new Point();
	private Point c = new Point();

	public Triangle(Point a, Point b, Point c) throws Exception  {
		super();
		if ((super.getDistance(a, b) + super.getDistance(b, c)) > super.getDistance(c, a)
				& (super.getDistance(a, b) + super.getDistance(c, a)) > super.getDistance(b, c)
				& (super.getDistance(c, a) + super.getDistance(b, c)) > super.getDistance(a, b)) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		else{
			 throw new Exception("Triangle not exists");
		}
	}

	@Override
	public double getPerimetr() {
		return (super.getDistance(a, b) + super.getDistance(b, c) + super.getDistance(c, a));
	}

	@Override
	public double getArea() {
		double polP = getPerimetr() / 2;
		return Math.sqrt(polP * (polP - super.getDistance(a, b)) * (polP - super.getDistance(b, c))
				* (polP - super.getDistance(c, a)));
	}

}
