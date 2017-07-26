import java.util.Arrays;

public class binarySearch_BookExample {
    public static void main(String[] args) {
	// инициализираме масива
	int[] array = new int[15];
	// запълваме с числата от 1 до 15
	for (int i = 0; i < array.length; i++) {
	    array[i] = i + 1;
	}
	// елемент, който ще търсим
	int x = 9;
	System.out.println(Arrays.toString(array));
	// извикваме binarySearch метода, който връща индекса на търсения
	// елемент
	// start = 0, end = дължината на масива - 1
	int index = binarySearch(array, x, 0, array.length - 1);
	System.out.println(index);
    }

    public static int binarySearch(int[] arr, int x, int left, int right) {
	// нашето предположение е mid елемента
	int mid = (right + left) / 2;
	// ако не съществува елемент вмасива със стойност х
	if (left > right) {
	    return -1;
	}
	// ако сме познали числото
	if (x == arr[mid]) {
	    return mid;
	}
	// ако числото е по-малко от елемента в средата,
	// съкращаваме диапазона до лявата половина
	if (x < arr[mid]) {
	    return binarySearch(arr, x, left, mid - 1);
	}
	// ако числото е по-голямо от елемента в средата,
	// съкращаваме диапазона до дясната половина
	if (x > arr[mid]) {
	    return binarySearch(arr, x, mid + 1, right);
	}
	return -1;
    }
}