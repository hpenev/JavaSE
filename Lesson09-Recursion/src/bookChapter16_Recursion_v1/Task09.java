package bookChapter16_Recursion_v1;

/*
9. �� �� ������� ��������, ����� ������ �� ������ ����� ��� ����� � x � y. ����-
������ �� �������� �������������� �� ����� �����, ���� �� �������� ������-
���� ���������� �������� (+). ����������� ��������.
*/

public class Task09 {
    public static void main(String[] args) {
	int result = multiTwoNums(4, 5);
	System.out.println(result);
    }

    static int multiTwoNums(int x, int y) {
	if (y == 1) {
	    return x;
	}
	return x + multiTwoNums(x, y - 1);
    }
}
