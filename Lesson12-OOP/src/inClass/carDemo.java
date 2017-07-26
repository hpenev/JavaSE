package inClass;

public class carDemo {
    public static void main(String[] args) {
	Car vw = new Car("Passat", false, "urban grey");
	Car ford = new Car("Focus", true, "black perl");
	vw.changeGearUp();
	vw.accelerate();
	Person az = new Person("Hristo", 31);
	ford.setPrice(5000);

	vw.setPrice(8000);

	az.setMoney(10000);
	az.buyCar(ford);
	ford.setOwner(az);
	az.sellCarForSrap();

	System.out.println(az.getMoney());

	Person somebody = new Person("Somebody", 30);
	Person[] friends = { somebody, new Person() };
	az.setFriends(friends);
	somebody.setFriends(friends);

	az.sellCarForSrap();

	System.out.println(az.getMoney());

	CarShop balkanStar = new CarShop(3);

	balkanStar.addCar(ford);
	balkanStar.addCar(vw);

	balkanStar.showAllCarsInTheShop();
	balkanStar.sellNextCar(az);

	System.out.println(balkanStar.getNextCar().getModel());

    }
}
