package loopsHomeworkWithRecursion;

/*
Задача 20:
Да се състави програма, чрез която се извежда квадрат от
цифри. Сумите от елементите на произволен ред или стълб са
равни на 45.
Пример:
1 2 3 4 5 6 7 8 9 0
2 3 4 5 6 7 8 9 0 1
3 4 5 6 7 8 9 0 1 2
4 5 6 7 8 9 0 1 2 3
5 6 7 8 9 0 1 2 3 4
6 7 8 9 0 1 2 3 4 5
7 8 9 0 1 2 3 4 5 6
8 9 0 1 2 3 4 5 6 7
9 0 1 2 3 4 5 6 7 8
0 1 2 3 4 5 6 7 8 9
*/

public class Task20 {
    public static void main(String[] args) {

	// iteration();
	recursionRow(1, 10);
    }

    static void recursionRow(int start, int i) {
	recursion(start, 10);

	if (start == 10) {
	    start = 0;
	}

	System.out.println(start + " ");
	i--;

	if (i == 0) {
	    return;
	}

	recursionRow(start + 1, i);
    }

    static void recursion(int start, int i) {
	if (start == 10) {
	    start = 0;
	}

	System.out.print(start + " ");
	i--;
	if (i == 0) {
	    return;
	}
	recursion(start + 1, i);

    }

    private static void iteration() {
	for (int i = 1; i <= 10; i++) {
	    int num = i;
	    for (int j = 1; j <= 10; j++) {
		if (num == 10) {
		    num = 0;
		}
		System.out.print(num + " ");
		num++;
	    }
	    System.out.println();
	}
    }
}
