package lesson14_homework.Task01;

public class ComputerDemo {
    public static void main(String[] args) {

	Computer c1 = new Computer(2017, 2000.00, 240, 200);
	Computer c2 = new Computer(2017, 2000.00, true, 240, 200, "Windows 10");

	if (c1.comparePrice(c2) == 0) {
	    System.out.println("same price");
	}
    }
}
