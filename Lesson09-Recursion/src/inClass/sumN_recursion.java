package inClass;

/*
sum 1 to n
*/

public class sumN_recursion {
    public static void main(String[] args) {
	// System.out.println(sum(5));
	System.out.println(sumOdd(100));
    }

    static int sum(int n) {
	if (n == 1) {
	    return 1;
	}
	return n + sum(n - 1);
    }

    static int sumOdd(int n) {
	if (n == 1) {
	    return 1;
	}

	if (n % 2 == 0) {
	    n--;
	}

	return n + sumOdd(n - 2);
    }

}
