package bookChapter16_Bitwise;

/*
4. Да се състави програма, която въвежда 5 цели числа от конзолата. Дадено е,
че две двойки от тях са равни, а едно число е различно от останалите. Да се из-
веде стойността на това число. Да се използват побитови операции.
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
