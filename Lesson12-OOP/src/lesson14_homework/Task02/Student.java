package lesson14_homework.Task02;

public class Student {

    private String name;

    String getName() {
	return name;
    }

    private String subject;
    private double grade;

    void setGrade(double grade) {
	if (grade > 0) {
	    this.grade = grade;
	}
    }

    double getGrade() {
	return grade;
    }

    private int yearInCollage;
    private int age;
    private boolean isDegree;
    private double money;

    void upYear() {
	if (!this.isDegree) {
	    this.yearInCollage++;
	    if (this.yearInCollage == 4) {
		this.isDegree = true;
	    }
	} else {
	    System.out.println("Student has a degree");
	}
    }

    double receiveScholership(double min, double amount) {
	if (this.grade >= min && this.age < 30) {
	    return this.money + amount;
	} else {
	    return this.money;
	}
    }

    Student() {
	this.grade = 4.0;
	this.yearInCollage = 1;
	this.isDegree = false;
	this.money = 0;
    }

    Student(String name, String subject, int age) {
	this();
	setName(name);
	setSubject(subject);
	setAge(age);
    }

    private void setName(String name) {
	if (name != null && !name.isEmpty()) {
	    this.name = name;
	} else {
	    System.out.println("Invalid name");
	}
    }

    private void setSubject(String subject) {
	if (subject != null && !subject.isEmpty()) {
	    this.subject = subject;
	} else {
	    System.out.println("Invalid subject");
	}
    }

    private void setAge(int age) {
	if (age > 18) {
	    this.age = age;
	} else {
	    System.out.println("Years Less than 18");
	}
    }
}
