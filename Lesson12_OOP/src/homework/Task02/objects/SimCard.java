package homework.Task02.objects;

public class SimCard {
    private String mobileNumber;
    private GSM device;

    public SimCard(String mobileNumber) {
	setMobileNumber(mobileNumber);
    }

    GSM getDevice() {
	return device;
    }

    void setDevice(GSM device) {
	this.device = device;
    }

    String getMobileNumber() {
	return mobileNumber;
    }

    private void setMobileNumber(String mobileNumber) {
	if (mobileNumber != null && !mobileNumber.isEmpty()) {
	    if (mobileNumber.length() == 10 && mobileNumber.indexOf("08") == 0) {
		this.mobileNumber = mobileNumber;
	    } else {
		System.out.println("Incorrect sim Mobile Number");
	    }
	} else {
	    System.out.println("sim mobile nummber cannot be null or empty");
	}
	this.mobileNumber = mobileNumber;
    }

}
