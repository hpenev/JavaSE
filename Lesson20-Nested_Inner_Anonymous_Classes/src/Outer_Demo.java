class Outer_Demo {
    private int num;
    private static int stat;

    // inner class
    private class Inner_Demo {
	public void print() {
	    System.out.println(stat);
	    System.out.println("This is an inner class");
	}
    }

    public static class Static_Inner_Demo {
	public void print() {
	    System.out.println(stat);
	    System.out.println("This is an static nested class");
	}
    }

    Static_Inner_Demo s = new Static_Inner_Demo() {
	public void print() {
	    System.out.println("This is anonimus class");
	};
    };

    // Accessing he inner class from the method within
    void display_Inner() {
	Inner_Demo inner = new Inner_Demo();
	inner.print();
    }
}