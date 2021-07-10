package lab4.prob2;

public class Test {

	public static void main(String[] args) {

		ClosedCurve[] objects = { 
				new Triangle(4, 5, 6), 
				new Square(3), 
				new Circle(3) ,
				new Rectangle(20,10)
				};

		for (ClosedCurve cc : objects) {
			System.out.println("The area of this "+cc.getClass().getSimpleName()+" is "+ cc.computeArea());

		}

	}

}