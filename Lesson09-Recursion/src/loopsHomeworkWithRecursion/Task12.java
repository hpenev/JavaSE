package loopsHomeworkWithRecursion;

/*
Задача 12: Да се състави програма, която извежда всички
естествени трицифрени числа, които нямат еднакви цифри т.е.
100,101, 606 и т.н. не се извеждат.
*/

public class Task12 {
    public static void main(String[] args) {

	// itaration();
	recursion(100, 999);
    }

    static void recursion(int start, int end) {
	if (start == end + 1) {
	    return;
	}

	int num = start;
	int num1 = num % 10;
	num /= 10;
	int num2 = num % 10;
	num /= 10;
	int num3 = num % 10;
	num /= 10;

	if (num1 != num2 && num2 != num3 && num1 != num3) {
	    System.out.print(start + " ");
	}

	recursion(start + 1, end);
    }

    private static void itaration() {
	for (int i = 100; i < 1000; i++) {
	    int tempNum = i;
	    int num1 = tempNum % 10;
	    tempNum /= 10;
	    int num2 = tempNum % 10;
	    tempNum /= 10;
	    int num3 = tempNum % 10;
	    tempNum /= 10;

	    if (num1 != num2 && num2 != num3 && num1 != num3) {
		System.out.print(i + " ");
	    }
	}
    }
}
