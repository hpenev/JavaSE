package bookChapter16_Recursion_v1;

/*
8. Да се състави програма, която проверява дали въведено естествено число е
просто. Просто е число, което се дели без остатък единствено на 1 и на себе си.
Използвайте рекурсия.
*/

public class Task08 {
    public static void main(String[] args) {
	int number = 100;
	System.out.println(isPrime(2, number));
    }

    static boolean isPrime(int idx, int original) {
	if (idx == original) {
	    return true;
	}

	if (original % idx == 0) {
	    return false;
	}

	return isPrime(idx + 1, original);
    }
}
