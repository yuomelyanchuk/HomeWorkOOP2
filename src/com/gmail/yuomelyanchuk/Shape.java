package com.gmail.yuomelyanchuk;

public abstract class Shape {
	
	public abstract double getPerimetr();
	public abstract double getArea();
	public double getDistance(Point a,Point b){		
		return Math.sqrt(Math.pow(b.getX()-a.getX(),2)+ Math.pow(b.getY()-a.getY(),2));
	}

}
