package bookChapter16_Recursion;

/*
5. �� �� ������� ��������, ����� ������ �� ������ ����� ����� �� ���� �����.
���������� �� ������� �� ������ ������� �� ���-������� �������. �����������
��������.
*/

public class Task05 {
    public static void main(String[] args) {
	int[] array = { 1, 2, 3 };
	System.out.println(recursiveGetIndexOfLargest(array, 0));
    }

    static int recursiveGetIndexOfLargest(int[] arr, int index) {
	if (index == arr.length - 1)
	    return index;

	int maxElementIndex = recursiveGetIndexOfLargest(arr, index + 1);
	return arr[index] > arr[maxElementIndex] ? index : maxElementIndex;
    }
}
