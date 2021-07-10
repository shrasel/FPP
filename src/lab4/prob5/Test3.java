package lab4.prob5;

public class Test3 {

	public static void main(String[] args) {

		Polygon[] objects = { new Triangle(4, 5, 6), new Square(3), new Rectangle(3, 4) };
		for (Polygon cc : objects) {
			System.out.println("For this " + cc.getClass().getSimpleName() + "\n\tNumber of sides = "
					+ cc.getArrayOfSides().length + "\n\tPerimeter = " + cc.computePerimeter());
		}

	}
}