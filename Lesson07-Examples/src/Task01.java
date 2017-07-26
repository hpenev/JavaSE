public class Task01 {
    public static void main(String[] args) {
	int[] arr = { 1, 2, 2, 3, 4, 5, 6 };

	boolean hasOnlyPositiveNumbers = true;
	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] < 0) {
		hasOnlyPositiveNumbers = false;
		break;
	    }
	}

	if (hasOnlyPositiveNumbers) {
	    System.out.println("Only positive numbers");
	} else {
	    System.out.println("positive and negative numers");
	}
    }
}
