package stringsTasksHomework;
/*
10. Продължение на Задача 10: за дадено неотрицателно цяло
число m <= n, открийте индекса на началото на числото в
конструирания низ.
*/

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter non negative number: ");
	int n = sc.nextInt();

	StringBuilder sb = new StringBuilder();
	for (int i = 0; i <= n; i++) {
	    sb.append(i);
	}

	System.out.println(sb);

	System.out.print("Enter non negative number <= previous: ");
	int m = sc.nextInt();

	System.out.println(sb.indexOf(String.valueOf(m)));

    }
}
