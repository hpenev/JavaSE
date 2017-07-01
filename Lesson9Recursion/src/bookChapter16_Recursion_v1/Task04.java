package bookChapter16_Recursion_v1;
/*
4. �� �� ������� ��������, ����� ������ �� ������ ����� ����� �� ����������
�����. ���������� �� ������� ���� � ������ ��� �����, ����� �� ��������. ��-
��������� ��������.
*/

public class Task04 {
    public static void main(String[] args) {
	int[] arr = { 1, 0, 3, 4, 2, -1 };
	System.out.println(hasUniqueNumbers(arr, arr.length - 1));
    }

    static boolean hasUniqueNumbers(int[] arr, int last) {
	if (last == 0) {
	    return true;
	}
	for (int i = 0; i <= last - 1; i++) {
	    if (arr[last] == arr[i]) {
		return false;
	    }
	}

	return hasUniqueNumbers(arr, last - 1);
    }
}
