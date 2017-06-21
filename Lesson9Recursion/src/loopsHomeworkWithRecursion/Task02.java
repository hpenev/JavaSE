package loopsHomeworkWithRecursion;

/*
Задача 2: Да се изведат на екрана числат от -20 до 50.
*/

public class Task02 {
    public static void main(String[] args) {
	// iteration();
	recursion(-20, 50);
    }

    static void recursion(int a, int b) {
	if (a == b + 1) {
	    return;
	}

	System.out.println(a);
	recursion(a + 1, b);
    }

    private static void iteration() {
	for (int i = -20; i <= 50; i++) {
	    System.out.println(i);
	}
    }
}
