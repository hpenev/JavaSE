package homework.Task02;

public class Call {

    static double priceForAMinute = 0.11;

    private GSM caller;
    private GSM receiver;
    private double duration;

    Call(GSM caller, GSM receiver, double duration) {
	this.caller = caller;
	this.receiver = receiver;
	this.duration = duration;
    }

    String getCaller() {
	return caller.getModel();
    }

    String getReceiver() {
	return receiver.getModel();
    }

    double getDuration() {
	return duration;
    }

}
