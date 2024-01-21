package com.assignments.shapes;

public class Rectangle extends Shapes {
	private double width;
	private double height;
	
	public Rectangle(double w,double h) {
		super(w,h);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double calcArea() {
		return this.height*this.width;
	}
	@Override
	public double calcPerimeter() {
		return 2*(this.height+this.width);
	}
}
