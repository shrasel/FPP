package lab8.prob2;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null, null, null);
	}

	public void addFirst(String item) {
		Node n = new Node(header.next, header, item);
		if (header.next != null) {
			Node temp = header.next;
			temp.previous = n;
		}
		header.next = n;

	}

	// inserts a new Node containing data so that its
	// position in the list is now pos
	void insert(String data, int pos) {
		int index = 0;
		Node current = header;
		while (current.next != null) {
			if (index == pos) {
				Node newNode = new Node(current.next, current, data);
				Node tempNode = current.next;
				tempNode.previous = newNode;
				current.next = newNode;
				return;
			}
			current = current.next;
			index++;
		}
		current.next = new Node(null, current, data);
	}

	// attempts to remove the first Node that contains
	// data; if successful, returns true; otherwise, false.
	boolean remove(String data) {
		Node previous = header;
		Node current = header.next;
		while (current != null) {
			if (data.equals(current.value)) {
				current.previous = previous;
				previous.next = current.next;
				//	System.out.println("\"" + current.value + "\" Removed: ");
				return true;
			}
			previous = current;
			current = current.next;
		}
		System.out.println("Data Not Found: \"" + data + "\"");
		return false;
	}

	// recursively attempts to find a String in some Node in the
	// list; returns true if found, false otherwise
	boolean recurSearch(String data) {
		Node current = header;
		while (current.next != null) {
			if (data.equals(current.value)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	// Search
	boolean search(String data) {
		Node current = header;
		boolean b = recurse(current, data);
		return b;
	}

	// Recursive
	boolean recurse(Node current, String data) {
		if (current == null)
			return false;
		if (data.equals(current.value))
			return true;
		return recurse(current.next, data);
	}

	// Also, implement the methods in MinSort and Search in this new context.
	void sort() {
		if (header == null)
			return;
		Node current = header.next;
		while (current != null) {
			Node min = minNode(current);
			swap(current, min);
			current = current.next;
		}
	}

	Node minNode(Node current) {
		Node min = current;
		while (current != null) {
			if (current.value.compareTo(min.value) < 0) {
				min = current;
			}
			current = current.next;
		}
		return min;
	}

	void swap(Node current, Node min) {
		String temp = current.value;
		current.value = min.value;
		min.value = temp;
	}

	int size() {
		int count = 0;
		Node current = header.next;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	void printNodes() {
		Node next = header.next;
		if (next == null)
			System.out.println("");
		else {
			String s = next.toString();
			System.out.println(s);
		}
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(Node next, Node previous, String value) {
			this.next = next;
			this.previous = previous;
			this.value = value;
		}

		@Override
		public String toString() {
			if (value == null)
				return "";
			StringBuilder sb = new StringBuilder(value + " ");
			sb = toString(sb, next);
			return sb.toString();
		}

		private StringBuilder toString(StringBuilder sb, Node n) {
			if (n == null)
				return sb;
			sb.append(n.value + " ");
			return toString(sb, n.next);
		}

	}

	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();
		list.addFirst("First");
		list.addFirst("Next First - 2");
		list.printNodes();
		list.insert("Inserted - 0", 0);
		list.addFirst("Add First - 3");
		list.insert("Inserted - 0", 0);
		list.insert("Inserted - 6", 6);
		list.insert("Inserted - 7", 7);
		list.remove("Add First - 3");
		System.out.println("");
		list.printNodes();
		list.sort();
		System.out.println("\nSorted:");
		list.printNodes();
		System.out.println();
		System.out.println(list.recurSearch("Add First - 3"));
		System.out.println(list.search("First"));
	}
}
