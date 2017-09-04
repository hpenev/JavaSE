package restaurant.menu.drinks;

import restaurant.menu.IVeganMenu;

public class NonAlcohol extends Drink implements IVeganMenu {

    public NonAlcohol(String name) {
	super(name);
	this.drinkType = "NON ALCOHOL";
	this.price = 2;
    }

    @Override
    public boolean isNonAlcohol() {
	return true;
    }

}
