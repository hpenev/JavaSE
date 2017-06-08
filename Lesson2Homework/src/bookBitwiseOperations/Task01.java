package bookBitwiseOperations;

public class Task01 {
    public static void main(String[] args) {

	// 1. Чрез побитови операции изведете от числото 3 числото 7.

	// 3(10) = 0011(2)
	// 7(10) = 0111(2)

	int a = 0b011; // 3
	int b = 0b111; // 7

	int missingNum = 0b100; // 4
	int result = a | missingNum;

	if (result == b) {
	    System.out.println("3 (bitwise)OR  " + missingNum);
	} else {
	    System.out.println("Cannot solve the task ");
	}

    }
}
