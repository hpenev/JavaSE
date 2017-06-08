public class arrCompare {
	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 4 };
		int[] arr2 = { 2, 5, 4 };

		boolean areEqual = true;

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					areEqual = false;
					break;
				}
			}
		} else {
			areEqual = false;
		}

		System.out.println(areEqual ? "Equal" : "Not Equal");
	}
}
