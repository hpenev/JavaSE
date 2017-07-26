package homework;

/*
Задача 6:
Да се състави програма, чрез която се въвежда изречение с отделни
думи.
Като резултат на екрана да се извежда същия текст, но всяка отделна
дума да започва с главна буква, а следващите я букви да са малки.
Пример: супер яката задача
Изход: Супер Яката Задача

*/
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a sentance: ");

	String input = sc.nextLine();
	String[] words = input.split("\\s+");
	sc.close();

	System.out.println("Capitalizing the first letter of each word.");

	for (int i = 0; i < words.length; i++) {
	    words[i] = CapitalizeWord(words[i]);
	}

	System.out.println(String.join(" ", words));
    }

    static String CapitalizeWord(String word) {
	StringBuilder sb = new StringBuilder();

	sb.append(word.substring(0, 1).toUpperCase());
	sb.append(word.substring(1));

	return sb.toString();
    }
}
