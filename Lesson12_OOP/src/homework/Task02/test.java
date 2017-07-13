package homework.Task02;

public class test {
    public static void main(String[] args) {
	GSM samsung = new GSM("Samsung Galaxy S8");
	GSM apple = new GSM("Apple Iphone 7 Plus");

	samsung.insertSimCard("0886584888");
	apple.insertSimCard("0871981538");

	samsung.call(apple, 12);
	samsung.call(apple, 14);
	samsung.call(apple, 2);
	samsung.call(apple, 8);

	apple.call(apple, 100);

	apple.call(samsung, 5);
	apple.call(samsung, 2);
	apple.call(samsung, 1);

	System.out.println();
	System.out.println(apple.getModel() + " bill is " + apple.getSumForCall());
	System.out.println(samsung.getModel() + " bill is " + samsung.getSumForCall());
	System.out.println();

	System.out.println(apple.getModel() + " info for the last incoming call: ");
	apple.printInfoForTheLastIncomingCall();
	System.out.println();

	System.out.println(apple.getModel() + " info for the last outgoing call: ");
	apple.printInfoForTheLastOutgoingCall();
	System.out.println();

	System.out.println(samsung.getModel() + " info for the last incoming call: ");
	samsung.printInfoForTheLastIncomingCall();
	System.out.println();

	System.out.println(samsung.getModel() + " info for the last outgoing call: ");
	samsung.printInfoForTheLastOutgoingCall();
    }
}
