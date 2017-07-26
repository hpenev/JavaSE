package loopsHomeworkWithRecursion;

/*
Задача 1: Да се изведат на екрана числата от 1 до 100.
*/

public class Task01 {
    public static void main(String[] args) {
	// iteration();
	recurtion(1, 100);
    }

    static void recurtion(int a, int b) {
	if (a == b + 1) {
	    return;
	}
	System.out.println(a);
	recurtion(a + 1, b);
    }

    private static void iteration() {
	for (int i = 1; i <= 100; i++) {
	    System.out.println(i);
	}
    }
}
