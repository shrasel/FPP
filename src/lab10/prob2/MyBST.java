package lab10.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyBST {
	
	private Node root;
	private int size = 0;

	public MyBST() {
		root = null;
	}

	public int size() {
		return size;
	}

	// if x is already in tree, x is ignored
	public void insert(Integer x) {
		if (root == null) {
			root = new Node(x, null, null);
			++size;
		} else {
			Node n = root;
			boolean inserted = false;
			while (!inserted) {
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new Node(x, null, null);
						++size;
						inserted = true;
					} else {
						n = n.left;
					}
				}

				else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new Node(x, null, null);
						++size;
						inserted = true;
					} else {
						n = n.right;
					}
				}

				// x is equal to the value in a node, so ignore x
				else {
					inserted = true;
				}
			}
		}
	}

	public void printAsDiagram() {
		BTreePrinter.printNode(root);
	}

	static class BTreePrinter {
		public static void printNode(Node root) {
			int maxLevel = BTreePrinter.maxLevel(root);
			printNodeInternal(Collections.singletonList(root), 1, maxLevel);
		}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		private static void printNodeInternal(List nodes, int level, int maxLevel) {
			if (nodes.isEmpty() || BTreePrinter.isAllElementsNull(nodes))
				return;
			int floor = maxLevel - level;
			int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
			int firstSpaces = (int) Math.pow(2, (floor)) - 1;
			int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;
			BTreePrinter.printWhitespaces(firstSpaces);
			List newNodes = new ArrayList();
			for (Object node : nodes) {
				if (node != null) {
					System.out.print(((Node) node).element);
					newNodes.add(((Node) node).left);
					newNodes.add(((Node) node).right);
				} else {
					newNodes.add(null);
					newNodes.add(null);
					System.out.print(" ");
				}

				BTreePrinter.printWhitespaces(betweenSpaces);
			}
			System.out.println("");

			for (int i = 1; i <= endgeLines; i++) {
				for (int j = 0; j < nodes.size(); j++) {
					BTreePrinter.printWhitespaces(firstSpaces - i);
					if (nodes.get(j) == null) {
						BTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
						continue;
					}

					if (((Node) nodes.get(j)).left != null)
						System.out.print("/");
					else
						BTreePrinter.printWhitespaces(1);

					BTreePrinter.printWhitespaces(i + i - 1);

					if (((Node) nodes.get(j)).right != null)
						System.out.print("\\");
					else
						BTreePrinter.printWhitespaces(1);

					BTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
				}

				System.out.println("");
			}

			printNodeInternal(newNodes, level + 1, maxLevel);
		}

		static void printWhitespaces(int count) {
			for (int i = 0; i < count; i++)
				System.out.print(" ");
		}

		static int maxLevel(Node node) {
			if (node == null)
				return 0;

			return Math.max(BTreePrinter.maxLevel(node.left), BTreePrinter.maxLevel(node.right)) + 1;
		}

		@SuppressWarnings("rawtypes")
		static boolean isAllElementsNull(List list) {
			for (Object object : list) {
				if (object != null)
					return false;
			}

			return true;
		}
	}

	public boolean remove(Integer val) {
		Node node = findNode(val, root);
		return removeNode(node);
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
	public void printTree() {
		if (root == null)
			System.out.println("<>");
		else
			printTree(root);
	}

	/**
	 * Returns a list of the elements in the tree in sorted order
	 */
	public List<Integer> asList() {
		List<Integer> retval = new LinkedList<>();
		if (root == null)
			return retval;
		else {
			asList(root, retval);
			return retval;
		}
	}

	public boolean find(Integer x) {
		if (x == null)
			return false;
		return find(x, root);
	}

	/////////// private auxiliary methods /////////

	// auxiliary method for printTree
	private void printTree(Node t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + " ");
			printTree(t.right);
		}
	}

	/// auxiliary method for asList
	private void asList(Node t, List<Integer> retval) {
		if (t != null) {
			asList(t.left, retval);
			retval.add(t.element);
			asList(t.right, retval);
		}
	}

	// // auxiliary methods for find
	private boolean find(Integer x, Node n) {
		if (n == null)
			return false;
		if (n != null && n.element.equals(x))
			return true;
		return (x.compareTo(n.element) < 0) ? find(x, n.left) : find(x, n.right);
	}

	// / auxiliary methods for remove
	private boolean removeNode(Node node) {
		if (node == null)
			return false;
		// Leaf Node Case: we can just break the link
		// from node to its parent
		Node parent = null;
		if (node.left == null && node.right == null) {
			parent = parent(node);
			if (parent != null) {
				if (parent.left == node)
					parent.left = null;
				if (parent.right == node)
					parent.right = null;
			} else { // this node must be the root
				root = null;
			}
			size--;
			return true;
		}
		// Single Child (left) Case: add a link from parent to
		// child of node
		if (node.left != null && node.right == null) {
			parent = parent(node);
			if (parent != null) {
				if (parent.left == node)
					parent.left = node.left;
				if (parent.right == node)
					parent.right = node.left;
			} else { // node is the root
				root = node.left;
				node = null;
			}
			size--;
			return true;
		}
		// Single Child (right) Case: add a link from parent to
		// child of node
		if (node.left == null && node.right != null) {
			parent = parent(node);
			if (parent != null) {
				if (parent.left == node)
					parent.left = node.right;
				if (parent.right == node)
					parent.right = node.right;
			} else { // this is the root node
				root = node.right;
				node = null;
			}

			size--;
			return true;
		}

		// Two Child Case: in this case, find min to the right of node and
		// insert this value into the node; link up parent of this min with
		// right child
		// of this min

		if (node.left != null && node.right != null) {
			Node min = findMinNode(node.right);
			Node parentOfMin = parent(min);
			node.element = min.element;
			parentOfMin.left = min.right;
			size--;
			return true;
		}
		return false;
	}

	private Node parent(Node t) {
		return parent(t, root, null);
	}

	private Node parent(Node t, Node n, Node parent) {

		if (n == null)
			return null;
		Integer val = t.element;

		if (n.element.equals(val))
			return parent;
		if (val.compareTo(n.element) < 0) {
			return parent(t, n.left, n);
		} else {
			return parent(t, n.right, n);
		}
	}

	private Node findNode(Integer val, Node n) {
		if (n == null)
			return null;
		if (n != null && n.element.equals(val))
			return n;
		if (val.compareTo(n.element) < 0) {
			return findNode(val, n.left);
		} else {
			return findNode(val, n.right);
		}
	}

	private Node findMinNode(Node t) {
		if (t == null)
			return null;
		while (t.left != null) {
			t = t.left;
		}
		return t;
	}

	/*
	 * Algorithm: getHeight() 1. If tree is empty then return 0 2. Else (a) Get the
	 * height of left subtree recursively (a) Get the height of right subtree
	 * recursively (c) Return the max height of left and right subtrees and add 1 to
	 * it for the current node.
	 */
	public int getHeight(Node node) {
		// Implement
		if (node == null) {
			return 0;
		} else {
			return 1 + Math.max(getHeight(node.left), getHeight(node.right));
		}
	}

	public static void main(String[] args) {
		MyBST bst = new MyBST();
		bst.insert(2);
		bst.insert(4);
		bst.insert(3);
		for (int i = 2; i >= 0; --i) {
			bst.insert(new Integer(2 * i));
			bst.insert(new Integer(2 * i - 5));
		}
		bst.insert(15);
		bst.printTree();
		System.out.println();
		bst.printAsDiagram();
		System.out.println("Height: " + bst.getHeight(bst.root));
		bst.insert(17);
		bst.insert(24);
		bst.printAsDiagram();
		System.out.println("Height: " + bst.getHeight(bst.root));
	}

	private class Node {
		private Node(Integer element, Node left, Node right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

		private Integer element; // The data in the node
		private Node left; // Left child
		private Node right; // Right child
	}

}