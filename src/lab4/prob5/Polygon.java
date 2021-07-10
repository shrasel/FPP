package lab4.prob5;

public interface Polygon {

	public double[] getArrayOfSides();

	static double sum(double[] arr) {
		double sumOfSides = 0;
		for (double side : arr) {
			sumOfSides += side;
		}
		return sumOfSides;
	}

	default double computePerimeter() {
		return sum(getArrayOfSides());
	}

}
