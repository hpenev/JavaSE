
public class Task02 {
    public static void main(String[] args) {
	int[] arr = { 2, 1, 10, 5, 11, 3, 9 };

	boolean isZigZag = true;
	boolean isUpperZigZag = arr[0] < arr[1];

	for (int i = 1; i < arr.length - 1; i += 2) {
	    if (isUpperZigZag) {
		if (!(arr[i - 1] < arr[i] && arr[i] > arr[i + 1])) {
		    isZigZag = false;
		    break;
		}
	    } else {
		if (!(arr[i - 1] > arr[i] && arr[i] < arr[i + 1])) {
		    isZigZag = false;
		    break;
		}
	    }
	}

	if (isZigZag) {
	    System.out.print(isUpperZigZag ? "up" : "down");
	    System.out.println(" ZigZag");
	} else {
	    System.out.println("not Zig Zag");
	}

    }
}
