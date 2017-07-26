package abstraction;

public class Demo {
    public static void main(String[] args) {
	Explodable[] bombi = new Explodable[3];

	bombi[0] = new Granade();
	bombi[1] = new C4();
	bombi[2] = new Dynamite();

	for (int i = 0; i < bombi.length; i++) {
	    bombi[i].blowUp();
	}
    }
}
