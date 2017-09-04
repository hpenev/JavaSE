package immigrants.weapons.shootingGuns;

import java.util.Random;

public class Gun extends ShootingWeapons {

    public Gun(int price) {
	super(price);
	// TODO Auto-generated constructor stub
    }

    @Override
    public int shoot() {
	System.out.println("fire with GUN");
	return new Random().nextInt(100) + 200;// some ammo
    }
}
