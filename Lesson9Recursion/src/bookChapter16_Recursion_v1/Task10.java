package bookChapter16_Recursion_v1;

/*
10. �� �� ������� ��������, ����� ������ �� ������ ����� ��� ����� � � � y.
���������� �� �������� ���������� �� xy (x �� ������ y), ���� �� ��������
���������� ���������� �������� (+). ����������� ��������.

*/
public class Task10 {
    public static void main(String[] args) {
	int result = pow(2, 7);
	System.out.println(result);

    }

    static int pow(int num, int power) {
	if (power == 0) {
	    return 1;
	}
	if (power == 1) {
	    return num;
	}

	return multiTwoNums(num, pow(num, power - 1));
    }

    static int multiTwoNums(int x, int y) {
	if (y == 1) {
	    return x;
	}
	return x + multiTwoNums(x, y - 1);
    }
}
