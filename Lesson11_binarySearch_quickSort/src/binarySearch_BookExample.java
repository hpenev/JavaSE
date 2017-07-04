import java.util.Arrays;

public class binarySearch_BookExample {
    public static void main(String[] args) {
	// �������������� ������
	int[] array = new int[15];
	// ��������� � ������� �� 1 �� 15
	for (int i = 0; i < array.length; i++) {
	    array[i] = i + 1;
	}
	// �������, ����� �� ������
	int x = 9;
	System.out.println(Arrays.toString(array));
	// ��������� binarySearch ������, ����� ����� ������� �� ��������
	// �������
	// start = 0, end = ��������� �� ������ - 1
	int index = binarySearch(array, x, 0, array.length - 1);
	System.out.println(index);
    }

    public static int binarySearch(int[] arr, int x, int left, int right) {
	// ������ ������������� � mid ��������
	int mid = (right + left) / 2;
	// ��� �� ���������� ������� ������� ��� �������� �
	if (left > right) {
	    return -1;
	}
	// ��� ��� ������� �������
	if (x == arr[mid]) {
	    return mid;
	}
	// ��� ������� � ��-����� �� �������� � �������,
	// ����������� ��������� �� ������ ��������
	if (x < arr[mid]) {
	    return binarySearch(arr, x, left, mid - 1);
	}
	// ��� ������� � ��-������ �� �������� � �������,
	// ����������� ��������� �� ������� ��������
	if (x > arr[mid]) {
	    return binarySearch(arr, x, mid + 1, right);
	}
	return -1;
    }
}