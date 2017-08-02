package immigrants.weapons.shootingGuns;

import java.util.Random;

public class MachineGun extends ShootingWeapons {

    public MachineGun(int price) {
	super(price);
	// TODO Auto-generated constructor stub
    }

    @Override
    public int shoot() {
	System.out.println("fire with MachineGun");
	return new Random().nextInt(500) + 2000;// some ammo
    }
}
