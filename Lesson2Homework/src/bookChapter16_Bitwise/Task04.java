package bookChapter16_Bitwise;

/*
4. �� �� ������� ��������, ����� ������� 5 ���� ����� �� ���������. ������ �,
�� ��� ������ �� ��� �� �����, � ���� ����� � �������� �� ����������. �� �� ��-
���� ���������� �� ���� �����. �� �� ��������� �������� ��������.
*/

public class Task04 {
    public static void main(String[] args) {
	int a = 4;
	int b = 3;
	int c = 6;
	int d = 4;
	int e = 3;

	int alone = a ^ b ^ c ^ d ^ e;

	System.out.println(alone);

    }
}
