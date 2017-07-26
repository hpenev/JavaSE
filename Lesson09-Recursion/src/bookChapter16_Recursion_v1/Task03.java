package bookChapter16_Recursion_v1;

/*
3. �� �� ������� ��������, ����� �� ������� ����� � ���������� ����� �����-
���� ���� ���� ����� � ��������� ���������. ��������� ��������� ����� �
�����, ��� ����� ����� ������� ������� � ��-����� �� ���������. �����������
��������.
*/

public class Task03 {
    public static void main(String[] args) {
	int[] arr = { 1, -2, 3 };
	System.out.println(isAscending(arr, arr.length - 1));
    }

    static boolean isAscending(int[] arr, int last) {
	if (last == 0) {
	    return true;
	}

	if (arr[last] > arr[last - 1]) {
	    return isAscending(arr, last - 1);
	} else {
	    return false;
	}
    }
}
