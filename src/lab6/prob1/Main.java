package lab6.prob1;

public class Main {
	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b', "Billy");
		t.add('w', "Willie");
		System.out.println(t);
		System.out.println("Entry of char w is " + t.get('w'));
		System.out.println("Entry of char x is " + t.get('x'));
	}
}