package sud.objects.citizens;

public class Accuser extends LawyerClients {
    public Accuser(String name, String address, int age) {
	super(name, address, age);
    }

    @Override
    public boolean isAccuser() {
	return true;
    }

    public void takeNotes() {
	System.out.println(this.name + " take notes");
    }

}
