package bookChapter16_Recursion;

public class Task04 {
    public static void main(String[] args) {
	int[] array = { 1, 0, 2, 3, 4, 5 };
	System.out.println(equalCells(array));
    }

    static boolean equalCells(int[] array) {
	if (array.length == 1) {
	    return false;
	}

	int[] newArray = new int[array.length - 1];

	if (array[0] == array[1]) {
	    return true;
	} else {
	    for (int i = 1; i < array.length; i++) {
		newArray[i - 1] = array[i];
	    }
	    return equalCells(newArray);
	}
    }
}
