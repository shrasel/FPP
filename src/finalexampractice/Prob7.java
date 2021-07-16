package finalexampractice;

public class Prob7 {
	Node header;

	Prob7() {
		header = new Node(null, null, null);
	}

	public void initializeGame() {
// initializes header, which can also empty the list
		header = new Node(null, null, null);
		addAllCards();
	}

	public void addAllCards() {
		for (int i = 12; i >= 1; i--) {
			addFirst(i);
		}
	}

	public Node addFirst(Integer item) {
		Node n = new Node(header.next, header, item);
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;
		return n;
	}

	private Node getNode(int pos) {
		if (pos >= size())
			throw new IndexOutOfBoundsException();
		Node next = header;
		for (int i = 0; i <= pos; ++i) {
			next = next.next;
		}
		// next is the node we are seeking
		return next;
	}

	public Integer get(int pos) {
		Node node = getNode(pos);
		return (node != null) ? node.value : null;
	}

	/**
	 * returns the index of the Integer data, if found; -1 otherwise
	 */
	public int find(Integer data) {
		if (data == null)
			return -1;
		Node currentNode = header;
		int i = -1;
		while (currentNode.next != null) {
			++i;
			currentNode = currentNode.next;
			if (data.equals(currentNode.value))
				return i;
		}
		return -1;
	}

	public void insertCard(Integer data, int pos) {
		// implement
		int index = 0;
		Node curreNode = header;

		while (curreNode.next != null) {
			if (index == pos) {
				Node node = new Node(curreNode.next, curreNode, data);
				curreNode.next.previous = node;
				curreNode.next = node;
			}
			curreNode = curreNode.next;
			index++;
		}
		curreNode.next = new Node(null, curreNode, data);
	}

	public boolean removeCard(Integer data) {
		// implement
		Node cuNode = header;
		while (cuNode != null) {
			if (data.equals(cuNode.value)) {
				if (cuNode.next != null) {
					cuNode.next.previous = cuNode.previous;
					cuNode.previous.next = cuNode.next;
					return true;
				}
				cuNode.previous.next = null;
				return true;
			}
		}
		return false;
	}

	public void insertNode(Integer intV, int pos) {
		Node temp = header;

		for (int i = 0; i < pos && temp.next != null; i++) {
			temp = temp.next;
		}

		Node newNode = new Node(temp.next, temp, intV);
		if (temp.next != null)
			temp.next.previous = newNode;
		temp.next = newNode;
	}

	public boolean removeNode(Integer intV) {
		Node temp = header;
		while (temp.next != null) {
			temp = temp.next;
			if (temp.value.equals(intV)) {
				temp.previous = temp.next;
				return true;
			}
		}

		return false;
	}

	public int size() {
		int count = 0;
		Node next = header.next;
		while (next != null) {
			++count;
			next = next.next;
		}
		return count;
	}

	public String toString() {
		Node next = header.next;
		if (next == null)
			return "Empty List";
		String output = next.toString();
		return ("[" + output + "]");
	}

	class Node {
		Integer value;
		Node next;
		Node previous;

		Node() {
		}

		Node(Node next, Node previous, Integer value) {
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

	void testInsert(Prob7 l) {
		addFirst(5);
		addFirst(7);
		insertCard(6, 1);
		System.out.println(l);
		insertCard(2, 0);
		System.out.println(l);
	}

	public static void main(String[] args) {
		Prob7 l = new Prob7();
//		System.out.println("Insert Tests: ");
//		l.testInsert(l);
//		System.out.println();
//		System.out.println("Initialized:");
//		l.initializeGame();
//		System.out.println(l);
//		System.out.println();
//		System.out.println("Removed from back then front, then last element");
//		l.removeCard(12);
//		System.out.println(l);
//		l.removeCard(1);
//		System.out.println(l);
//		System.out.println();
//		System.out.println("Initialized:");
//		l.initializeGame();
//		System.out.println(l);
//		System.out.println();
//		System.out.println("Removed from front then back");
//		l.removeCard(1);
//		System.out.println(l);
//		l.removeCard(12);
//		System.out.println(l);
//		System.out.println();
//		System.out.println("Removed from middle: ");
//		l.removeCard(5);
//		System.out.println(l);
		l.insertCard(1, 0);
		l.insertCard(2, 1);
		System.out.println(l);
	}
}
