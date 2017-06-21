package loopsHomeworkWithRecursion;

/*
Задача 4: Да се изведат на екрана числата от 10 до 1 в обратен
ред.
*/

public class Task04 {
    public static void main(String[] args) {
	// iteration();
	recursion(10, 1);
    }

    static void recursion(int a, int b) {
	if (a == b - 1) {
	    return;
	}
	System.out.println(a);
	recursion(a - 1, b);

    }

    private static void iteration() {
	for (int i = 10; i >= 1; i--) {
	    System.out.print(i + " ");
	}
    }
}
