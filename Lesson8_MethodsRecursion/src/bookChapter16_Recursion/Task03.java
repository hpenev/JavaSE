package bookChapter16_Recursion;

public class Task03 {
    public static void main(String[] args) {
	int[] arr = { 1, 2, 3, 4, 5, 6, 6 };

	System.out.println(isAscendingArray(arr));

    }

    static boolean isAscendingArray(int[] array) {
	// bottom of the recursion
	if (array.length == 1) {
	    return true;
	}

	int[] temp = new int[array.length - 1];

	if (array[0] < array[1]) {
	    // copy to new array - without first cell
	    for (int i = 1; i < array.length; i++) {
		temp[i - 1] = array[i];
	    }
	    // check if new array is ascending
	    return isAscendingArray(temp);
	} else
	    return false;
    }
}
