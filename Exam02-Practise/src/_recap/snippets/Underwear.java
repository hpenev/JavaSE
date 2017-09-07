package _recap.snippets;

public class Underwear {
    class Victoria {
	private class Secret {
	    int age = 22;
	}
    }

    public static void main(String[] args) {
	Underwear underwear = new Underwear();
	Underwear.Victoria superModel = underwear.new Victoria();
    }
}
