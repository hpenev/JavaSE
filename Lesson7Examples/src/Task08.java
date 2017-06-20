
public class Task08 {
    public static void main(String[] args) {

	boolean[][] array = {
		{ false, false, false, true, false },
		{ false, false, false, false, false },
		{ false, false, false, false, false },
		{ false, false, false, false, false },
		{ false, false, false, false, false }
	};

	boolean hasTrue = false;

	for (int row = 0; row < array.length; row++) {
	    for (int col = 0; col < array[0].length; col++) {
		if (col + row == array.length - 2) {
		    if (array[row][col]) {
			hasTrue = true;
		    }
		}
	    }
	}
	System.out.println(hasTrue ? "In the upper antidiagonal there is a \"true\""
		: "In the upper antidiagonal there isn't a \"true\"");
    }
}
