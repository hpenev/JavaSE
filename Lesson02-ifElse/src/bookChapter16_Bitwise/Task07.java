package bookChapter16_Bitwise;

/*
7. �� �� ������� ��������, ����� �� ������ 2 ����� �� 0 �� 50 �� ������� �����
� ������� ���, ����� ������� ������� �� ���������, � ����� �� ���������� ����-
������� ������ � ��������� ����������� �� ����� �������� �����, � ���� � ���-
����� ������.

�������� ����� �����:
15
10
��������:
0101

*/

public class Task07 {
    public static void main(String[] args) {
	int a = 15;
	int b = 10;

	int result = a ^ b;

	System.out.println(result);
	System.out.println(Integer.toBinaryString(result));
    }
}
