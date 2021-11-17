package com.shape;

public class Shapes {
	
	public String shape;
	public String color;
	public double length;
	public double width;
	public double area;
	public double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Shapes [shape=" + shape + ", color=" + color + ", length=" + length + ", width=" + width + ", radius =" + radius +", area="
				+ area + "]";
	}
}
