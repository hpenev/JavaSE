package bookChapter16_Bitwise;
/*
3. Да се състави програма, която по въведени две цели числа записва по-голя-
мото от двете в трета променлива. Да се изведе накрая стойността на тази про-
менлива. Да се използват само аритметични и побитови операции.
*/

public class Task03 {
    public static void main(String[] args) {
	int x = 11;
	int y = 7;

	int max = solution1(x, y);

	// int max = solution2(x, y);

	System.out.println(max);

    }

    private static int solution1(int x, int y) {
	int diference = x - y;
	// 0=(+) 1=(-)
	int znak = diference >> 31 & 1;
	// s formulata namirame max ot dvete chisla
	int max = x - znak * (x - y);
	return max;
    }

    private static int solution2(int x, int y) {
	int max = 0;

	for (int i = 32; i >= 0; i--) {
	    int bit1 = (x >> i) & 1;
	    int bit2 = (y >> i) & 1;

	    if (bit1 > bit2) {
		max = x;
		break;
	    }

	    if (bit2 > bit1) {
		max = y;
		break;
	    }
	}
	return max;
    }

}
