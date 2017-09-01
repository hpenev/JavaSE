package vinetki_v1.vignettes;

public class BusVignette extends Vignette {

    public BusVignette(Validity validity) {
	super(validity);
	this.color = "BusColor";
	super.setPrice();
    }

}
