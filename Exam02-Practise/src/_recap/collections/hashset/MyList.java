package _recap.collections.hashset;

public class MyList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    private class Node<T> {

	private Node(T value) {
	    this.value = value;
	}

	private T value;
	private Node<T> next;
	private Node<T> prev;
    }

    public boolean isEmplty() {
	return this.size == 0;
    }

    public void add(T item) {
	Node<T> newNode = new Node<>(item);
	if (this.isEmplty()) {
	    this.head = newNode;
	    this.tail = newNode;
	} else {
	    newNode.next = tail;
	    tail.prev = newNode;
	    tail = newNode;
	}
	size++;
    }

    public T get(int x) {
	if (x < 0 || x >= size) {
	    throw new IndexOutOfBoundsException();
	}
	Node<T> current = head;
	// find the xth element
	for (int i = 0; i < x; i++) {
	    current = current.prev;
	}
	return current.value;
    }

    public int size() {
	return this.size;
    }

}
