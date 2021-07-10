package lab8.prob2;

public class MyStringLinkedListMine {
	
	Node header;

	MyStringLinkedListMine() {
		header = new Node(null, null, null);
	}

	public void addFirst(String item) {
		Node n = new Node(header.next, header, item);
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;

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

	
	// attempts to remove the first Node that contains
	// data; if successful, returns true; otherwise, false.
	boolean remove(String data) {
		return false;
	}

	// recursively attempts to find a String in some Node in the
	// list; returns true if found, false otherwise
	boolean recurSearch(String data) {
		return false;
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
		MyStringLinkedListMine list = new MyStringLinkedListMine();
		list.addFirst("A");
		list.addFirst("B");
		list.printNodes();
	}
}
