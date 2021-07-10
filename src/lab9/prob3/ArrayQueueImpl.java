package lab9.prob3;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = 0;
	private int rear = 0;

	public boolean isEmpty() {
		return size == 0;
	}

	public void enqueue(int data) {
		if (size == arr.length)
			resize();
		arr[rear] = data;
		rear++;
		size++;
	}

	public boolean dequeue() {
		if (front == rear || size <= 0)
			throw new IllegalStateException("Cannot dequeue because Queue is empty!");
		front++;
		size--;
		return true;
	}

	public int peek() {
		if (front == rear || size <= 0)
			throw new IllegalStateException("Cannot peek because Queue is empty!");
		return arr[front];
	}

	public int size() {
		return size;
	}

	private void resize() {
		int newData[] = new int[2 * arr.length];
		System.arraycopy(arr, 0, newData, 0, arr.length);
		this.arr = newData;
	}

	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();

		for (int i = 0; i < 15; i++)
			q.enqueue(i);
		for (int i = 0; i < 14; i++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
	}
}
