package bookChapter16_Recursion;

/*
4. Да се състави програма, която приема за входни данни масив от естествени
числа. Програмата да извежда дали в масива има числа, които се повтарят. Из-
ползвайте рекурсия.
*/

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
