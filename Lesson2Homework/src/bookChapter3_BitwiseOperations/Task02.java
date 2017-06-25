package bookChapter3_BitwiseOperations;

public class Task02 {
	public static void main(String[] args) {

		// 2. Чрез побитови операции изведете от числото 231 числото 772.

		// 231(10) = 0000_1110_0111(2)
		// 772(10) = 0011_0000_0100(2)
		int a = 0b0000_1110_0111; // 231
		int b = 0b0011_0000_0100; // 772

		int missingNum = 0b0011_1110_0011; // 995
		int result = a ^ missingNum;

		if (result == b) {
			System.out.println("231 (bitwise)XOR  " + missingNum);
		} else {
			System.out.println("Cannot solve the task ");
		}
	}
}
