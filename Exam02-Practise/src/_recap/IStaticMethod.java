package _recap;

public interface IStaticMethod {

    public static void print() {
	System.out.println("static method");
    }

    public default void print123() {
	System.out.println("default method");
    }

}
