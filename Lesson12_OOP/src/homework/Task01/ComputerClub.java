package homework.Task01;

public class ComputerClub {
    public static void main(String[] args) {
	Computer c1 = new Computer(2015, 1200, 120, 100, "Windows 10 pro", true);
	Computer c2 = new Computer(2016, 1500, 240, 100, "Windows 10 pro", false);
	c1.useMemory(100);
	c2.changeOperationSystem("Linux");

	System.out.println(c1);
	System.out.println(c2);

    }
}
