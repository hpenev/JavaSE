package bookChapter16_Bitwise;

/*
9. Да се състави програма, която по дадено цяло число от тип long да извежда
true, ако числото е по-голямо от 217 , и false в противен случай. Да се използват
побитови операции за целта.
Пример:
Въведете число:
13183
Отрицателно ли е:
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
