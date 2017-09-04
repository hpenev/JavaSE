package restaurant_v1.restaurant.menu.meals;

import java.util.Random;

import restaurant_v1.restaurant.Restaurant.SectionType;

public class Desert extends Meals {

    public Desert(String name) {
	super(SectionType.DESERT, name, 4);
    }

    @Override
    public void setWeight(int weight) {
	if (weight >= 200 && weight <= 300) {
	    this.weight = weight;
	} else {
	    this.weight = new Random().nextInt(201) + 100;
	}

    }

}
