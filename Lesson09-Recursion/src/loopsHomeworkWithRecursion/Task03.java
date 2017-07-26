package loopsHomeworkWithRecursion;
/*
Задача 3: Да се изведат на екрана всички нечетни числа от -10
до 10
*/

public class Task03 {
    public static void main(String[] args) {
	// iteration();
	recursion(-10, 10);
    }

    static void recursion(int a, int b) {
	if (a == b + 1) {
	    return;
	}

	if (a % 2 == 0) {
	    a++;
	}

	System.out.println(a);
	recursion(a + 2, b);

    }

    private static void iteration() {
	for (int i = -10; i <= 10; i++) {
	    if (i % 2 != 0) {
		System.out.println(i);
	    }
	}
    }
}
