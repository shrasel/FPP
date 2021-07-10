package lab3.prob4;

public final class Circle {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double computeArea() {
		return Math.PI*radius*radius;
	}

	public double getRadius() {
		return radius;
	}
}
