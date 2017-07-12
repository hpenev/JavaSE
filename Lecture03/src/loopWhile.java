import java.util.Scanner;

public class loopWhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int x = sc.nextInt();
		sc.close();
		
		int i = 1;
		
		while (i <= x) {
			System.out.println(i);
			i++;
		}
	}
}
