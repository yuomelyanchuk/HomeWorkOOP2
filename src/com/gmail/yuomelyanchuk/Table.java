package com.gmail.yuomelyanchuk;

public class Table {
	private Shape[] tbl;

	public Table()  {
		super();
	}		

	public void setTblSize(int size) throws IllegalArgumentException{
		if (size<1) throw new IllegalArgumentException("invalid  table size");
		this.tbl = new Shape[size];
	}


	public void setShapeOnPosition(Shape sh, int position) throws IllegalArgumentException {
		if (position > this.tbl.length - 1 && position < 0) {
			throw new IllegalArgumentException("invalid position");
		} else if (this.tbl[position] != null) {
			throw new IllegalArgumentException("position not empty");
		} else {
			this.tbl[position] = sh;
		}
	}

	public void deleteShapeOnPosition(int position) throws IllegalArgumentException {
		if (position > this.tbl.length - 1 && position < 0) {
			throw new IllegalArgumentException("invalid position");
		} else {
			this.tbl[position] = null;
		}
	}

	public String getTableInfo() {
		StringBuilder sp = new StringBuilder("");
		for (Shape shape : this.tbl) {
			if (shape != null) {
				sp.append(shape.getClass());
				sp.append(", area=");
				sp.append(shape.getArea());
				sp.append(System.lineSeparator());
			}
		}
		return (sp.toString());
	}

	public String getSumAreaEachShapeOnTable() {
		double area = 0;
		for (Shape shape : this.tbl) {
			if (shape != null) {
				area += shape.getArea();
			}
		}
		return ("total area="+ area+System.lineSeparator());
	}

}
