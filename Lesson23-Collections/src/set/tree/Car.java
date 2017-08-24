package set.tree;

public class Car implements Comparable<Car> {
    private String name;
    private String color;

    public String getName() {
	return name;
    }

    public Car(String name, String color) {
	this.name = name;
	this.color = color;
    }

    @Override
    public int compareTo(Car c) {
	return this.color.compareTo(c.color);
    }

    @Override
    public String toString() {
	return this.name + ":" + this.color;
    }

}
