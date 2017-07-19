package homework;

public class Student extends Person {
    private double score;

    protected Student(String name, int age, boolean isMale, double score) {
	super(name, age, isMale);
	setScore(score);
    }

    double getScore() {
	return score;
    }

    void setScore(double score) {
	if (2 <= score && score <= 6) {
	    this.score = score;
	} else {
	    System.out.println("Invalid score");
	}
    }

    protected void showStudentInfo() {
	super.howPersonInfo();
	System.out.println("Score: " + this.score);
    }

}
