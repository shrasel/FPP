package lab4.prob0;

public class BadInherit extends SuperClass {
	BadInherit() {
		System.out.println("In BadInherit");
	}

	public static void main(String[] args) {
		new BadInherit();
	}
}

class SuperClass {
	SuperClass() {
		System.out.println("In SuperClass");
		new BadInherit();
	}
}


/**
 *	It causes error and that is "java.lang.StackOverflowError" 
 *  this is because it inherited a super class and inside the super 
 *  class subclass instance has been created
 */
