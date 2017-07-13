package homework.Task02;

import homework.Task02.objects.GSM;
import homework.Task02.objects.SimCard;

public class test {
    public static void main(String[] args) {
	GSM samsung = new GSM("Samsung Galaxy S8");
	GSM apple = new GSM("Apple Iphone 7 Plus");

	SimCard mtelSim = new SimCard("0886584888");
	SimCard vivacomSim = new SimCard("0871981538");

	// test without sim
	samsung.call(apple, 5.2);

	samsung.insertSimCard(mtelSim);
	apple.insertSimCard(vivacomSim);

	// normal call
	samsung.call(apple, 1.2);
	apple.call(samsung, 4.6);

	// test calling to itsself
	apple.call(apple, 100);

	// test without sim
	apple.removeSimCard();
	samsung.removeSimCard();
	samsung.call(apple, 1.2);
	apple.call(samsung, 4.6);

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
