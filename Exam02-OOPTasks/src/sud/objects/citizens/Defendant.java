package sud.objects.citizens;

public class Defendant extends LawyerClients {

    private boolean isGuilty = false;

    private int yearsInJale = 0;

    public void setYearsInJale(int yearsInJale) {
	this.yearsInJale = yearsInJale;
    }

    public Defendant(String name, String address, int age) {
	super(name, address, age);
    }

    public void setGuilty(boolean isGuilty) {
	this.isGuilty = isGuilty;
    }

    @Override
    public boolean isAccused() {
	return true;
    }
}
