package lab9.prob4;

public class NodeQueue {
	/* stores the element at the front of the queue, if it exists */
	private Node head;
	
	/* stores the element at the end of the queue, if it exists */
	private Node tail;
	
	/**
	 * Inserts a new node containing s at end of queue
	 */
	public void enqueue(String s) {
		//implement
		Node temp = new Node(); 
    	temp.data = s;
        if (this.tail == null) {
        	this.tail = temp;
            this.head = temp;
        }
        tail.next = temp;
        tail = temp;
	}	
	/**
	 * Removes node from the front of the queue and returns its value if
	 * head is n
	 */
	public String dequeue() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		if (this.head == null) {
            return null;
        }
		else {	
			String s = peek();
			head = head.next;
			return s;
		}
	}	
	/**
	 * Returns value stored at the front of the queue
	 * @return
	 * @throws QueueException
	 */
	public String peek() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		if (this.head == null) {
            return null;
        }
		else {
			return head.data;
		}
	}
	public boolean isEmpty() {
		return head == null;
	}
	@Override
	public String toString() {
		if (isEmpty())
			return "<Queue is empty!>";
		return head.toString();
	}
}


