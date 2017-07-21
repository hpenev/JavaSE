package homework;

public class Person {
    private String name;
    private int age;
    private boolean isMale;

    String getName() {
	return name;
    }

    void setName(String name) {
	if (name != null && !name.isEmpty()) {
	    this.name = name;
	} else {
	    System.out.println("Invalid name");
	}
    }

    int getAge() {
	return age;
    }

    void setAge(int age) {
	if (age >= 0) {
	    this.age = age;
	}
    }

    protected Person(String name, int age, boolean isMale) {
	this.name = name;
	this.age = age;
	this.isMale = isMale;
    }

    protected void howPersonInfo() {
	System.out.println("Name: " + this.name);
	System.out.println("Age: " + this.age);
	System.out.println("Is Male: " + this.isMale);
    }

}
