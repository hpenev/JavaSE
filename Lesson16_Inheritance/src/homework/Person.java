package homework;

public class Person {
    protected String name;
    protected int age;
    protected boolean isMale;

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
