package bookChapter16_Bitwise;

/*
5. Да се състави програма, която прочита 3 числа – a, b и c. Да се създаде нова
целочислена променлива, на която бъдат вдигнати (да бъдат със стойност 1) би-
товете на позиции a, b и c.

Пример:
Въведете a, b и c:
0
3
5
Числото е:
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
