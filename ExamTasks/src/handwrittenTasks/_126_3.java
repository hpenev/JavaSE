package handwrittenTasks;

import java.util.Arrays;

public class _126_3 {
    public static void main(String[] args) {
	int[] a = { 1, 2, 3 };
	int[] b = { 11, 12, 13, 14 };

	System.out.println(Arrays.toString(concatArrays(a, b)));

    }

    static int[] concatArrays(int[] a, int[] b) {
	int[] c = new int[a.length + b.length];
	for (int i = 0; i < c.length; i++) {
	    if (i < a.length) {
		c[i] = a[i];
	    } else {
		c[i] = b[i - a.length];
	    }
	}

	return c;
    }

}
