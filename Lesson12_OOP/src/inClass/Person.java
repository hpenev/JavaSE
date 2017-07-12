package inClass;

public class Person {
    String name;
    int age;
    Person friend;

    void walk() {
	System.out.println(this.name + " is walking");
    }

    void eatChocolate(Chocolate c) {
	if (c.weight > 10) {
	    c.weight -= 10;
	}
	c.melt();
    }
}
