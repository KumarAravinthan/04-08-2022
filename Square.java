package com.abstracts.demo;

public class Square extends Rectangle {
	
	
	public Square()
	{
		
	}
	
	public Square(double side)
	{
		length=side;
	}
	public Square(double side,double radius,String color,boolean filled)
	{
		length=side;
		width=side;
		this.color=color;
		this.filled=filled;
	}

	public double getSide() {
		return length;
	}

	public void setSide(double side) {
		this.length = side;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	  
	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}
	
	
}
