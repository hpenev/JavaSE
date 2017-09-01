package vinetki_v1.vignettes;

public class TruckVignette extends Vignette {

    public TruckVignette(Validity validity) {
	super(validity);
	this.color = "TruckColor";
	super.setPrice();
    }

}
