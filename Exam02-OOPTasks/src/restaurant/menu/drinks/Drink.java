package restaurant.menu.drinks;

public class Drink {

    public static final String[] drinkTypes = { "ALCOHOL", "NON_ALCOHOL" };

    private String name;
    protected double price;
    protected String drinkType;

    public Drink(String name) {
	this.name = name;
    }

    public String getDrinkType() {
	return drinkType;
    }

    public boolean isAlcohol() {
	return false;
    }

    public boolean isNonAlcohol() {
	return false;
    }

}
