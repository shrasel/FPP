package finalexampractice;


// Build a stack


import java.util.LinkedList;

public class Prob4 {
	LinkedList<String> linkedList = new LinkedList<>();
	
	void push(String data) {
		linkedList.addFirst(data);
	}
	
	String pop() {
		return linkedList.removeFirst();
	}
	
	String peek() {
		return linkedList.getFirst();
	}
	
	public static void main(String[] args) {
		Prob4 myStack = new Prob4();
		myStack.push("Bob"); 
		myStack.push("Harry");
		myStack.push("Alice");
		System.out.println("Popping…"+myStack.pop());
		System.out.println("Peeking…."+myStack.peek());
		System.out.println("Popping…"+myStack.pop());
	}

}
