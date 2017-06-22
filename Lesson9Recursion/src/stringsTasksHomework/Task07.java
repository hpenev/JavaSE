package stringsTasksHomework;

/*
7. Напишете програма, която трансформира дадена матрица от
реални числа в символен низ, така че при отпечатване на
екрана на символния низ числата от матрицата да бъдат в
четим табличен вид с точност 2 цифри след десетичната точка.
*/

public class Task07 {
    public static void main(String[] args) {
	double[][] numbers = {
		{ 1, 2, 3 },
		{ 2, 3, 4 },
		{ 3, 4, 5 }
	};

	String strRow = "";

	for (int i = 0; i < numbers.length; i++) {
	    for (int j = 0; j < numbers[i].length; j++) {
		strRow = strRow + String.format("%.2f", (numbers[i][j])) + " ";
	    }
	    System.out.println(strRow);
	    strRow = "";
	}
    }
}
