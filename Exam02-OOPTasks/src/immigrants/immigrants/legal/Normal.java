package immigrants.immigrants.legal;

import java.util.ArrayList;

import immigrants.immigrants.Immigrant;
import immigrants.passport.Passport;

public class Normal extends Immigrant {

    public Normal(Passport passport, int money, ArrayList<Immigrant> relatives) {
	super(passport, money, relatives, null);
    }

    @Override
    protected boolean validRelatives(ArrayList<Immigrant> relatives) {
	return super.validRelatives(relatives) && relatives.size() <= 10;
    }

    @Override
    public boolean isLegal() {
	return true;
    }

    @Override
    public void act() {
	System.out.println("Nothing to do. I live my life.");
    }

}
