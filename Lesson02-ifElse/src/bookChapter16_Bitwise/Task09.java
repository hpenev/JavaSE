package bookChapter16_Bitwise;

/*
9. �� �� ������� ��������, ����� �� ������ ���� ����� �� ��� long �� �������
true, ��� ������� � ��-������ �� 217 , � false � �������� ������. �� �� ���������
�������� �������� �� �����.
������:
�������� �����:
13183
����������� �� �:
false
*/
public class Task09 {
    public static void main(String[] args) {
	int number = 13183;
	int boundry = 217;

	long znak = (number >> 63) & 1;
	long bigger = number - znak * (number - boundry);

	if (number == bigger) {
	    System.out.println("true");
	} else {
	    System.out.println("false");
	}
    }
}
