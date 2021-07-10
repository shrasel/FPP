package lab4.prob5;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;

	public Square(double side) {
		this.side = side;

	}
	
	public int getNumberOfSides() {
		return 4;
	}
	
	public double computeArea() {
		return side * side;
	}

	@Override
	public double[] getArrayOfSides() {
		return new double[] { side, side, side, side };
	}
}