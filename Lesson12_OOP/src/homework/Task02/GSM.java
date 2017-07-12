package homework.Task02;

public class GSM {
    private String model;
    private boolean hasSimCard;
    private int simMoblileNumber;
    private int outgoingCallsDuration;
    private Call lastIncomingCall;
    private Call lastOutgoingCall;

    public void setSimMoblileNumber(int simMoblileNumber) {
	String simMobileNumberString = String.valueOf(simMoblileNumber);
	if (simMobileNumberString.length() == 10 && simMobileNumberString.indexOf("08") == 0) {
	    this.simMoblileNumber = simMoblileNumber;
	} else {
	    System.out.println("Incorrect sim Mobile Number");
	}
    }

    void insertSimCard(int simCardNumber) {
	if (this.hasSimCard) {
	    System.out.println("There are sim card in this GSM");
	} else {
	    this.hasSimCard = true;
	    setSimMoblileNumber(simCardNumber);
	}
    }

    void removeSimCard() {
	if (this.hasSimCard) {
	    this.hasSimCard = false;
	} else {
	    System.out.println("Already removed");
	}
    }

    void call(GSM receiver, int duratuion) {
	if (this.simMoblileNumber == receiver.simMoblileNumber) {
	    System.out.println("Cannot make call to yourself");
	    return;
	}

	if (!this.hasSimCard || !receiver.hasSimCard) {
	    System.out.println("One of the phones does not have sim card");
	    return;
	}

	if (duratuion > 0) {
	    Call newCall = new Call(this, receiver, duratuion);
	    this.lastOutgoingCall = newCall;
	    receiver.lastIncomingCall = newCall;
	    this.outgoingCallsDuration += duratuion;
	} else {
	    System.out.println("invalid call duration");
	}
    }

    double getSumForCall() {
	return this.outgoingCallsDuration * Call.priceForAMinute;
    }

}
