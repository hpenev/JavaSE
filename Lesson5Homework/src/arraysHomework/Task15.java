package arraysHomework;

public class Task15 {
    public static void main(String[] args) {
	// Scanner sc = new Scanner(System.in);
	// System.out.print("Enter array length: ");
	// int arrayLength = sc.nextInt();
	//
	// double[] array = new double[arrayLength];
	// for (int i = 0; i < arrayLength; i++) {
	// System.out.print("Enter a number: ");
	// array[i] = sc.nextInt();
	// }
	// sc.close();

	double[] array = { 7.13, 0.2, 4.9, 5.1, 6.34, 1.12 };

	double[] maxNumbers = new double[3];

	for (int i = 0; i < array.length; i++) {

	    // implement bubbleSort
	    double temp = 0;
	    for (int j = 0; j < maxNumbers.length; j++) {
		for (int k = 1; k < maxNumbers.length - j; k++) {

		    double previous = maxNumbers[k - 1];
		    double current = maxNumbers[k];

		    if (previous < 0) {
			previous *= -1;
		    }

		    if (current < 0) {
			current *= -1;
		    }

		    if (previous > current) {
			temp = maxNumbers[k - 1];
			maxNumbers[k - 1] = maxNumbers[k];
			maxNumbers[k] = temp;
		    }
		}
	    }

	    double originalValue = array[i];
	    double minValue = maxNumbers[0];

	    if (originalValue < 0) {
		originalValue *= -1;
	    }

	    if (minValue < 0) {
		minValue *= -1;
	    }

	    if (originalValue > minValue) {
		maxNumbers[0] = array[i];
	    }
	}

	System.out.print("[");
	for (int i = 0; i < maxNumbers.length; i++) {
	    if (i != maxNumbers.length - 1) {
		System.out.print(maxNumbers[i] + ", ");
	    } else {
		System.out.print(maxNumbers[i]);
	    }
	}
	System.out.println("]");
    }
}
