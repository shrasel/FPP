package finalexampractice;

public class dublyLinkedList {
	Node header;

	dublyLinkedList() {
		header = new Node(null, null, null);
	}

	public Node addFirst(String str) {

		Node firstNode = new Node(header.next, header, str);

		if (header.next != null)
			header.next.previous = firstNode;

		header.next = firstNode;

		return firstNode;

	}

	public void insertNode(String data, int pos) {
		Node current = header;

		for (int i = 0; i < pos && current.next != null; i++) {
			current = current.next;
		}

		Node newNode = new Node(current.next, current, data);
		if (current.next != null)
			current.next.previous = newNode;
		current.next = newNode;

	}

	public boolean removeNode(String data) {
		Node current = header;

		while (current.next != null) {
			
			current = current.next;
			
			if(current.data.equals(data)) {
				if(current.next != null)
				current.next.previous = current.previous;
				
				current.previous = current.next;
				return true;
				
			}
		}
		
		return false;
	}
	
	public String toString() {
		Node next = header.next;
		if (next == null)
			return "Empty List";
		String output = next.toString();
		return ("[" + output + "]");
	}

	class Node {
		Node next;
		Node previous;
		String data;

		Node(Node next, Node previous, String data) {
			this.next = next;
			this.previous = previous;
			this.data = data;
		}

	}
	
	public static void main(String args) {
		dublyLinkedList dbl = new dublyLinkedList();
		
		dbl.addFirst("first");
		dbl.insertNode("second", 0);
		
		System.out.println(dbl);
		
		
	}

}
