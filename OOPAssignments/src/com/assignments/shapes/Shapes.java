package com.assignments.shapes;

public abstract class Shapes {
	public double h;
	public double w;
	
//	Shapes(){}
	public Shapes(double h,double w) {
		this.h=h;
		this.w=w;
	}
	
	public abstract double calcArea();
	public abstract double calcPerimeter();
}
