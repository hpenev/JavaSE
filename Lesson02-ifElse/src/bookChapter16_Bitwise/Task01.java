package bookChapter16_Bitwise;

/*
1. Да се състави програма, която преобразува числото 6 в числото 4, използ-
вайки само побитови операции.
*/

public class Task01 {
    public static void main(String[] args) {

	int number1 = 6;
	int number2 = 4;

	System.out.println("number " + number1 + " to binary = " + Integer.toBinaryString(number1));
	System.out.println("number " + number2 + " to binary = " + Integer.toBinaryString(number2));

	solution(number1);
	// solution2(number1, number2);

    }

    private static void solution2(int number1, int number2) {
	int result = number1 & number2;
	System.out.println(result);
    }

    private static void solution(int number) {
	int oneShiftLeft = 1 << 1;
	int result = number ^ oneShiftLeft;
	System.out.println(result);
    }
}
