package bookChapter16_Recursion_v1;

/*
1. �� �� ������� ��������, ����� ������ �� ������ ����� ���������� ����� N �
������� �� ������ ���������� �� N! (N ���������). ��������� �� ����� N �� ��-
������� ���� ��������� �� ������ ����� �� 1 �� N. ����������� ��������.
*/

public class Task01 {
    public static void main(String[] args) {
	int number = 5;
	System.out.println(fact(number));

    }

    static int fact(int n) {
	if (n == 1) {
	    return 1;
	}

	return n * fact(n - 1);
    }
}
