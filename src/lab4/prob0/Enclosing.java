package lab4.prob0;

public class Enclosing implements Cloneable {
	public Enclosing clone() throws CloneNotSupportedException {
		System.out.println("Inside Enclosing.clone()");
		return (Enclosing) super.clone();
	}

	class Inner implements Cloneable {
		void innerMethod() throws CloneNotSupportedException {
			Enclosing en = new Enclosing();
			System.out.println(en.clone().getClass().getName());
		}
	}

	public static void main(String[] args) {
		Enclosing p1 = new Enclosing();
		Enclosing.Inner i1 = p1.new Inner();

		try {
			i1.innerMethod();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}