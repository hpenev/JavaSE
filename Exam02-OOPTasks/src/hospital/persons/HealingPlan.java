package hospital.persons;

public class HealingPlan {
    private String[] allDiagnoses = {};

    private String diagnose;
    private int pills;
    private int days;

    public String getDiagnose() {
	return diagnose;
    }

    public int getDays() {
	return days;
    }

    public void decreaceDays() {
	days--;
    }

    public boolean isCompleted() {
	return days == 0 ? true : false;
    }

    public int getPills() {
	return pills;
    }

    public void getOnePill() {
	pills--;
    }

    public HealingPlan(String diagnose, int pills, int days) {
	this.diagnose = diagnose;
	this.pills = pills;
	this.days = days;
    }
}
