package lab4.prob2;

public class Rectangle extends ClosedCurve {
	
	private double width;
	private double length;
	
	public Rectangle(double w,double h) {
		this.width  = w;
		this.length = h;
	}

	@Override
	public double computeArea() {
		return (length*width);
	}
}
