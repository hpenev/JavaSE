package bookChapter16_Bitwise;

/*
10. Да се състави програма, която по дадени 3 цели числа от тип byte да извежда
число в двоичен вид, чиито битове са единица на тези позиции, където битовете
са единици едновременно в първото и второто число, но не и в третото.
Пример:
Въведете трите числа:
5
7
3
Номерът на битове, които са вдигнати в първото и второто,
но не и в третото:
100
*/
public class Task10 {
    public static void main(String[] args) {
	byte x = 5;
	byte y = 7;
	byte z = 3;

	int firstOfX = (x >> 0) & 1;
	int firstOfY = (y >> 0) & 1;
	int firstOfZ = (z >> 0) & 1;
	int firstOfresult = (firstOfX & firstOfY) & (firstOfZ ^ 1);

	int secondOfX = (x >> 1) & 1;
	int secondOfY = (y >> 1) & 1;
	int secondOfZ = (z >> 1) & 1;
	int secondOfresult = (secondOfX & secondOfY) & (secondOfZ ^ 1);

	int thirdOfX = (x >> 2) & 1;
	int thirdOfY = (y >> 2) & 1;
	int thirdOfZ = (z >> 2) & 1;
	int thirdOfresult = (thirdOfX & thirdOfY) & (thirdOfZ ^ 1);

	int fourthOfX = (x >> 3) & 1;
	int fourthOfY = (y >> 3) & 1;
	int fourthOfZ = (z >> 3) & 1;
	int fourthOfresult = (fourthOfX & fourthOfY) & (fourthOfZ ^ 1);

	int fifthOfX = (x >> 4) & 1;
	int fifthOfY = (y >> 4) & 1;
	int fifthOfZ = (z >> 4) & 1;
	int fifthOfresult = (fifthOfX & fifthOfY) & (fifthOfZ ^ 1);

	int sixthOfX = (x >> 5) & 1;
	int sixthOfY = (y >> 5) & 1;
	int sixthOfZ = (z >> 5) & 1;
	int sixthOfresult = (sixthOfX & sixthOfY) & (sixthOfZ ^ 1);

	int seventhOfX = (x >> 6) & 1;
	int seventhOfY = (y >> 6) & 1;
	int seventhOfZ = (z >> 6) & 1;
	int seventhOfresult = (seventhOfX & seventhOfY) & (seventhOfZ ^ 1);

	int eightOfX = (x >> 7) & 1;
	int eightOfY = (y >> 7) & 1;
	int eightOfZ = (z >> 7) & 1;
	int eightOfresult = (eightOfX & eightOfY) & (eightOfZ ^ 1);

	int result = firstOfresult | secondOfresult << 1 | thirdOfresult << 2 | fourthOfresult << 3 | fifthOfresult << 4
		| sixthOfresult << 5 | seventhOfresult << 6 | eightOfresult << 7;

	System.out.println(result);
	System.out.println(Integer.toBinaryString(result));
    }
}
