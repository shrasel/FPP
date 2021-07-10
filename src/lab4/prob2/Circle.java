package lab4.prob2;

public final class Circle extends ClosedCurve {
	private final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		return (Math.PI * radius * radius);
	}
}
