package stringsTasksHomework;

/*
5. �������� ��������, ����� ��������� ���� ����� �������� ���
� �������� (������� ������ �������, �� �� ������������ �
����� ���) �� ���� �������� ���. ������������ ����
����������� �����.
*/

public class Task05 {
    public static void main(String[] args) {
	String fistWord = "mmmaa";
	String secondWord = "mama";

	boolean isAnagram = true;

	for (int i = 0; i < fistWord.length(); i++) {
	    if (!secondWord.contains(fistWord.substring(i, i + 1))) {
		isAnagram = false;
		break;
	    }
	}

	for (int i = 0; i < secondWord.length(); i++) {
	    if (!fistWord.contains(secondWord.substring(i, i + 1))) {
		isAnagram = false;
		break;
	    }
	}

	System.out.println(isAnagram ? "Anagram" : "Not Anagram");

    }
}
