package com.assignments.shapes;

public class Triangle extends Shapes {
	private double base;
	private double height;
	public Triangle(double base,double height) {
		super(base,height);
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double calcArea() {
		return base*height/2;
	}
	@Override
	public double calcPerimeter() {
		return base+height+Math.sqrt((base*base)+(height*height));
	}
	
}
