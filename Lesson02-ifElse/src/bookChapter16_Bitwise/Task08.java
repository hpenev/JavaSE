package bookChapter16_Bitwise;

/*
8. Да се състави програма, която по дадено цяло число от тип byte да извежда
true, ако числото е отрицателно, и false в противен случай. Да се използват по-
битови операции за целта.

Пример:
Въведете число:
-10
Отрицателно ли е:
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
