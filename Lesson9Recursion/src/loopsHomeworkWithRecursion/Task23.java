package loopsHomeworkWithRecursion;

/*
Задача 23:
Да се състави програма, която чрез цикъл while извежда
таблицата за умножение, но без повторение.
Т.е. ако е изведено 4*5 не се извежда 5*4.
Пример:
1-ви ред: 1*1; 1*2; 1*3; 1*4; 1*5; 1*6; 1*7; 1*8; 1*9;
2-ри рeд: 2*2; 2*3; 2*4; 2*5; 2*6; 2*7; 2*8; 2*9;
...
9-ти ред: 9*9;
*/

public class Task23 {
    public static void main(String[] args) {

	// iteration();
	row(1, 1);
    }

    static void row(int row, int col) {
	if (row == 10) {
	    return;
	}

	col(row, row);
	System.out.println();
	row(row + 1, col);
    }

    static void col(int row, int col) {
	if (col == 10) {
	    return;
	}

	System.out.print(row + "*" + col + " ");
	col(row, col + 1);
    }

    private static void iteration() {
	int num1 = 1;
	int num2 = 1;

	while (num1 < 10) {
	    System.out.printf("%d row: ", num1);
	    while (num2 < 10) {
		System.out.printf("%d*%d; ", num1, num2);
		num2++;
	    }
	    System.out.println();

	    num1++;
	    num2 = num1;
	}
    }
}
