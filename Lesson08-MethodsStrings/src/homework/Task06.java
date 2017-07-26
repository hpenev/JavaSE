package homework;

/*
������ 6:
�� �� ������� ��������, ���� ����� �� ������� ��������� � �������
����.
���� �������� �� ������ �� �� ������� ����� �����, �� ����� �������
���� �� ������� � ������ �����, � ���������� � ����� �� �� �����.
������: ����� ����� ������
�����: ����� ����� ������

*/
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a sentance: ");

	String input = sc.nextLine();
	String[] words = input.split("\\s+");
	sc.close();

	System.out.println("Capitalizing the first letter of each word.");

	for (int i = 0; i < words.length; i++) {
	    words[i] = CapitalizeWord(words[i]);
	}

	System.out.println(String.join(" ", words));
    }

    static String CapitalizeWord(String word) {
	StringBuilder sb = new StringBuilder();

	sb.append(word.substring(0, 1).toUpperCase());
	sb.append(word.substring(1));

	return sb.toString();
    }
}
