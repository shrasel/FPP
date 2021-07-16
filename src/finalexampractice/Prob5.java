package finalexampractice;


// Queue implementation 

import java.util.LinkedList;

public class Prob5 {
	
	LinkedList<String> lst;
	
	Prob5(){
		lst = new LinkedList<String>();
	}
	
	public void enqueue(String s) {
		lst.addLast(s);
	}
	
	public String dequeue() throws Exception {
		if(lst.isEmpty()) throw new Exception("Queue is empty");	
		return lst.removeFirst();
	}
	
	public String peek() {
		if(lst.isEmpty()) return null;
		
		return lst.getFirst();
	}

	public static void main(String[] args) {
		Prob5 myQueue = new Prob5();
		myQueue.enqueue("Bob");
		myQueue.enqueue("Harry");
		myQueue.enqueue("Alice");
		
		try {
			System.out.println("Popping…" + myQueue.dequeue());
			System.out.println("Peeking…." + myQueue.peek());
			System.out.println("Popping…" + myQueue.dequeue());
			System.out.println("Popping…" + myQueue.dequeue());
			System.out.println("Popping…" + myQueue.dequeue());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
