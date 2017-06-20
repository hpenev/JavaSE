package bookChapter16_methods;

public class Task07 {
    public static void main(String[] args) {
	char[] array = { 'a', '1', '0', 'a', 'a', 'a', };
	System.out.println(countDigits(array));
    }

    static int countDigits(char[] array) {
	int count = 0;
	for (int i = 0; i < array.length; i++) {
	    if (array[i] >= 48 && array[i] <= 57) {
		count++;
	    }
	}
	return count;
    }
}
