package exercisesInClass;

//Task2. Write a program that prints all odd numbers between 0 and 50 and all even numbers  between 51 and 100.

public class Task02 {
    public static void main(String[] args) {
	for (int i = 0; i <= 50; i++) {
	    if (i % 2 != 0) {
		System.out.print(i + ",");
	    }
	}

	for (int i = 51; i <= 100; i++) {
	    if (i % 2 == 0) {
		System.out.print(i + ",");
	    }
	}
    }
}
