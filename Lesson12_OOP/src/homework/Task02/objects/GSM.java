package homework.Task02.objects;

public class GSM {
    private String model;
    private int outgoingCallsDuration;
    private Call lastIncomingCall;
    private Call lastOutgoingCall;
    private SimCard simCard;

    public GSM(String model) {
	setModel(model);
	this.outgoingCallsDuration = 0;
    }

    public void insertSimCard(SimCard simCard) {
	if (this.simCard == null) {
	    this.simCard = simCard;
	    this.simCard.setDevice(this);
	} else {
	    System.out.println("GSM has simcard");
	}

    }

    // void insertSimCard(String simMoblileNumber) {
    // if (this.hasSimCard) {
    // System.out.println("There are sim card in this GSM");
    // } else {
    // this.hasSimCard = true;
    // setSimMoblileNumber(simMoblileNumber);
    // }
    // }

    public void removeSimCard() {
	if (this.simCard != null) {
	    this.simCard = null;
	} else {
	    System.out.println("Already removed");
	}
    }

    // void removeSimCard() {
    // if (this.hasSimCard) {
    // setSimMoblileNumber(null);
    // this.hasSimCard = false;
    // } else {
    // System.out.println("Already removed");
    // }
    // }

    public String getModel() {
	return model;
    }

    public void call(GSM receiver, double duratuion) {
	if (this.simCard == null) {
	    System.out.println(this.getModel() + " does not have sim card");
	    return;
	}

	if (receiver.simCard == null) {
	    System.out.println(receiver.getModel() + " does not have sim card");
	    return;
	}

	if (this.simCard.getMobileNumber() == receiver.simCard.getMobileNumber()) {
	    System.out.println("Cannot make call to yourself");
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

    public double getSumForCall() {
	return this.outgoingCallsDuration * Call.priceForAMinute;
    }

    public void printInfoForTheLastOutgoingCall() {
	if (this.lastOutgoingCall != null) {
	    System.out.println("Info For The Last Outgoing Call:");
	    System.out.println("duration: \t" + this.lastOutgoingCall.getDuration());
	    System.out.println("caller: \t" + this.lastOutgoingCall.getCaller());
	    System.out.println("receiver: \t" + this.lastOutgoingCall.getReceiver());
	} else {
	    System.out.println("there is no last outgoing call");
	}
    }

    public void printInfoForTheLastIncomingCall() {
	if (this.lastIncomingCall != null) {
	    System.out.println("Info For The Last Incoming Call:");
	    System.out.println("duration: \t" + this.lastIncomingCall.getDuration());
	    System.out.println("caller: \t" + this.lastIncomingCall.getCaller());
	    System.out.println("receiver: \t" + this.lastIncomingCall.getReceiver());
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

    // private void setSimMoblileNumber(String simMoblileNumber) {
    // if (simMoblileNumber != null && !simMoblileNumber.isEmpty()) {
    // if (simMoblileNumber.length() == 10 && simMoblileNumber.indexOf("08") ==
    // 0) {
    // this.simMoblileNumber = simMoblileNumber;
    // } else {
    // System.out.println("Incorrect sim Mobile Number");
    // }
    // } else {
    // System.out.println("sim mobile nummber cannot be null or empty");
    // }
    // }

}
