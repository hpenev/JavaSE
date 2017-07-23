package sud.objects.CaseStuff;

import sud.objects.Jury;
import sud.objects.JuristPositionStuff.Prosecutor;

public class CriminalCase extends Case {
    private Jury[] juries = new Jury[13];
    private Prosecutor prosecutor;

    public void perform() {
	super.perform();
	this.prosecutor.increaseWoringCases();
    }
}
