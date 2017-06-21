package loopsHomeworkWithRecursion;

/*
Задача 17:
Да се състави програма, която извежда квадрат, чийто страни са
оформени със знака *, а вътрешността е запълнена със въведен
знак.
Входни данни b - дължина на страната число от интервала
[3..20], c - желан знак.
Програмата да използва цикъл for.
Пример: 4 +
Изход:
****
*++*
*++*
****
*/

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("enter a number: ");
	int b = sc.nextInt();
	System.out.print("enter a char: ");
	String ch = sc.next();
	sc.close();

	if (b >= 3 && b <= 20) {

	    for (int i = 1; i <= b; i++) {
		System.out.print("*");
	    }
	    System.out.println();

	    for (int i = 1; i <= (b - 2); i++) {
		System.out.print("*");
		for (int j = 1; j <= (b - 2); j++) {
		    System.out.print(ch);
		}
		System.out.println("*");
	    }

	    for (int i = 1; i <= b; i++) {
		System.out.print("*");
	    }
	    System.out.println();

	    // System.out.println(repeatStr("*", b));
	    //
	    // for (int i = 1; i <= b - 2; i++) {
	    // System.out.print("*");
	    // System.out.print(repeatStr(ch, b - 2));
	    // System.out.println("*");
	    // }
	    //
	    // System.out.println(repeatStr("*", b));
	} else {
	    System.out.println("Wrong input");
	}
    }

    public static String repeatStr(String str, int count) {
	StringBuilder repeated = new StringBuilder();
	for (int i = 0; i < count; i++) {
	    repeated.append(str);
	}
	return repeated.toString();
    }
}
