package homework.Task02;

public class GSM {
    private String model;
    private boolean hasSimCard;
    private String simMoblileNumber;
    private int outgoingCallsDuration;
    private Call lastIncomingCall;
    private Call lastOutgoingCall;

    GSM(String model) {
	setModel(model);
	this.outgoingCallsDuration = 0;
    }

    void insertSimCard(String simMoblileNumber) {
	if (this.hasSimCard) {
	    System.out.println("There are sim card in this GSM");
	} else {
	    this.hasSimCard = true;
	    setSimMoblileNumber(simMoblileNumber);
	}
    }

    void removeSimCard() {
	if (this.hasSimCard) {
	    setSimMoblileNumber(null);
	    this.hasSimCard = false;
	} else {
	    System.out.println("Already removed");
	}
    }

    String getModel() {
	return model;
    }

    void call(GSM receiver, int duratuion) {
	if (this.simMoblileNumber == receiver.simMoblileNumber) {
	    System.out.println("Cannot make call to yourself");
	    return;
	}

	if (!this.hasSimCard) {
	    System.out.println(this.getModel() + " does not have sim card");
	    return;
	}

	if (!receiver.hasSimCard) {
	    System.out.println(receiver.getModel() + " does not have sim card");
	    return;
	}

	if (duratuion > 0) {
	    System.out.println(this.model + " is calling to " + receiver.model);
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

    void printInfoForTheLastOutgoingCall() {
	if (this.lastOutgoingCall != null) {
	    System.out.println("duration: " + this.lastOutgoingCall.getDuration());
	    System.out.println("caller: " + this.lastOutgoingCall.getCaller());
	    System.out.println("receiver: " + this.lastOutgoingCall.getReceiver());
	} else {
	    System.out.println("there is no last outgoing call");
	}
    }

    void printInfoForTheLastIncomingCall() {
	if (this.lastIncomingCall != null) {
	    System.out.println("duration: " + this.lastIncomingCall.getDuration());
	    System.out.println("caller: " + this.lastIncomingCall.getCaller());
	    System.out.println("receiver: " + this.lastIncomingCall.getReceiver());
	} else {
	    System.out.println("there is no last incoming call");
	}
    }

    private void setModel(String model) {
	if (model != null && !model.isEmpty()) {
	    this.model = model;
	} else {
	    System.out.println("cannot assign GSM model");
	}
    }

    private void setSimMoblileNumber(String simMoblileNumber) {
	if (simMoblileNumber != null && !simMoblileNumber.isEmpty()) {
	    if (simMoblileNumber.length() == 10 && simMoblileNumber.indexOf("08") == 0) {
		this.simMoblileNumber = simMoblileNumber;
	    } else {
		System.out.println("Incorrect sim Mobile Number");
	    }
	} else {
	    System.out.println("sim mobile nummber cannot be null or empty");
	}
    }

}
