package com.gmail.yuomelyanchuk;

public class Main {

	public static void main(String[] args) {
		Point a = new Point(-1, 1);
		Point b = new Point(1, 1);
		Point c = new Point(1, -1);
		Point d = new Point(-1, -1);
		double circleRadius = 5;
		try {

			Triangle tr = new Triangle();
			tr.setTriangleCoordinates(a, b, c);
			System.out.println(tr.getArea());

			Circle cr = new Circle();
			cr.setCenterRaius(a, circleRadius);
			System.out.println(cr.getArea());

			Square sq = new Square();
			sq.setSquareCoordinates(a, b, c, d);
			System.out.println(sq.getPerimetr());

			Table tbl = new Table();
			tbl.setTblSize(4);

			tbl.setShapeOnPosition(tr, 1);
			System.out.println(tbl.getTableInfo());
			System.out.println(tbl.getSumAreaEachShapeOnTable());

			tbl.setShapeOnPosition(cr, 0);
			System.out.println(tbl.getTableInfo());
			System.out.println(tbl.getSumAreaEachShapeOnTable());

			tbl.deleteShapeOnPosition(1);
			System.out.println(tbl.getTableInfo());
			System.out.println(tbl.getSumAreaEachShapeOnTable());

			tbl.setShapeOnPosition(sq, 0);

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());

		}

	}

}
