package sud.objects.CaseStuff;

import sud.objects.CitizenStuff.Accused;
import sud.objects.CitizenStuff.Witness;
import sud.objects.JuristStuff.Judge;

public class Case {
    protected Judge judge;
    protected Accused accused;
    protected Witness[] witnesses;

    public Case(Judge judge, Accused accused, Witness[] witnesses) {
	this.judge = judge;
	this.accused = accused;
	this.witnesses = witnesses;
    }

    public void perform() {
	this.judge.increaseWoringCases();
    }
}
