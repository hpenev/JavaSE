package _recap.collections.hashset;

public class MyHashSet<T> {

    private static final int INITIAL_CAPACITY = 16;
    private static final double STANDARD_LOAD_FACTOR = 0.75;
    private double loadFactor;
    private MyList<T>[] cells;

    public MyHashSet() {
	this.cells = new MyList[INITIAL_CAPACITY];
	this.loadFactor = STANDARD_LOAD_FACTOR;
	initCells(INITIAL_CAPACITY);
    }

    public MyHashSet(int capacity, double loadFactor) {
	this.cells = new MyList[capacity];
	this.loadFactor = loadFactor;
	initCells(capacity);
    }

    private void initCells(int capacity) {
	for (int i = 0; i < capacity; i++) {
	    cells[i] = new MyList<>();
	}
    }

    public void add(T item) {
	int hash = item.hashCode();
	int index = hash % cells.length;
	MyList<T> list = cells[index];
	if (list.isEmplty()) {
	    list.add(item);
	} else {
	    for (int i = 0; i < list.size(); i++) {
		if (list.get(i).equals(item)) {
		    return;
		}
	    }
	    list.add(item);
	}
	// check for loading factor
    }

    public boolean contains(T item) {
	int hash = item.hashCode();
	int index = hash % cells.length;
	MyList<T> list = cells[index];
	for (int i = 0; i < list.size(); i++) {
	    if (list.get(i).equals(item)) {
		return true;
	    }
	}
	return false;
    }

}
