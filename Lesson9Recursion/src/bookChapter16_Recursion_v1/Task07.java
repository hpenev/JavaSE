package bookChapter16_Recursion_v1;

/*
7. Да се състави програма, чрез която по въведени начална и крайна цифра се
извеждат на всеки нов ред редица от числа, започващи с първата цифра и уве-
личаващи броя си с едно на всеки ред, докато не се стигне до втората – крайна
цифра. Използвайте рекурсия.
*/

public class Task07 {
    public static void main(String[] args) {
	int x = 2;
	int y = 3;
	printTriangle(x, y, 0);
    }

    static void printTriangle(int start, int end, int index) {
	if (index == end - start + 1) {
	    return;
	}
	for (int i = 0; i <= index; i++) {
	    System.out.print(i + start + " ");
	}
	System.out.println();
	printTriangle(start, end, index + 1);
    }
}
