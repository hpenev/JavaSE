package documents;

public class SecretDocument extends OrdinaryDocument {

    private String password;

    public SecretDocument(String name, String password) {
	super(name);
	if (password != null && password.length() >= 5) {
	    this.password = password;
	} else {
	    System.out.println("invalid password");
	}
    }

    @Override
    public boolean isSecret() {
	return true;
    }
}
