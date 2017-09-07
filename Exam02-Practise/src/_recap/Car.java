package _recap;

import java.util.ArrayList;
import java.util.HashMap;

public class Car extends Vehicle implements IStaticMethod {

    private String model;

    public Car() {
	super();
    }

    public static void makeNoise() {
	HashMap<String, Integer> test = new HashMap<>();
	ArrayList<Integer> list = new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);

	list.remove(2);
	list.remove(Integer.valueOf(2));

    }

    public void drive(int i) {

    }

    private int drive(int i, int x) {
	return x;
    }

    @Override
    public Car getCar() {
	return null;
    }
}
