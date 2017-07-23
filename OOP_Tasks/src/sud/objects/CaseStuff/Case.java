package sud.objects.CaseStuff;

import sud.objects.CitizenStuff.Accused;
import sud.objects.CitizenStuff.Witness;
import sud.objects.JuristPositionStuff.Judge;

public class Case {
    private Judge judge;
    private Accused accused;
    private Witness[] witnesses;

    public void perform() {
	this.judge.increaseWoringCases();
    }
}
