package bookChapter16_Bitwise;

/*
8. �� �� ������� ��������, ����� �� ������ ���� ����� �� ��� byte �� �������
true, ��� ������� � �����������, � false � �������� ������. �� �� ��������� ��-
������ �������� �� �����.

������:
�������� �����:
-10
����������� �� �:
true

*/
public class Task08 {
    public static void main(String[] args) {
	byte number = -1;

	int znak = (number >> 5) & 1;

	if (znak == 0) {
	    System.out.println("false - number is positive");
	}
	if (znak == 1) {
	    System.out.println("true - number is negative");
	}

    }
}
