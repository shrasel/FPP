package lab9.prob1;

public class MyStack {
	private MyStringLinkedList list;

	public MyStack() {
		list = new MyStringLinkedList();
	}

	public boolean pop() {
		// implement
		return list.remove(0);
	}

	public String peek() {
		// implement
		return list.get(0);
	}

	public void push(String s) {
		// implement
		list.add(s);
	}

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("Rasel");
		stack.push("Suha");
		stack.push("Safwan");
		stack.push("Jesmin");
		System.out.println("Popping…" + stack.pop());
		System.out.println("Peeking…." + stack.peek());
		System.out.println("Popping…" + stack.pop());
	}
}
