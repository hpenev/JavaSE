package bookChapter16_Bitwise;
/*
6. Да се състави програма, която прочита 3 числа – a, b и c. Да се обърнат бито-
вете на позиции b и c в числото а.

Въведете a, b и c:
15
0
2
Новото число е:
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
