
public class Task10 {
    public static void main(String[] args) {
	int[] array = { 4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3 };
	int count = 0;
	int maxCount = 0;
	int value = 0;

	for (int i = 0; i < array.length; i++) {

	    for (int j = 0; j < array.length; j++) {
		if (array[i] == array[j]) {
		    count++;
		}
	    }
	    if (count > maxCount) {
		maxCount = count;
		value = array[i];
	    }
	    count = 0;
	}

	System.out.print(value + "(" + maxCount + " times)");

    }
}
