package vinetki_v1.vignettes;

public class CarVignette extends Vignette {

    public CarVignette(Validity validity) {
	super(validity);
	this.color = "CarColor";
	super.setPrice();
    }

}
