package bookChapter16_Recursion_v1;

/*
8. �� �� ������� ��������, ����� ��������� ���� �������� ���������� ����� �
������. ������ � �����, ����� �� ���� ��� ������� ���������� �� 1 � �� ���� ��.
����������� ��������.
*/

public class Task08 {
    public static void main(String[] args) {
	int number = 100;
	System.out.println(isPrime(2, number));
    }

    static boolean isPrime(int idx, int original) {
	if (idx == original) {
	    return true;
	}

	if (original % idx == 0) {
	    return false;
	}

	return isPrime(idx + 1, original);
    }
}
