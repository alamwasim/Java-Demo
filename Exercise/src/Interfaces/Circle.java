package Interfaces;

public class Circle {
	private int radius;
	public Circle() {
		radius=10;
	}
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public double area() {
		return (3.14*radius*radius);
	}
	
	
	
	

}
