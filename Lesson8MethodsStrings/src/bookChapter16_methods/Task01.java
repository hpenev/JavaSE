package bookChapter16_methods;

public class Task01 {
    public static void main(String[] args) {
	int[] arr = { 1, 2, 3, 4, 5 };
	System.out.print(arrayAvarage(arr));

    }

    static double arrayAvarage(int[] array) {
	double sum = 0;

	for (int i = 0; i < array.length; i++) {
	    sum += array[i];
	}

	double avarage = (double) (sum / array.length);

	return avarage;
    }
}
