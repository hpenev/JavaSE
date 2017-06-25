package bookChapter16_Bitwise;

/*
5. �� �� ������� ��������, ����� ������� 3 ����� � a, b � c. �� �� ������� ����
����������� ����������, �� ����� ����� �������� (�� ����� ��� �������� 1) ��-
������ �� ������� a, b � c.

������:
�������� a, b � c:
0
3
5
������� �:
41

*/
public class Task05 {
    public static void main(String[] args) {
	int a = 0;
	int b = 3;
	int c = 5;

	int result = 0;

	result = result | (1 << a);
	result = result | (1 << b);
	result = result | (1 << c);

	System.out.println(result + "(10)");
	System.out.println(Integer.toBinaryString(result) + "(2)");
    }
}
