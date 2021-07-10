package lab3.prob4;

public class Main {
	public static void main(String[] args) {
		Circle cr = new Circle(20);
		Rectangle rt = new Rectangle(40, 50);
		Triangle tr = new Triangle(10, 15);
		
		System.out.println("Area of Triangle is " +tr.computeArea());
		System.out.println("Area of Circle is " +cr.computeArea());
		System.out.println("Area of Rectangle is " +rt.computeArea());
		
		
		
	}
}
