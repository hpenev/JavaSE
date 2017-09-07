package _recap.snippets;

public class s6 {
    public static void main(String[] args) {
	Object object = new Object();
	object.toString();
	System.out.println(object);

	String string = (String) object;
	string = "Spam and eggs";
	System.out.println(string);
    }
}
