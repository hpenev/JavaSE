package inClassTasks;

/*
Write a function to find the n-th number of Finonachi
sequence
*/

public class Task04 {
    public static void main(String[] args) {
	int number = 7;
	System.out.println(Finonachi(number));

    }

    static int Finonachi(int n) {
	if (n < 0) {
	    return -1;
	}

	if (n == 0) {
	    return 0;
	}

	if (n == 1) {
	    return 1;
	}

	int fib = 1;
	int prevFib = 1;

	for (int i = 2; i < n; i++) {
	    int temp = fib;
	    fib += prevFib;
	    prevFib = temp;
	}
	return fib;
    }
}
