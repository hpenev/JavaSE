package arraysHomework;

public class Task12 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		// Both Arithmetic solutions may cause arithmetic overflow. If x and y
		// are too large, addition and multiplication may go out of integer
		// range.

		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];

		// The multiplication and division based approach doesn’t work if one of
		// the numbers is 0 as the product becomes 0 irrespective of the other
		// number.
		//
		// Both Arithmetic solutions may cause arithmetic overflow. If x and y
		// are too large, addition and multiplication may go out of integer
		// range.

		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] = arr[4] / arr[5];

		// using BITWISE XOR
		// arr[4] = arr[4] ^ arr[5];
		// arr[5] = arr[4] ^ arr[5];
		// arr[4] = arr[4] ^ arr[5];

		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				System.out.print(arr[i] + ", ");
			} else {
				System.out.print(arr[i]);
			}
		}
		System.out.println("]");
	}
}
