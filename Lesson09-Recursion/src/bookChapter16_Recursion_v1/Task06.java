package bookChapter16_Recursion_v1;

/*
6. Да се състави програма, която приема за входни данни естествено число N.
Програмата да извежда число, чиито цифри са написани в ред, обратен на въве-
деното число. Използвайте рекурсия.
*/
public class Task06 {
    public static void main(String[] args) {
	int number = 123;
	reverce(number);

	System.out.println();
	System.out.println(reverced1(number, 0));
    }

    static void reverce(int num) {
	if (num == 0) {
	    return;
	}

	System.out.print(num % 10);
	reverce(num / 10);
    }

    static int reverced1(int number, int reverced) {
	if (number == 0) {
	    return reverced;
	}
	reverced = reverced * 10 + number % 10;
	return reverced1(number / 10, reverced);
    }
}
