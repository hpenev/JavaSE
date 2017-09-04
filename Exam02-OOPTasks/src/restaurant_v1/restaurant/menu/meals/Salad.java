package restaurant_v1.restaurant.menu.meals;

import java.util.Random;

import restaurant_v1.restaurant.Restaurant.SectionType;
import restaurant_v1.restaurant.menu.IVegan;

public class Salad extends Meals implements IVegan {

    public Salad(String name) {
	super(SectionType.SALAD, name, 5);
    }

    @Override
    public void setWeight(int weight) {
	if (weight >= 300 && weight <= 600) {
	    this.weight = weight;
	} else {
	    this.weight = new Random().nextInt(301) + 300;
	}

    }

}
