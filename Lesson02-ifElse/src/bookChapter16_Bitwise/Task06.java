package bookChapter16_Bitwise;
/*
6. �� �� ������� ��������, ����� ������� 3 ����� � a, b � c. �� �� ������� ����-
���� �� ������� b � c � ������� �.

�������� a, b � c:
15
0
2
������ ����� �:
10

*/

public class Task06 {
    public static void main(String[] args) {
	int a = 15;
	int b = 0;
	int c = 2;

	System.out.println(Integer.toBinaryString(a) + "(2) - before oprations");

	a = a ^ (1 << b);
	a = a ^ (1 << c);

	System.out.println(a + "(10)");
	System.out.println(Integer.toBinaryString(a) + "(2) - after oprations");
    }
}
