package bookChapter16_Bitwise;

/*
7. Да се състави програма, която по дадени 2 числа от 0 до 50 да извежда число
в двоичен вид, което съдържа единица на позициите, в които се различават съот-
ветните битове в двоичното представяне на двете въведени числа, и нула в про-
тивен случай.

Въведете двете числа:
15
10
Резултат:
0101

*/

public class Task07 {
    public static void main(String[] args) {
	int a = 15;
	int b = 10;

	int result = a ^ b;

	System.out.println(result);
	System.out.println(Integer.toBinaryString(result));
    }
}
